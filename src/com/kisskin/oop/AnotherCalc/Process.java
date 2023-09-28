package com.kisskin.oop.AnotherCalc;

import java.util.Objects;
import java.util.Scanner;

public class Process {
    static String value1;
    static String value2;
    static String func;
    static Convertation conv = new Convertation();
    public static void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        value1 = sc.nextLine();
        if(conv.finalConv(value1) == 0){
            do{
                System.out.println("Error! Enter the first number from 1 to 10 or from I to X");
                value1 = sc.nextLine();
            }while(conv.finalConv(value1) != 0);
        }
        System.out.println("Enter the function (only + - * or /)");
        func = sc.nextLine();
        if ((!func.equals("+") || !func.equals("-") || !func.equals("*") || !func.equals("/"))) {
            do {
                System.out.println("БАЛЯ НЕПРАВИЛЬНАЯ ФУНКЦИЯ");
                System.out.println("Enter the function (only + - * or /)");
                func = sc.nextLine();
            }while (!(func.equals("+") || func.equals("-") || func.equals("*") || func.equals("/")));
        }
        System.out.println("Enter the second number");
        value2 = sc.nextLine();
        if(conv.finalConv(value2) == 0){
            do{
                System.out.println("Error! Enter the second number from 1 to 10 or from I to X");
                value2 = sc.nextLine();
            }while(conv.finalConv(value2) != 0);
        }
    }
}

