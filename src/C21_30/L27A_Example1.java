package C21_30;

public class L27A_Example1 {
    public static void main(String[] args){

        String bread = "flat bread";
        String cheese = "Mozzarella";
        String topping = "Salami";


        String pizza = bakePizza(bread, cheese, topping);
        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread+" pizza";
    }
    static String bakePizza(String bread, String cheese) {
        return bread + " pizza with " + cheese;
    }
    static String bakePizza(String bread, String cheese, String topping) {
        return bread + " pizza with " + cheese + " and "+topping;
    }
}
