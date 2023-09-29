
package com.kisskin.oop.AnotherCalc;

import java.util.Scanner;

import static com.kisskin.oop.AnotherCalc.Convertation.isNumber;

public class AnotherCalculator {

    static String answer;
    static Convertation conv = new Convertation();


    public static void main(String[] args) {
        do {
            Process.process();
            Scanner sc = new Scanner(System.in);
            if ((isNumber(Process.value1) == isNumber(Process.value2))){
                int digit1 = conv.finalConv(Process.value1);
                int digit2 = conv.finalConv(Process.value2);
                if ((ReturningValue.functionArabResult(digit1, digit2, Process.func)) < 0){
                    System.out.println("Calculator works only with positive values. Try again!");
                    System.out.println("Want to continue calculating? [Type Y for yes / Type any or Enter for exit]");
                    String negative = new String("Y");
                    answer = sc.nextLine().toUpperCase();
                }else{
                System.out.println(Process.value1.toUpperCase() + " " + Process.func + " " + Process.value2.toUpperCase() + " = " + ReturningValue.functionResult(digit1, digit2, Process.func));
                System.out.println("Want to continue calculating? [Type Y for yes / Type any or Enter for exit]");
                String negative = new String("Y");
                answer = sc.nextLine().toUpperCase();}
            } else {
                System.out.println("Incompatible data types. Try again:)");
                System.out.println("Want to continue calculating? [Type Y for yes / Type any or Enter for exit]");
                String negative = new String("Y");
                answer = sc.nextLine().toUpperCase();
            }
        } while (answer.equals("Y"));

    }
}




