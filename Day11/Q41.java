package Day11;

//Write a program to Write function to find sum of two numbers

import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + sum(a, b));

        sc.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
