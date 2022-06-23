import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/* <applet code="PersonalAndAcademic.class" width=500 height=500> </applet> */

public class PersonalAndAcademic extends JApplet  
{
	public void init() 
	{
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Personal", new PersonalPanel());
		jtp.addTab("Academic", new AcademicPanel());

		add(jtp);

		//create the scroll pane
		JScrollPane jsp = new JScrollPane(jtp);
		
		add(jsp, BorderLayout.CENTER);

	}//end of init method
		
}//end of PersonalAndAcademic class

class PersonalPanel extends JPanel
{
	JLabel jlblFirstName, jlblLastName, jlblMobNo, jlblEmail, jlblGender, jlbl;
	JTextField jtxtFirstName, jtxtLastName, jtxtMobNo, jtxtEmail;
	ButtonGroup bg;
	JButton jbtnSubmit, jbtnReset;
	JRadioButton rbMale, rbFemale;
	JComboBox jcomboState, jcomboCity;

	public PersonalPanel()
	{
		setLayout(new GridLayout(10,10));
		String city[] = {"Pune","Mumbai","Delhi","Solapur","Kolhapur"};
		String state[] = {"Maharashtra","Goa","Panjab","Karnatak","Gujrat"};
		
		
		jlblFirstName = new JLabel("First Name");
		jlblLastName = new JLabel("Last Name");
		jlblMobNo = new JLabel("Mob No");
		jlblEmail = new JLabel("Email");
		jlblGender = new JLabel("Gender");
		jlbl = new JLabel("");
		

		jtxtFirstName = new JTextField(20);
		jtxtLastName = new JTextField(20);
		jtxtMobNo = new JTextField(20);
		jtxtEmail = new JTextField(20);
		
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		
		bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);

		jcomboCity = new JComboBox(city);
		jcomboState = new JComboBox(state);

		jbtnReset = new JButton("Reset");
		jbtnSubmit = new JButton("Submit");
		
		add(jlblFirstName);
		add(jtxtFirstName);
		add(jlblLastName);
		add(jtxtLastName);
		add(jlblMobNo);
		add(jtxtMobNo);
		add(jlblEmail);
		add(jtxtEmail);
		add(jlblGender);
		add(jlbl);
		add(rbMale);
		add(rbFemale);
		add(jcomboCity);
		add(jcomboState);
		add(jbtnReset);
		add(jbtnSubmit);

	}//end of init method	
	

}//end of PersonalPanel class

class AcademicPanel extends JPanel
{

	AcademicPanel()
	{
		
		setLayout(new GridLayout(10,2));
		JLabel jlblCourse, jlblEnrollNo, jlblPer, jlblCreadits, jlbl;
		JTextField jtxtPer, jtxtCreadits, jtxtEnrollNo;
		JCheckBox jchkProject, jchkDM, jchkJava, jchkAndroid;

		//create objects of Jlabel
		jlblCourse = new JLabel("Course");
		jlblEnrollNo = new JLabel("Enroll No");
		jlblPer = new JLabel("Percentage");
		jlblCreadits = new JLabel("Creadits");
		jlbl = new JLabel();

		//Create objects of JTextField
		jtxtPer = new JTextField(20);
		jtxtCreadits = new JTextField(20);
		jtxtEnrollNo = new JTextField(20);

		//create objects of JCheckBox
		jchkProject = new JCheckBox("Project");
		jchkJava = new JCheckBox("Java");
		jchkDM = new JCheckBox("DMI");
		jchkAndroid = new JCheckBox("Android");

		//adding controls to the control window
		add(jlblEnrollNo);
		add(jtxtEnrollNo);
		add(jlblCreadits);
		add(jtxtCreadits);
		add(jlblPer);
		add(jtxtPer);
		add(jlblCourse);
		add(jlbl);
		add(jchkJava);
		add(jchkProject);
		add(jchkDM);
		add(jchkAndroid);
			
		

	}//end of AcademicPanel Constructor

}//end of AcademicPanel class