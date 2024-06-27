
import java.util.*;

class substring2 {
  public static void main(String args[]) {
    String str = "aabbcc";
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        System.out.println(str.substring(i, j));
      }
    }

  }
}
