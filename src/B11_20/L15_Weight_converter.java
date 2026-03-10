package B11_20;

import java.util.Scanner;

public class L15_Weight_converter {
    public static void main(String[] args){

        //declaration
        Scanner scanner = new Scanner(System.in);
        double kilo;
        double pound;
        int choice;

        //input
        System.out.println("Weight Conversion Program");

        System.out.println("1: Pounds to Kilos");
        System.out.println("2: Kilos to Pounds");
        choice = scanner.nextInt();

        //processing
        if (choice ==1){
            System.out.print("\nEnter the weight in Pounds: ");
            pound = scanner.nextDouble();
            kilo = pound/2.20462;

            //output
            System.out.printf("The weight in Kilos is: %.2f kg",kilo);

        } else if (choice ==2) {
            System.out.print("\nEnter the weight in Kilos: ");
            kilo = scanner.nextDouble();
            pound = kilo*2.20462;

            //output
            System.out.printf("The weight in pound is: %.2f lbs", pound);
        } else {
            System.out.println("Not a valid choice.");
        }

        scanner.close();
    }
}
