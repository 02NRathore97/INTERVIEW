package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(4444);
		System.out.println("Echo Server Started");
		Socket client = null;
		
		boolean flag = true;
		while(flag) {
			client = ss.accept();  // Accept Client
			talk(client);  // Talk to the Client
		}
		System.out.println("Echo Server Stopped");
		ss.close();
	}

	private static void talk(Socket client) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		String msg = null;
		msg = in.readLine();
		
		while(msg != null) {
			System.out.println("Server Recieved "+msg);
			out.println(msg+" "+msg);
			if(msg.equals("Bye")) break;
			msg = in.readLine();
		}
			out.close();
			in.close();
			client.close();
			
	}
	
}