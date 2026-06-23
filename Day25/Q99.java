package Day25;

//Write a program to Sort names alphabetically.

import java.util.Arrays;
import java.util.Scanner;
public class Q99 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many names: ");
        int num = sc.nextInt();

        sc.nextLine();

        String[] names = new String[num];
        
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.nextLine();
        }
        
        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");

        System.out.println(Arrays.toString(names));

        sc.close();
    }
}
