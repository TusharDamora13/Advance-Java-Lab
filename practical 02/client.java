import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args){
    try{
        Socket s=new Socket("192.168.0.106",8080);
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello server");
        dout.flush();
        dout.close();
        s.close();
        }
    catch(Exception e){
        System.out.println(e);
        }
    }
} 