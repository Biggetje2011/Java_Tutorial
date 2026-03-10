package B11_20;

import java.util.Scanner;

public class L19_calculator {
    public static void main(String[] args){

        //declaration
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double ans = 0;
        char operator = '0';

        //input
        System.out.print("Enter the first number: ");
        a = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter an operator (+, -, x, /, ^'x^y')");
        operator = scanner.nextLine().charAt(0);

        System.out.print("Enter the second number: ");
        b = scanner.nextDouble();

        //processing
        System.out.println(" ");
        switch (operator){
            case '+'        -> ans = a+b;
            case '-'        -> ans = a-b;
            case 'x', 'X'   -> ans = a*b;
            case '/'        -> ans = a/b;
            case '^'        -> ans = Math.pow(a,b);
            default ->
                    System.out.println("Operator was not selected, answer set to 0");
        }

        //output
        if (b == 0 && '/' == operator){
            System.out.println("dividing by 0 is not possible");
        }else {
            System.out.printf("The result equals: %.2f", ans);
        }
    }
}
