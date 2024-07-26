
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
  public static void main(String[] args) {
    // Define an array of integers with some duplicate values
    int[] array = { 15, 22, 3, 40, 8, 7, 50, 1, 3, 22, 15 };

    // Find and print duplicate values
    findDuplicates(array);
  }

  public static void findDuplicates(int[] array) {
    // Create a set to store the unique elements
    Set<Integer> uniqueElements = new HashSet<>();
    // Create a set to store the duplicate elements
    Set<Integer> duplicateElements = new HashSet<>();

    // Traverse the array
    for (int value : array) {
      // If the value is already in the set of unique elements, add it to the set of
      // duplicates
      if (!uniqueElements.add(value)) {
        duplicateElements.add(value);
      }
    }

    // Print the duplicate values
    if (duplicateElements.isEmpty()) {
      System.out.println("No duplicate values found.");
    } else {
      System.out.println("Duplicate values: " + duplicateElements);
    }
  }
}
