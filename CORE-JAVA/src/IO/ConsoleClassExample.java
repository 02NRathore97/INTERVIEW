package IO;

import java.io.Console;
import java.io.IOException;

public class ConsoleClassExample {

	public static void main(String[] args) {
		
		String username ;
		char[] password ;
		Console con = System.console();
		System.out.println("Enter username : ");
		username = con.readLine();
		
		
		System.out.println("Enter password : ");
		password = con.readPassword();
		String a = String.valueOf(password);
		
		
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
		System.out.println("Password = " + a);
		
	}		

}
