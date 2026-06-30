package Day29;

//Write a program to Create menu-driven array operations system.

import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum capacity of the array: ");
        int capacity = sc.nextInt();

        int[] arr = new int[capacity];
        int count = 0;

        while (true) {
            System.out.println("\n<<--- ARRAY OPERATING MENU --->>");
            System.out.println("1. Insert an Element");
            System.out.println("2. Delete an Element");
            System.out.println("3. Search for an Element");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice:");
            int choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please enter 1-5");
                continue;
            }

            switch (choice) {
                case 1:
                    if (count >= capacity) {
                        System.out.println("Array is full!");
                    } else {
                        System.out.print("Enter element: ");
                        int element = sc.nextInt();
                        arr[count] = element;
                        count++;
                    }
                    break;
                case 2:
                    if (count <= 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter index to delete:");
                        int deleteIndex = sc.nextInt();

                        if (deleteIndex < 0 || deleteIndex >= count) {
                            System.out.println("Invalid index!");
                        } else {
                            for (int i = deleteIndex; i < count - 1; i++) {
                                arr[i] = arr[i + 1];
                            }
                            count--;
                            System.out.println("Element deleted successfully.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Array: ");
                        for (int i = 0; i < count; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Operations complete successfully.");
                    sc.close();
                    return;
                default:
                    break;
            }

        }
    }
}
