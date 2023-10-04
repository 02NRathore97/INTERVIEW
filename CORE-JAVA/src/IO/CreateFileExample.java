package IO;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) throws IOException {
		File f = new File("D://Neeraj.txt");
		
		if(f.createNewFile()) {
			System.out.println("file successfully created..........");
		}else {
			System.out.println("File is already exists............");
		}
	}

}
