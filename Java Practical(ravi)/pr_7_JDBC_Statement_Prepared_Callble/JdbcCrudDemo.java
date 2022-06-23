import java.sql.*;
import java.util.*;
public class JdbcCrudDemo
{
	
	public static void main(String args[])
	{
		Connection con;
		PreparedStatement prstmt;
		String createEmp;
		Scanner sc = new Scanner(System.in);
		int ch = 1, Sal, n;
		String eNo, eName;
		ResultSet rs;
		try
		{
			//Establish the connection
			Class.forName("oracle.jdbc.OracleDriver");
		
			//Make the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "vinayak");
			System.out.println(con);

			/*//create Table
			createEmp = "create table Emp(Eid varchar2(4), Ename varchar2(30), Salary number)";
			prstmt = con.prepareStatement(createEmp);
			int n = prstmt.executeUpdate();
			//System.out.println(n);*/
			do
			{
				System.out.println("-----------------------------------");
				System.out.println("	| * Employee Table * |");
				System.out.println("-----------------------------------");
				System.out.println(" 1-Insert Record\n 2-Update Record\n 3-Delete Record\n 4-Search Record\n 5-Display All Records");
				System.out.println("-----------------------------------");
				System.out.println("Enter your choice : ");
				ch = sc.nextInt();
				System.out.println("-----------------------------------");
			
				switch(ch)
				{
					case 1:
						//Insert Record into table
						String insertEmp = "insert into Emp values(?, ?, ?)";
						prstmt = con.prepareStatement(insertEmp);
						System.out.println("Enter Employee Id : ");
						prstmt.setString(1, sc.next());
						System.out.println("Enter Employee Name : ");
						prstmt.setString(2, sc.next());
						System.out.println("Enter Employee Salary : ");
						prstmt.setInt(3, sc.nextInt());
						n = prstmt.executeUpdate();
						if(n>0)
							System.out.println("Record Inserted Successfully...!");
						break;
					case 2:
						//Update Record into table
						String UpdateEmp = "update Emp set Ename=?, Salary=? where Eid=?";
						prstmt = con.prepareStatement(UpdateEmp);
						System.out.println("Enter new Employee Name : ");
						prstmt.setString(1, sc.next());
						System.out.println("Enter new Employee Salary : ");
						prstmt.setInt(2, sc.nextInt());
						System.out.println("Enter Employee Id : ");
						prstmt.setString(3, sc.next());
						n = prstmt.executeUpdate();
						if(n>0)
							System.out.println("Record Updated Successfully...!");
						break;
					case 3:
						//Delete Record from table
						String DeleteEmp = "delete from Emp where Eid=?";
						prstmt = con.prepareStatement(DeleteEmp);
						System.out.println("Enter Employee Id : ");
						prstmt.setString(1, sc.next());
						n = prstmt.executeUpdate();
						if(n>0)
							System.out.println("Record Deleted Successfully...!");
						break;
					case 4:
						String SearchEmp = "select * from Emp where Eid=?";
						prstmt = con.prepareStatement(SearchEmp);
						System.out.println("Enter Employee Id : ");
						prstmt.setString(1, sc.next());
						rs = prstmt.executeQuery();
						while(rs.next())
						{
							eNo = rs.getString(1);
							eName = rs.getString(2);
							Sal = rs.getInt(3);
							System.out.println("Emp No \tEmp Name \tSalary");
							System.out.println(eNo +"\t"+ eName +"\t"+ Sal);
						}
						break;
					case 5:
						//Select Records from table
						String selEmp = "select * from Emp";
						prstmt = con.prepareStatement(selEmp);
						rs = prstmt.executeQuery();
						System.out.println("Emp No \tEmp Name \tSalary");
						while(rs.next())
						{
							eNo = rs.getString(1);
							eName = rs.getString(2);
							Sal = rs.getInt(3);
				
							System.out.println(eNo +"\t"+ eName +"\t"+ Sal);
	
						}//end of while loop
						break;

				}//end of switch block
				System.out.println("Do you want to continue Press 0 : ");
				ch = sc.nextInt();
			}while(ch==0);
			con.close();
			
		}//end of try block
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);

		}//end of catch block
		
	}//end of main method

}//end of JdbcDemo class