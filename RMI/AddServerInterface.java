import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.*;
public interface AddServerInterface extends Remote {

	public int sum(int a,int b) throws RemoteException;
}