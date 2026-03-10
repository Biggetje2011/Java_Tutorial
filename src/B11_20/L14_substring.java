package B11_20;

import java.util.Scanner;

public class L14_substring {
    public static void main(String[] args){

        //declaration
        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;
        int temp;

        //input
        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        //processing
        if (email.contains("@")) {
            temp = email.indexOf("@");
            username = email.substring(0, temp);
            domain = email.substring(temp + 1);

            //output
            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("That is not a valid email");
        }

        scanner.close();
    }
}
