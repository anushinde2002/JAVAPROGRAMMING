//WAP to Convert ArrayList to Array

//package Basicarraychallenges;

import java.util.concurrent.*;
import java.util.ArrayList;

public class ArrayListToArray {
  public static void main(String[] args) {
    // Example ArrayList
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("apple");
    arrayList.add("banana");
    arrayList.add("cherry");

    // Convert ArrayList to array of String
    String[] array = new String[arrayList.size()];
    array = arrayList.toArray(array);

    // Print the array elements
    System.out.print("Array: ");
    for (String element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }
}
