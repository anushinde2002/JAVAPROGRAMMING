import java.util.Arrays;

public class SortStringArrays {
  public static void main(String[] args) {
    // Define an array of strings
    String[] array = { "banana", "apple", "orange", "mango", "grape" };

    // Print the original array
    System.out.println("Original array: " + Arrays.toString(array));

    // Sort the array
    Arrays.sort(array);

    // Print the sorted array
    System.out.println("Sorted array: " + Arrays.toString(array));
  }
}
