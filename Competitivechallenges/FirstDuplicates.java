import java.util.HashSet;

public class FirstDuplicates {
  public static void main(String[] args) {
    // Example array of integer values
    int[] array = { 1, 2, 3, 4, 5, 3, 6, 7, 8, 2 };

    // Call the method to find the first duplicate
    int firstDuplicate = findFirstDuplicate(array);

    // Print the result
    if (firstDuplicate != -1) {
      System.out.println("The first duplicate element is: " + firstDuplicate);
    } else {
      System.out.println("No duplicate elements found.");
    }
  }

  public static int findFirstDuplicate(int[] array) {
    // Create a HashSet to store unique values
    HashSet<Integer> seen = new HashSet<>();

    // Iterate over the array
    for (int value : array) {
      // If the value is already in the set, it is the first duplicate
      if (!seen.add(value)) {
        return value;
      }
    }

    // If no duplicates are found, return -1
    return -1;
  }
}
