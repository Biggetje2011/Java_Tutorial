package C21_30;

import java.util.Scanner;

public class L23A_Example2 {
    public static void main(String[] args) throws  InterruptedException{

        Scanner scanner = new Scanner(System.in);
        int start;

        System.out.print("Enter the start number for the countdown: ");
        start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR");

        scanner.close();
    }
}
