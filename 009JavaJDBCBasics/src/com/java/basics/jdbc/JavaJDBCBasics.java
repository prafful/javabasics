package com.java.basics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBCBasics {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		/*
		 * 1. Setup the driver manager.
		 * 2. Setup the connection string to create the connection.
		 * 3. Use above connection to create the statement
		 * 4. Use above statement to create the query
		 * 5. Once we fire the query, we get resultset (data)
		 * 6. Iterate through the resultset to do something with the data
		 * 7. Close the connection
		 */
		Class.forName("com.mysql.jdbc.Driver"); //1
		String connectionString = "jdbc:mysql://localhost:3306/bms";
		//Oracle - jdbc:oracle:thin:@localhost:12345:databaseName
		Connection connection = DriverManager.getConnection(connectionString, "root", "root"); //2
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM user_details");
		
		while(resultSet.next()){
			System.out.print(resultSet.getLong(1) + " " + resultSet.getLong(2) + " ");
			System.out.print(resultSet.getString(3) + " " + resultSet.getString(4));
			System.out.println("");
		}
		connection.close();
		//CRUD - Create Read Update Delete
		
		
	}

}
