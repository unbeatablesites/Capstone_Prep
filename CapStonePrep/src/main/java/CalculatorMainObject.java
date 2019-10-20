public class CalculatorMainObject {

    public static void main(String[] args) {
        CalculatorObject calculatorObject = new CalculatorObject();
        System.out.println("===INT===");
        System.out.println(calculatorObject.add(2,2));
        System.out.println(calculatorObject.sub(2,3));
        System.out.println(calculatorObject.multi(10,10));
        System.out.println(calculatorObject.div(100,10));

        System.out.println();
        System.out.println();
        System.out.println("===DOUBLE===");

        System.out.println(calculatorObject.add(1.1,1));
        System.out.println(calculatorObject.sub(1.1,1.2));
        System.out.println(calculatorObject.multi(1.1,2.2));
        System.out.println(calculatorObject.div(1.1,2.2));


    }





}
