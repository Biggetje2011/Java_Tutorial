package C21_30;

import java.util.Scanner;

public class L21A_Example_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int age = -1;

        while (age<0){
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.printf("You are %d years old", age);

        scanner.close();
    }
}
