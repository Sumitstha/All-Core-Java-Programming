package tcpPackage;
//DtagramSocket, DatagramPacket


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {
	public UdpClient() throws IOException {
		DatagramSocket soc=new DatagramSocket();
		//data that needs to sent
		byte[] data= new byte[256];
		InetAddress address =InetAddress.getByName("localhost");
		DatagramPacket packet= new DatagramPacket(data,data.length,address,2222);
		soc.send(packet);
		
		//get response
		packet = new DatagramPacket(data,data.length);
		soc.receive(packet);
		
		//response display
		//byte[] response= packet.getData();
		String response= new String(packet.getData());//converts byte into string
		System.out.println("Response is:"+ response+"of size"+ response.length());
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		new UdpClient();
		}catch(Exception ex) {
		
		
	}
	}
}
