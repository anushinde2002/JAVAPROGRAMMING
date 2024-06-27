//package String; // Ensure the correct package name if using packages

import java.util.*;
import java.lang.*;

public class duplicate {
  public static void main(String args[]) {
    String str1 = "Great responsibility";
    int count;

    // Converts given string into char array
    char[] string = str1.toCharArray();
    System.out.println("Duplicate characters from the given string:");

    // Loop through each character in the string
    for (int i = 0; i < string.length; i++) {
      count = 1;
      for (int j = i + 1; j < string.length; j++) {
        // Check if the current character matches with any other character
        if (string[i] == string[j] && string[i] != '0' && string[i] != ' ') {
          count++;
          // Set string[j] to '0' to avoid printing visited character
          string[j] = '0';
        }
      }
      // A character is considered duplicate if the count is greater than 1
      if (count > 1 && string[i] != '0') {
        System.out.println(string[i]);
      }
    }
  }
}
