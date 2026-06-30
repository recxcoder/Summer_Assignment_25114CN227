package Day30;

//Write a program to Develop complete mini project using arrays, strings and functions.

import java.util.Scanner;
public class Q120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menuNames = {"Coffee", "Sandwich", "Pizza", "Cold Drink"};
        double[] menuPrices = {4.5, 3.0, 5.0, 2.4};
        int[] orderedQuantities = new int[menuNames.length];

        while (true) {
            displayMainMenu();
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice <1 || choice > 4) {
                System.out.println("Invalid option! Please pick a choice between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    displayMenu(menuNames, menuPrices);
                    break;
                case 2:
                    takeOrder(menuNames, orderedQuantities, sc);
                    break;
                case 3:
                    generateBill(menuNames, menuPrices, orderedQuantities);
                    break;
                case 4:
                    System.out.println("Thank you for visiting our Cafe! System closed.");
                    sc.close();
                    return;
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\n<<--- CAFE MANAGEMENT SYSTEM --->>");
        System.out.println("1. View Menu Card");
        System.out.println("2. Take Order");
        System.out.println("3. Generate Receipt");
        System.out.println("4. Exit");
    }

    private static void displayMenu(String[] names, double[] prices) {
        System.out.println("\n--- Cafe Menu Card ---");
        System.out.printf("%-4s %-15s %-10s\n", "S.No", "Item Name", "Price");
        System.out.println("------------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-4d %-15s $%-9.2f\n", (i + 1), names[i], prices[i]);
        }
    }

    private static void takeOrder(String[] names, int[] quantities, Scanner sc) {
        System.out.println("\n--- Place Your Order ---");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter quantity for " + names[i] + " (Current: " + quantities[i] + "): ");
            int qty = sc.nextInt();
            if (qty < 0) {
                System.out.println("Quantity cannot be negative! Keeping previous value.");
            } else {
                quantities[i] = qty;
            }
        }
        System.out.println("Order updated successfully.");
    }

    // Method 3: Calculates calculations dynamically and structures a clean text receipt
    private static void generateBill(String[] names, double[] prices, int[] quantities) {
        double subtotal = 0;
        boolean hasOrder = false;

        System.out.println("\n=================================");
        System.out.println("           CAFE RECEIPT          ");
        System.out.println("=================================");
        System.out.printf("%-15s %-6s %-10s\n", "Item", "Qty", "Total");
        System.out.println("---------------------------------");

        for (int i = 0; i < names.length; i++) {
            if (quantities[i] > 0) {
                hasOrder = true;
                double itemTotal = quantities[i] * prices[i];
                subtotal += itemTotal;
                System.out.printf("%-15s %-6d $%-9.2f\n", names[i], quantities[i], itemTotal);
            }
        }

        if (!hasOrder) {
            System.out.println("   No items ordered yet!         ");
            System.out.println("=================================");
            return;
        }

        double taxRate = 0.12;
        double tax = subtotal * taxRate;
        double finalAmount = subtotal + tax;

        System.out.println("---------------------------------");
        System.out.printf("%-22s $%-9.2f\n", "Subtotal:", subtotal);
        System.out.printf("%-22s $%-9.2f\n", "Tax (12%):", tax);
        System.out.println("---------------------------------");
        System.out.printf("%-22s $%-9.2f\n", "Final Net Payable:", finalAmount);
        System.out.println("=================================");
    }
}