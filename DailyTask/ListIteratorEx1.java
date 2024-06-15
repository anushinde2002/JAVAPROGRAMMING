import java.util.*;

public class ListIteratorEx1 {
	String sname,sclass,slocation;

  public static void main(String[] args) //main() method
  {
	  
    // Creating a linked list of student details
    List<String> students = new LinkedList<>();
	
	

    students.add("Anita");
    students.add("TY.BCS");
    students.add("Pune");

    // Creating a lisiterator object for the list.
    ListIterator<String> studentsIterator = students.listIterator();

    //using hasNext() next element is present in the list
    while (studentsIterator.hasNext()) {
      System.out.println(studentsIterator.next());//use next() print the element
    }
  }
}