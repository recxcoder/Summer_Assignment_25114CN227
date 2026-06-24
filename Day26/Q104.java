package Day26;

// Write a program to Create quiz application.

import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        String[] question = {
                "Which is the capital of India?",
                "Which language is used for Android development?"
        };

        String[][] options = {
                { "1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai" },
                { "1. Java", "2. Python", "3. C", "4. PHP" }
        };

        int[] correctAnswer = { 2, 1 };

        System.out.println("<<---Start your Quiz--->>");

        for (int i = 0; i < question.length; i++) {
            System.out.println("Q" + (i + 1) + ". " + question[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Answer: ");
            int ans = sc.nextInt();

            if (ans == correctAnswer[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
            System.out.println();
        }

        System.out.println("You score " + score + " out of " + question.length);

        sc.close();
    }
}
