package A1_10;

import java.util.Scanner;

public class L7_statements {
    public static void main(String[] args){

        //assigning
        Scanner scanner = new Scanner(System.in);
        String name;
        String temp;
        char answer;
        int age;
        boolean isStudent;


        //Questions
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        if (name.isBlank()){
            System.out.println("You didn't enter your name.");
        }
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Are you a student? ");
        temp = scanner.nextLine().toUpperCase();
        answer = temp.charAt(0);
        if ('Y' == answer) {
             isStudent = true;
        }
        else{
            isStudent = false;
        }

        System.out.println();

        //Name
        if (!name.isBlank()){
            System.out.println("Welcome "+name);
        }

        //Age
        if (age >= 65){
            System.out.println("You are a senior!");
        }
        else if (age >= 18) {
            System.out.println("You are an adult.");
        }
        else if (age > 10) {
            System.out.println("You are a teenager.");
        }
        else if (age >= 4){
            System.out.println("You are a child.");
        }
        else if (age >= 0){
            System.out.println("You are a baby.");
        }
        else {
            System.out.println("That's not a valid age");
        }

        //Student
        if (isStudent){
            System.out.println("You are a student.");
        }
        else {
            System.out.println("You are not a student.");
        }
        scanner.close();
    }
}
