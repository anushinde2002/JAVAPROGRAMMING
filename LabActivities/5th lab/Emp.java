//program to Printwriter class with store diff data details
import java.io.*;

public class Emp {

	public static void main(String[] args) throws IOException
	{
	
		String[] e1= {"11","Anita","555550"};//employee details eId,eName,Salary
		String[] e2= {"12","Omkar","12000"};
		
		//open file using PrintWriter
		PrintWriter writer=new PrintWriter(new FileWriter("C:\\Practice\\abc.txt"));
		
		//write each employees details to the file
		writer.println("eId\t eName\t Salary");
		writer.println(String.join("\t", e1));
		writer.println(String.join("\t", e2));
		writer.close();//close file
	}
}
