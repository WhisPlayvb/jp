import java.awt.*; 
import java.applet.*; 
import java.awt.event.*;   


//Applet code 
/* 
<applet code="LoginDemo.class" height="500" width="500"> 
</applet> 
*/ 
 
 
public class LoginDemo extends Applet implements ActionListener 
{ 
Label lblUname,lblPass; 
TextField txtUname,txtPass; 
Button btnSubmit,btnReset; 
String str,msg; 
 
public void init() 
{ 
	//Creating label and textfield for username 
	lblUname= new Label("UserName:"); 
	txtUname= new TextField(10); 
 
	//Creating label and textfield for password 
	lblPass= new Label("Password:"); 
	txtPass= new TextField(10); 
	txtPass.setEchoChar('*'); 
 
	//Creating Buttons 
	btnSubmit= new Button("Submit"); 
	btnReset= new Button("Reset"); 
 
	//Adding label, text, button 
	add(lblUname); 
	add(txtUname); 
	add(lblPass); 
	add(txtPass); 	
	add(btnSubmit); 
	add(btnReset); 
 
	btnSubmit.addActionListener(this); 
	btnReset.addActionListener(this); 
}//End of init() method 
 
	public void actionPerformed(ActionEvent ae) 
	{ 
		str= ae.getActionCommand(); 
		msg="You Clicked on "+str; 
		repaint(); 
 
	}//End of actionPerformed method 
	 
	public void paint(Graphics g) 
	{ 
		g.drawString(msg, 10, 50); 
	}//End of paint method 
 
}//End of Formclass 
 
 
