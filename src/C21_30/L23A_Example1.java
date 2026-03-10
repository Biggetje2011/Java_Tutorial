package C21_30;

import java.util.Scanner;

public class L23A_Example1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int loop;

        System.out.print("Enter how many times you want to loop: ");
        loop = scanner.nextInt();

        for (int i = 0; i < loop; i++) {
            System.out.println(i+1);
        }


    }
}
