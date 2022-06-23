//Demonstrate borderLayout
import java.awt.*;
import java.applet.*;
import java.util.*;
/*
	<applet code="BorderLayoutDemo" width="300" height="300">
	</applet>
*/
public class BorderLayoutDemo extends Applet
{
	public void init()
	{	
		setLayout(new BorderLayout());
		add(new Button("Top"), BorderLayout.NORTH);
		add(new Button("Bottom"), BorderLayout.SOUTH);
		add(new Button("Right"), BorderLayout.EAST);
		add(new Button("Left"), BorderLayout.WEST);
		add(new TextArea("Border Layout"), BorderLayout.CENTER);
				

	}//end of init method

}//end of BorderLayoutDemo class