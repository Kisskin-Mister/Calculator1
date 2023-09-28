
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
            if (isNumber(Process.value1) == isNumber(Process.value2)) {
                int digit1 = conv.finalConv(Process.value1);
                int digit2 = conv.finalConv(Process.value2);
                System.out.println(Process.value1.toUpperCase() + " " + Process.func + " " + Process.value2.toUpperCase() + " = " + ReturningValue.functionResult(digit1, digit2, Process.func));
                System.out.println("Want to end calculating?[Y/N]");
                answer = sc.nextLine().toUpperCase();
            } else {
                System.out.println("БАЛЯ ЦИФРЫ ДОЛЖНЫ БЫТЬ ОДНОГО РЕГИСТРА. ДАВАЙ ЗАНОВО");
                Process.process();
            }
        } while (answer.equals("N"));

    }
}




