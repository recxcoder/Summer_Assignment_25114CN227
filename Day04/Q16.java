package Day04;

// Write a program to Print Armstrong numbers in a range.

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the last number: ");
        int end = sc.nextInt();

        System.out.print("Armstrong numbers in range of " + start + " to " + end + " are : ");

        for (int i = start; i <= end; i++) {
            if (i < 0) {
                continue;
            }
            int digit = 0;
            int temp = i;

            if (i == 0) {
                digit = 1;
            } else {
                while (temp > 0) {
                    digit++;
                    temp /= 10;
                }
            }

            long sum = 0;
            temp = i;

            while (temp > 0) {
                int d = temp % 10;
                sum += (long) Math.pow(d, digit);
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
