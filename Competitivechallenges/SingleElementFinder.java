
public class SingleElementFinder {
  public static void main(String[] args) {
    // Example array where every element is repeated twice except one
    int[] array = { 2, 3, 5, 4, 5, 3, 4 };

    // Call the method to find the single element
    int singleElement = findSingleElement(array);

    // Print the result
    System.out.println("The element that appears only once is: " + singleElement);
  }

  public static int findSingleElement(int[] array) {
    int result = 0;

    // Iterate over the array and XOR each element with the result
    for (int value : array) {
      result ^= value;
    }

    // The result will be the single element
    return result;
  }
}
