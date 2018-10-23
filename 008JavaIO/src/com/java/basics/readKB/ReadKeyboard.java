package com.java.basics.readKB;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ReadKeyboard {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		FileWriter output = new FileWriter(new File("keyboard.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(output);
		
		System.out.println("Enter the text: (exit to exit)");
		
		
		String text= "";
		
		while(!text.equalsIgnoreCase("exit")){
			text = bufferedReader.readLine();
			bufferedWriter.write(text);
			bufferedWriter.newLine();
			System.out.println(text);
		}
					
		bufferedWriter.flush();
		bufferedWriter.close();
		output.close();
		
		bufferedReader.close();
		inputStreamReader.close();

	}

}
