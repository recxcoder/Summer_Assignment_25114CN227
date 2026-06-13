package Day15;

//Write a program to Move zeroes to end.

import java.util.Arrays;

public class Q60 {
    public static void main(String[] args) {
    
        int[] arr = {0, 1, 0, 3, 5, 8, 0, 2};
        int n = arr.length;

        int[] temp = new int[n];
        int tempIndex = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[tempIndex] = arr[i];
                tempIndex++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.println("After moving all zeroes to end: " + Arrays.toString(arr));
    }
}
