//prgm to calculate total bill using array

import java.util.*;
public class TajHotel
{
public static void main(String args[])//main method
{
	
	int no_of_days=30;
	
	String room[]={"luxury","a/c","non/ac","delux","general"};//array declararion
	int cost[]={2500,2000,1500,1200,500};//assign values to array
	int bill[]=new int[5];
	for(int i=0;i<4;i++)//for loop
	{
		bill[i]=cost[i]*no_of_days;//total bill=cost per day*no.of day
		System.out.println(room[i]+" "+"cost is"+bill[i]+" ");//print total bill
	}
	}
}
