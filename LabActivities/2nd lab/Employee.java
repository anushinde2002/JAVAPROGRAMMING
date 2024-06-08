//wrp to demonstrate static variable

import java.util.*;
public class Employee
{
int eid;//nostatic
String ename;//nonstatic
static String company="Britania";//static
Employee(int x,String y)
{
eid=x;
ename=y;
}
void show()
{
System.out.println(eid+" "+ename+" "+company);
}
}
class Static
{
	public static void main(String args[])
{
Employee e1=new Employee(1,"Priti");
Employee e2=new Employee(11,"Priyansh");
Employee e3=new Employee(22,"Anjali");
e1.show();
e2.show();
e3.show();
}
}

