//prgm to demo Interfacedemo


interface Person
{
public void speak();//abstract
}

class Student implements Person
{
 public void speak()//abstract
{
System.out.println("Hello Students");
}
}
class Teacher implements Person
{
 public void speak()
{
System.out.println("Welcome to Staff");
}
}
class Interfacedemo
{
	
public static void main(String args[])//main()
{
Student s1=new Student();//object Student

s1.speak();

}
}









