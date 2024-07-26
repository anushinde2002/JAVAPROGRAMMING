//WAP to check if two arrays are equal or not
//package Basicarraychallenges;

import java.util.*;

public class EqualArrays {
  public static void main(String[] args) {
    int[] array1 = { 1, 2, 3, 4, 5 };
    int[] array2 = { 1, 0, 3, -1, 5 };

    System.out.println("Array 1 check result: " + checkArray(array1));
    System.out.println("Array 2 check result: " + checkArray(array2));
  }

  public static boolean checkArray(int[] array) {
    for (int num : array) {
      if (num <= 0 || num == -1) {
        return false;
      }
    }
    return true;
  }
}
