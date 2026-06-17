package Day17;

// Write a program to Union of arrays.

import java.util.HashSet;
public class Q66 {
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = { 2, 3, 5, 7};

        HashSet<Integer> unionSet = new HashSet<>();

        for (int i : arr1) {
            unionSet.add(i);
        }

        for (int i : arr2) {
            unionSet.add(i);
        }

        System.out.println("Union using HashSet: " + unionSet);
    }
}


// HashSet refuses to store duplicate values. So HashSet is used in this problem.
