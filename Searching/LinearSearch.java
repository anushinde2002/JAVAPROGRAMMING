
//Linear Search
import java.util.*;

public class LinearSearch {
  public static void main(String[] args) {
    int i, n, item;
    int a[];
    Scanner sc = new Scanner(System.in);
    System.out.println("How many elements do u want to enter");
    n = sc.nextInt();
    a = new int[n];

    System.out.println("Enter elements");

    for (i = 0; i < n; i++)
      a[i] = sc.nextInt();
    System.out.println("Enter item to find");
    item = sc.nextInt();
    for (i = 0; i < a.length; i++) {
      if (a[i] == item) {
        System.out.print("item exist");
        break;
      }
    }

  }
}