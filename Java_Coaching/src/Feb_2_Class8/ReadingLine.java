package Feb_2_Class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingLine {
	
	// Reading Line by Line
	
	public static void main(String[] args) throws IOException {
		
	File f = new File("C:\\Users\\Sadia Shah\\Desktop\\inputFile.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);// BufferedReader need object of File Reader
	String s;
	
	while((s=br.readLine())!=null)
	{
		System.out.println(s);
	}
	
	}
	

}
