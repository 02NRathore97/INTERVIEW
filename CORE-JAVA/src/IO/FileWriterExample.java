package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("D://Neeraj.txt");
		f.write("Neeraj ");
		System.out.println("Successfull.......");
		f.close();
	}

}
