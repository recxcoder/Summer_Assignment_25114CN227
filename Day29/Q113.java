package Day29;

//Write a program to Create menu-driven calculator.

import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, result;

        while (true) {
            System.out.println("<<--- MENU-DRIVEN CALCULATOR --->>");
            System.out.println("1. Addition(+)");
            System.out.println("2. Subtraction(-)");
            System.out.println("3. Multiplication(*)");
            System.out.println("4. Division(/)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice:");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid Choice! Please enter 1-5");
                continue;
            }

            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;

                case 4:

                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;

                case 5:
                    sc.close();
                    return;
                default:
                    break;
            }

        }

    }
}
