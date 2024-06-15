import java.util.*;
public class BankCustomer
{
int ano;
String atype;
double amt;
BankCustomer()
{
	ano=1;
	atype="saving";
	amt=100000;
}
BankCustomer(int x)
{
	ano=x;
	
}
BankCustomer(int x,String y)
{
	ano=x;
	atype=y;
	
}
BankCustomer(int x,String y,double z)
{
	ano=x;
	atype=y;
	amt=z;
	
}
void show()
{
System.out.println(ano+" "+atype+" "+amt);
}
}
class BankCustomer1
{
	public static void main(String args[])
	{
		BankCustomer b1=new BankCustomer();
		BankCustomer b2=new BankCustomer(1000);
		BankCustomer b3=new BankCustomer(1000,"saving");
		BankCustomer b4=new BankCustomer(1000,"saving",3000000);
		b1.show();
		b2.show();
		b3.show();
		b4.show();
	}
}

		

	


