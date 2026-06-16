package Day16;

// Write a program to Find pair with given sum.

import java.util.HashSet;

public class Q63 {
    public static void main(String[] args) {

        int[] arr = { 10, 15, 20, 30, 40, 50, 65, 70, 80, 90 };
        int sum = 70;

        HashSet<Integer> seenNumbers = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = sum - num;

            // Check if the number needed to reach the sum has already been seen
            if (seenNumbers.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                found = true;
            }

            // Add the current number to the set for future checks
            seenNumbers.add(num);
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }
    }
}
