package algorithms;

public class Factorial {
    public static int calculate(int n){
        return factorial(n, 1);
    }
    private static int factorial(int n, int result ){
        if(n == 0){
            return result;
        }
        return factorial(n-1, result * n);
    }
}
