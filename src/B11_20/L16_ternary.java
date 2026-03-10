package B11_20;

public class L16_ternary {
    public static void main(String[] args){

        //test
        int score = 50;
        String bigger;
        bigger = (score>60) ? "Pass" : "Fail";
        System.out.println(bigger);

        //even checker
        String variable;
        int number = 2;
        variable = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(variable);

        //time
        int hours = 5;
        String dayPart = (hours<12) ? " A.M." : " P.M.";
        System.out.println(hours+dayPart);

        //salary
        int income = 20000;
        int newIncome;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}
