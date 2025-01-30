package databaseconnectiondemo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCconcepts {

	public static void main(String[] args) throws SQLException {

		// Create COnnection
		//check if any jars needs to be configured for jdbc connection based on database
		//"jdbc:mySQL://"+host+":"+port+"/databasename";
		Connection con = DriverManager.getConnection("ENter JDBC URL with user name and apssword", "username", "password");

		// Create statement / write query

		Statement stmt = con.createStatement();
		// String s = "Inert into tablename values('101, 'Scott)";
		String s = "Select firstname from tablename where name = ''";
		// execute statement or query
		// stmt.execute(s);

		// to store value into variable

		ResultSet res = stmt.executeQuery(s);

		// TO read values since the number of records not known use res

		while (res.next()) {
			int empid = res.getInt("Employee_ID"); // where EMPloyee_ID is column in table
			String fname = res.getString("Frist_Name");
			System.out.println(" DB Values pring" + empid + " " + fname);
			//Pass the above values received in selenium script
		}

		// Close the coneection

		con.close();

	}

}
