package Day18;

//Write a program to Bubble sort

import java.util.Arrays;
public class Q69 {
    public static void main(String[] args) {
        
        int[] arr = {1,3,5,2,6,4,9,8,7};
        int n = arr.length;
        
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("After bubble sort: " + Arrays.toString(arr));

    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
