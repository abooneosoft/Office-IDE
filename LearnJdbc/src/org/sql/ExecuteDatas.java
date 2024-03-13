package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteDatas {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HR","root","Aboo@1234");
		
		Statement statement = con.createStatement();
		String query = "SELECT JOB_ID,SALARY FROM EMPLOYEES GROUP BY JOB_ID";
		
		//To get the result use *executeQuery
		ResultSet executeQuery = statement.executeQuery(query);
		
		while(executeQuery.next()) {
			String string3 = executeQuery.getString("JOB_ID");
			int int1 = executeQuery.getInt("SALARY");
			
			
			System.out.println(string3+" | "+int1);
		}
	}
}
