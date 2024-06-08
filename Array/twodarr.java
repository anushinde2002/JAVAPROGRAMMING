import java.util.*;

public class twodarr {
  public static void main(String args[]) {
    int a[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array elements:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        a[i][j] = sc.nextInt();

      }
    }
    System.out.println("Matrix:\n");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(a[i][j] + "");

      }
      System.out.print("\n");

    }
  }
}
