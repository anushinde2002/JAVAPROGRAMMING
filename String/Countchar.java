import java.util.*;
import java.lang.*;

public class Countchar {
  public static void main(String args[]) {
    String str = "Accenture is my dream company";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        count++;
      }
    }
    System.out.println("Total no of characters in a string (excluding spaces): " + count);
  }
}
