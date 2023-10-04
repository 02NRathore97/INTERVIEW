package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerial {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//Serialize........
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("D://Neeraj.txt"));
		
		StudentSerial s = new StudentSerial(1, "Neeraj");
		o.writeObject(s);
		o.close();
		
		
		
		//Deserialize.......
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://Neeraj.txt"));
		s = (StudentSerial) in.readObject(); 
		System.out.println(s.getName());
	}

}
