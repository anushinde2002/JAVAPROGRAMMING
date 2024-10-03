import java.util.*;

public class Commonarr {
  public static void main(String[] args) {
    int arr1[] = { 11, 22, 33, 4, 5 };
    int arr2[] = { 11, 22, 33, 44, 55 };
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          System.out.println(arr1[i]);
        }
      }
    }
  }

}
