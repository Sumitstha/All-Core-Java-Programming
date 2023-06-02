package tcpPackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {
	public UdpServer() throws IOException {
		DatagramSocket soc= new DatagramSocket(2222);
		byte[] data=new byte[256];
		//Receiving request
		DatagramPacket packet= new DatagramPacket(data,data.length);
				soc.receive(packet);
				InetAddress address=packet.getAddress();
				int port=packet.getPort();
				String request=new String(packet.getData());
				System.out.println("Request is:"+ request+"of size"+ request.length());
				
				//sending response
				String resmess="Hi client i am you server";
				data= resmess.getBytes();//convert string to bytes
				packet=new DatagramPacket(data,data.length,address,port);
						soc.send(packet);//send response
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		new UdpServer();
	}

}
