package IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInformationExample {

	public static void main(String[] args) throws IOException{
		File f = new File("D://Neeraj.txt");
		
		if (f.exists()) {
			
			//Name of the file
			System.out.println("FileName = "+ f.getName());
			
			//Path of the file
			System.out.println("File Path = "+ f.getAbsolutePath());
			
			//Check access permissions
			System.out.println("Is file writable = " + f.canWrite());
			System.out.println("Is file radable = " + f.canRead());
			
			
			//Check if it is directory or file
			System.out.println("Is File = " + f.isFile());
			System.out.println("Is Directory = " + f.isDirectory());
			
			
			//Last Modified date of file/directory
			Date d = new Date(f.lastModified());
			System.out.println("Last modified date = " + d);
			
			//Length of the file
			System.out.println("File size = " + f.length() + " Bytes");
			
			
			//delete file
			System.out.println("File Removed = "+ f.delete());
			
		} else {
			System.out.println("File is not present......");
		}
	}

}
