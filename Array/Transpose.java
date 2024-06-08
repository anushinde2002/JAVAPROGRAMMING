import java.util.*;

public class Transpose {
  public static void main(String args[]) {
    int original[][] = { { 1, 3, 4 }, { 2, 3, 4 }, { 3, 4, 5 } };// original matrix
    int transpose[][] = new int[3][3];// 3 rows and 3 columns

    // code to transpose a matrix
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        transpose[i][j] = original[j][i];
      }
    }

    System.out.println("printing matrix without transpose:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(original[i][j] + "");
      }
      System.out.println();

    }
    System.out.println("printing matrix after transpose:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(transpose[i][j] + "");
      }
      System.out.println();
    }
  }
}
