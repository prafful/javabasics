package com.java.basics.fileutilities;

import java.io.File;

public class FileUtilities {

	public static void main(String[] args) {
		File file = null;
		File file1 = new File("sunset.jpg");
		
		file = new File("/Users/Pradhi/workspace-java-neon3/008JavaIO");
		
		String[] path = file.list();
		/*for(String p:path){
			
		}*/
		
		for (String string : path) {
			System.out.println(string);
		}
		
		System.out.println("######## file size ########");
		System.out.println(file1.length()/1024 + "kb");

	}

}
