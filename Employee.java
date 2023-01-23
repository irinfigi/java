//Create a class for Employee having eno,ename and esal as data members.Provide functions for reading and displaying employee details.(Accept information of n employees in the main function, display the same and search for an emp(using eno)).

import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Prgm
{
public String name;
public int number,sal;
public void read()
{
try
{
 Scanner console=new Scanner(System.in);
DataInputStream dir=new DataInputStream(System.in);
System.out.println("enter the employee name");
name=console.nextLine();
System.out.println("enter the employee number");
number=Integer.parseInt(dir.readLine());
System.out.println("enter the employee salary");
sal=Integer.parseInt(dir.readLine());
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
public void display()
{
System.out.println("employee id="+number);
System.out.println("name="+name);
System.out.println("salary="+sal);
}
}
class Employee
{
public static void main(String args[])
{
 try
 {
 int i,n;
 Prgm obj[]=new Prgm[10];
 DataInputStream dir1=new DataInputStream(System.in);
 System.out.println("enter the number of employees");
 n=Integer.parseInt(dir1.readLine());
 for(i=1;i<=n;i++)
 {
 obj[i]=new Prgm();
 obj[i].read();
 }
 for(i=1;i<=n;i++)
 {
 obj[i].display();
 }
 }
catch(Exception e)
{
 System.out.println("error"+e);
}
}
}

