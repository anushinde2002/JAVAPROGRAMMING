
/*Java program to Reverse a String using ListIterator*/
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class Reversestring {
  public static void main(String[] args) {
    String input = "Geeks For Geeks";
    char[] hello = input.toCharArray();
    List<Character> trial1 = new ArrayList<>();

    for (char c : hello)
      trial1.add(c);

    Collections.reverse(trial1);
    ListIterator li = trial1.listIterator();
    while (li.hasNext())
      System.out.print(li.next());
  }
}
