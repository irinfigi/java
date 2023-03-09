package Networking;
import java.io.*;
import java.net.*;
public class FileSrvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss = new ServerSocket(123);
			System.out.println("Server listening......");
			Socket s=ss.accept();
			System.out.println("Connection Established with client");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String file = dis.readUTF().trim();
			System.out.println("File content is");
			FileInputStream fis = new FileInputStream(file);
			int b=fis.read();
			while(b!=-1)
			{
			char c=(char)b;
			System.out.print(c);
			b=fis.read();
			}
			 System.out.println("");
			s.close();
			ss.close();
			dis.close();
			fis.close();
			}
				catch(Exception e)
				{
				System.out.println(e);
				}
	}

}
