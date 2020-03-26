package org.fasttrackit.inputprocessingoutput;

import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int age, retirementAge;
        System.out.println("What is your current age? ");
        age = scanner.nextInt();
        System.out.println("What is your retirement age?");
        retirementAge = scanner.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("You have " + (retirementAge - age) + " years until you retire" + "\n" + "It's "+ Calendar.getInstance().get(Calendar.YEAR) + " now, so you can retire in  " + ((Calendar.getInstance().get(Calendar.YEAR) + (retirementAge-age)) ));



    }
}

