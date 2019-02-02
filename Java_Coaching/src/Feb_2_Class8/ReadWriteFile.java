package Feb_2_Class8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {
	
	
	public String data_read(String path) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		return s;
		
		
	}
	public void data_write(String path,String val) throws IOException
	{
		
		File f = new File(path);
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		br.write(val);
		br.close();
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		ReadWriteFile wf = new ReadWriteFile();
		String value = wf.data_read("C:\\Users\\Sadia Shah\\Desktop\\outFile.txt");
		System.out.println("Value:-"+value);
		ReadWriteFile wf1 = new ReadWriteFile();
		wf1.data_write("C:\\Users\\Sadia Shah\\Desktop\\readWrite.txt",value);
		
		
	}
  
}
