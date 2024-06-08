public class MergeArray {
  public static void main(String[] args) {
    int[] array1 = { 1, 3, 5, 7 };
    int[] array2 = { 2, 4, 6, 8, 10 };

    // Call the merge method
    int[] mergedArray = mergeArrays(array1, array2);

    // Print the merged array
    System.out.print("Merged Array: ");
    for (int element : mergedArray) {
      System.out.print(element + " ");
    }
  }

  public static int[] mergeArrays(int[] array1, int[] array2) {
    int length1 = array1.length;
    int length2 = array2.length;

    // Create a new array to hold the merged elements
    int[] mergedArray = new int[length1 + length2];

    // Copy elements from array1 to mergedArray
    for (int i = 0; i < length1; i++) {
      mergedArray[i] = array1[i];
    }

    // Copy elements from array2 to mergedArray
    for (int i = 0; i < length2; i++) {
      mergedArray[length1 + i] = array2[i];
    }

    return mergedArray;
  }
}
