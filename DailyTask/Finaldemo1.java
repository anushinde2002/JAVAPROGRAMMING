//prgm to demo final class 

import java.util.*;
final class Base
{
void display()
{
System.out.println("I am display msg in Base class.");
}
}
class FinalTest extends Base
{
void display1()
{
System.out.println("I'm display msg in FinalTest.");
}
}
class Finaldemo1
{
	
public static void main(String args[])
{
FinalTest t=new FinalTest();
t.display();
t.display1();
}
}






