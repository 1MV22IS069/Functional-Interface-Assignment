package com.cl.utils;

import com.cl.areacalculator.AreaImplementation;
import com.cl.bonuscalculator.CalculateBonusImplementation;
import com.cl.calculator.CalculatorClassImplementation;
import com.cl.stringoperation.PerformOperation;

import java.util.Scanner;

public class Utils {

    public void showMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your choice:");
        System.out.println("1. Calculator");
        System.out.println("2. Bonus Calculator");
        System.out.println("3. String Operations");
        System.out.println("4. Area Calculator");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                CalculatorClassImplementation calculator = new CalculatorClassImplementation();
                calculator.calculate();
                break;

            case 2:
                CalculateBonusImplementation bonus = new CalculateBonusImplementation();
                bonus.calculateBonus();
                break;

            case 3:
                PerformOperation operation = new PerformOperation();
                operation.performOperations();
                break;

            case 4:
                AreaImplementation area = new AreaImplementation();
                area.calculateArea();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}