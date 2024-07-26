package Basicarraychallenges;

import java.util.*;
import java.util.Arrays;

public class SumArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int sum = 0;

    // Iterate through the array and sum the values
    for (int value : array) {
      sum += value;
    }

    // Print the sum of the array elements
    System.out.println("Sum of the array elements: " + sum);
  }
}
