//prgm to demo of abstract class
abstract class Shape
{
abstract void calculateArea()
{
class Circle extends Shape
{
void calculateArea()
{
System.out.println("circle calculateArea");
}
}
class Rectangle extends Shape
{
void calculateArea()
{
System.out.println("rectangel calculateArea");
}
class Shape2
{
public static void main(String args[])
{
Circle c=new Circle();
c.calculateArea();
Rectangle r=new Rectangle();
r.calculateArea();
}
}
}

}
}
