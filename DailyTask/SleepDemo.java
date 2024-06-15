 //sleep() method in Java
  
import java.lang.*;
  
public class SleepDemo implements Runnable {
    Thread t;
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println(
                Thread.currentThread().getName() + "  "
                + i);
            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }
  
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
  
    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new SleepDemo());// call run() method
        t.start();
  
        Thread t2 = new Thread(new SleepDemo());
  
        // call run() method
        t2.start();
    }
}
		
		
  