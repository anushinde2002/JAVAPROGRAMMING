//prgm to create Treeset and perfrom Navigable Operations on it

import java.util.*;
import java.util.NavigableSet;
import java.util.TreeSet;

class TreeSet5
{
public static void main(String args[])//main() method
{
TreeSet<String> set=new TreeSet<String>();//create object 
set.add("A");//set values of String

set.add("B");

set.add("c");

set.add("D");
 
set.add("E");
System.out.println("Initial Set:" +set);

System.out.println("Reverse Set:" +set.descendingSet());//Reverse() method
System.out.println("Head Set:" +set.headSet("C",true));//Head() method

System.out.println("SubSet:" +set.subSet("A", false,"E",true));//subSet()
System.out.println("TailSet:" +set.tailSet("C",false));//Tail() method

}
}
