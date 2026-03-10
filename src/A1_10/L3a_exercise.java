package A1_10;

import java.util.Scanner;

public class L3a_exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a square calculator");
        System.out.print("Please input the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Please input the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println();

        double area = width*length;
        double perimeter = 2*(length+width);
        System.out.println("The area is: "+area);
        System.out.println("The perimeter is: "+ perimeter);

        scanner.close();
    }
}
