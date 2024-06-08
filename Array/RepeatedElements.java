import java.util.HashSet;

public class RepeatedElements {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 3, 9, 1 };

    // Call the method to find repeated elements
    int[] repeatedElements = findRepeatedElements(array);

    // Print the repeated elements
    System.out.print("Repeated elements in the array: ");
    for (int element : repeatedElements) {
      System.out.print(element + " ");
    }
  }

  public static int[] findRepeatedElements(int[] array) {
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> repeated = new HashSet<>();

    for (int element : array) {
      if (!seen.add(element)) {
        // If add returns false, it means the element is already in the set
        repeated.add(element);
      }
    }

    // Convert the repeated elements set to an array
    int[] result = new int[repeated.size()];
    int index = 0;
    for (int element : repeated) {
      result[index++] = element;
    }

    return result;
  }
}
