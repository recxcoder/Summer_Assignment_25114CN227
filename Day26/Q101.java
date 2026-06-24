package Day26;

// Write a program to Create number guessing game.

import java.util.Scanner;
import java.util.Random;

public class Q101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Choose a number between 1 to 10: ");
        int num = sc.nextInt();

        int random = rand.nextInt(10) + 1;

        while (random != num) {
            System.out.println("Fail to guess");
            System.out.print("Choose a number between 1 to 10: ");
            num = sc.nextInt();
        }

        System.out.println("You gussed right.");

        sc.close();
    }
}
