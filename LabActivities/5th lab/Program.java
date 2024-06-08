//Program with ByteArrayOutputStream and SequenceInputStream classes

import java.io.*;//package
public class Program
{
public static void main(String args[]) throws IOException
{
ByteArrayOutputStream baos=new ByteArrayOutputStream();//create ByteArrayOutputStream

baos.write("This is java Programming".getBytes());

InputStream is1=new ByteArrayInputStream("Hello".getBytes());//create two input stream
InputStream is2=new ByteArrayInputStream("World".getBytes());
SequenceInputStream s=new SequenceInputStream(is1,is2);//create SequenceInputStream

//write data from SequenceInputStream to the ByteArrayOutputStream
int data;
while((data=s.read())!=-1)
{
baos.write(data);
}
System.out.println(baos.toString());//print content of ByteArrayOutputStream
}
}
