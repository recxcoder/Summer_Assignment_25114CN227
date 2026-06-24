package Day24;

//Write a program to Compress a string.

import java.util.Scanner;
public class Q94 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("String is emty");
            sc.close();
            return;
        }

        StringBuilder compressed = new StringBuilder();

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            }
            else{
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }


        System.out.println("Compressed string: " + compressed);

        sc.close();
    }
}
