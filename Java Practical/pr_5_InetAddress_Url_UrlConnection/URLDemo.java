import java.net.*;
class URLDemo
{
	public static void main(String args[]) throws MalformedURLException
	{
		URL gpp = new URL("https://gppune.ac.in/userindex.php");
		System.out.println("Protocol: " + gpp.getProtocol());
		System.out.println("Port: " + gpp.getPort());
		System.out.println("Host: " + gpp.getHost());
		System.out.println("File: " + gpp.getFile());
		System.out.println("Ext:" + gpp.toExternalForm());
	}
}
