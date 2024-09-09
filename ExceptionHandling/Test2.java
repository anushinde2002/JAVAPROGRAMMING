public class Test2 {
  void div(int a, int b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException();
    } else {
      int v = a / b;
      System.out.println(v);
    }
  }

  public static void main(String[] args) throws ArithmeticException {
    Test2 t = new Test2();
    try {
      t.div(20, 0);
    } catch (Exception e) {
      System.out.println("value of b is zero");
    }

  }

}
