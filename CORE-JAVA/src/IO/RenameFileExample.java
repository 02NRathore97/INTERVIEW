package IO;

import java.io.File;
import java.io.IOException;

public class RenameFileExample {

	public static void main(String[] args) throws IOException{
		File f = new File("D://Neeraj.txt");
		File f1 = new File("D://Amit.txt");
		
		if(f.exists()) {
			System.out.println(f.renameTo(f1));
		}else{
			System.out.println("File does not exists");
		}
	}

}
