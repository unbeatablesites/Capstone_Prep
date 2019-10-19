import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10");

        String userInput = scan.nextLine();

        int number = Integer.parseInt(userInput);

        do {

            scan = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 10");

            userInput = scan.nextLine();

            number = Integer.parseInt(userInput);


        }while (number < 1 || number > 10);

        System.out.println( "Good job!" + " You picked " + number  );

        }

    }

