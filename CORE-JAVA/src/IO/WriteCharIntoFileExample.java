package IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCharIntoFileExample {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("D://Neeraj.txt");
		
		char[] ch = {'H','i'};
		fw.write(ch);
		fw.write(',');
		fw.write("Neeraj...");
		fw.close();
		
		System.out.println("Successfull......");
	}

}
