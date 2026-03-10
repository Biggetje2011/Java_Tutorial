package A1_10;

import java.util.Scanner;

public class L6_Shopping_cart {

    public static void main(String[] args){

        //Assigning
        Scanner scanner = new Scanner(System.in);
        String item;
        String temp;
        double price;
        int quantity;
        char currency = '$';
        double total = 0;
        boolean shopping = true;
        char answer;


        while (shopping) {
            //buying
            System.out.print("What item would you like to buy: ");
            item = scanner.nextLine();
            System.out.print("How many dollars is the " + item + ": ");
            price = scanner.nextDouble();
            System.out.print("How many do you want to buy: ");
            quantity = scanner.nextInt();
            scanner.nextLine();

            //sub-total
            total += quantity * price;
            System.out.println("\nYour current total is "+currency+total);

            //do you want to keep shopping
            System.out.print("Would you like to keep shopping? (Y/N)");
            temp = scanner.nextLine().toUpperCase();
            answer = temp.charAt(0);
            if ('N' == answer) {
                shopping = false;
            }

        }
        //total
        System.out.print("\nYour total will be "+currency+total);

        scanner.close();
    }
}
