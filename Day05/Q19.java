//Write a program to Print factors of a number

package Day05;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 1) {
            System.out.println("Enter a positive integer: ");
            sc.close();
            return;
        }

        System.out.print("Factors of " + num + " are: ");

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        for (int i = (int) Math.sqrt(num); i >= 1; i--) {
            if (num % i == 0) {
                if (i * i == num) {
                    continue;
                }
                System.out.print(num / i + " ");
            }
        }

        sc.close();
    }
}


// This question made me mad. It take almost 40-50 minutes to solve with better Time Complexity