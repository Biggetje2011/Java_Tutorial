package B11_20;

import java.util.Scanner;

public class L11_compound_calculator {
    public static void main(String[] args){

        //assigning
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        //input
        System.out.print("Enter the principle amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the amount of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        //calculating
        amount = principal*Math.pow(1+rate/timesCompounded, timesCompounded*years);


        //output
        System.out.printf("\nThe amount equals: $%.2f", amount);


        scanner.close();
    }
}
