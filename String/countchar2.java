import java.util.*;

class countchar2 {
  public static void main(String args[]) {
    String str = "India is my country";
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != '0') {
        count++;
      }
      System.out.println("Total no of character in a string:" + count);
    }

  }
}
