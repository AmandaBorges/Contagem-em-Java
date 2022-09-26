import java.util.Scanner;

public class MaximoDivisor {

    public static int mdc (int n1, int n2){
        int mdc = 1;
        for (int i = 1; i <= n1 && i <= n2; i++){
            if(n1 %i == 0 && n2 % i == 0) {
                mdc = i;
            }
        }
        return mdc;
    }


}

