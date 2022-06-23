//Demonstrate CardLayout
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
	<applet code="CardLayoutDemo.class" width="300" height="300">
	</applet>
*/
public class CardLayoutDemo extends Applet implements ActionListener,MouseListener
{
	//Creating Refernce variables here
	Checkbox chkWinXP, chkWinVista, chkSolaris, chkMac;
	Panel pnlOsCards;
	CardLayout cardLo;
	Button btnWin, btnOthers;
	public void init()
	{
		
		//creating button objects
		btnWin = new Button("Windows");
		btnOthers = new Button("Others");

		//adding buttons on applet
		add(btnWin);
		add(btnOthers);
		
		//creating cardLayout object
		cardLo = new CardLayout();
		pnlOsCards = new Panel();
		pnlOsCards.setLayout(cardLo);

		//Creating objects of Checkboxs
		chkWinXP = new Checkbox("WinXP", null, true);
		chkWinVista = new Checkbox("WinVista");
		chkSolaris = new Checkbox("Solaris");
		chkMac = new Checkbox("Mac");
		
		//add windows checkboxes to panel
		Panel WinPan = new Panel();
		WinPan.add(chkWinXP);
		WinPan.add(chkWinVista);
		
		//add others checkboxes to panel
		Panel OthersPan = new Panel();
		OthersPan.add(chkSolaris);
		OthersPan.add(chkMac);
		
		//add Panel to the Card deck
		pnlOsCards.add(WinPan, "Windows");
		pnlOsCards.add(OthersPan, "Others");

		//addcards to main applet/panel
		add(pnlOsCards);

		//register to recieve actionEvent
		btnWin.addActionListener(this);
		btnOthers.addActionListener(this);

		//register mouse event
		addMouseListener(this);
		
	}//end of init method

	//Cycle through Panel
	public void mousePressed(MouseEvent me)
	{

		cardLo.next(pnlOsCards);

	}//end of mousePressed method
	public void mouseReleased(MouseEvent me)
	{

	}//end of mouseReleased method
	public void mouseExited(MouseEvent me)
	{

	}//end of mouseExited method
	public void mouseClicked(MouseEvent me)
	{

	}//end of mouseClicked method
	public void mouseEntered(MouseEvent me)
	{

	}//end of mouseEntered method
	public void actionPerformed(ActionEvent ae)
	{

		if(ae.getSource()=="Windows")
		{
			cardLo.show(pnlOsCards, "Windows");
		}
		else
		{
			cardLo.show(pnlOsCards, "Others");
		}

	}//end of actionPerformed method
	

}//end of GridLayout class