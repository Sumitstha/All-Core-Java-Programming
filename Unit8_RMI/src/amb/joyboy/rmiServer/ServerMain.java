package amb.joyboy.rmiServer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import amb.joyboy.rmi.MessageImpl;

public class ServerMain {
	
	public void startServer() throws RemoteException, AlreadyBoundException
	{
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("myMessage", new MessageImpl());
	}

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		new ServerMain().startServer();
	}

}

//import java.rmi.AlreadyBoundException;
//import java.rmi.RemoteException;
//import java.rmi.registry.LocateRegistry;
//import java.rmi.registry.Registry;
//
//import amb.joyboy.rmi.MessageImpl;
//
//public class ServerMain {
//public void startServer() throws RemoteException ,AlreadyBoundException{
//	//RMI registry is RMI server //create registry in port 1099
//	Registry registry =LocateRegistry.createRegistry(1099);
//	//create a new service named myMessage with remote object
//	registry.bind("myMessage", new MessageImpl());
//}
//	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
//		// TODO Auto-generated method stub
//		new ServerMain().startServer();
//	}
//
//}
