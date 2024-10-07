import java.util.*;

public class SelectionSort {
  public static void main(String[] args) {
    int i, j, size, temp;
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    size = sc.nextInt();
    System.out.println("Enter array elements");
    for (i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Sorting array with using selection sort");
    for (i = 0; i < size; i++) {
      for (j = i + 1; j < size; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

        }
      }
    }
    System.out.println("Now sorted array:\n");
    for (i = 0; i < size; i++) {
      System.out.println(arr[i] + " ");
    }

  }

}
