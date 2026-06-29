package Day28;

//Write a program to Create ticket booking system.

import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vipSeat = 30;
        int normalSeat = 70;

        do {
            System.out.println("<<--- Ticket Booking System --->>");
            System.out.println("1. View ticket avilable");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");

            System.out.print("Your choice: ");
            int yourChoice = sc.nextInt();

            switch (yourChoice) {
                case 1:
                    System.out.println("Total Seats avilable: " + (vipSeat + normalSeat));
                    System.out.println("VIP Seats avilabe: " + vipSeat);
                    System.out.println("Normal Seats avilable: " + normalSeat);

                    break;

                case 2:
                    System.out.println("<-- Booking Ticket -->");
                    System.out.println("Which seat do you want to book-");
                    System.out.print("1. Normal \n2. VIP\nChoice: ");
                    int choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.print("Number of ticket you want: ");
                        int numTicket = sc.nextInt();

                        if (numTicket > 0 && numTicket <= normalSeat) {
                            System.out.println("Your seat is confirmed.");
                            normalSeat -= numTicket;
                        } else {
                            System.out.println("Not avilable!");
                            System.out.println("Avilable Normal seat: " + normalSeat);
                        }
                    } else if (choice == 2) {
                        System.out.print("Number of ticket you want: ");
                        int numTicket = sc.nextInt();
                        if (numTicket > 0 && numTicket <= vipSeat) {
                            System.out.println("Your seat is confirmed.");
                            vipSeat -= numTicket;
                        } else {
                            System.out.println("Not avilable!");
                            System.out.println("Avilabe VIP seat: " + vipSeat);
                        }
                    } else {
                        System.out.println("Invalide choice.");
                    }
                    break;

                case 3:
                    System.out.print("Cancel ticket of which section: \n1. Normal \n2.VIP ");
                    int section = sc.nextInt();

                    if (section == 1) {
                        System.out.print("How many ticket do you want to cancel:");
                        int cancelTicket = sc.nextInt();
                        if (cancelTicket > 0) {
                            System.out.println("Ticket cancelled successfully!");
                            normalSeat += cancelTicket;
                        } else {
                            System.out.println("Invalide number of tickets!");
                        }
                    } else if (section == 2) {
                        System.out.print("How many ticket do you want to cancel:");
                        int cancelTicket = sc.nextInt();
                        if (cancelTicket > 0) {
                            System.out.println("Ticket cancelled successfully!");
                            vipSeat += cancelTicket;
                        } else {
                            System.out.println("Invalide number of tickets!");
                        }
                    } else {
                        System.out.println("Invalid Choice");
                    }
                    break;

                case 4:
                    System.out.println("Thankyou for using our service.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
                    ;
            }

        } while (true);
    }
}