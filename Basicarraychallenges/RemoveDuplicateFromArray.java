
//  WAP to remove duplicates from an array and then return the new length of the array.
package Basicarraychallenges;

import java.util.*;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 5, 1 };

        System.out.println("Original Array: " + Arrays.toString(array));

        // Use a set to track unique elements
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }

        // Convert set back to array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));

        // Print the new length of the array
        System.out.println("New length of the array: " + newArray.length);
    }
}
