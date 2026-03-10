package A1_10;

import java.util.Scanner;

public class L2_user_input {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter price of your car: $");
        double carPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Have you played this game before? (Y/N) ");
        String temp = scanner.nextLine();

        boolean playedBefore;

        if (temp.equals("Y")) {
            playedBefore = true;
        }
        else if (temp.equals("N")) {
            playedBefore = false;
        }
        else {
            System.out.println("not a valid input, played before set to false");
            playedBefore = false;
        }

        System.out.println();


        System.out.println("character created");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("car price: $"+carPrice);
        System.out.println("has played game before: "+ playedBefore);
        scanner.close();
    }
}
