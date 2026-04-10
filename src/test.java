import java.util.*;

public class test {
    public static void main(String[] args){
        Random random = new Random();

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            newList.add(random.nextInt(0,101));
        }
        Collections.sort(newList);

        for (int i = 0; i < newList.toArray().length; i++) {
            System.out.print(newList.toArray()[i] + " ");
        }
    }
}