package B11_20;

public class L18_Enhanced_switch {
    public static void main(String[] args){

        String day = "Sunday";

        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                    -> System.out.println("It's a weekday");
            case "Saterday", "Sunday"
                    -> System.out.println("It's the weekend");
            default
                    -> System.out.println("That is not a day");

        }
    }
}
