package C21_30;

import java.util.Random;
import java.util.Scanner;

public class L30_DiceRolling {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;
        int rolls;
        int eyes;

        System.out.print("Enter the amount of rolls: ");
        rolls = scanner.nextInt();
        for (int i = 0; i < rolls; i++) {
            eyes = random.nextInt(1,7);
            printDie(eyes);
            System.out.println("You rolled "+eyes+"\n");
            total += eyes;
        }
        System.out.println("Your roll total is "+total);
    }
    public static void printDie(int eyes){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------""";
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------""";
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------""";
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------""";
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------""";
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------""";

        if (eyes == 1){
            System.out.println(dice1);
        } else if (eyes == 2) {
            System.out.println(dice2);
        } else if (eyes == 3) {
            System.out.println(dice3);
        } else if (eyes == 4) {
            System.out.println(dice4);
        } else if (eyes == 5) {
            System.out.println(dice5);
        } else if (eyes == 6) {
            System.out.println(dice6);
        }


    }
}
