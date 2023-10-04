package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageExample {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("D://download.jpg");
		FileOutputStream fos = new FileOutputStream("D://Neeraj.jpg");
		
		int i = fis.read();
		
		while(i != -1) {
			fos.write(i);
			i = fis.read();
		}
		fis.close();
		fos.close();
		
		System.out.println("Success...");
		
	}

}
