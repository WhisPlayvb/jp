import java.net.*;
class InetAddressTest
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println(Address);
	
		InetAddress Address1 = InetAddress.getByName("www.google.com");
		System.out.println(Address1);
		
		InetAddress SW[] = InetAddress.getAllByName("www.gmail.com");
		for (int i=0; i<SW.length; i++)
			System.out.println(SW[i]); 

		
		//eqals method
		System.out.println("eqals method : " + Address1.equals(Address));

		//getHostAddress method
		System.out.println("getHostAddress method : " + Address1.getHostAddress());

		//getHostName method
		System.out.println("getHostName method : " + Address1.getHostName());

		//getAddress method
		System.out.println("getAddress method : " + Address1.getAddress());

		//isMulticastAddress method
		System.out.println("isMulticastAddress method : " + Address1.isMulticastAddress());

		//toString method
		System.out.println("toString method : " + Address1.toString());
		
	}
}
