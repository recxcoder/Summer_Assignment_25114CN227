package Day24;

//Write a program to Find longest word.

import java.util.Scanner;
public class Q95 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Write sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longesteWord = " ";

        for (String word : words) {
            if (word.length() > longesteWord.length()) {
                longesteWord = word;
            }
        }

        System.out.println("Longest word from given sentence is: " + longesteWord);
        System.out.println("Length of the word is: " + longesteWord.length());

        sc.close();
    }
}
