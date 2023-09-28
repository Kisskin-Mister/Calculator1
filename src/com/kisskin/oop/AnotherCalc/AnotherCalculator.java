package com.kisskin.oop.AnotherCalc;

import java.util.Scanner;

public class AnotherCalculator {
    static String value1;
    static String value2;
    static String func;
    static String answer;


    static Convertation conv = new Convertation();


    public static void main(String[] args) {
        do {
            System.out.println("Enter the first number");
            Scanner sc = new Scanner(System.in);
            value1 = sc.nextLine();
            System.out.println("Enter the function (only + - * or /)");
            func = sc.nextLine();
            System.out.println("Enter the second number");
            value2 = sc.nextLine();
            if ((value2 == "0" && func == "/")) {
                do {
                    System.out.println("It's impossible to divide on 0");
                    System.out.println("Enter the second number");
                    value2 = sc.nextLine();
                } while ((value2 == "0"));
            }
            int digit1 = conv.finalConv(value1);
            int digit2 = conv.finalConv(value2);
            System.out.println(value1 + " " + func + " " + value2 + " = " + ReturningValue.functionResult(digit1, digit2, func));
            System.out.println("Want to end calculating?[Y/N]");
            answer = sc.nextLine().toUpperCase();
        }
        while (answer.equals("N"));
    }
}

