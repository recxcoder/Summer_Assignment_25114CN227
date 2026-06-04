package Day7;

//Write a program to Recursive Fibonacci.

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int term = sc.nextInt();

        for (int i = 1; i <= term; i++) {
            int result = fibonacci(i);
            System.out.println(result);
        }

        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
