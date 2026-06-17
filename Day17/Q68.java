package Day17;

//Write a program to Find common elements. 
// This is similar question to Intersection of array

import java.util.HashSet;
public class Q68 {
    public static void main(String[] args) {
        
        String[] arr1 = {"Apple", "Mango", "Orange", "Banana"};
        String[] arr2 = {"Mango", "Banana", "Pineapple", "Guava"};

        HashSet<String> newSet = new HashSet<>();

        for (String i : arr1) {
            newSet.add(i);
        }

        System.out.print("Common elemets are: ");

        for (int i = 0; i < arr2.length; i++) {
            if (newSet.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");

                // Remove the element to handle potential duplicates in arr2 gracefully
                newSet.remove(arr2[i]);
            }
        }
    }
}
