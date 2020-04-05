package org.fasttrackit.inputprocessingoutput;

public class Numbers {

    public static int getSum(int firstNumber, int secondNumber) {

        int sum = firstNumber + secondNumber;
        sum = firstNumber + secondNumber;
        System.out.println(sum);

        return sum;

    }

    public static int getDif(int firstNumber, int secondNumber) {
        int dif = secondNumber - firstNumber;
        dif = firstNumber - secondNumber;
        System.out.println(dif);
        return dif;
    }


    public static double getSum(double firstNumber, double secondNumber){

        double sum = firstNumber + secondNumber;
        sum = firstNumber +secondNumber;
        System.out.println(sum);
        return sum;
    }
    public static double getDif(double firstNumber, double secondNumber) {
        double dif = firstNumber/secondNumber;
        dif = firstNumber/secondNumber;
        System.out.println(dif);
        return dif;
    }
}