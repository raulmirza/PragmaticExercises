package org.fasttrackit.inputprocessingoutput;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrintingQuotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String author, quote;
        System.out.println("What is the quote? ");
        quote = scanner.nextLine();
        System.out.println("Who said it? ");
        author = scanner.nextLine();
        System.out.println(author + " says, " + quote);

    }


    }




