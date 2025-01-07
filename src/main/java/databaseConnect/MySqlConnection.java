package databaseConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class MySqlConnection {

	Connection con;
	
	public void getConnection() throws SQLException {
		String username = "root";
		String password = "password";
		String connectionUrl ="jdbc:mysql://localhost:3036/emp";
		String dbClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(dbClass).newInstance();
		 con = DriverManager.getConnection(connectionUrl, username, password);
			java.sql.Statement stmt = (java.sql.Statement) con.createStatement();
			ResultSet result = stmt.executeQuery("select * from employee");
			
			while(result.next()) {
				String myName = result.getString(1);
				 String myAge = result.getString(2);
				 
				 System.out.println(myName +""+ myAge);
			}
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			con.close();		
		}
		
	}
}
