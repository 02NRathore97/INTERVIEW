package IO;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharExample {

	public static void main(String[] args) throws IOException{
		FileReader fr  = new FileReader("D://Neeraj.txt");
		
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}

}
