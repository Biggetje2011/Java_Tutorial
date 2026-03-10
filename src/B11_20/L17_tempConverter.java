package B11_20;

import java.util.Scanner;

public class L17_tempConverter {
    public static void main(String[] args){

        //declaration
        Scanner scanner = new Scanner(System.in);
        int choice;
        double celsius;
        double fahrenheit;

        //input
        System.out.println("Temperature Conversion Program");
        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Choice: ");
        choice = scanner.nextInt();

        //processing
        if (choice==1){
            System.out.print("\nEnter the temperature in Celsius: ");
            celsius = scanner.nextDouble();
            fahrenheit = (celsius*1.8)+32;

            System.out.printf("The temperature in Fahrenheit: %.2f", fahrenheit);

        } else if (choice==2) {
            System.out.print("\nEnter the temperature in Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            celsius = (fahrenheit-32)*5/9;

            System.out.printf("\nThe temperature in Celsius: %.2f", celsius);



        } else {
            System.out.println("\nNot a valid choice");
        }


        scanner.close();
    }
}
