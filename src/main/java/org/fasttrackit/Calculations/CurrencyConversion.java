package org.fasttrackit.Calculations;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int eurosToExchange = scanner.nextInt();
        System.out.println("What is the exchange rate?");
        double changeRate = scanner.nextDouble();
        double rateTo = 1.08;
        double amountToExchange = eurosToExchange*changeRate/rateTo;
        System.out.println(eurosToExchange + " euros at an exchange rate of " + changeRate + " is " + amountToExchange + " U.S dollars.");
    }
}
