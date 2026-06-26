package Day27;

// Write a program to Create student record management system

import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        int[] studentID = new int[100];
        String[] branch = new String[100];

        int count = 0;
        int choice;

        do {
            System.out.println("1. View Student record");
            System.out.println("2. Add a student to record");
            System.out.println("3. Remove a student from record");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (count <= 0) {
                    System.out.println("No student record found");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                                "Student name: " + name[i]
                                        + "\nID: " + studentID[i]
                                        + "\nBranch: " + branch[i]);
                    }
                }
            }
            if (choice == 2) {
                if (count >= 100) {
                    System.out.println("Database is full!");
                } else {
                    System.out.print("Enter name: ");
                    name[count] = sc.nextLine();
                    
                    System.out.print("Enter student ID: ");
                    studentID[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter branch: ");
                    branch[count] = sc.nextLine();

                    count++;
                    System.out.println("Student added succefully");
                }
            }

            if (choice == 3) {
                System.out.print("Enter Student ID to remove: ");
                int id = sc.nextInt();

                int index = -1;

                for (int i = 0; i < count; i++) {
                    if (studentID[i] == id) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("Student not found.");
                } else {
                    for (int i = index; i < count - 1; i++) {
                        name[i] = name[i + 1];
                        studentID[i] = studentID[i + 1];
                        branch[i] = branch[i + 1];
                    }
                    count--;
                    System.out.println("Student removed successfully.");
                }
            }
            System.out.println();
        } while (choice != 4);

        sc.close();
    }
}
