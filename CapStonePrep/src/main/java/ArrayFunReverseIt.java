import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayFunReverseIt {

    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {

        int[] rev = new int[]{1, 2, 3, 4, 5};

        String print2 = Arrays.toString(rev);

        System.out.println(print2);

        for (int i = 0; i < rev.length / 2; i++) {
            int temp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = temp;
        }


        String print = Arrays.toString(rev);

        System.out.println(print);



    }
}
