//wrp to demo of super()

class Manager
{
Manager()
{
System.out.println("Manager Info");
}
}
class Employee extends Manager
{
Employee()
{
System.out.println("Employee Info");
}
}
class Superdemo
{
public static void main(String args[])
{
Employee e=new Employee();
}
}
