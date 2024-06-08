import java.util.*;

public class minmax {
  static int getMin(int arr[], int n) {
    int res = arr[0];
    for (int i = 0; i < n; i++)
      res = Math.min(res, arr[i]);
    return res;
  }

  static int getMax(int arr[], int n) {
    int res = arr[0];
    for (int i = 0; i < n; i++)
      res = Math.max(res, arr[i]);
    return res;
  }

  public static void main(String args[]) {
    int a[] = { 12, 15, 188, 200, 20 };
    int n = a.length;
    System.out.println("Maximum elements of array:" + getMax(a, n));
    System.out.println("Minimum elements of array is:" + getMin(a, n));

  }

}
