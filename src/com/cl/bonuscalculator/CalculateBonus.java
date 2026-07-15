package com.cl.bonuscalculator;
import java.util.Scanner;

public class CalculateBonus {
    BonusCalculator calculate = (sal) -> 0.15 * sal;

    void calculateBonus() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        double bonus = calculate.bonusCalculate(salary);

        System.out.println("Bonus : " + bonus);
        System.out.println("Total : " + (salary + bonus));

        sc.close();
    }

    public static void main(String[] args) {
        CalculateBonus calcBonus = new CalculateBonus();
        calcBonus.calculateBonus();
    }
}
