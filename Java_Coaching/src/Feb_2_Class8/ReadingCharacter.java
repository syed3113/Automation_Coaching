package Feb_2_Class8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Reading character by character from text file
public class ReadingCharacter {
	
	public static void main(String[] args) throws IOException {
		 
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\inputFile.txt");
		
		FileReader fr = new FileReader(f); // FileReader class is used for reading character by character from txt file 
		int r;
		while((r=fr.read())!=-1) //storing in r because return type is int & comparing with -1 because there is no ASCII value equal -1
		{
			System.out.println((char)r);// Explicit Conversion because we are getting result in integer and to convert it into character we need to do explicit conversion  
		}
			
			
	}
	

}
