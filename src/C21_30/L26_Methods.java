package C21_30;

public class L26_Methods {
    public static void main(String[] args){

        //Method = block of reusable code
        drawCube(5,5,"&");
        drawCube(6,10,"$");

        happyBday();
        System.out.println(square(5));
        System.out.println(getFullName("Sir","Pig"));

        System.out.println(legal(65));
    }
    static void happyBday() {
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday dear you\n");
    }
    static void drawCube(int rows, int columns, String symbol){
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }


    }
    static double square(double number){
        return number*number;


    }
    static String getFullName(String firstName, String lastName){
        return firstName+" "+lastName;
    }
    static boolean legal(int age){
        if (age<18){
            return false;
        }else {
            return true;
        }
    }
}
