import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file = new File("c:\\Temp\\Java\\createFile.txt");
		File file = new File("createFile.txt");
		
		System.out.println("File present is:" + file);
		System.out.println("-----------------------------------");
		System.out.println("Does file exists? " + file.exists());
		System.out.println("Is file a directory? " + file.isDirectory());
		
		//Writing to the file
		
		String content = "write from java";
		OutputStream outputStream = new FileOutputStream(file);
		outputStream.write(content.getBytes());
		outputStream.close();
		
		System.out.println("-----------------------------------");
		System.out.println("Does file exists? " + file.exists());
		
		//read from the file
		FileInputStream fileinputstream = new FileInputStream(file);
		InputStreamReader inputstreamreader = new InputStreamReader(fileinputstream);
		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		
		String firstline = bufferedreader.readLine();
		bufferedreader.close();
		
		System.out.println("File text: " + firstline);
			
		
	}

}
