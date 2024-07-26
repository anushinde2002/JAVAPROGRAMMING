//  WAP to remove a specific element from an array
package Basicarraychallenges;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int elementToRemove = 3;

        System.out.println("Original Array: " + Arrays.toString(array));

        // Find index of element to remove
        int indexToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            // Create a new array with reduced size
            int[] newArray = new int[array.length - 1];

            // Copy elements from original array to new array excluding the element to
            // remove
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i == indexToRemove) {
                    continue;
                }
                newArray[j++] = array[i];
            }

            // Print the updated array
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
        } else {
            System.out.println("Element " + elementToRemove + " not found in the array.");
        }
    }
}
