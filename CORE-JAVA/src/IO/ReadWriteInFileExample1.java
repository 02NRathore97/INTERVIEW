package IO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class ReadWriteInFileExample1 {

	public static void main(String[] args) throws IOException {
		

			//read data from console
		InputStreamReader b = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(b);
		
		
		//write data into file
		PrintWriter pw = new PrintWriter(new FileWriter("D:/NeerajIO.txt"));	
		System.out.println("Enter data.....");
		
		String s = bf.readLine();
		
		while(!s.equals("quit")) {
			pw.println(s);
			System.out.println(s);
			s = bf.readLine();
			
		}
		
		pw.close();
		bf.close();
		System.out.println("scanned");
	}

}
