//WAP to separate integer and character from String and store it into array
package String;

import java.util.Arrays;

public class SeparateChar_Int_FromString_StoreInArray {
	public static void main(String[] args) {
		
		String str = "Nee1ra2j";
		
		char[] ch = str.toCharArray();
		String result  = "";
		String result1 = "";
	
		for(int i = 0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				result = result + String.valueOf(ch[i]);
				
			}else {
				result1 = result1 + String.valueOf(ch[i]);
			}
		}
		char[] x = result.toCharArray();
		char[] y = result1.toCharArray();
		
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(x));
		}
	}


