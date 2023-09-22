package com.kisskin.oop.calc;

public class MainCalc {
    public static String aa;
    public static String bb;

    public static void main(String[] args) {


        int a;
        int b;

        aa = "10"; // число 1
        bb = "3"; // число 2

        if (isNumber(aa)) {
            a = arabNumber(aa);
        } else {
            a = romeNumber(aa);
        }

        if (isNumber(bb)) {
            b = arabNumber(bb);
        } else {
            b = romeNumber(bb);
        }

        if (isNumber(aa) == isNumber(bb)) {
            int sum = a+b;
            int dif = a-b;
            int multi = a*b;
            int divide = a/b;

            System.out.println(aa + " + " + bb + " = " + sum + " ; " + aa + " - " + bb + " = " + dif + " ; " + aa + " * " + bb + " = " + multi + " ; " + aa + " / " + bb + " = " + divide);
        } else {
            System.out.println("ВВЕДИ ДАННЫЕ ОДНОГО РЕГИСТРА");
        }


    }


    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;

        return true;

    }

    public static int arabNumber(String xx) {
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
                throw new IllegalArgumentException("БАЛЯТЬ НЕПРАВИЛЬНО ВВЕЛ ЧИСЛА");
        }
    }

    public static int romeNumber(String yy) {
        switch (yy) {
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
                throw new IllegalArgumentException("БАЛЯТЬ НЕПРАВИЛЬНО ВВЕЛ ЧИСЛА");
        }
    }
}

