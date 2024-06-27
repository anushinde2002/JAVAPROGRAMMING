
import java.util.*;

class palindrome2 {
  public static void main(String args[]) {

    String revstr = "";
    Scanner sc = new Scanner(System.in);
    String original = sc.nextLine();
    for (int i = original.length() - 1; i >= 0; i--) {
      revstr = revstr + original.charAt(i);
    }
    if (original.equals(revstr)) {
      System.out.println("given string is palindrome");
    } else {
      System.out.println("given string is not palindrome");
    }

  }

}
