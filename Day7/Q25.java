package Day7;

//Write a program to Recursive factorial.

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Number can't be negative.");
        } else {
            int result = factorial(n);

            System.out.println(result);
        }
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
