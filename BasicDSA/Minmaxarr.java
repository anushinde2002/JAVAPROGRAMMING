import java.util.*;

public class Minmaxarr {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
    int min = arr[0];
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];

      } else if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println(" largest no " + max + " smallest no " + min);
  }

}
