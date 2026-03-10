package C21_30;

import java.util.Scanner;

public class L21A_Example_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");

            response = scanner.nextLine().toUpperCase();
        }




        System.out.println("You exited the game");

        scanner.close();
    }
}
