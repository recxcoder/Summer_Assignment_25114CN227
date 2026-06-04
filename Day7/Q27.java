package Day7;

//Write a program to Recursive sum of digits. 

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = sum(n);
        System.out.print("Digits of " + n + " are: ");
        System.out.print(result);

        sc.close();
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        n /= 10;
        return digit + sum(n);
    }
}
