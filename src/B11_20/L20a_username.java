package B11_20;

import java.util.Scanner;

public class L20a_username {
    public static void main(String[] args){

        // username must be between 4-12 characters
        // username must not contain any spaces or underscores

        String username;
        Scanner scanner = new Scanner(System.in);;
        boolean enter = true;

        while (enter){
            System.out.print("Enter your username: ");
            username = scanner.nextLine();

            if (    username.contains(" ")
                        || username.contains("_") ) {
                System.out.println("Username can not include spaces or underscores\n");

            } else if (    username.length() < 4
                        || username.length() > 12){
                System.out.println("Username must be between 4 and 12 characters");
                System.out.printf("Username is currently %d characters long\n\n", username.length());

            } else {
                System.out.println("That is a valid username");
                System.out.printf("Welcome %s", username);
                enter = false;
            }
        }

        scanner.close();
    }
}
