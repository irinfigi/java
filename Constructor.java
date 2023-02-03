import java.io.*;
import java.lang.*;
class demo
{
demo()
{
System.out.println("EMPTY CONSTRUCTOR");
}
demo(int a,String b)
{
System.out.println("PARAMETERISED CONSTRUCTOR");
System.out.println(a);
System.out.println(b);
}
}
class Constructor
{
public static void main(String args[])
{
demo d1=new demo();
demo d2=new demo(33,"Irin");
}
}
