package org.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteSample {

	public static void main(String[] args) throws SQLException {
		
		//1..create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neosoft","root","Aboo@1234");
		
		//2. write statement /query
		Statement statment = con.createStatement();
		
		String query ="Select * from teamamol";
		     
		   //to execute the query
		statment.execute(query);  //<-- it will performing actions internally
		
		
		//3. to close the connection
		
		con.close();
		System.out.println("Query executed and closed");
	
	
	}

}
