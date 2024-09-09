public class NumberFormatException {

  public static void main(String[] args) {
    String str = "123";
    try {
      int a = Integer.parseInt(str);
      System.out.println(a);

    } catch (ArithmeticException e) {
      System.out.println("String" + str + "can't converted to integer");
    }
    System.out.println("main thread ended");

  }
}