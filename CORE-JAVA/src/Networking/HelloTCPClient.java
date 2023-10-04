package Networking;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class HelloTCPClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("localhost", 1234);

		Scanner in = new Scanner(client.getInputStream());

		PrintWriter out = new PrintWriter(client.getOutputStream());
		out.println("Hello TCP Server......");
		
		String greeting = in.nextLine();
		System.out.println(greeting);

		client.close();

	}

}
