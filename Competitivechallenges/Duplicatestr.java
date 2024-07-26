
// WAP to find the duplicate elements between two arrays. (string values)
import java.util.HashSet;

public class Duplicatestr {
  public static void main(String[] args) {
    // Example arrays of string values
    String[] array1 = { "apple", "banana", "orange", "kiwi" };
    String[] array2 = { "banana", "grape", "orange", "apple" };

    // Call the method to find duplicates
    findDuplicates(array1, array2);
  }

  public static void findDuplicates(String[] array1, String[] array2) {
    // Create a HashSet to store elements of the first array
    HashSet<String> set = new HashSet<>();
    for (String str : array1) {
      set.add(str);
    }

    // Create a HashSet to store duplicate elements
    HashSet<String> duplicates = new HashSet<>();

    // Iterate through the second array and check for duplicates
    for (String str : array2) {
      if (set.contains(str)) {
        duplicates.add(str);
      }
    }

    // Print the duplicate elements
    System.out.println("Duplicate elements between the two arrays are: " + duplicates);
  }
}
