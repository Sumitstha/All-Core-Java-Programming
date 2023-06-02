package tcpudp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServers {
	public TcpServers() throws IOException {
		ServerSocket ss = new ServerSocket(5555);
		Socket soc = ss.accept();
		DataInputStream in = new DataInputStream(soc.getInputStream());
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		
		String request = in.readUTF();
		System.out.println("The request is: "+request);
		
		String response = "Hi Sujan, Everything is fine.";
		out.writeUTF(response);
		
		ss.close();
		soc.close();
		in.close();
		out.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		new TcpServers();
	}

}
