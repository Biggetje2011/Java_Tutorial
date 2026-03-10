package C21_30;
import java.util.Scanner;
import java.util.Random;


public class L22_NumberGuesser {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String temp;
        int guess = -1;
        int number = random.nextInt(0,101);
        char answer;

        System.out.println("I am thinking of a number, what do you think it is?");
        while (guess != number){
            System.out.print("Enter the number: ");
            guess = scanner.nextInt();

            if (guess == -10){
                System.out.println(number);
            }
            else if (guess < number-20){
                System.out.println("That is way too low");
            }
            else if (guess > number + 20) {
                System.out.println("That is way too high");
            }
            else if (guess < number){
                System.out.println("That is too low");
            }
            else if (guess > number) {
                System.out.println("That is too high");
            }
            else{
                System.out.println("That is correct");
                scanner.nextLine();

                System.out.print("Would you like to keep playing? ");
                temp = scanner.nextLine().toUpperCase();
                answer = temp.charAt(0);
                if ('Y' == answer) {
                    guess = -1;
                    number = random.nextInt(0,101);
                }
            }

            System.out.println();
        }
    }
}
