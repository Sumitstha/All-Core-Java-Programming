package tcpudp;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
//socket acts as an brige between server and client or request and response
public class TcpClients {

	public TcpClients() throws UnknownHostException, IOException {
		Socket soc = new Socket("localhost", 5555);
		DataInputStream in = new DataInputStream(soc.getInputStream());
		DataOutputStream out = new DataOutputStream(soc.getOutputStream());
		
		String request = "Hello server, I am Sujan";
		out.writeUTF(request); //request is on the socket
		
		String response = in.readUTF();
		System.out.println("Response is :" +response);
		
		soc.close();
		in.close();
		out.close();
		//In case of client, in is request retrieving and out is request transferring
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new TcpClients();
	}

}