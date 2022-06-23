import java.awt.*;
import javax.swing.*;
public class JScrollDemo extends JFrame
{
JScrollPane scrollpane;
public JScrollDemo ()
{
super("JScrollPane Demonstration");
setSize(300, 200);
setDefaultCloseOperation(EXIT_ON_CLOSE);
String categories[] = { "Java", "Python","Computer Security", "Android", "Project","C","C++","DataStructure","JavaScripts","HTML","CSS"};
JList list = new JList(categories);
scrollpane = new JScrollPane(list);
getContentPane().add(scrollpane, BorderLayout.CENTER);
}
public static void main(String args[])
{
JScrollDemo sl = new JScrollDemo ();
sl.setVisible(true);
}
}