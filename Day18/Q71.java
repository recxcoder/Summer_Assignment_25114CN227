package Day18;

//Write a program to Binary search

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter the key element: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("The element " + key + " is at Index: " + index);
        } else {
            System.out.println("The element " + key + " is not in the array.");
        }

        sc.close();
    }
}
