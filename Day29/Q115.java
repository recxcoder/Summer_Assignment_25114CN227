package Day29;

//Write a program to Create menu-driven string operations system

import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";

        while (true) {
            System.out.println("\n<<--- STRING OS --->>");
            System.out.println("1. Add String");
            System.out.println("2. Display String");
            System.out.println("3. Delete Substring");
            System.out.println("4. Length of String");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please choose 1-5");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.println("String saved.");
                    break;

                case 2:
                    if (str.isEmpty()) {
                        System.out.println("String is empty.");
                    } else {
                        System.out.println("Current String: \"" + str + "\"");
                    }
                    break;

                case 3:
                    if (str.isEmpty()) {
                        System.out.println("String is empty.");
                    } else {
                        System.out.print("Enter text to delete: ");
                        String deleteText = sc.nextLine();
                        if (str.contains(deleteText)) {
                            str = str.replace(deleteText, "");
                            System.out.println("Text deleted. Updated string: \"" + str + "\"");
                        } else {
                            System.out.println("Text not found!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Length of the string: " + str.length() + " characters.");
                    break;

                case 5:
                    System.out.println("Exiting System.");
                    sc.close();
                    return;

                default:
                    break;
            }
        }
    }
}
