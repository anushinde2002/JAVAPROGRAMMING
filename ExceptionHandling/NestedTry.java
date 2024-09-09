public class NestedTry {
  public static void main(String[] args) {
    try {

      try {
        int a[] = new int[] { 10, 20, 30, 40 };
        System.out.println(a[4]);

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
      }
      System.out.println(10 / 2);

    } catch (ArithmeticException e) {
      System.out.println(e);
    }
    System.out.println("Learn coding");

  }

}
