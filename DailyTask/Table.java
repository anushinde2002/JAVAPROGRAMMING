//prgm demo for method synchronization

class Table{  
void printTable(int n){//method not synchronized  
   for(int i=1;i<=3;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(1000);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(3);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(50);  
}  
}  
  
class Synchronization1{  
public static void main(String args[])
{  
Table t = new Table();//only one object  
MyThread1 t1=new MyThread1(t);  
MyThread2 t2=new MyThread2(t);  
t1.start();  
t2.start();  
}  
}  