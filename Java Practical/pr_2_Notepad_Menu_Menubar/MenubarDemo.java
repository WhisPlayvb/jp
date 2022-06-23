//Demonstrate Menubar
import java.awt.*;
import java.awt.event.*;

public class MenubarDemo extends Frame implements ActionListener
{
	
	Frame f;
	FileDialog fd;
	MenubarDemo()
	{
		f = new Frame();
		fd = new FileDialog(f, "FileDialog Example", FileDialog.SAVE);

		//Create Menubar and add it to frame
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);

		//create the menu and menu to menu item
		Menu menuFile = new Menu("File");
		MenuItem itemOpen = new MenuItem("Open");
		MenuItem itemSave = new MenuItem("Save");
		MenuItem itemExit = new MenuItem("Exit");

		//add menuitems to menu
		menuFile.add(itemOpen);
		menuFile.add(itemSave);
		menuFile.add(itemExit);
		
		//create the Edit Menu and its menuitem
		Menu menuEdit = new Menu("Edit");
		MenuItem itemCopy = new MenuItem("Copy");
		MenuItem itemCut = new MenuItem("Cut");

		//add edit menu items to edit menu
		menuEdit.add(itemCopy);
		menuEdit.add(itemCut);

		//Creating menuview
		Menu menuView = new Menu("View");

		//adding Menu to theMenubar
		mbar.add(menuFile);
		mbar.add(menuEdit);
		mbar.add(menuView);

		//register listener to menuItem
		itemSave.addActionListener(this);
		

	}//end of MenubarDemo constructor

	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getActionCommand().equals("Save"))
		{

			f.setVisible(true);
			fd.setVisible(true);

		}


	}//end of actionPerformed method

	public static void main(String args[])
	{

		MenubarDemo mbar = new MenubarDemo();
		mbar.setTitle("Menu in MenubarDemo");
		mbar.setSize(350,350);
		mbar.setResizable(false);
		mbar.setVisible(true);

	}//end of main method

}//end of MenubarDemo class