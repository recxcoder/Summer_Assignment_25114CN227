package Day06;

//Write a program to Find x^n without pow(). 

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double result = 1;

        if (n == 0 && x != 0) {
            System.out.println("x^n = " + result);
            sc.close();
            return;
        }
        if (n == 0 && x == 0) {
            System.out.println("x^n = Undefined(0^0)");
            sc.close();
            return;
        }

        int absN = Math.abs(n);
        for (int i = absN; i > 0; i--) {
            result *= x;
        }

        if (n < 0) {
            result = 1/result;
        }

        System.out.println("x^n = " + result);

        sc.close();
    }
}
