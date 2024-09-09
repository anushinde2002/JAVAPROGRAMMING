public class Demo {
  public static void wait() throws InterruptedException {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
      Thread.sleep(1000);
    }

  }

  public static void main(String[] args) throws InterruptedException {
    wait();
    System.out.println("main thread is ended");

  }

}
