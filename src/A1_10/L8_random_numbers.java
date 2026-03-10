package A1_10;

import java.util.Random;

public class L8_random_numbers {

    public static void main(String[] args){

        //assigning
        Random random = new Random();
        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1,101);
        number2 = random.nextDouble(1,101);
        isHeads = random.nextBoolean();

        //output
        System.out.println(number1);
        System.out.println(number2);
        if (isHeads) {
            System.out.println("The coin flip was heads!");
        }
        else {
            System.out.println("The coin flip was tails!");
        }

    }
}
