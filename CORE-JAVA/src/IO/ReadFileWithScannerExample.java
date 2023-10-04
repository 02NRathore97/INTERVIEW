package IO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScannerExample {

	public static void main(String[] args) throws IOException{
		
		FileReader fr  = new FileReader("D://Neeraj.txt");
		Scanner sc = new Scanner(fr);
	
		while(sc.hasNext()) {
			String s = sc.nextLine();
			System.out.print(s);
		}
	}

}
