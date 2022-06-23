 import java.sql.*;
import java.util.*;
public class JdbcCrudDemo2
{
	
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		String createEmp;
		Scanner sc = new Scanner(System.in);
		int ch = 1, rn, n, m1, m2;
		String name;
		ResultSet rs;
		try
		{
			//Establish the connection
			Class.forName("oracle.jdbc.OracleDriver");
		
			//Make the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ravi2320");
			System.out.println(con);

			//create jdbc statement
			stmt = con.createStatement();
			do
			{
				System.out.println("-----------------------------------");
				System.out.println("	| * Student Table * |");
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
						System.out.println("Enter Student Id : ");
						rn = sc.nextInt();
						System.out.println("Enter Student Name : ");
						name = sc.next();
						System.out.println("Enter Subject1 marks : ");
						m1 = sc.nextInt();
						System.out.println("Enter Subject2 marks : ");
						m2 = sc.nextInt();						
						String insertStud = "insert into student values( " + rn + ", '" + name + "', " + m1 + ", " + m2 + ")";
						n = stmt.executeUpdate(insertStud);
						if(n>0)
							System.out.println("Record Inserted Successfully...!");
						break;
					case 2:
						//Update Record into table
						System.out.println("Enter Student Id : ");
						rn = sc.nextInt();
						System.out.println("Enter New Student Name : ");
						name = sc.next();
						System.out.println("Enter New Subject1 marks : ");
						m1 = sc.nextInt();
						System.out.println("Enter New Subject2 marks : ");
						m2 = sc.nextInt();						
						String updateStud = "update student set Name = '" + name + "' " + ", Marks1 = " + m1 + ", Marks2 = " + m2 + " where RollNo = " + rn;
						n = stmt.executeUpdate(updateStud);
						if(n>0)
							System.out.println("Record Updated Successfully...!");
						else	
							System.out.println("Record Not Updated...!");
						break;
					case 3:
						//Delete Record from table
						System.out.println("Enter Student Id : ");
						rn = sc.nextInt();
						String deleteStud = "delete from student where RollNo = " + rn;;
						n = stmt.executeUpdate(deleteStud);
						if(n>0)
							System.out.println("Record Dedated Successfully...!");
						else	
							System.out.println("Record Not Dedated...!");
						break;
					case 4:
						System.out.println("Enter Student Id : ");
						rn = sc.nextInt();
						String selectStud = "select * from student where RollNo = " + rn;;
						rs = stmt.executeQuery(selectStud);
						System.out.println("-----------------------------------");
						System.out.println("Roll No \tStudent Name \tMarks1 \tMarks2");
						System.out.println("-----------------------------------");
						while(rs.next())
						{
							rn = rs.getInt(1);
							name = rs.getString(2);
							m1 = rs.getInt(3);
							m2 = rs.getInt(3);
							System.out.println(rn +"\t"+ name +"\t"+ m1 +"\t"+ m2);
						}	
						System.out.println("-----------------------------------");
						break;
					case 5:
						//Select Records from table
						String displayStud = "select * from student";
						rs = stmt.executeQuery(displayStud);
						System.out.println("-----------------------------------");
						System.out.println("Roll No \tStudent Name \tMarks1 \tMarks2");
						System.out.println("-----------------------------------");
						while(rs.next())
						{
							rn = rs.getInt(1);
							name = rs.getString(2);
							m1 = rs.getInt(3);
							m2 = rs.getInt(3);
							System.out.println(rn +"\t"+ name +"\t"+ m1 +"\t"+ m2);
						}
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