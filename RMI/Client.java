import java.rmi.*;
import java.rmi.registry.*;
 public class Client {
 public static void main(String args[]) {
 try{
	Registry registry=LocateRegistry.getRegistry(5000);
 	

AddServerInterface st = (AddServerInterface)registry.lookup("rmi://localhost/AddService");

	
 	System.out.println(st.sum(30,40));
 }
 catch(Exception e) {
 System.out.println(e);
}
}
}
