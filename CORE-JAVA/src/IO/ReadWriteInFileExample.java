package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class ReadWriteInFileExample {

	public static void main(String[] args) throws IOException {
		
		//Read data form console
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//Write Data into file
		FileWriter fw = new FileWriter("D:/NeerajIO.txt");
		PrintWriter pw = new PrintWriter(fw);
		System.out.println("Enter.....");
		
		String s = bf.readLine();

			pw.write(s);
			System.out.println(s);


		pw.close();
		fw.close();
	
	
	
		
	}

}
