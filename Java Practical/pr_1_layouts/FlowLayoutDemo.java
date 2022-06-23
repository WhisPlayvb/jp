//Demonstrate borderLayout
import java.awt.*;
import java.applet.*;
import java.util.*;
/*
	<applet code="FlowLayoutDemo" width="300" height="300">
	</applet>
*/
public class FlowLayoutDemo extends Applet
{
	FlowLayout f;
	Button btn1, btn2;
	public void init()
	{	
		
		f = new FlowLayout(FlowLayout.RIGHT);
		setLayout(f);

		btn1 = new Button("Button 1");
		btn2 = new Button("Button 2");
		add(btn1);
		add(btn2);

	}//end of init method

}//end of FlowLayoutDemo class