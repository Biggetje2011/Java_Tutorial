package A1_10;

public class L3_variable {

    public static void main(String[] args){

        //defining
        int age = 14;
        int year = 2026;
        double price = 2.99;
        char grade = 'A';
        boolean isAlive = false;
        boolean forSale = true;
        String name = "Biggetje";
        String mail = "fakemail@gmail.com";
        String car = "Ferrari";

        //printing
        System.out.println("I am "+age+" years old");
        System.out.println("The year is "+year);

        System.out.println("The price is $"+price);

        System.out.println("I got an "+grade+" for my last test");

        if(isAlive){
            System.out.println("He is alive");
        }
        else{
            System.out.println("He isn't alive");
        }

        System.out.println("My name is "+name);
        System.out.println("Send mails to "+mail);

        System.out.println("I am "+name+", I am "+age+" years old and my mail is "+mail+".");
        if (forSale) {
            System.out.println("The price of the " + car + " is $" + price);
        }
        else {
            System.out.println("You can not buy this car");
        }
    }
}
