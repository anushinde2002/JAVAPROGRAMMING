//prgm to demo Interface

interface BankAccount
{  
void withdraw();
void deposit();
}  
//Implementation: by second user  
class CheckingAccount implements BankAccount
{
public void withdraw()
{
	System.out.println("It's withdraw method");
}
}
public void deposit()
{
	System.out.println("It's deposit method");
}
class CheckingAccount1
{
	public static void main(String args[])
	{
		CheckingAccount1 c=new CheckingAccount1();
		c.withdraw();
		c.deposit();
	}
}

