package String;

import java.util.Arrays;

public class SortingOfString {

	public static void main(String[] args) {
		String str = "Neeraj";
		String name = str.toLowerCase();
		char[] ch = name.toCharArray();
		
		
		//Approach-1
		char temp;
		for(int i = 0; i<ch.length; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j]  =temp;
				}
			}
			System.out.print(ch[i]);				
			}
		System.out.println();
		
		
		
		//Approach-2
		Arrays.sort(ch);
		System.out.println(ch);
		}
	}


