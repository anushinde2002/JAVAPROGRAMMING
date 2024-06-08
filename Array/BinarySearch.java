public class BinarySearch {
  public static void main(String[] args) {
    int[] array = { 2, 3, 4, 10, 40, 44, 55, 65, 70, 80 };
    int target = 10;

    // Call the binary search method
    int result = binarySearch(array, target);

    // Print the result
    if (result == -1) {
      System.out.println("Element not present in array");
    } else {
      System.out.println("Element found at index: " + result);
    }
  }

  // Method to perform binary search
  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      // Check if the target is present at mid
      if (array[mid] == target) {
        return mid;
      }

      // If target greater, ignore left half
      if (array[mid] < target) {
        left = mid + 1;
      } else {
        // If target smaller, ignore right half
        right = mid - 1;
      }
    }

    // Target was not present in the array
    return -1;
  }
}
