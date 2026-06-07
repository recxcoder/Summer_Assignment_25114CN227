package Day04;

//Write a program to Find nth Fibonacci term.

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term: ");
        int n = sc.nextInt();

        long a = 0, b = 1;

        if (n == 1) {
            System.out.println(n + " term of Fibonacci is = " + a);
        } else {
            for (int i = 0; i < n - 2; i++) {
                long c = a + b;
                a = b;
                b = c;
            }
            System.out.println(n + " term of Fibonacci is = " + b);
        }

        sc.close();
    }
}
