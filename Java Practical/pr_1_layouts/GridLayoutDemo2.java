//Demonstrate GridLyout
import java.awt.*;
import java.applet.*;
/*
	<applet code="GridLayoutDemo2.class" width="300" height="300">
	</applet>
*/
public class GridLayoutDemo2 extends Applet
{

	static final int n=4;
	public void init()
	{

		setLayout(new GridLayout(n,n));
		int k=1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{

				k=i*n+j+1;
				if(k>0)
					add(new Button(" " + k));
			
			}//end of j for loop

		}//end of i for loop

	}//end of init method

}//end of GridLayout class