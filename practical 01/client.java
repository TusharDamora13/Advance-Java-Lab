import java.io.*;
import java.net.*;
public class client {
public static void main(String[] args) {
	try {
		Socket s=new Socket("localhost",8000);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hellow Server");
		dout.flush();
		dout.close();	
	}catch(Exception e)
	{
		System.out.println(e);
	}
} 	
}