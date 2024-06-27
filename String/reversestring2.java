public class reversestring2 {
  public static void main(String args[]) {
    String str = "India is my country";
    String revstr = " ";
    for (int i = str.length() - 1; i >= 0; i--) {
      revstr = revstr + str.charAt(i);

    }
    System.out.println("original string:" + str);
    System.out.println("THe reverse string is:" + revstr);

  }
}
