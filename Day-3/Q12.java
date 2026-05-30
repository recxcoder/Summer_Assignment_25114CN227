// Write a program to Find LCM of two numbers.
// LCM = (a*b)/GCD

import java.util.Scanner;

public class Q12 {
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

        int lcm = (num1 / a) * num2;  //Prevent against overflow.

        System.out.println("LCM of " + num1 + " & " + num2 + " is = " + lcm);

        sc.close();
    }
}
