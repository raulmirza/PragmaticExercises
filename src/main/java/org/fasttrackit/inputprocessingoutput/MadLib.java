package org.fasttrackit.inputprocessingoutput;



import java.util.Scanner;

public class MadLib {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String dog, walk, quikly, blue;

        System.out.println("Enter a noam: " );
        dog = keyboard.nextLine();
        System.out.println("Enter an adjective: ");
        blue = keyboard.nextLine();
        System.out.println("Enter a verb: ");
        walk = keyboard.nextLine();
        System.out.println("Enter an adverb: ");
        quikly = keyboard.nextLine();
        System.out.println("Do you " +  walk + "your " + " " +blue  +" "+ dog  +" " +  quikly + "? " + "That's hilarious!" );


    }

}

