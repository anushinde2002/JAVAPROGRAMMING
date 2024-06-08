//prgm to demonstrate two threads t1->avg of first 10 number
//t2->print square of number of given array

import java.util.*;


public class  MyThread extends Thread {

    public static void main(String[] args) //main() method
	{
        
        Thread t1 = new Thread()//create obj of Thread t1
		{
            public  synchronized void run() {
				int sum=0;
				double avg;
				for(int i=1;i<=10;i++)
				{
					sum=sum+i;
				}
				avg=sum/10;
				System.out.println("Average of 1st 10 numbers is:"+avg);//avg of first 10 numbers
			}
		};
		
				
					
					t1.start();//call t1.start()
	
					Thread t2=new Thread()//create obj of Thread t2
					{
					public synchronized void run()//synchronized run() method
					{
					int a[] ={1,20,50,15,30};//array declaration
					int square;
					for(int i=0;i<5;i++)//for loop
					{
						square=a[i]*a[i];
						System.out.println("Square of "+i+" :"+square);//print square of array elements
					}
					}
					};
					t2.start();//call t2.start()
	
}


	
					
						
					
					
}
   