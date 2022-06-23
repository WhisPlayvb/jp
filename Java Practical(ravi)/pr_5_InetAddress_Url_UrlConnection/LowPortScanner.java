import java.io.*;
import java.net.*;

public class LowPortScanner
{

	public static void main(String args[])
	{	

		String host="localhost";
		
		//for(int i=1;i<1024;i++)
		//{	
			try
			{
				//port 135, 445
				Socket s=new Socket(host, 445);
				System.out.println("There is a Server on port "+ 445 +" of "+ host);

			}

			catch(UnknownHostException ex)
			{
				System.out.println(ex);
				//break;

			}//end of catck block
			catch(IOException ex){}//end of IOException catch block

		
		
		//}//end of for loop
		
	}//end of main method

}//end of LowPortScanner class