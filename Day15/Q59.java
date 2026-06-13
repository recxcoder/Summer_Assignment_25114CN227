package Day15;

//Write a program to Rotate array right

import java.util.Arrays;

public class Q59 {
    public static void main(String[] args) {
        
    int[] arr = { 50, 45, 76, 63, 76, 25, 56, 63, 76, 84, 53 };
        int k = 2;  // k = number of rotation

        rotateRight(arr, k);
        
        System.out.print("After rotate array right: " + Arrays.toString(arr));

    }
    public static void rotateRight(int[] arr, int k){
        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        k = k % n;  // Handle cases where k is greater than n

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    private static void reverse(int[] arr, int start, int end){
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}