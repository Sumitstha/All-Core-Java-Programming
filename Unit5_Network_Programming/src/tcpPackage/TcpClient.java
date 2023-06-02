package tcpPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public TcpClient() throws UnknownHostException,IOException {
		Socket soc= new Socket("localhost",5555);
		DataInputStream in = new DataInputStream(soc.getInputStream());
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		String request="hello server, I am client";
		out.writeUTF(request);//request is on the socket
		String response=in.readUTF();
		System.out.println("Response is:"+ response);
		soc.close();
		in.close();
		out.close();
		
	}
	
	public static void main(String[] args) throws UnknownHostException,IOException{
		// TODO Auto-generated method stub
		new TcpClient();
	}

}
