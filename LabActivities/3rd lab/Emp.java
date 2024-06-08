//prgm to demo Encapsulation demo
import java.util.*;
class  Emp
{
private int eid;//private members
private String name;
private float salary;

public void setInput(int eid,String name,float salary)//setInput()
{
	this.eid=eid;
	this.name=name;
	this.salary=salary;
}
public void getOutput(int eid,String name,float salary)//getOutput()
{
	
	System.out.println(eid+" "+name+" "+salary);
}
public static void main(String args[])//main() method
{
Emp e=new Emp();//create object of Emp

e.getOutput(1,"Akshada",2000);

}
}

