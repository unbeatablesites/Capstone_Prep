public class SomeMath {

    public static void main(String[] args) {

        System.out.println("The total of the numbers is " + total5( 10,10,10,10,10));
        System.out.println("The average  of all the numbers is " + average5( 10 ,10,10,10,10));
        System.out.println("The largest number in the group is " + largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }

    public static int total5(int a, int b, int c, int d, int e){

        return a + b + c + d + e;
    }

    public static int average5(int a, int b, int c, int d, int e){
        return (a + b + c + d + e) / 5;
    }

    public static double largest5( double a, double b, double c, double d, double e) {

        if (a >= b || a >= c || a >= d || a >= e) {
            return a;
        }

        if (b >= a || b >= c || b >= d || b >= e) {
            return b;
        }

        if (c >= a || c >= b || c >= d || c >= e) {
            return c;
        }

        if (d >= a || d >= b || d >= c || d >= e) {
            return d;
        }

        if (e >= a || e >= b || e >= c || e >= d) {
            return e;
        }
        return 0;
    }
}



