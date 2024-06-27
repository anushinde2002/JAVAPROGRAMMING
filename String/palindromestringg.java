import java.util.*;

public class palindromestringg {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // Reading input from the user
    System.out.println("Enter a string:");
    String original = sc.nextLine();

    // Initialize an empty string for reversal
    String reversed = "";

    // Reverse the original string
    for (int i = original.length() - 1; i >= 0; i--) {
      reversed = reversed + original.charAt(i);
    }

    // Check if the reversed string is equal to the original string
    if (original.equals(reversed)) {
      System.out.println("Palindrome string.");
    } else {
      System.out.println("Not a palindrome string.");
    }

    sc.close(); // Close the scanner object
  }
}
