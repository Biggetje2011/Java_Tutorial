import java.util.Scanner;

public class A_Useful_code {

    public static void main(String[] args) {

        //Yes or No
        Scanner scanner = new Scanner(System.in);
        String temp;
        char answer;
        boolean variable;

        temp = scanner.nextLine().toUpperCase();
        answer = temp.charAt(0);
        if ('Y' == answer) {
            variable = true;
        } else {
            variable = false;
        }
        System.out.println(variable);

        //even checker
        String variable2;
        int number = 2;
        variable2 = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(variable2);
    }
}