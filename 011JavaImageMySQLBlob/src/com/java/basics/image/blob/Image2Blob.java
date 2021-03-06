package com.java.basics.image.blob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Image2Blob {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		//read the image file
		System.out.println("About to read the image file in binary format....");
		File file = new File("2017_GraphQL_Preprint.pdf");
		FileInputStream inputStream = new FileInputStream(file);
		System.out.println("Image data read is success....");
		
		
		//setup the driver manager
		Class.forName("com.mysql.jdbc.Driver");
		String  connectionString = "jdbc:mysql://localhost:3306/imageblob";
		Connection connection = DriverManager.getConnection(connectionString, "root", "root");
		System.out.println("Database connection is success....");
		
		//prepare the statement
		String sqlQuery = "insert into profileimage (image) values (?)";
		PreparedStatement statement = connection.prepareStatement(sqlQuery);
		statement.setBinaryStream(1, inputStream);
		
		//execute the statement
		statement.executeUpdate();
		System.out.println("Image is saved in the database....");
		
		//close the connection
		connection.close();
		System.out.println("Database connection is closed....");
		
		

	}

}
