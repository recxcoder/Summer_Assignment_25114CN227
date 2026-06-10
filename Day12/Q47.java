package Day12;

// Write a program to Write function for Fibonacci.

import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            sc.close();
            return;
        }
        System.out.println("Fibonacci series upto " + terms + " terms are:");
        fibonacci(terms);

        sc.close();
    }

    public static int fibonacci(int n) {
        int a = 0, b = 1;
        if (n >= 1) {
            System.out.print(a);
        }
        if (n >= 2) {
            System.out.print(", " + b);
        }
        for (int i = 1; i <= n - 2; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();

        return 0;
    }
}
