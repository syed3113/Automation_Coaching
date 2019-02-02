package Feb_2_Class8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingByLineNumber {

	public String read_data(String path, int lineNo) throws IOException
	{
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int i=0;
		String s;
		
		while((s=br.readLine())!=null) {
			
			i=i+1;
			if(i==lineNo) {
				
				break;
			}
				
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		
		ReadingByLineNumber rl = new ReadingByLineNumber();
		String value =rl.read_data("C:\\Users\\Sadia Shah\\Desktop\\outFile.txt", 3);
		System.out.println("Value is" +value);
		
	}
	
}
