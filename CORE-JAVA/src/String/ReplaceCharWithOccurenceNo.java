package String;

import java.util.Arrays;

public class ReplaceCharWithOccurenceNo {

	public static void main(String[] args) {
		String name = "Neeraj";
		char charToReplace = 'a';
		
		if(name.indexOf(charToReplace)==-1) {
			System.out.println("Not present");
			System.exit(0);
		}
		
		int cnt=1;
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == charToReplace) {
				ch[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
