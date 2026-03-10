package A1_10;

public class L9_Math_class {
    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        //x to the power of y
        double result;
        result = Math.pow(2, 10);
        System.out.println(result);

        //absolute
        result = Math.abs(-5);
        System.out.println(result);

        //square root
        result = Math.sqrt(16);
        System.out.println(result);

        //round
        result = Math.round(3.3);
        System.out.println(result);

        //always round up
        result = Math.ceil(3.3);
        System.out.println(result);

        //always round down
        result = Math.floor(3.6);
        System.out.println(result);

        //Biggest number
        result = Math.max(10, 20);
        System.out.println(result);

        //Smallest number
        result = Math.min(10, 20);
        System.out.println(result);
    }
}
