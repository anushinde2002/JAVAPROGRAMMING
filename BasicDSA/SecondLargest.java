import java.util.*;

public class SecondLargest {
  public static void main(String[] args) {
    int arr[] = { 100, 200, 300, 400, 500 };
    int firstmax = 0;
    int secondmax = 0;
    for (int i = 0; i < arr.length; i++) {
      if (firstmax < arr[i]) {
        secondmax = firstmax;
        firstmax = arr[i];
      } else if (secondmax > arr[i]) {
        secondmax = arr[i];
      }
    }
    System.out.println(" firstmaxno: " + firstmax + " secondmax " + secondmax);
  }

}
