package String;

import java.util.*;

public class VowelsOrConsonant {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character:");
    char ch = sc.next().charAt(0);

    // Checking if the entered character is a vowel
    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
      System.out.println("The given character is a vowel.");
    } else {
      System.out.println("The given character is a consonant.");
    }

    sc.close(); // Closing the scanner object
  }
}
