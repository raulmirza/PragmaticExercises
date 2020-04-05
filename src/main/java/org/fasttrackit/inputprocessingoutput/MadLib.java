package org.fasttrackit.inputprocessingoutput;



import java.util.Scanner;

public class MadLib {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String dog, walk, quickly, blue;

        System.out.println("Enter a noam: " );
        dog = keyboard.nextLine();
        System.out.println("Enter an adjective: ");
        blue = keyboard.nextLine();
        System.out.println("Enter a verb: ");
        walk = keyboard.nextLine();
        System.out.println("Enter an adverb: ");
        quickly = keyboard.nextLine();
        System.out.println("Do you " +  walk + "your " + " " +blue  +" "+ dog  +" " +  quickly + "? " + "That's hilarious!" );


    }

}

