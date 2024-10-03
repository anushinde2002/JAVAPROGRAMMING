import java.util.*;

public class Secondlargearr {
  public static int getSecondmax(int arr[], int total) {
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;

        }
      }
    }
    return arr[total - 1];
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 6 };
    int b[] = { 22, 66, 77, 33 };
    System.out.println("Second max:" + getSecondmax(a, 4));
    System.out.println("Second max:" + getSecondmax(b, 2));
  }
}
