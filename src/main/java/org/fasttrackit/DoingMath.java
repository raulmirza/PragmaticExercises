package org.fasttrackit;

import java.util.Scanner;

public class DoingMath {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        int firstNumber = 20, secondNumber=10;

        int sum;

        sum = firstNumber + secondNumber;

        int product = firstNumber*secondNumber;

        int product2 = firstNumber/secondNumber;

        int product3 = firstNumber - secondNumber;


        System.out.println("Sum of two numbers is:" + sum);

        System.out.println("Multiple of numbers is:" + product);

        System.out.println("Result of dividing the two numbers is: " + product2);

        System.out.println("Difference of two numbers is: " + product3);





    }
}
