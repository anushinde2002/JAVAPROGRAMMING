//package String;

import java.util.*;
import java.io.*;

public class strdemo {
  public static void main(String args[]) {
    String s1 = "Indira";
    String s2 = "Indira";
    String s3 = new String("Indira");

    System.out.print(s1 == s2); // true, both refer to the same string literal in the string pool
    System.out.print(s2 == s3); // false, s3 refers to a new object in the heap
    System.out.print(s1.equals(s3));// true, both strings have the same value

  }
}
