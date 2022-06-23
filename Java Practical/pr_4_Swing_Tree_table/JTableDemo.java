import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* <applet code="JTableDemo.class" width=500 height=500> </applet> */

public class JTableDemo extends JApplet
{
	public void init(){
		String colHead[]={"Id","Name","Marks"};
		String data[][]={
			{"01","Ravindra","97"},
			{"02","Vijay","94"},
			{"03","Pranav","96"},
			{"04","Akash","94"},
			{"05","Sagar","97"},
			{"06","Ankush","92"},
			{"07","Sarthak","91"}
			};
	
		JTable tbl=new JTable(data,colHead);
		JScrollPane jsp=new JScrollPane(tbl);
		add(jsp);
		
		
	}
}