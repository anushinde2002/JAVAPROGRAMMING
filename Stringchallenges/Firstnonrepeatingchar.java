
//WAP to find first non-repeating character from the string
import java.util.*;

class Firstnonrepeatingchar {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input a String:");
    String word = s.next();
    boolean flag = true;

    for (char i : word.toCharArray()) {
      if (word.indexOf(i) == word.lastIndexOf(i)) {
        System.out.println("The first character which is not repeating is: " + i);
        flag = false;
        break;
      }
    }
    if (flag == true) {
      System.out.println("There is no non-repeating character in the input string");
    }
  }
}
