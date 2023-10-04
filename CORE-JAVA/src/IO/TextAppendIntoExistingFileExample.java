package IO;

import java.io.FileWriter;
import java.io.IOException;

public class TextAppendIntoExistingFileExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D://Neeraj.txt",true);
		
		fw.write(" Rathore");
		fw.close();
		System.out.println("Successfully......");
	}

}
