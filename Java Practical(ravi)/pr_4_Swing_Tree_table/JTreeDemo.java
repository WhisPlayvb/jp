import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;

/* <applet code="JTreeDemo.class" width=500 height=500> </applet> */

public class JTreeDemo extends JApplet{
	JTree tree;
	JLabel lbl;
	public void init(){

		DefaultMutableTreeNode gpp = new DefaultMutableTreeNode("Government Polytechnic, Pune");
		DefaultMutableTreeNode CompDept = new DefaultMutableTreeNode("Computer Department");
		DefaultMutableTreeNode MetDept = new DefaultMutableTreeNode("Metelargy Department");
		DefaultMutableTreeNode EtcDept = new DefaultMutableTreeNode("E&TC Department");
		DefaultMutableTreeNode MechDept = new DefaultMutableTreeNode("Mechanical Department");
		DefaultMutableTreeNode DdgmDept = new DefaultMutableTreeNode("Dress Designing Department");
		DefaultMutableTreeNode ItDept = new DefaultMutableTreeNode("IT Department");
		gpp.add(CompDept);
		gpp.add(MetDept);
		gpp.add(EtcDept);
		gpp.add(MechDept);
		gpp.add(DdgmDept);
		gpp.add(ItDept);
		
		
		DefaultMutableTreeNode FirstYear=new DefaultMutableTreeNode("First Year");
		CompDept.add(FirstYear);
		DefaultMutableTreeNode g1=new DefaultMutableTreeNode("G1");
		FirstYear.add(g1);
		DefaultMutableTreeNode h1=new DefaultMutableTreeNode("H1");
		FirstYear.add(h1);
		DefaultMutableTreeNode n1=new DefaultMutableTreeNode("N1");
		FirstYear.add(n1);

		DefaultMutableTreeNode SecondYear=new DefaultMutableTreeNode("Second Year");
		CompDept.add(SecondYear);
		DefaultMutableTreeNode g2=new DefaultMutableTreeNode("G2");
		SecondYear.add(g2);
		DefaultMutableTreeNode h2=new DefaultMutableTreeNode("H2");
		SecondYear.add(h2);
		DefaultMutableTreeNode n2=new DefaultMutableTreeNode("N2");
		SecondYear.add(n2);


		DefaultMutableTreeNode ThirdYear=new DefaultMutableTreeNode("Third Year");
		CompDept.add(ThirdYear);
		DefaultMutableTreeNode g3=new DefaultMutableTreeNode("G3");
		ThirdYear.add(g3);
		DefaultMutableTreeNode h3=new DefaultMutableTreeNode("H3");
		ThirdYear.add(h3);
		DefaultMutableTreeNode n3=new DefaultMutableTreeNode("N3");
		ThirdYear.add(n3);
		
			
		tree=new JTree(gpp);
		JScrollPane jsp=new JScrollPane(tree);
		add(jsp);
		
		
	}
}
