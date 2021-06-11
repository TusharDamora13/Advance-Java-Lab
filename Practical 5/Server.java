import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
public class Server
{
	public static void main(String[] args)throws Exception
	{
		DatagramSocket ds =new DatagramSocket(1234);
		byte[] receive=new byte[65536];
		DatagramPacket dp=null;
                while(true){
		dp=new DatagramPacket(receive,receive.length);
		ds.receive(dp);
		String str=data(receive).toString();
		System.out.println("Client said: "+data(receive));
                if(data(receive).toString().equals("bye"))
                break;
                receive=new byte[65535];
                }
	}
        public static StringBuilder data(byte[]a)
	{
		if(a==null)
		{
			return null;
		}
		StringBuilder ret=new StringBuilder();
		int i=0;
		while(a[i]!=0)
		{
			ret.append((char)a[i]);
			i++;
		}
		return ret;
	}
}
