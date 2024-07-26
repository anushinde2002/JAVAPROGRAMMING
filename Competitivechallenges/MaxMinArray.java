import java.util.Arrays;

public class MaxMinArray {
  public static void main(String[] args) {
    // Define an array of integers
    int[] array = { 15, 22, 3, 40, 8, 7, 50, 1 };

    // Initialize max and min with the first element of the array
    int max = array[0];
    int min = array[0];

    // Traverse through the array
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }

    // Print the maximum and minimum values
    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);
  }
}
