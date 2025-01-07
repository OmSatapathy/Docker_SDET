package core.JavaSprint;

import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnect {
	
	
	@Test
	public void dbconnection() throws ClassNotFoundException, SQLException {
		
		String username= "postgres";
		String pwd= "Om@2023";
		
		Class.forName("org.postgresql.Driver");
		
		Connection connection =
			      DriverManager
			        .getConnection("jdbc:postgresql://localhost:5432/employee",username, pwd);

		
			    Statement st = connection.createStatement();
			    System.out.println("*** Connection estalished ***");
			    String selectquery = "select * from employee";
			

			    // Executing the SQL Query and store the results in ResultSet
			    ResultSet rs = st.executeQuery(selectquery);

			    // While loop to iterate through all data and print results
			    while (rs.next()) {
			      System.out.println(rs.getString("age"));
			      System.out.println(rs.getString("bank"));
			    }

			    // Closing DB Connection
			    connection.close();
	}

}
