//Write a program to Find product digits.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int originalNumber = num;
        int digit, product = 1;

        if (num == 0) {
            product = 0;
        }

        while (num > 0) {
            digit = num % 10;
            product *= digit;
            num /= 10;
        }
        System.out.println("Product of digits of " + originalNumber + " = " + product);

        sc.close();
    }
}
