import java.rmi.*;
import java.rmi.server.*;
public class Adder extends UnicastRemoteObject
implements AddServerInterface
{
 	Adder()throws RemoteException{
 	super();
}
public int sum(int a,int b)
{
 	return a*b;
}
}