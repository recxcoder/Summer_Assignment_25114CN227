package Day17;

// Write a program to Merge arrays

import java.util.Arrays;
public class Q65 {
    public static void main(String[] args) {
        int[] arr1 = {10, 30, 50, 70};
        int[] arr2 = {20, 40, 60, 80, 90};

        int[] mergeArr = new int[arr1.length + arr2.length]; 

        System.arraycopy(arr1, 0, mergeArr, 0, arr1.length);

        System.arraycopy(arr2, 0, mergeArr, arr1.length, arr2.length);

        Arrays.sort(mergeArr);

        System.out.println("Merged array is: " + Arrays.toString(mergeArr));
    }
}
