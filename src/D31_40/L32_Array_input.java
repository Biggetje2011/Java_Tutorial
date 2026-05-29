package D31_40;
import java.util.Scanner;

public class L32_Array_input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int amount;

        System.out.print("How many items do you want in your array: ");
        amount = scanner.nextInt();
        scanner.nextLine();

        String[] list = new String[amount];

        for (int i = 0; i < list.length; i++) {
            System.out.print("add item: ");
            list[i] = scanner.nextLine();
        }
        for(String item : list){
            System.out.println(item);
        }
    }
}
