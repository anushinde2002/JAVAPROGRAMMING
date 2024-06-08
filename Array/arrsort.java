import java.util.Arrays;

public class arrsort {
  public static void main(String args[]) {

    int a[] = { 10, 70, 90, 80, 50 };
    System.out.println("original array is:");
    for (int num : a) {
      System.out.print(num + " ");
    }
    Arrays.sort(a);
    System.out.println("\n sorted array is:");
    for (int num : a) {
      System.out.print(num + " ");
    }
  }
}
