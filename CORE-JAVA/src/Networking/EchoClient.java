package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket echoSocket = new Socket("127.0.0.1",4444);
		PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput = stdIn.readLine();
		
		while(userInput != null) {
			out.println(userInput);
			System.out.println("echo : "+in.readLine());
			if("Bye".equals(userInput)) {
			break;
		}
			userInput = stdIn.readLine();
	}
		echoSocket.close();
}
}