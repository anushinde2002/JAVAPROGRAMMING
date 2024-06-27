public class totalcount {
  public static void main(String args[]) {
    String str = "I love India";
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      // Increment count for each valid character (excluding spaces)
      if (str.charAt(i) != ' ') {
        count++;
      }
    }

    System.out.println("The total count of characters is: " + count);
  }
}
