import java.lang.*;
import java.util.*;

public class Substring {
  public static void main(String args[]) {
    String str = "abbabb";
    System.out.println("all substring of given string is:");
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j < str.length(); j++) {
        System.out.println(str.substring(i, j));
      }
    }
  }

}
