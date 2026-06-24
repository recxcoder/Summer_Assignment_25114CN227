package Day26;

// Write a program to Create ATM simulation.

import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 15300;

        System.out.println("<<--ATM Simulation-->>");

        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Current Balance");

        System.out.print("Choice: ");
        int choice = sc.nextInt();

        if (choice != 1 && choice != 2 && choice != 3) {
            System.out.println("! Invalid choice !");
            sc.close();
            return;
        }

        if (choice == 1) {
            System.out.print("Enter the amount: ");
            int amout = sc.nextInt();

            balance += amout;
            System.out.println("Current Balance: " + balance);
        }

        if (choice == 2) {
            System.out.print("Enter the amount: ");
            int amout = sc.nextInt();
            if (amout > balance) {
                System.out.println("Insufficent Balance");
            } else {
                balance -= amout;
                System.out.println("Current Balance: " + balance);
            }
        }

        if (choice == 3) {
            System.out.println("Current Balance: " + balance);
        }

        sc.close();
    }
}
