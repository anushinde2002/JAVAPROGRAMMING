import java.util.*;

public class sumarray {
  public static void main(String args[]) {
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first matrix data:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        a[i][j] = sc.nextInt();

      }
    }
    System.out.println("Enter second matrix data:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        b[i][j] = sc.nextInt();
      }
    }
    System.out.println("First Matrix\n");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println(a[i][j] + "");
      }
    }
    System.out.println("second Matrix\n");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.println(b[i][j] + "");
      }
    }
    System.out.println("sum of two Matrix\n");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        a[i][j] = a[i][j] + b[i][j];
        System.out.println(a[i][j] + b[i][j]);
      }
      System.out.print("\n");
    }

  }
}
