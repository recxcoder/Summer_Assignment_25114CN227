package Day17;

//Write a program to Intersection of arrays.

import java.util.HashSet;

public class Q67 {
    public static void main(String[] args) {

        int[] arr1 = { 10, 15, 20, 30, 40, 50 };
        int[] arr2 = { 20, 35, 40, 50, 60, 70 };

        HashSet<Integer> newSet = new HashSet<>();

        for (int i : arr1) {
            newSet.add(i);
        }

        System.out.print("Intersection of arrays: ");

        for (int i = 0; i < arr2.length; i++) {
            if (newSet.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
