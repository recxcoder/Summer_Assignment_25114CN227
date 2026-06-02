//Write a program to Find largest prime factor.

package Day5;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " have no prime factor.");
            sc.close();
            return;
        }
        int temp = num;
        int largestPrimeFactor = -1;

        while (temp % 2 == 0) {
            largestPrimeFactor = 2;
            temp /= 2;
        }

        for (int i = 3; i * i <= temp; i++) {
            while (temp % i == 0) {
                largestPrimeFactor = i;
                temp /= i;
            }
        }
        if (temp > 2) {
            largestPrimeFactor = temp;
        }

        System.out.println(largestPrimeFactor + " is the largest prime factor of " + num);

        sc.close();
    }
}

// I try it in better way that reduce the time complexity;