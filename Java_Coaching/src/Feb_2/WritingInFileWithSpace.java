package Feb_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFileWithSpace {
	
	//Writing in a file with space
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Sadia Shah\\Desktop\\outFile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Syed Ahtisham Ali");
		br.newLine();
		br.write("Automation Engineer");
		br.newLine();
		br.close();
	}
	

}
