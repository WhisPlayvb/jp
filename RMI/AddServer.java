import java.rmi.*;
import java.rmi.registry.*;
public class AddServer {
public static void main(String args[]) {
try {
	AddServerInterface addService=new Adder();
	Registry registry=LocateRegistry.createRegistry(5000);
	registry.rebind("rmi://localhost/AddService",addService);

}
catch(Exception e) {
 System.out.println(e);
}
}

}
