package Day25;

// Write a program to Merge two sorted arrays. 

public class Q97 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 5, 7, 9 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] merged = new int[(arr1.length + arr2.length)];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr1[i++];
        }

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
