import java.util.Arrays;

public class SplitArray {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

    // Call the method to split the array
    int[][] splitArrays = splitArrayIntoThree(array);

    // Print the split arrays
    System.out.println("Array 1: " + Arrays.toString(splitArrays[0]));
    System.out.println("Array 2: " + Arrays.toString(splitArrays[1]));
    System.out.println("Array 3: " + Arrays.toString(splitArrays[2]));
  }

  public static int[][] splitArrayIntoThree(int[] array) {
    int length = array.length;

    // Calculate sizes for the three new arrays
    int size1 = length / 3;
    int size2 = length / 3;
    int size3 = length - size1 - size2; // Remaining elements go to the third array

    int[][] splitArrays = new int[3][];
    splitArrays[0] = new int[size1];
    splitArrays[1] = new int[size2];
    splitArrays[2] = new int[size3];

    // Copy elements to the first array
    System.arraycopy(array, 0, splitArrays[0], 0, size1);
    // Copy elements to the second array
    System.arraycopy(array, size1, splitArrays[1], 0, size2);
    // Copy elements to the third array
    System.arraycopy(array, size1 + size2, splitArrays[2], 0, size3);

    return splitArrays;
  }
}
