//Demonstrate GridLyout
import java.awt.*;
import java.applet.*;
/*
	<applet code="GridLayoutDemo.class" width="300" height="300">
	</applet>
*/
public class GridLayoutDemo extends Applet
{

	static final int n=4;
	public void init()
	{

		setLayout(new GridLayout(2,2));
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		

	}//end of init method

}//end of GridLayout class