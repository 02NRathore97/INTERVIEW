package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputFromKeyboardInputStreamReader {

	public static void main(String[] args) throws IOException{
//	InputStreamReader input	= new InputStreamReader(System.in);
//	BufferedReader bf = new BufferedReader(input);
	
	//////////////////////OR/////////////////////
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Entetr the name...");
	String name = bf.readLine();
	System.out.println(name);
	}

}
