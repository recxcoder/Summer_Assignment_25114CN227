package Day26;

// Write a program to Create voting eligibility system.

import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("Invalid age");
            sc.close();
            return;
        }
        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting, as your age is less than 18 years");
        }

        sc.close();
    }
}
