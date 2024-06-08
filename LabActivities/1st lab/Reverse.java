//Program to Reverse No
class Reverse{
public static void main(String args[])
{
int num=5678,reversed=0;
{
System.out.println("Original Number:"+num);

while(num!=0)
{
//get last digit from the num
int digit=num%10;
reversed=reversed*10+digit;

//remove the last digit from num
num/=10;
}
System.out.println("Reverse No:"+reversed);
}
}
}
