package A1_10;

public class L10_printf {

    public static void main(String[] args){

        //assigning
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %04d years old\n", age);
        System.out.printf("You are %4d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("You are % .2f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);
    }
}
