import java.util.Arrays;

public class InsertElementinarray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };
    int position = 2; // Position to insert the element (0-indexed)
    int elementToInsert = 100;

    System.out.println("Original Array: " + Arrays.toString(array));

    // Create a new array with increased size
    int[] newArray = new int[array.length + 1];

    // Copy elements from original array to new array up to the specified position
    for (int i = 0; i < position; i++) {
      newArray[i] = array[i];
    }

    // Insert the new element at the specified position
    newArray[position] = elementToInsert;

    // Copy the remaining elements from original array to new array
    for (int i = position + 1; i < newArray.length; i++) {
      newArray[i] = array[i - 1];
    }

    // Print the updated array
    System.out.println("Array after insertion: " + Arrays.toString(newArray));
  }
}
