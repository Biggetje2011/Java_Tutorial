package C21_30;

import java.util.Scanner;

public class L29_BankingProgram{

    static double balance = 100;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        //show balance
        //deposit
        //withdraw
        //exit

        int answer;

        while (true) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice: ");
            answer = scanner.nextInt();

            if (answer == 1){
                showBalance();
            } else if (answer == 2) {
                deposit();
            } else if (answer == 3) {
                withdraw();
            } else if (answer == 4) {
                break;
            } else{
                System.out.println("That is not a valid option");
            }
            System.out.println();
        }
        System.out.println("You have exited the banking program");
    }
    static void showBalance() throws InterruptedException {
        System.out.println("Your current balance is: "+balance);
        Thread.sleep(1000);
    }
    static void deposit() throws InterruptedException {
        System.out.print("How much money would you like to deposit: ");
        double deposit = scanner.nextDouble();
        balance += deposit;
        showBalance();
    }
    static void withdraw() throws InterruptedException {
        System.out.print("How much money would you like to withdraw: ");
        double withdraw = scanner.nextDouble();
        if (withdraw <= balance) {
            balance -= withdraw;
            showBalance();
        }else {
            System.out.println("You don't have enough balance");
            Thread.sleep(1000);
        }
    }
}
