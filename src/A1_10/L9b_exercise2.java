package A1_10;

import java.util.Scanner;

public class L9b_exercise2 {
    public static void main(String[] args){

        //decleration
        Scanner scanner = new Scanner(System.in);
        double radius;
        double diameter;
        double area;
        double circumference;
        double pi = Math.PI;

        //input
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        diameter = 2*radius;

        //calculating
        circumference = pi*diameter;
        area = pi*Math.pow(radius, 2);

        //output
        System.out.printf("\nDiameter: %.1f",diameter);
        System.out.printf("\nArea: %.1f",area);
        System.out.printf("\nCircumference: %.1f",circumference);
    }
}
