package tcpudp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClients {
	public UdpClients() throws IOException {
		DatagramSocket soc = new DatagramSocket();
		
		//data that needs to be sent
		byte[] data = new byte[256];
		String reqmessage = "Hi server I am Sujan Shrestha";
		data = reqmessage.getBytes();
		InetAddress address = InetAddress.getByName("localhost");
		
		DatagramPacket packet = new DatagramPacket(data, data.length, address, 2222);
		soc.send(packet);
		
		//get response
		packet = new DatagramPacket(data, data.length);
		soc.receive(packet);
		
		//response display
		String response = new String(packet.getData()); //this converts byte to string
		System.out.println("Response is :" +response+ "of size" + response.length());
	}

	public static void main(String[] args) {
		try {
		new UdpClients();
		}
		catch (Exception ex) {
			
		}
		// we can also create try catch for easy as we dont know the sppecified exception

	}

}