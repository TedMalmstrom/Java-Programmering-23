package My_code.My_E.My_E4;
import java.util.Scanner;

public class MyMathMethods {
    public static int calculateFactorial(int number) {
        int factorial = 1;

        if(number < 0) {
            System.out.println("Error");
            return 0;
        }

        if (number == 0) {
            factorial = 1;
            return factorial;
        }

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }

        return factorial;
    }

    public static int calculateFibonacci(int number) {
        //F(n) = F(n-1) + F(n-2) ex.0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        if (number <= 0) {
            System.out.println("Error");
        }

        if (number == 1 || number == 2) {
            return number = 1;
        }

        int previous = 0;
        int current = 1;
        int fibonacci = 0;

        for (int i = 3; i <= number; i++) {
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;    
        }

        return fibonacci;
    }

    public static boolean isPrime(int number) {
        // number = prime true or false
        // prime = fasle if number / 2 = two of the same numbers
        // i % 2
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*        System.out.println("Factorial: Enter number...");
        int factorialInput = scanner.nextInt();
        int factorialResult = calculateFactorial(factorialInput);
        System.out.println("Result: " + factorialResult);
        */

        System.out.println("Fibonacci: Enter number...");
        int fibonacciInput = scanner.nextInt();
        int fibonacciResult = calculateFibonacci(fibonacciInput);
        System.out.println("Result: " + fibonacciResult);
        
        scanner.close();
    }
}

