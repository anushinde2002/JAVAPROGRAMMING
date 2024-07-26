
import java.util.HashSet;

public class FindDuplicatesstr {
  public static void main(String[] args) {
    // Example array of string values
    String[] array = { "apple", "banana", "apple", "orange", "banana", "grape" };

    // Call the method to find duplicates
    findDuplicates(array);
  }

  public static void findDuplicates(String[] array) {
    // Create a HashSet to store unique values
    HashSet<String> uniqueValues = new HashSet<>();
    // Create a HashSet to store duplicate values
    HashSet<String> duplicateValues = new HashSet<>();

    // Iterate over the array
    for (String value : array) {
      // If the value is already in uniqueValues, it is a duplicate
      if (!uniqueValues.add(value)) {
        duplicateValues.add(value);
      }
    }

    // Print the duplicate values
    System.out.println("Duplicate values: " + duplicateValues);
  }
}
