package org.fasttrackit.inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {


    public static void simpleMath(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the first  number? ");
        num1 = scanner.nextInt();
        System.out.println("What is the second number? ");
        num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);


    }





    }
