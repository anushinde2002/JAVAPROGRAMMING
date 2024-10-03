import java.util.*;

public class Equalarr {
  public static void main(String[] args) {
    int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
    int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };
    boolean status = Arrays.equals(arr1, arr2);
    if (status == true) {
      System.out.println("Arrays are equal");
    } else {
      System.out.println("Arrays are not equal");
    }
  }

}
