public class Test {
  public static void main(String[] args) {
    System.out.println("main thread started");
    int a = 10, b = 0, c;
    try {
      c = a / b;
      System.out.println(c);

    } catch (Exception e) {

      System.out.println("can't divide by zero");

    }
    System.out.println("main thread ended");

  }
}
