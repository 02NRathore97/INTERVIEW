package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLReader {

	public static void main(String[] args) throws IOException {
		URL u = new URL("http://www.sunilos.com:80/Home");
		
		System.out.println("Protocol : " +u.getProtocol());
		System.out.println("Host Name : " +u.getHost());
		System.out.println("Port Number : " +u.getPort());//if port no is not specified then it will return -1
		System.out.println("File Name : " +u.getFile());
		
		
		
		
//		InputStream iStr = u.openStream();
//		
//		Scanner in = new Scanner(iStr);
//		
//		while(in.hasNext()) {
//			String html = in.nextLine();
//			System.out.println(html);
//		}
//		in.close();
	}

}
