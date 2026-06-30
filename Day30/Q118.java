package Day30;

//Write a program to Create mini library system.

import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maximum book capacity of the library: ");
        int capacity = sc.nextInt();

        int[] bookIds = new int[capacity];
        String[] titles = new String[capacity];
        boolean[] isIssued = new boolean[capacity];
        int count = 0;

        while (true) {
            System.out.println("\n<<--- MINI LIBRARY SYSTEM --->>");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Remove Book from Library");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice! Please choose 1-6.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (count >= capacity) {
                        System.out.println("Library is at maximum capacity!");
                    } else {
                        System.out.print("Enter Unique Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        int existIdx = -1;
                        for (int i = 0; i < count; i++) {
                            if (bookIds[i] == id) {
                                existIdx = i;
                                break;
                            }
                        }

                        if (existIdx != -1) {
                            System.out.println("Error: A book with this ID already exists!");
                        } else {
                            System.out.print("Enter Book Title: ");
                            titles[count] = sc.nextLine();
                            bookIds[count] = id;
                            isIssued[count] = false;
                            count++;
                            System.out.println("Book added to catalog successfully.");
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available in the library.");
                    } else {
                        System.out.println("\n--- Library Catalog ---");
                        for (int i = 0; i < count; i++) {
                            String status = isIssued[i] ? "Issued" : "Available";
                            System.out.println("ID: " + bookIds[i] + " | Title: \"" + titles[i] + "\" | Status: [" + status + "]");
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No books avilable in the library.");
                    } else {
                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();
                        int idx = -1;

                        for (int i = 0; i < count; i++) {
                            if (bookIds[i] == issueId) {
                                idx = i;
                                break;
                            }
                        }

                        if (idx == -1) {
                            System.out.println("Book not found.");
                        } else if (isIssued[idx]) {
                            System.out.println("Sorry, this book is already issued to someone else.");
                        } else {
                            isIssued[idx] = true;
                            System.out.println("Book \"" + titles[idx] + "\" issued successfully.");
                        }
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No books avilable in the library.");
                    } else {
                        System.out.print("Enter Book ID to return: ");
                        int returnId = sc.nextInt();
                        int idx = -1;

                        for (int i = 0; i < count; i++) {
                            if (bookIds[i] == returnId) {
                                idx = i;
                                break;
                            }
                        }

                        if (idx == -1) {
                            System.out.println("Book not found.");
                        } else if (!isIssued[idx]) {
                            System.out.println("This book is already sitting in the library shelf.");
                        } else {
                            isIssued[idx] = false;
                            System.out.println("Book \"" + titles[idx] + "\" returned successfully.");
                        }
                    }
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No book avilable in the library.");
                    } else {
                        System.out.print("Enter Book ID to remove: ");
                        int removeId = sc.nextInt();
                        int deleteIdx = -1;

                        for (int i = 0; i < count; i++) {
                            if (bookIds[i] == removeId) {
                                deleteIdx = i;
                                break;
                            }
                        }

                        if (deleteIdx == -1) {
                            System.out.println("Book not found in database.");
                        } else {
                            for (int i = deleteIdx; i < count - 1; i++) {
                                bookIds[i] = bookIds[i + 1];
                                titles[i] = titles[i + 1];
                                isIssued[i] = isIssued[i + 1];
                            }
                            count--;
                            System.out.println("Book removed from library successfully.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Closing Library Management System.");
                    sc.close();
                    return;
            }
        }
    }
}
