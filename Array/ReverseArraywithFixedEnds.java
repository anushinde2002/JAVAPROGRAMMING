public class ReverseArraywithFixedEnds {
  public static void main(String[] args) {
    // Example array
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    // Print the original array
    System.out.print("Original array: ");
    printArray(array);

    // Call the method to reverse the array
    reverseArrayWithFixedEnds(array);

    // Print the reversed array
    System.out.print("Reversed array with fixed ends: ");
    printArray(array);
  }

  public static void reverseArrayWithFixedEnds(int[] array) {
    // Check if the array has more than two elements
    if (array.length <= 2) {
      return;
    }

    int left = 1;
    int right = array.length - 2;

    while (left < right) {
      // Swap the elements at left and right positions
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;

      // Move the pointers
      left++;
      right--;
    }
  }

  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
