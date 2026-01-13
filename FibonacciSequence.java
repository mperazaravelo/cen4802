public class Fibonacci {

    public static int FibonacciSum(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            return FibonacciSum(n-1) + FibonacciSum(n-2);
        }
    }

    public static void main(String [] args){
        int num = 10;
        int result = FibonacciSum(num);
        System.out.println("The 10th term of the Fibonacci sequence is " + result);
    }
}
