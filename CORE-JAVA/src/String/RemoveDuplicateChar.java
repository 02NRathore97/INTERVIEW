package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		String str = "programming";
		
		
		//Approach-1
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c-> sb.append((char)c));
		System.out.println(sb);
		
		
		
		//Approach-2
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch,i+1);
			if(idx==-1) {
				System.out.print(ch);
			}
		}
		System.out.println("");
		
		
		//Approach-3
		
		char[] arr = str.toCharArray();
		for(int i= 0; i< arr.length; i++) {
			boolean repeated = false;
			for(int j=i+1; j< arr.length; j++) {
				if(arr[i]== arr[j]) {
				repeated= true;
				break;
				}
			}
			if(!repeated) {
				System.out.print(arr[i]);
		}
			
	}
		System.out.println("");	
		
		
		//Approach-4
		Set<Character> set = new LinkedHashSet();
		for(int i=0; i< str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(char c: set) {
			System.out.print(c);
		}
	
	}

}
