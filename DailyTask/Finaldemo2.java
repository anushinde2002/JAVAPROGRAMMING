//prgm to demo final method

import java.util.*;
class A
{
final void add()
{
System.out.println("base method");
}
}
class B extends A
{
void add()
{
System.out.println("derived method");
}
}
class Finaldemo2
{

public static void main(String args[])
{
B b=new B();
b.add();
}
}
