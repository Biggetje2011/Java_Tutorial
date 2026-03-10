package C21_30;

public class L24_BreakContinue {
    public static void main(String[] args){

        //breaks = break out all current loops
        //continue = skips the current loop cycle

        for (int i = 0; i < 10; i++) {

            if (i == 5){
                continue;
            }

            System.out.print(i+" ");

        }

    }
}
