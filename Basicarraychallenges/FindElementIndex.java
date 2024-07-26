//WAP to find the index of an array element
package Basicarraychallenges;

import java.util.*;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int elementToFind = 30;
        int index = -1;

        // Iterate through the array to find the index of the element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                index = i;
                break;
            }
        }

        // Check if element is found and print the index
        if (index != -1) {
            System.out.println("Element " + elementToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " not found in the array.");
        }
    }
}
