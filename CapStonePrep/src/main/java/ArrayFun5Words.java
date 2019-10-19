import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        wordsIntoArray();

    }


    public static void wordsIntoArray(){


        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];

        int i = 0;

//        while (i < 5){

            for(i = 0; i < 5; i++){
                System.out.println("Enter a word to enter into the array");
                array[i] = scan.nextLine();
            }
            System.out.println(Arrays.toString(array));
//        }



    }
}

