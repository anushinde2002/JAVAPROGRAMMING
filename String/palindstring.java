import java.util.*;

public class palindstring {
  public static void main(String args[]) {
    String reverse = " ";
    // String str="ICCS";
    System.out.println("ENter an input string:");
    Scanner sc = new Scanner(System.in);
    String original = sc.nextLine();
    for (int i = original.length(); i >= 0; i++) {
      reverse = reverse + original.charAt(i);

    }
    if (original.equals(reverse)) {
      System.out.println("String is palindrome");
    } else {
      System.out.println("String not palindrome");
    }

  }

}
