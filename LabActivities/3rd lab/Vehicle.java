//prgm to Methodoverriding
import java.util.*;
class Vehicle
{
void run()//run()
{
System.out.println("Vehicle is running");
}
}
class Bike extends Vehicle//hierarchical inheritance
{
void run()
{
System.out.println("bike is running");
}
}
class Car extends Vehicle//hierachical inheritance
{
	void run()
	{
		System.out.println("car is stop");
	}
}
class Override2
{
public static void main(String[] args)//main() method
{
Bike b=new Bike();//create object Bike
b.run();
Car c=new Car();//create object Car
c.run();
 }
 }
 
 