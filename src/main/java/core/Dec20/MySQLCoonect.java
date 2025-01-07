package core.Dec20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Row;

public class MySQLCoonect {

	public static void main(String[] args) {
		String username = "root";
		String password = "pwd";

		String url = "jdbc:mysql//localhost";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			Statement stmt = con.createStatement();
			ResultSet row = stmt
					.executeQuery("select max(salary) from Employye ORDER BY  salary desc limit 4 offset 1");

			while (row.next()) {
				String fname = row.getString(1);
				String lastname = row.getString(2);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
