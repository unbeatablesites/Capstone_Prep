import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        array();

    }

    public static void array(){


        Scanner scan = new Scanner(System.in);

        System.out.println(" Please enter a number ");

        String userInput1 = scan.nextLine();

        int number1 = Integer.parseInt(userInput1);

        System.out.println(" Please enter a number ");

        String userInput2 = scan.nextLine();

        int number2 = Integer.parseInt(userInput2);

        System.out.println(" Please enter a number ");

        String userInput3 = scan.nextLine();

        int number3 = Integer.parseInt(userInput3);

        System.out.println(" Please enter a number ");

        String userInput4 = scan.nextLine();

        int number4 = Integer.parseInt(userInput4);

        System.out.println(" Please enter a number ");

        String userInput5 = scan.nextLine();

        int number5 = Integer.parseInt(userInput5);

        int arr[] = {number1,number2,number3,number4,number5};

        String stringArr = Arrays.toString(arr);

        System.out.println(stringArr);







    }
}
