package Day11;

// Write a program to Write function to find maximum.

import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println(findMax(num1, num2, num3) + " is the Maximum number among " + num1 + ", " + num2 + ", " + num3);

        sc.close();
    }

    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
