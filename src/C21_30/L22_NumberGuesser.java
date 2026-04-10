package C21_30;
import java.util.Scanner;
import java.util.Random;


public class L22_NumberGuesser {
    public static void main(String[] args) throws InterruptedException {


        selfdestruct();
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
    public static void selfdestruct() throws InterruptedException {
        while (true){

            try {
                System.out.println(5 / 0);
            }
            catch(Exception e) {
                String error = String.valueOf(e);

                System.out.println("""
                        C:\\Users\\merij\\.jdks\\openjdk-25.0.2\\bin\\java.exe "-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2025.3.3\\lib\\idea_rt.jar=58126" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\\Users\\merij\\IdeaProjects\\Java_Tutorial\\out\\production\\Java Tutorial" C21_30.L22_NumberGuesser
                        \u001B[31mException in thread "main" java.lang.ArithmeticException: / by zero
                        	at C21_30.L22_NumberGuesser.selfdestruct(L22_NumberGuesser.java:56)
                        	at C21_30.L22_NumberGuesser.main(L22_NumberGuesser.java:10)\u001B[0m
                        
                            """
                );

            }
            Thread.sleep(1000);
        }


    }
}
