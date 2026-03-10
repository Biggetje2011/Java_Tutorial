package A1_10;

import java.util.Scanner;

public class L4_mad_libs {

    public static void main(String[] args){

        //Assigning variables
        Scanner scanner = new Scanner(System.in);
        String adjective1 = "adjective1";
        String adjective2 = "adjective2";
        String noun1 = "noun1";
        String verb1 = "verb1";

        //Printing unfilled text
        System.out.println("The ("+adjective1+") person went to the store.");
        System.out.println("He bought a ("+noun1+").");
        System.out.println("The ("+noun1+") was ("+adjective2+").");
        System.out.println("At last he ("+verb1+") the ("+noun1+").");

        //Fill the gaps
        System.out.print("\nadjective1: ");
        adjective1 = scanner.nextLine();
        System.out.print("noun1: ");
        noun1 = scanner.nextLine();
        System.out.print("adjective2: ");
        adjective2 = scanner.nextLine();
        System.out.print("verb1: ");
        verb1 = scanner.nextLine();

        //Result
        System.out.println("\nResult:");
        System.out.println("The "+adjective1+" person went to the store.");
        System.out.println("He bought a "+noun1+".");
        System.out.println("The "+noun1+" was "+adjective2+".");
        System.out.println("At last he "+verb1+" the "+noun1+".");

        scanner.close();
    }
}
