import java.applet.*;
import java.awt.*;

/* 
	<applet code="RegistrationDemo.class" width=300 height=300>
	</applet>
*/

public class RegistrationDemo extends Applet
{
	public void init()
	{
		//Create Objects of labels
		Label lblMobno = new Label("Mob No");
		Label lblFname = new Label("First Name");		
		Label lblMname = new Label("Middle Name");
		Label lblLname = new Label("Last Name");		
		Label lblUsername = new Label("Username");
		Label lblPassword = new Label("Password");
		Label lblGender = new Label("Gender");
		Label lblState = new Label("State");
		Label lblCourses = new Label("Courses");
		Label lblEnrollNo = new Label("Enroll No");
		Label lblAddress = new Label("Address");

		//create objects of textField
		TextField txtFname = new TextField("First Name");
		TextField txtMname = new TextField("Middle Name");
		TextField txtLname = new TextField("Last Name");
		TextField txtMobno = new TextField("Mob No    ");
		TextField txtUsername = new TextField("Username");
		TextField txtPassword = new TextField("Password");
		TextField txtEnrollNo = new TextField("Enroll No");
		TextField txtAddress = new TextField("Address");

		//creating Checkbox group
		CheckboxGroup cbgGender = new CheckboxGroup();
		Checkbox chkMale = new Checkbox("Male", cbgGender, false);
		Checkbox chkFemale = new Checkbox("Female", cbgGender, false);
		
	
		//creating choice for state
		Choice chState = new Choice();
		chState.add("Maharashtra");
		chState.add("Goa");
		chState.add("Panjab");
		chState.add("Gujrat");

		//creating checkboxes
		Checkbox chkJava = new Checkbox("Java");
		Checkbox chkAndroid = new Checkbox("Android");
		Checkbox chkDMI = new Checkbox("DMI");
		Checkbox chkProject = new Checkbox("Project");		

		//setEcho char
		txtPassword.setEchoChar('*');

		//Adding Labels Controls to the window
		add(lblEnrollNo);
		add(txtEnrollNo);
		add(lblFname);
		add(txtFname);
		add(lblMname);
		add(txtMname);
		add(lblLname);
		add(txtLname);	
		add(lblMobno);
		add(txtMobno);
		add(lblUsername);
		add(txtUsername);	
		add(lblPassword);
		add(txtPassword);
		add(lblAddress);
		add(txtAddress);
		add(lblState);
		add(chState);
		add(lblGender);
		add(new Label());
		add(chkMale);
		add(chkFemale);
		add(lblCourses);
		add(chkJava);
		add(chkDMI);
		add(chkAndroid);
		add(chkProject);
		
		//Create objects for Buttons
		Button btnSubmit = new Button("Submit");
		Button btnReset = new Button("Reset");
		
		//Adding Button Controls to The window
		add(btnSubmit);
		add(btnReset);

	}//end of init method

}//end of class