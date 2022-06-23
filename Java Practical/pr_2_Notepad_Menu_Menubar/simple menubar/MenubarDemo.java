import java.awt.*;

public class MenubarDemo extends Frame
{
        MenubarDemo()
	{
            //Create Menubar and add it to frame
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);

		//create the menu and menu to menu item
		Menu menuFile = new Menu("File");
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemOpen = new MenuItem("Open");
		MenuItem itemSave = new MenuItem("Save");
		MenuItem itemClose = new MenuItem("Close");

		//add menuitems to menu
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(itemSave);
		menuFile.add(itemClose);
		
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
		

	}//end of MenubarDemo constructor

	public static void main(String args[])
	{

		MenubarDemo mbar = new MenubarDemo();
		mbar.setTitle("Menu in MenubarDemo");
		mbar.setSize(500,500);
		mbar.setResizable(false);
		mbar.setVisible(true);
}//end of main method
}//end of MenubarDemo class
