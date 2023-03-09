package Networking;
import java.io.*;
import java.net.*;
public class FacClnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		 {
		 Socket s=new Socket("localhost",124);
		 System.out.println("waiting....");
		 ObjectOutputStream ous=new ObjectOutputStream(s.getOutputStream());
		 DataInputStream dis=new DataInputStream(System.in);
		 System.out.println("Enter the number:");
		 String str=dis.readLine();
		 ous.writeUTF(str);
		 ous.close();
		 s.close();
		 
		 }
		 catch(Exception e)
		 {
		 System.out.println("error: "+e);
		 }
	}

}
