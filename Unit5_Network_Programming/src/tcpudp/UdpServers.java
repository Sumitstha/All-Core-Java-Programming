package tcpudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServers {
	
	public UdpServers() throws IOException {
		DatagramSocket soc = new DatagramSocket(2222);
		byte[] data = new byte[256];
		
		//receiving request
		DatagramPacket packet = new DatagramPacket(data, data.length);
		soc.receive(packet);
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		String request = new String(packet.getData()); //this converts byte to string
		System.out.println("Request is :" +request+ " of size" + request.length());
		
		//sending response
		String resmessage = "Hi Sujan Shrestha I am server !!";
		data = resmessage.getBytes(); // this converts string to bytes
		packet = new DatagramPacket(data, data.length, address, port);
		soc.send(packet); //send response
	}

	public static void main(String[] args) throws IOException {
		new UdpServers();

	}

}
