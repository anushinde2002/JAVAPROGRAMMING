
import java.util.HashSet;

public class DuplicateFinder {
  public static void main(String[] args) {
    // Example arrays of integer values
    int[] array1 = { 1, 2, 3, 4, 5 };
    int[] array2 = { 4, 5, 6, 7, 8 };

    // Call the method to find duplicates
    findDuplicates(array1, array2);
  }

  public static void findDuplicates(int[] array1, int[] array2) {
    // Create a HashSet to store elements of the first array
    HashSet<Integer> set = new HashSet<>();
    for (int num : array1) {
      set.add(num);
    }

    // Create a HashSet to store duplicate elements
    HashSet<Integer> duplicates = new HashSet<>();

    // Iterate through the second array and check for duplicates
    for (int num : array2) {
      if (set.contains(num)) {
        duplicates.add(num);
      }
    }

    // Print the duplicate elements
    System.out.println("Duplicate elements between the two arrays are: " + duplicates);
  }
}
