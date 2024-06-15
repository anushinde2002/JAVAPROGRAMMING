//prgm to demo of abstract class
abstract class Shape
{
abstract void calculateArea();
}

class Circle extends Shape
{
void calculateArea(){

System.out.println("calculateArea of Circle");
}
}
class Rectangle extends Shape
{
void calculateArea()
{
System.out.println("calculateArea of Rectangle");
}
}
class Abstractdemo
{
public static void main(String args[]) 
{
Circle c=new Circle();
c.calculateArea();
Rectangle r=new Rectangle();
r.calculateArea();
}
}

