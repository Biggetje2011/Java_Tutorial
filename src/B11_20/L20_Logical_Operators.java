package B11_20;

import org.w3c.dom.ls.LSOutput;

public class L20_Logical_Operators {
    public static void main(String[] args){

        //AND = &&
        //OR = ||
        //NOT = !

        double temp = 20;
        boolean isSunny = true;

        if (temp>15 && temp<25 && isSunny){
            System.out.println("That's good weather");
        } else if (temp>15 && temp<25 && !isSunny) {
            System.out.println("Its still a good temperature, too bad about the clouds");
        } else if (temp>10 && temp<15) {
            System.out.println("You should wear a jacket");
        } else if (temp<10) {
            System.out.println("It's pretty cold");
        } else if (temp>25) {
            System.out.println("It's pretty hot");
        }
    }
}
