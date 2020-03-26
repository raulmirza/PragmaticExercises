package org.fasttrackit.inputprocessingoutput;


import java.util.Scanner;

public class CountingTheNumberOfWords {

    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("What is the input string?");

        String userInput = scanner2.nextLine();
        System.out.println(userInput + " has " + userInput.length() + " characters");

    }
}
