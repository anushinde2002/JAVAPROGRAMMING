class reversestringg {
  public static void main(String args[]) {
    String str = "Indira";
    String strrev = " ";
    for (int i = str.length() - 1; i >= 0; i--) {
      strrev = strrev + str.charAt(i);
    }
    System.out.println("The reverse string is:" + strrev);
  }
}