//Write a program to Find sum of digits of a number.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int originalNumber = n;
        int sum = 0;

        while (n != 0) {
            int digits = n % 10;
            sum += digits;
            n /= 10;
        }

        System.out.println("Sum of digits of " + originalNumber + " = " + sum);

        sc.close();
    }
}