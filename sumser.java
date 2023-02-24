import java.io.*;
import java.lang.*;
class test
{
public int i;
public Double s=0d;
test1 t=new test1();
Double sum(int n)
{
for(i=1;i<=n;i++)
{
s=s+(i/t.factor(i));
}
return s;
}
}
class test1
{
public int r=1;
 public int factor(int p)
 {
 if(p!=0)
 {
 r=p*factor(p-1);
}
 return r;
 }
}
class sumser
{
public static void main(String args[])
{
try
{
int n;
DataInputStream dir=new DataInputStream(System.in);
System.out.println("enter the limit");
n=Integer.parseInt(dir.readLine());
test t1=new test();
System.out.println("Sum is:"+t1.sum(n));
}
catch(Exception e)
{
 System.out.println("error"+e);}}}
 
