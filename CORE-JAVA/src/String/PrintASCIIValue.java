package String;

import java.util.Arrays;

public class PrintASCIIValue {

	public static void main(String[] args) {
		String name = "Neeraj"
				+ "Rathore";
		
		
		//Approach-1
		 char[] ch =  name.toCharArray();
		 for(int i = 0; i<ch.length; i++) {
			 System.out.println("The ASCII value of "+ch[i]+" = "+(int)ch[i]);
		 }
		 
		 
		 //Approach-2
		 for(int i : ch) {
			 System.out.println(i);
			 
		 }
	
	}

}
