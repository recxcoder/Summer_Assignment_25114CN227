package Day29;

//Write a program to Create inventory management system.

import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();

        int[] srlNum = new int[capacity];
        String[] names = new String[capacity];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add");
            System.out.println("2. Display");
            System.out.println("3. Delete");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice! Please enter 1-4.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (count >= capacity) {
                        System.out.println("Inventory is Full!");
                    } else {
                        System.out.print("Enter Seriel Number: ");
                        srlNum[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        count++;
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Inventory is Empty.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + srlNum[i] + " | Name: " + names[i]);
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Inventory is Empty.");
                    } else {
                        System.out.print("Enter seriel number to delete: ");
                        int deleteSrlNum = sc.nextInt();
                        int index = -1;

                        // Find the item index
                        for (int i = 0; i < count; i++) {
                            if (srlNum[i] == deleteSrlNum) {
                                index = i;
                                break;
                            }
                        }

                        if (index == -1) {
                            System.out.println("Item not found.");
                        } else {
                            for (int i = index; i < count - 1; i++) {
                                srlNum[i] = srlNum[i + 1];
                                names[i] = names[i + 1];
                            }
                            count--;
                            System.out.println("Item deleted from inventory.");
                        }
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting.");
                    sc.close();
                    return;

                default:
                    break;
            }
        }
    }
}
