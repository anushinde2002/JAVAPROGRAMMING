import java.lang.*;

public class charactercountstring {
  public static void main(String args[]) {
    String string = "Accenture is my Dream Company";
    int count = 0;

    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) != ' ')

        count++;

    }
    System.out.println("Total no of character in a string:" + count);
  }

}
