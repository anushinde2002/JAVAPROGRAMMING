import java.io.*;

public class File {
  public static void main(String args[])
  {
    File f=new File(" ");
    try{
        if(f.createNewFile())
    {
    System.out.println("File create successfully..!");

    }
    else{
    System.out.println("File is already exist");
    }
    catch(Exception e)
    {
    System.out.println("Exception Handled");
    }
  }
  
}
}
