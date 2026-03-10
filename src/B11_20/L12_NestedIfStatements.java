package B11_20;

import java.util.Scanner;

public class L12_NestedIfStatements {
    public static void main(String[] args){

        //declaration
        Scanner scanner = new Scanner(System.in);
        String temp;
        char answer;
        boolean isStudent; //10% discount
        boolean isSenior; //20% discount    //both equals 30% discount
        int age;
        double standardPrice = 9.99;
        double price = standardPrice;

        //input
        System.out.print("Are you a student? ");
        temp = scanner.nextLine().toUpperCase();
        answer = temp.charAt(0);
        if ('Y' == answer) {
            isStudent = true;
        } else {
            isStudent = false;
        }

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        if (age>64){
            isSenior = true;
        }
        else{
            isSenior = false;
        }
        System.out.println();

        //calculating
        if (isStudent && isSenior){
            price = standardPrice*0.7;
            System.out.println("You get a 30% discount");
        } else if (isStudent) {
            price = standardPrice*0.9;
            System.out.println("You get a 10% discount");
        } else if (isSenior) {
            price = standardPrice*0.8;
            System.out.println("you get a 20% discount");
        }

        //output
        System.out.printf("Your total price wil be: $%.2f", price);

    }
}
