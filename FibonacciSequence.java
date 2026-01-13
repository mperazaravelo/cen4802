/**
 * The Fibonacci class provides a method to calculate the nth term of the Fibonacci sequence using recursion.
 */
public class Fibonacci {
/**
 * Returns the nth term of the Fibonacci sequence using recursion, along with some descriptive text.
 * The n parameter represents the nth position in the Fibonacci sequence.
 *
 * @param n the number representing the position in the Fibonacci sequence
 * @return the nth Fibonacci number
 */
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
 /**
  * Serves as the point of start of the program.
  * It calculates and prints the 10th term of the Fibonacci sequence.
  *
  * @param args command-line arguments (not used)
  */
    public static void main(String [] args){
        int num = 10;
        int result = FibonacciSum(num);
        System.out.println("The 10th term of the Fibonacci sequence is " + result);
    }
}
