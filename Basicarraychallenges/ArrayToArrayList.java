//WAP to convert an array to arraylist
//package Basicarraychallenges

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
  public static void main(String[] args) {
    // Example array
    String[] array = { "apple", "banana", "cherry", "date" };

    // Convert array to ArrayList
    List<String> arrayList = new ArrayList<>(Arrays.asList(array));

    // Print ArrayList
    System.out.println("ArrayList: " + arrayList);
  }
}
