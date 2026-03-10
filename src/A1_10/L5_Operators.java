package A1_10;

public class L5_Operators {

    public static void main(String[] args) {

        // ORDER OF OPERATIONS [ P E  M D A S]
        //                      () x² * / + -

        //declarations
        double x = 1;
        double y = 3;
        double z;


        //addition
        z = x+y;
        System.out.println(z);
        //subtraction
        z = x-y;
        System.out.println(z);
        //multiplication
        z = x*y;
        System.out.println(z);
        //division
        z = x/y;
        System.out.println(z);
        //remainder, nice for checking for even
        z= x%y;
        System.out.println(z);


        //augmented assignment operators
        //addition
        x += y;
        System.out.println("\n"+x);
        //subtraction
        x -= y;
        System.out.println(x);
        //multiplication
        x *= y;
        System.out.println(x);
        //division
        x /= y;
        System.out.println(x);
        //remainder
        x %= y;
        System.out.println(x);


        //Increment and Decrement Operators
        //adds 1
        x++;
        System.out.println(x);
        //subtracts 1
        x--;
        System.out.println(x);
    }
}
