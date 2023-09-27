package com.kisskin.oop.AnotherCalc;

public class AnotherCalculator {
    public static String value1 = "10"; // число 1
    public static String value2 = "3"; // число 2
    public static String func = "-"; // функция: - + * /

    static convertation conv = new convertation();


    public static void main(String[] args) {
        int digit1 = conv.finalConv(value1);
        int digit2 = conv.finalConv(value2);
        System.out.println(conv.returnFinal(convertation.rtn.functionReturn(digit1, digit2, func), value1, value2));


    }
}
