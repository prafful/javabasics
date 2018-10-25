package com.java.basics.image.blob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Blob2Image {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//setup the driver manager
		Class.forName("com.mysql.jdbc.Driver");
		String  connectionString = "jdbc:mysql://localhost:3306/imageblob";
		Connection connection = DriverManager.getConnection(connectionString, "root", "root");
		System.out.println("Database connection is success....");
		
		//prepare the statement
		String sqlQuery = "select image from profileimage where id = ?";
		PreparedStatement statement = connection.prepareStatement(sqlQuery);
		statement.setInt(1,2);
		
		//execute the statement
		ResultSet resultSet = statement.executeQuery();
		System.out.println("Image is read from the database....");

		//create a fileoutput stream to save the data returned by the blob
		File file = new File("graphql1.pdf");
		FileOutputStream outputStream = new FileOutputStream(file);
		System.out.println("File is instantiated....with help of outputstream");
		
		//loop through the resultset and convert the blob binary data to respective file.
		while(resultSet.next()){
			InputStream inputStreamBinaryData = resultSet.getBinaryStream("image");
			System.out.println("Extracting the binary blob from the resultset....");
			byte[] fromInputStreamBuffer = new byte[128];
			while(inputStreamBinaryData.read(fromInputStreamBuffer) > 0){
				System.out.println("Writing binaryblob to outputstream - 1024 bytes at a time....");
				outputStream.write(fromInputStreamBuffer);
			}
			inputStreamBinaryData.close();
		}
		
		//closing the connections
		if(resultSet != null){
			resultSet.close();
		}
		if(connection != null){
			connection.close();
		}
		
		outputStream.close();
				
		System.out.println("File creation is success.... closing all connections....");
	}

}
