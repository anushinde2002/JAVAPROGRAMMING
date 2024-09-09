public class MultipleTryCatch {

  public static void main(String[] args) {
    try {
      int a = 10, b = 0, c;
      c = a / b;
      System.out.println(c);

    } catch (ArithmeticException e) {
      System.out.println("can't divide by zero");

    }
    try {
      int a[] = new int[] { 1, 3, 5, 6, 7, 7 };
      System.out.println(a[6]);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("beyond the array limit");

    }

  }
}
