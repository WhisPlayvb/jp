import java.sql.*;
import oracle.jdbc.OracleTypes;
class JdbcFunSum
{
	
	public static void main(String args[])
	{
		Connection con;
		CallableStatement stmt;
		try
		{
			//Establish the connection
			Class.forName("oracle.jdbc.OracleDriver");
		
			//Make the connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ravi2320");
			System.out.println(con);
			
			//create jdbc statement
			stmt = con.prepareCall("{?= call sum(?,?)}");
			stmt.setInt(2, 50);
			stmt.setInt(3, 20);
			stmt.registerOutParameter(1, OracleTypes.INTEGER);
			stmt.execute(); 
			System.out.println(stmt.getInt(1));
			stmt.close();
			con.close();

		}//end of try block
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);

		}//end of catch block

		/*finally
		{
			

		}//end of finally block*/
		
	}//end of main method

}//end of JdbcDemo class