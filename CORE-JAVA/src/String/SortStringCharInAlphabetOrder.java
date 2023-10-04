package String;

import java.util.Arrays;

public class SortStringCharInAlphabetOrder {

	public static void main(String[] args) {
		String str = "neeraj";
		
		
		//Approach-1
		char[] ch = str.toCharArray();
		char temp;
		
		for(int i=0; i<ch.length; i++ ) {
			for(int j= i+1; j<ch.length; j++) {
				if(ch[i]>ch[j]) {
					temp = ch[i];
					ch[i]= ch[j];
					ch[j]= temp;
					
				}
			}
			System.out.print(ch[i]);
			}
		System.out.println(" ");
		
		
		
		//Approach-2
		char[] c = str.toCharArray();
		Arrays.sort(c);
		System.out.println(c);

	}

}
