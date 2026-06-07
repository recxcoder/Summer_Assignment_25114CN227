package Day04;

//Write a program to Generate Fibonacci series
//e.g. 0,1,1,2,3,5,8,13,21...
// long data type is used to prevent from overflow

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms of series: ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;
        long a = num1, b = num2;

        System.out.print("Fibonacci series: " + num1 + ", " + num2);

        for (int i = 0; i < n - 2; i++) {
            long c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

        sc.close();
    }
}
