public class NestedCatch {
  public static void main(String[] args) {
    try {
      System.out.println(10 / 0);

    } catch (Exception e) {
      System.out.println(e);
      try {
        String a = "ANITA";
        System.out.println(a.toLowerCase());

      }

      catch (NullPointerException n) {
        System.out.println("null value can't found");
      }

    }
    System.out.println("main thread is ended");

  }
}
