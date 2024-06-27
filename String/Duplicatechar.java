import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class Duplicatechar {
  public static void main(String args[]) {
    String string = "Good opportunity";
    int count;
    char String[] = string.toCharArray();
    System.out.println("Duplicate character in a given string");
    for (int i = 0; i < String.length; i++) {
      count = 1;
      for (int j = i + 1; j < String.length; j++) {
        if (String[i] == String[j] && String[i] != '0') {
          count++;
          String[j] = 0;

        }
      }
      if (count > 1 && String[i] != 0)
        System.out.println(String[i]);

    }

  }

}
