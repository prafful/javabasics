package com.java.basics.filereaderwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class FIleCopyReaderWriter {

	public static void main(String[] args) throws IOException {
		
		File fileread = new File("ChatLog.docx");
		FileReader reader = new FileReader(fileread);
		
		File filewrite = new File("ChatLogWrite.docx");
		FileWriter writer = new FileWriter(filewrite);
		
		int c;
		while((c = reader.read()) != -1){
			writer.write(c);
		}
		
		if(reader != null){
			reader.close();	
		}
		if(writer!=null){
			writer.close();
		}
		
		
		

	}

}
