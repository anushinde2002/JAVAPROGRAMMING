import java.util.*;

public class Bubblesort {
  static void Bubblesort(int arr[]) {
    int n = arr.length;
    int temp = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;

        }
      }
    }
  }

  public static void main(String args[]) {
    int arr[] = { 5, 9, 8, 7, 6, 4 };
    System.out.println("Array before sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
    Bubblesort(arr);
    System.out.println("Array after bubblesort");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }

}
