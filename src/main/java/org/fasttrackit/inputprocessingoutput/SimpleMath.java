package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("What is the first  number? " );
        num1 = scanner.nextInt();
        System.out.println("What is the second number? ");
        num2= scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);


    }
}
