//Write a program to Check perfect number.

package Day5;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a Perfect number.");
            return;
        }

        int sumOfFactor = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num) {
                    sumOfFactor += i + (num / i);
                } else
                    sumOfFactor += i;
            }
        }

        if (sumOfFactor == num) {
            System.out.println(num + " is a Perfect number.");
        } else
            System.out.println(num + " is not a Perfect number.");

        sc.close();
    }
}
