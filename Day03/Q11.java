// Write a program to Find GCD of two numbers.
// GDC is just HCF- Highest Common Factor

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();

        int a = num1, b = num2;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("GDC of "+ num1 + " & " + num2 + " = " + a);

        sc.close();
    }
}
