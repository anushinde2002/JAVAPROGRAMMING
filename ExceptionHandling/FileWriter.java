import java.io.*;

public class FileWriter {
  public static void main(String args[])
  {
    FileWriter fw=new FileWriter(" ");
    try{
        fw.write("Java Programming is the best lang..!");
    }
    finally{
      f.close();
    }
    System.out.println("Successfully wrote data in file");
  }
  catch(IOException)
  {
    System.out.println(i);
  }
  
}
