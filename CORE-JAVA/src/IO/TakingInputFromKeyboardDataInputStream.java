package IO;

import java.io.DataInputStream;
import java.io.IOException;

public class TakingInputFromKeyboardDataInputStream {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter the name = ");
		String name = dis.readLine();
		
		
		
		System.out.println("Enter roll : ");
		int roll = Integer.parseInt(dis.readLine());
		
		System.out.println("Name = " + name);
		System.out.println("Roll No = " +roll);
		
	}

}
