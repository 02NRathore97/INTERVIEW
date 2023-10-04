package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineExample {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D://Neeraj.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		while(s!=null) {
			System.out.print(s);
			s = br.readLine();
		}
		br.close();
		fr.close();
	}

}
