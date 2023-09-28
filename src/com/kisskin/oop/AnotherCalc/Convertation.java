package com.kisskin.oop.AnotherCalc;

import static com.kisskin.oop.AnotherCalc.Convertation.isNumber;

public class Convertation {
    public int arabNumber(String xx) {
        switch (xx) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            default:
                throw new IllegalArgumentException("БАЛЯТЬ НЕПРАВИЛЬНО ВВЕЛ ЧИСЛА (от 1 до 10)");
        }
    }

    public int romeNumber(String yy) {
        switch (yy.toUpperCase()) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("БАЛЯТЬ НЕПРАВИЛЬНО ВВЕЛ ЧИСЛА (от I до X)");
        }
    }


    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;

        return true;

    }

    public int finalConv(String x) {
        int result = 0;
        if (isNumber(x)) {
            result = arabNumber(x);
        } else {
            result = romeNumber(x);
        }
        return result;
    }

//    public String returnConvertedValue(String x, String a, String b) {
//        if ((isNumber(a) == isNumber(b))) {
//            return x;
//        } else if (AnotherCalculator.func == "/" && AnotherCalculator.value2 == "0") {
//            throw new IllegalArgumentException("БАЛЯТЬ НЕ ДЕЛИ НА НОЛЬ");
//        } else {
//            throw new IllegalArgumentException("БАЛЯТЬ НЕПРАВИЛЬНО ВВЕЛ ЧИСЛА(один регистр, от 1 до 10)");
//        }
//
    }











