package com.kisskin.oop.AnotherCalc;

import static com.kisskin.oop.AnotherCalc.Convertation.isNumber;

public class ReturningValue {
    static String functionResult(int x, int y, String func) {
        String a = AnotherCalculator.value1;
        String b = AnotherCalculator.value2;
        if (isNumber(a) && isNumber(b)) {
            return String.valueOf(functionArabResult(x, y, func));
        } else if (!((isNumber(a) && isNumber(b)))) {
            return functionRomeResult(x, y, func);
        } else {
            throw new IllegalArgumentException("БАЛЯТЬ ЧИСЛА ДОЛЖНЫ БЫТЬ ОДНОГО РЕГИСТРА");
        }
    }


    static int functionArabResult(int a, int b, String func) {
        int i = 0;
        switch (func) {
            case "/":
                return i = a / b;
            case "*":
                return i = a * b;
            case "-":
                return i = a - b;
            case "+":
                return i = a + b;
            default:
                throw new IllegalArgumentException("БАЛЯТЬ НЕПРАВИЛЬНО ВВЕЛ ФУНКЦИЮ (+ - * /)");
        }


    }

    static String functionRomeResult(int a, int b, String func) {
        int i = 0;
        switch (func) {
            case "/":
                i = a / b;
            case "*":
                i = a * b;
            case "-":
                i = a - b;
            case "+":
                i = a + b;
        }
        return toRoman(i);


    }


    public static String toRoman(int num) {
        if (num < -1 || num > 3999) {
            return "Invalid number";
        } else if (num == 0) {
            return "";
        } else if (-10 <= num && num <= 10) {
            int[] values = {-1, 1};
            String[] roman = {"X", "V"};
            for (int i = 0; i < 2; i++) {
                switch (num + values[i]) {
                    case -9:
                        return roman[1] + toRoman(-8);
                    case -8:
                        return roman[1] + toRoman(-7);
                    case -7:
                        return roman[0] + toRoman(4) + roman[1];
                    case -6:
                        return roman[1] + toRoman(-5);
                    case -5:
                        return roman[0] + toRoman(8) + roman[1];
                    case -4:
                        return roman[1] + toRoman(-3);
                    case -3:
                        return roman[0] + toRoman(12) + roman[1];
                    case -2:
                        return roman[1] + toRoman(-1);
                    case -1:
                        return roman[1];
                    case 1:
                        return roman[0];
                    case 2:
                        return "II";
                    case 3:
                        return "III";
                    case 4:
                        return "IV";
                    case 5:
                        return "V";
                    case 6:
                        return "VI";
                    case 7:
                        return "VII";
                    case 8:
                        return "VIII";
                    case 9:
                        return "IX";
                    default:
                        throw new IllegalArgumentException("Invalid number");
                }
            }
        } else {
            String tens = "";
            int power = num % 10;
            switch (num / 10) {
                case 0:
                    break;
                case 1:
                    tens = "X";
                    break;
                case 2:
                    tens = "XX";
                    break;
                case 3:
                    tens = "XXX";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid number");
            }
            switch (power) {
                case 0:
                    return tens + toRoman(num - power);
                case 1:
                    return tens + "I" + toRoman(num - power);
                case 2:
                    return tens + "II" + toRoman(num - power);
                case 3:
                    return tens + "III" + toRoman(num - power);
                case 4:
                    return tens + "IV" + toRoman(num - power);
                case 5:
                    return tens + "V" + toRoman(num - power);
                default:
                    throw new IllegalArgumentException("Invalid number");
            }
        }
        return null;
    }
}
