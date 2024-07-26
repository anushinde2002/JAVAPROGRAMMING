import java.util.*;

public class SecondMaxMinArray {
  public static void main(String[] args) {
    // Define an array of integers
    int[] array = { 15, 22, 3, 40, 8, 7, 50, 1 };

    // Find second largest and second smallest elements
    findSecondLargestAndSmallest(array);
  }

  public static void findSecondLargestAndSmallest(int[] array) {
    if (array.length < 2) {
      System.out.println("Array must contain at least two elements.");
      return;
    }

    // Initialize first and second largest and smallest elements
    int firstLargest, secondLargest, firstSmallest, secondSmallest;

    if (array[0] > array[1]) {
      firstLargest = array[0];
      secondLargest = array[1];
      firstSmallest = array[1];
      secondSmallest = array[0];
    } else {
      firstLargest = array[1];
      secondLargest = array[0];
      firstSmallest = array[0];
      secondSmallest = array[1];
    }

    // Traverse the array starting from the second index
    for (int i = 2; i < array.length; i++) {
      // Update largest and second largest
      if (array[i] > firstLargest) {
        secondLargest = firstLargest;
        firstLargest = array[i];
      } else if (array[i] > secondLargest && array[i] != firstLargest) {
        secondLargest = array[i];
      }

      // Update smallest and second smallest
      if (array[i] < firstSmallest) {
        secondSmallest = firstSmallest;
        firstSmallest = array[i];
      } else if (array[i] < secondSmallest && array[i] != firstSmallest) {
        secondSmallest = array[i];
      }
    }

    // Print the results
    System.out.println("Second largest value: " + secondLargest);
    System.out.println("Second smallest value: " + secondSmallest);
  }
}
