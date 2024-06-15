import java.lang.*;
import java.util.*;
class EmployeeTask
{
private int empID;
private String empName;
private int noOfHoursWorked;
private double hourlyPrice;
private double grossSalary=0;
private double tax;
private double netSalary=0;
Scanner sc=new Scanner(System.in);
public void SetEmpID(int value)
{
empID=value;
}
public int GetEmpID()
{
System.out.println("Enter Employee ID:");
empID=sc.nextInt();
System.out.println("Employee ID is:"+empID);
return empID;
}
public void SetEmpName(String value)
{
empName=value;
}
public String GetEmpName()
{
System.out.println("Enter Employee Name:");
empName=sc.next();
System.out.println("Employee Name is:"+empName);
return empName;
}
public void SetNoOfHoursWorked(int value)
{
	noOfHoursWorked=value;
}
public double GetNoOfHoursWorked()
{
	System.out.println("Enter Employee No of Hours Worked:");
	noOfHoursWorked=sc.nextInt();
	System.out.println("Employee No of Hours worked is:"+noOfHoursWorked);
	return noOfHoursWorked;
}
public void SetHourlyPrice(double value)
{
	hourlyPrice=value;
}
public double GetHourlyPrice()
{
	System.out.println("Enter Employee HourlyPrice:"); 
	hourlyPrice=sc.nextDouble();
	System.out.println("Employee hourlyPrice is:"+hourlyPrice);
	return hourlyPrice;
}
public double GetGrossSalary()
{
	grossSalary=noOfHoursWorked*hourlyPrice;
	System.out.println("GrossSalary is:"+grossSalary);
	if(grossSalary>30000)
	{
		tax=grossSalary*0.05;
		System.out.println("Tax is:"+tax);
	}
	else
	{
		double tax=0;
		System.out.println("Tax is:"+tax);
	}
	return grossSalary;
	}
	public double GetNetSalary()
	{
	netSalary=grossSalary-tax;
	System.out.println("NetSalary is:"+netSalary);
	return netSalary;
	}
	public void display()
	{
		System.out.println("*********Employee Details*******");
		System.out.println("Employee ID is:"+empID);
		System.out.println("Employee Name is:"+empName);
		System.out.println("Employee no of Hours worked is:"+noOfHoursWorked);
		System.out.println("Employee hourly price is:"+hourlyPrice);
		System.out.println("Gross Salary is:"+grossSalary);
		System.out.println("Tax is:"+tax);
		System.out.println("Net Salary is:"+netSalary);
	}
}
 public class EmployeeDemo
{
	public static void main(String args[])
	{
	EmployeeTask e=new EmployeeTask();
	e.GetEmpID();
	e.GetEmpName();
	e.GetNoOfHoursWorked();
	e.GetHourlyPrice();
	e.GetGrossSalary();
	e.GetNetSalary();
	e.display();
	}
}

	
		
		
	
		
	
	