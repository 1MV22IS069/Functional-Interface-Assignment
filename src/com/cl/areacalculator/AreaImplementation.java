package com.cl.areacalculator;
import java.util.Scanner;

public class AreaImplementation {
    double PI = 3.14;
    AreaTriangle areaT = (b,h) -> (0.5*b*h);
    AreaCircle areaC = (r) -> (PI*r*r);
    AreaRectangle areaR = (l,b) -> (l*b);

    public void calculateArea() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");

        System.out.print("Select operation: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();

                System.out.print("Enter height: ");
                double height = sc.nextDouble();

                System.out.println("Triangle Area: " + areaT.areaCalculate(base, height));
                break;

            case 2:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                System.out.println("Circle Area: " + areaC.areaCalculate(radius));
                break;

            case 3:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();

                System.out.println("Rectangle Area: " + areaR.areaCalculate(length, breadth));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

}
