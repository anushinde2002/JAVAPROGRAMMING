import java.util.HashSet;

public class UniqueElements {
  public static void main(String[] args) {
    int[] array = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };

    // Call the method to find unique elements
    int[] uniqueElements = findUniqueElements(array);

    // Print the unique elements
    System.out.print("Unique elements in the array: ");
    for (int element : uniqueElements) {
      System.out.print(element + " ");
    }
  }

  public static int[] findUniqueElements(int[] array) {
    // Use a HashSet to track unique elements
    HashSet<Integer> uniqueSet = new HashSet<>();
    HashSet<Integer> allElementsSet = new HashSet<>();

    for (int element : array) {
      // If element is already in allElementsSet, it's not unique, remove it from
      // uniqueSet
      if (allElementsSet.contains(element)) {
        uniqueSet.remove(element);
      } else {
        // Otherwise, add it to both sets
        allElementsSet.add(element);
        uniqueSet.add(element);
      }
    }

    // Convert the HashSet to an array
    int[] uniqueArray = new int[uniqueSet.size()];
    int index = 0;
    for (int element : uniqueSet) {
      uniqueArray[index++] = element;
    }

    return uniqueArray;
  }
}
