package C21_30;

import java.util.Scanner;

public class L25A_Example1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol;

        System.out.print("Enter the amount of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the amount of rows: ");
        rows = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter the symbol to use: ");
        symbol = scanner.nextLine();

        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
