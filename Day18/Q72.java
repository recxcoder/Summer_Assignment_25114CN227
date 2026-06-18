package Day18;

//Write a program to Sort array in descending order.

import java.util.Arrays;
public class Q72 {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 2, 6, 4, 1, 9, 8, 7 };
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("Sort array in desecnding order: " + Arrays.toString(arr));

    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
