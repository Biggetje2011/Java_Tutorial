package A1_10;

import java.util.Scanner;

public class L9a_exercise1 {
    public static void main(String[] args){

        //decleration
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        //input
        System.out.println("This is a right triangle calculator");
        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        //calculating
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        //output
        System.out.println("The length of side C is "+c);

        scanner.close();
    }
}
