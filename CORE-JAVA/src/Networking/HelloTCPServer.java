package Networking;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HelloTCPServer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		System.out.println("Server started......");
		
		ServerSocket server = new ServerSocket(1234);

		
		Socket client = server.accept();
		System.out.println("Client Connected.....");

		
		Scanner in = new Scanner(client.getInputStream());

		
		PrintWriter out = new PrintWriter(client.getOutputStream());
		
		out.println("Hello TCP Client....");
		

		String greeting = in.nextLine();
		System.out.println(greeting);

		

		
		server.close();
	}

}
