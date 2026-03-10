package C21_30;

import java.util.Scanner;

public class L21_whileLoops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.printf("Welcome %s", name);

        scanner.close();
    }
}
