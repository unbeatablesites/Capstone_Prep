import java.util.Scanner;

public class ConverterApplication {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ConvertIf convertIf = new ConvertIf();
        ConvertSwitch convertSwitch = new ConvertSwitch();

        int userDayInput = scan.nextInt();
        int userMonthInput = scan.nextInt();

        System.out.println(convertIf.convertDay(userDayInput));
        System.out.println(convertIf.convertMonth(userMonthInput));
        System.out.println("=================Switch===========");
        System.out.println(convertSwitch.convertDay(userDayInput));
        System.out.println(convertSwitch.convertMonth(userMonthInput));
    }

}
