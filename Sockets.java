import java.util.*;
import java.net.*;
import java.io.*;
class Sockets
{
	public static void main(String arg[])
	{
		try
		{
			Socket s=new Socket("Intermic.net",4040);
			InputStream i=s.getInputStream();
			OutputStream o=s.getOutputStream();
			String name="rediff.com";
			o.write(name.getBytes());
			
			
			while(true)
			{
				int x=i.read();
				if(x==-1)
			    break;
				System.out.print((char)x);
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
	