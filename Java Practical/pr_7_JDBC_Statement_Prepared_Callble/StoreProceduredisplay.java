import java.sql.*;
import java.util.*;
import oracle.jdbc.OracleTypes;

public class StoreProceduredisplay{

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        String retriveSP = "CREATE OR REPLACE PROCEDURE get_employee_by_name( "
                + " p_name IN EMP.ENAME%TYPE, "
                + " o_c_dbuser OUT SYS_REFCURSOR) "
                + " AS "
                + " BEGIN "
                + "     OPEN o_c_dbuser FOR "
                + "     SELECT * FROM EMP WHERE ENAME LIKE p_name || '%'; "
                + " END; ";

        String runSP = "{ call get_employee_by_name(?,?) }";
 

        try 
	{
		//Establish the connection
		Class.forName("oracle.jdbc.OracleDriver");
		
		Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE", "system", "ravi2320");
             	Statement statement = conn.createStatement();
             	CallableStatement callableStatement = conn.prepareCall(runSP);
		
		// create or replace stored procedure
            	statement.execute(retriveSP);
	            

            //----------------------------------
		System.out.println("Enter Employee name to retrive the record : ");
		String ename = sc.next();
		callableStatement.setString(1, ename);

		callableStatement.registerOutParameter(2, OracleTypes.CURSOR);
    
            // run SP
            callableStatement.execute();

            // get refcursor and convert it to ResultSet
            ResultSet resultSet = (ResultSet) callableStatement.getObject(2);
            while (resultSet.next()) {

                String eid = resultSet.getString("EID");
                String name = resultSet.getString("ENAME");
                int salary = resultSet.getInt("SALARY");

                System.out.println("Employee ID : " + eid);
		System.out.println("Employee name : " + name);
		System.out.println("Employee Salary : " + salary);
		

            }

        } 
	catch(ClassNotFoundException | SQLException e) 
	{
            System.out.println(e);
        } 

    }
}