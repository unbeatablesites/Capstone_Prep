public class Calculator {

    public static void main(String[] args) {
        divide(12,-4);
    }

public static int divide(int a, int b){

    int answer = a / b;

    if (a == 0 || b == 0){
        System.out.println(answer);
        return 0;
    }
    System.out.println(answer);

    return answer;

}

}
