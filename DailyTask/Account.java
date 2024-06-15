//prgm to demo Exception handling

import java.lang.*;
public class Account
{
private int acno=12345;
public int acno()
{
return acno;
}
private String cname="Anita";
public String cname()
{
return cname;
}
private int balance=500;
public int balance()
{
return balance;
}
public void withdraw(int amount) throws InSufficientFundException{
if(amount>balance)
{
throw new InSufficentFundException(String.format("Current balance %d is less than requested amount %d",balance,amount));
}
balance=balance-amount;
}
public void deposit(int amount){
if(amount<=0)
{
throw new IllegalArgumentException(String.format("Invalid deposit amount %s",amount));
}
}
}




