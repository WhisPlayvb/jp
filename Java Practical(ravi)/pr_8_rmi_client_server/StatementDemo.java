import java.sql.*;
public class StatementDemo
{
	public static void main(String[] args)
	{
		Statement stmt;
		Connection con;
		ResultSet rs;
		String selQuery = "select * from emp";
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "ravi2320");
			stmt = con.createStatement();
			rs = stmt.executeQuery(selQuery);
			while(rs.next())
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			con.close();
			stmt.close();

		}
		catch(SQLException | ClassNotFoundException e)
		{
			System.out.println(e);
		}	

	}//end of main method

}//end of StatementDemo