import java.awt.*;
import java.awt.event.*;

public class FileDialogDemo 
{
	FileDialog f;
	FileDialogDemo()
	{
		Frame fe=new Frame();
		f=new FileDialog(fe,"Open",FileDialog.LOAD);
		
		fe.setSize(500,500);
		f.setVisible(true);	
	}

	public static void main(String args[])
	{
		new FileDialogDemo();
	}
}
