package Day27;

//Write a program to Create employee management system

import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] employeeID = new int[100];
        String[] name = new String[100];
        String[] designation = new String[100];
        double[] salary = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("<<--- Employee Management System --->>");
            System.out.println("1. View Employee Record");
            System.out.println("2. Add an Employee");
            System.out.println("3. Remove an Employee");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (count <= 0) {
                    System.out.println("No employee record found.");
                } else {
                    System.out.println("<--- Current Emoployee Directory --->");
                    for (int i = 0; i < count; i++) {
                        System.out.println(
                                "ID: " + employeeID[i]
                                        + " | Name: " + name[i]
                                        + " | Designation: " + designation[i]
                                        + " | Salary: $" + salary[i]);
                    }
                }
            }

            else if (choice == 2) {
                if (count >= 100) {
                    System.out.println("Database is full.");
                } else {
                    System.out.print("ID: ");
                    employeeID[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    name[count] = sc.nextLine();
                    System.out.print("Designation: ");
                    designation[count] = sc.nextLine();
                    System.out.print("Salary: $");
                    salary[count] = sc.nextDouble();

                    count++;

                    System.out.println("\nEmployee added successfully");
                }
            }

            else if (choice == 3) {
                if (count <= 0) {
                    System.out.println("No Employee Found! Record is Empty");
                } else {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    int index = -1;

                    for (int i = 0; i < count; i++) {
                        if (id == employeeID[i]) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Employee not found.");
                    } else {
                        for (int i = index; i < count - 1; i++) {
                            employeeID[i] = employeeID[i + 1];
                            name[i] = name[i + 1];
                            designation[i] = designation[i + 1];
                            salary[i] = salary[i + 1];
                        }
                        count--;
                        System.out.println("\nEmployee removed successfully");
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
