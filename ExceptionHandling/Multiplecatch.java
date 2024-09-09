import java.lang.*;

public class Multiplecatch {
  public static void main(String[] args) {
    try {
      int a = 10, b = 2, c;
      c = a / b;
      System.out.println(c);

      int arr[] = { 1, 2, 3, 4, 5, 6 };
      System.out.println(arr[2]);

      String str = "anita";
      System.out.println(str.toUpperCase());

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array exception");

    } catch (ArithmeticException e) {
      System.out.println("Artithmetic exception");

    }

    catch (Exception e) {
      System.out.println("All type of exception are handle");
    }
  }

}
