public class NullpointerException {
  public static void main(String[] args) {
    String str = "anita";
    try {

      System.out.println(str.toUpperCase());

    } catch (NullPointerException n) {
      System.out.println("null can't be casted");
    }
  }
}
