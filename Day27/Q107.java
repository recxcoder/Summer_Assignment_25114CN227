package Day27;

// Write a program to Create salary management system.

import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] employeeID = new int[100];
        String[] name = new String[100];
        double[] baseSalary = new double[100];
        double[] allowances = new double[100];

        int count = 0;
        int choice;

        do {
            System.out.println("<<--- Employee Management System --->>");
            System.out.println("1. View Payroll Directory");
            System.out.println("2. Add Employee Salary Record");
            System.out.println("3. Update Allowances");
            System.out.println("4. Remove an Employee");
            System.out.println("5. Exit");

            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                if (count <= 0) {
                    System.out.println("No payroll record found.");
                } else {
                    double totalCompanyPayout = 0;
                    System.out.println("<--- Payroll Statements --->");
                    for (int i = 0; i < count; i++) {
                        double netSalary = baseSalary[i] + allowances[i];
                        totalCompanyPayout += netSalary;
                        System.out.println(
                                "ID: " + employeeID[i]
                                        + " | Name: " + name[i]
                                        + " | Base $: " + baseSalary[i]
                                        + " | Allowance: $" + allowances[i]
                                        + " | Net Payout: $" + netSalary);
                    }
                    System.out.println("---------------------------------------");
                    System.out.println("Total Monthly Company Expenditure: $" + totalCompanyPayout);
                }
            }

            else if (choice == 2) {
                if (count >= 100) {
                    System.out.println("Database limit reached.");
                } else {
                    System.out.print("ID: ");
                    employeeID[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Base Salary: $");
                    baseSalary[count] = sc.nextDouble();

                    System.out.print("Allowances: $");
                    allowances[count] = sc.nextDouble();

                    count++;

                    System.out.println("\nSalary record added successfully");
                }
            } else if (choice == 3) {
                if (count <= 0) {
                    System.out.println("No records availabe.");
                } else {
                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    int index = -1;

                    for (int i = 0; i < count; i++) {
                        if (id == employeeID[i]) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Employee ID not found!");
                    } else {
                        System.out.println("Enter New Allowance amount for " + name[index]);
                        allowances[index] = sc.nextDouble();
                        System.out.println("Payroll modified successfully!");
                    }
                }

            }

            else if (choice == 4) {
                if (count <= 0) {
                    System.out.println("Database is Empty");
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
                            baseSalary[i] = baseSalary[i + 1];
                            allowances[i] = allowances[i + 1];
                        }
                        count--;
                        System.out.println("\nEmployee removed successfully");
                    }
                }
            } else if (choice == 5) {
                System.out.println("Exiting System!");
            } else {
                System.out.println("Invalide choice selection!");
            }
            System.out.println();
        } while (choice != 5);

        sc.close();
    }
}