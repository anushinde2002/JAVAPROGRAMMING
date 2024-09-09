public class Trycatchfinally {
  public static void main(String[] args) {
    try {
      String str = "anita";
      System.out.println(str.toUpperCase());

    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println(10 / 0);
    }
    System.out.println("main thread ended");

  }

}
