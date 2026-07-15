package com.cl.calculator;
import java.util.Scanner;

public class CalculatorClass{
    Calculator addition = (a,b) -> a+b;
    Calculator subtraction = (a,b) -> a-b;
    Calculator multiplication = (a,b) -> a*b;
    Calculator division = (a,b) -> {
        try{
            if(b!=0){
                return a/b;
            }else{
                throw new DivisionByZeroCustomException("Divisor cannot be zero");
            }
        }catch (DivisionByZeroCustomException e){
            System.out.println(e.getMessage());
            return -1;
        }
    };
    void calculate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + addition.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Division: " + division.calculate(a, b));

        sc.close();
    }

    public static void main(String[] args) {
        CalculatorClass cal = new CalculatorClass();
        cal.calculate();
    }
}
