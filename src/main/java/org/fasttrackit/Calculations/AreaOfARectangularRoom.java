package org.fasttrackit.Calculations;

import java.util.Scanner;

public class AreaOfARectangularRoom {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        double length = scanner.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double width = scanner.nextDouble();
        double feetX2 = length*width;
        double areaOfRoom = length*width;
        double meters = feetX2*0.09290304;
        System.out.println("Area of the room is: " + "\n" + areaOfRoom + " square feet" + "\n" + meters + " square meters");

    }
}
