import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class DialogDemo implements ActionListener
{
	Dialog d;
	DialogDemo()
	{
                Frame f=new Frame();
		d=new Dialog(f,"DialogDemo",true);
		d.setLayout(new FlowLayout());
		Button b=new Button("OK");
		d.add(new Label("Click button to continue"));
		d.add(b);
		d.setSize(500,500);
		d.setVisible(true);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		d.setVisible(false);
	}
	public static void main(String args[])
	{
		new DialogDemo();
	}
}
