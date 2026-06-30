package Day30;

// Write a program to Create student record system using arrays and strings.

import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum student capacity: ");
        int capacity = sc.nextInt();

        int[] rollNumbers = new int[capacity];
        String[] names = new String[capacity];
        int count = 0; 

        while (true) {
            System.out.println("\n<<--- STUDENT RECORD SYSTEM --->>");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Student ");
            System.out.println("4. Delete Student Record");
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
                    if (count >= capacity) {
                        System.out.println("System full! Cannot add more records.");
                    } else {
                        System.out.print("Enter Roll Number: ");
                        int roll = sc.nextInt();
                        sc.nextLine();

                        boolean isDuplicate = false;
                        for (int i = 0; i < count; i++) {
                            if (rollNumbers[i] == roll) {
                                isDuplicate = true;
                                break;
                            }
                        }

                        if (isDuplicate) {
                            System.out.println("Error: Roll number already exists!");
                        } else {
                            System.out.print("Enter Student Name: ");
                            names[count] = sc.nextLine();
                            rollNumbers[count] = roll;
                            count++;
                            System.out.println("Record added successfully.");
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("Database is empty.");
                    } else {
                        System.out.println("\n--- Student Database ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll No: " + rollNumbers[i] + " | Name: " + names[i]);
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("Database is empty.");
                    } else {
                        System.out.print("Enter Roll Number to search: ");
                        int searchRoll = sc.nextInt();
                        int foundIndex = -1;

                        for (int i = 0; i < count; i++) {
                            if (rollNumbers[i] == searchRoll) {
                                foundIndex = i;
                                break;
                            }
                        }

                        if (foundIndex != -1) {
                            System.out.println("Record Found -> Roll No: " + rollNumbers[foundIndex] + ", Name: " + names[foundIndex]);
                        } else {
                            System.out.println("Student record not found.");
                        }
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("Database is empty.");
                    } else {
                        System.out.print("Enter Roll Number to delete: ");
                        int deleteRoll = sc.nextInt();
                        int deleteIdx = -1;

                        for (int i = 0; i < count; i++) {
                            if (rollNumbers[i] == deleteRoll) {
                                deleteIdx = i;
                                break;
                            }
                        }

                        if (deleteIdx == -1) {
                            System.out.println("Record not found!");
                        } else {
                            for (int i = deleteIdx; i < count - 1; i++) {
                                rollNumbers[i] = rollNumbers[i + 1];
                                names[i] = names[i + 1];
                            }
                            count--;
                            System.out.println("Student record deleted successfully.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting Student System. Program ended.");
                    sc.close();
                    return;
            }
        }
}
