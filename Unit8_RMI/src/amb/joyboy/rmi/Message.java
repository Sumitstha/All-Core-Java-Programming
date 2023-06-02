package amb.joyboy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Message extends Remote {
	public String sayHello(String message)throws RemoteException;
	
	public int sayFactorial(int a) throws RemoteException;

}
