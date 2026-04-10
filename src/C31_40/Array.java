package C31_40;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        String[] fruits = {"apple", "banana", "orange"};

        fruits[0] = "pear";
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);
        Arrays.sort(fruits);

        for (int i = 0; i < numOfFruits; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println();

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
