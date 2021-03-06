package com.java.basics.fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream input;
		FileOutputStream output;
		
		input = new FileInputStream("ChatLog.docx");
		output = new FileOutputStream("ChatLog1.docx");
		
		int c;
		while((c = input.read()) != -1){
			output.write(c);
		}
		
		if(input != null){
			input.close();
		}
		if(output != null){
			output.close();
		}
		
		/*
		 * problem which happens during the execution of the program - inspite of 
		 * the code being correct leads to something called exceptions!!!
		 * 
		 */

	}

}
