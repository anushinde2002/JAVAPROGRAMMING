import java.util.*;

public class Sumarr {
  public static void main(String[] args) {
    int arr[] = { 10, 2, 3, 4, 5, 6, 7 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println("sum of array elements are:" + sum);
  }

}
