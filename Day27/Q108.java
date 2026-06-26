package Day27;

// Write a program to Create marksheet generation system.

import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollNumber = new int[100];
        String[] name = new String[100];
        double[] physicsMarks = new double[100];
        double[] chemistryMarks = new double[100];
        double[] mathsMarks = new double[100];

        int choice;
        int count = 0;

        do {
            System.out.println("<<--- Marksheet generation system --->>");
            System.out.println("1. View all Marksheets");
            System.out.println("2. Add student Marks");
            System.out.println("3. Remove student record");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (count <= 0) {
                    System.out.println("No student record found.");
                } else {
                    System.out.println("<--- Current Student Record --->");
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                                "Roll Number: " + rollNumber[i]
                                        + " | Name: " + name[i]
                                        + " | Physics marks: " + physicsMarks[i]
                                        + " | Chemistry marks: " + chemistryMarks[i]
                                        + " | Maths marks: " + mathsMarks[i]);
                    }
                }
            }

            else if (choice == 2) {
                if (count >= 100) {
                    System.out.println("Database is full.");
                } else {
                    System.out.print("Roll Number: ");
                    rollNumber[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Physics marks: ");
                    physicsMarks[count] = sc.nextDouble();
                    System.out.print("Chemistry marks: ");
                    chemistryMarks[count] = sc.nextDouble();
                    System.out.print("Maths marks: ");
                    mathsMarks[count] = sc.nextDouble();

                    count++;

                    System.out.println("\nStudent Marksheet added successfully");
                }
            }

            else if (choice == 3) {
                if (count <= 0) {
                    System.out.println("Record is Empty");
                } else {
                    System.out.print("Enter Roll Number: ");
                    int rollNum = sc.nextInt();
                    sc.nextLine();

                    int index = -1;

                    for (int i = 0; i < count; i++) {
                        if (rollNum == rollNumber[i]) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Employee not found.");
                    } else {
                        for (int i = index; i < count - 1; i++) {
                            rollNumber[i] = rollNumber[i + 1];
                            name[i] = name[i + 1];
                            physicsMarks[i] = physicsMarks[i + 1];
                            chemistryMarks[i] = chemistryMarks[i + 1];
                            mathsMarks[i] = mathsMarks[i + 1];
                        }
                        count--;
                        System.out.println("\nStudent marksheet removed successfully");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Exiting System!");
            } else {
                System.out.println("Invalide choice!");
            }
            System.out.println();

        } while (choice != 4);

        sc.close();
    }
}
