package Feb_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFileWithoutOverwrite {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\outFile.txt");
		FileWriter fw = new FileWriter(f,true); // Append new Line without overwriting
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Aligarh Muslim University");
		bw.newLine();
		bw.write("Aligarh");
		bw.newLine();
		bw.close();
	}
	
}
