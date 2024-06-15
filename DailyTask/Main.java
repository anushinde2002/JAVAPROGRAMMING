//pkg creation
package anudip
public class Studentinfo
{
	int age;
	String name,add;
	public Studentinfo(int e,String a,String b)
	{
		age=e;
		name=a;
		add=d;
	}
	public void display()
	{
		System.out.prinltn("Student Details");
		System.out.println("Name of the student is:"+name);
		System.out.println("Age of the student is:"+age);
		System.out.println("Add of the student is:"+add);
	}
	
}
package training;
public class Sdinfo{
	String name,pos;
	public Sdinfo(String n,String p)
	{
		name=n;
		pos=p;
	}
	public void display()
	{
		System.out.println(Name of the Member"+name);
		System.out.println("his position"+pos);
	}
}
class Main{
	import training.*;
	class PackageDemo
	{
		public static void main(String args[])
		{
			training.Studentinfo a=new training.Studentinfo(18,'b','parner');
			a.display();
		}
	}
	
