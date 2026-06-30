package Day30;

//Write a program to Create mini employee management system

import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum employee capacity of the system: ");
        int capacity = sc.nextInt();

        int[] employeeIds = new int[capacity];
        String[] names = new String[capacity];
        String[] designations = new String[capacity];
        int count = 0;

        while (true) {
            System.out.println("\n<<--- EMPLOYEE MANAGEMENT SYSTEM --->>");
            System.out.println("1. Register New Employee");
            System.out.println("2. Display All Employee Records");
            System.out.println("3. Update Employee Designation");
            System.out.println("4. Remove Employee Record");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice! Please choose 1-5");
                continue;
            }

            switch (choice) {
                case 1:
                    if (count >= capacity) {
                        System.out.println("System full! Cannot add more employee profiles.");
                    } else {
                        System.out.print("Enter Unique Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        int duplicateIdx = -1;
                        for (int i = 0; i < count; i++) {
                            if (employeeIds[i] == id) {
                                duplicateIdx = i;
                                break;
                            }
                        }

                        if (duplicateIdx != -1) {
                            System.out.println("Error: An employee with this ID already exists!");
                        } else {
                            System.out.print("Enter Employee Name: ");
                            names[count] = sc.nextLine();
                            System.out.print("Enter Designation: ");
                            designations[count] = sc.nextLine();
                            
                            employeeIds[count] = id;
                            count++;
                            System.out.println("Employee profile registered successfully.");
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found in the system.");
                    } else {
                        System.out.println("\n--- Employee Directory ---");
                        System.out.printf("%-10s %-25s %-20s\n", "ID", "Name", "Designation");
                        System.out.println("---------------------------------------------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-10d %-25s %-20s\n", employeeIds[i], names[i], designations[i]);
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("The employee directory is empty.");
                    } else {
                        System.out.print("Enter Employee ID to update: ");
                        int searchId = sc.nextInt();
                        sc.nextLine();
                        
                        int targetIdx = -1;
                        for (int i = 0; i < count; i++) {
                            if (employeeIds[i] == searchId) {
                                targetIdx = i;
                                break;
                            }
                        }

                        if (targetIdx == -1) {
                            System.out.println("Employee record not found.");
                        } else {
                            System.out.print("Enter New Designation (Current: " + designations[targetIdx] + "): ");
                            designations[targetIdx] = sc.nextLine();
                            System.out.println("Designation updated successfully.");
                        }
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("The employee directory is empty.");
                    } else {
                        System.out.print("Enter Employee ID to remove: ");
                        int removeId = sc.nextInt();
                        int deleteIdx = -1;

                        for (int i = 0; i < count; i++) {
                            if (employeeIds[i] == removeId) {
                                deleteIdx = i;
                                break;
                            }
                        }

                        if (deleteIdx == -1) {
                            System.out.println("Employee profile not found.");
                        } else {
                            for (int i = deleteIdx; i < count - 1; i++) {
                                employeeIds[i] = employeeIds[i + 1];
                                names[i] = names[i + 1];
                                designations[i] = designations[i + 1];
                            }
                            count--;
                            System.out.println("Employee record removed successfully.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Shutting down Employee Management System. Goodbye!");
                    sc.close();
                    return;
            }
        }
    }
}
