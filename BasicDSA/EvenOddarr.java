import java.util.*;

public class EvenOddarr {
  public static void main(String[] args) {
    int arr[] = { 10, 27, 17, 19, 50 };

    System.out.println("Even elements in array...");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 == 0) {
        System.out.println(arr[i]);
      }
      System.out.println("Odd elements in array...");
      for (i = 0; i < arr.length; i++) {
        if (arr[i] % 2 != 0) {
          System.out.println(arr[i]);
        }
      }
    }

  }

}
