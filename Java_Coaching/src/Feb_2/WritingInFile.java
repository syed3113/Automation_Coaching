package Feb_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {
	
	//Writing in a File
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\outFile.txt");
		FileWriter fw = new FileWriter(f);// used for writing in a file
		fw.write("Syed Ahtisham Ali");
		fw.close(); // save the file
		
		
		
	}
	

}
