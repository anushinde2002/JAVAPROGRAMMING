import java.util.*;
import java.lang.*;

public class Palindromestring {
  public static void main(String args[]) {
    String string = "ABABA";
    System.out.println("Original String:" + string);
    String stringRev = new StringBuffer(string).reverse().toString();
    if (string.equals(stringRev)) {
      System.out.println(string + "is palindrome no!");

    } else {
      System.out.println(string + "is not palindrome no");
    }
  }

}
