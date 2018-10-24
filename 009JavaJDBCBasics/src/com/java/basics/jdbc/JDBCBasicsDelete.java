package com.java.basics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBasicsDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
		//Statement statement = connection.createStatement();
		
		String deleteQuery = "delete from user_details where account_number = ?";
		PreparedStatement statement = connection.prepareStatement(deleteQuery);
		statement.setLong(1, 1234567890111112L);
		
		
		int checkDelete = statement.executeUpdate();
		if (checkDelete > 0) {
			System.out.println("Delete is success!!!!");
		}

	}

}
