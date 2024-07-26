// WAP to find duplicate elements from three sorted arrays.

import java.util.HashSet;

public class DuplicateFromThree {
  public static void main(String[] args) {
    // Example sorted arrays
    int[] arr1 = { 2, 4, 6, 8, 10 };
    int[] arr2 = { 4, 6, 8, 10, 12 };
    int[] arr3 = { 3, 4, 6, 8, 12 };

    // Call the method to find duplicates
    HashSet<Integer> duplicates = findDuplicates(arr1, arr2, arr3);

    // Print the duplicate elements
    System.out.println("Duplicate elements from three arrays are: " + duplicates);
  }

  public static HashSet<Integer> findDuplicates(int[] arr1, int[] arr2, int[] arr3) {
    HashSet<Integer> result = new HashSet<>();
    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length && k < arr3.length) {
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        result.add(arr1[i]);
        i++;
        j++;
        k++;
      } else if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr2[j] < arr3[k]) {
        j++;
      } else {
        k++;
      }
    }

    return result;
  }
}
