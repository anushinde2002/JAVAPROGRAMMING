
//  WAP to copy an array by iterating an array
package Basicarraychallenges;
import java.util.*;

import java.util.Arrays;

public class CopyArray {
  public static void main(String[] args) {
    int[] originalArray = { 1, 2, 3, 4, 5 };
    int[] copiedArray = new int[originalArray.length];

    // Iterate through the original array and copy elements to the copied array
    for (int i = 0; i < originalArray.length; i++) {
      copiedArray[i] = originalArray[i];
    }

    // Print the original and copied arrays
    System.out.println("Original Array: " + Arrays.toString(originalArray));
    System.out.println("Copied Array: " + Arrays.toString(copiedArray));
  }
}
