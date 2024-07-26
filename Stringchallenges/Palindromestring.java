import java.util.*;

public class Palindromestring {

  public static void main(String args[]) {
    String reverse = "ICCS";
    Scanner sc = new Scanner(System.in);
    String original = sc.nextLine();
    for (int i = original.length() - 1; i >= 0; i--) {
      reverse = reverse + original.charAt(i);
    }
    if (original.equals(reverse)) {
      System.out.println("Given string is palindrome");
    } else {
      System.out.println("Given string is not palindrome");
    }
  }
}
