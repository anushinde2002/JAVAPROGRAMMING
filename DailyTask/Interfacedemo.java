//prgm to demo Interface
interface BankAccount
{
void deposit();//abstract method
void withdraw();
}
abstract class CheckingAccount implements BankAccount{
public void deposit()
{
System.out.println("It's deposit");
}
}

public void withdraw()
{
System.out.println("It's withdraw");
}

class Interfacedemo
{
public static void main(String args[])
{
CheckingAccount c=new CheckingAccount();
c.deposit();
c.withdraw();
}
}
