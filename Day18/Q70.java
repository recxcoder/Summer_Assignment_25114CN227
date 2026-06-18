package Day18;

//Write a program to Selection sort.

import java.util.Arrays;

public class Q70 {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 2, 6, 4, 1, 9, 8, 7 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
        System.out.println("After Selection sort: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
