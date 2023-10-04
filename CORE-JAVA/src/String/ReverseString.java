//WAP to print reverse String
package String;

public class ReverseString {

	public static void main(String[] args) {
	String name = "Neeraj";
	
	
	//Approach-1
	for(int i = name.length()-1; i>=0; i--) {
		System.out.print(name.charAt(i));
	}
	System.out.println(" ");
	
	
	
	
	//Approach-2
	char[] ch = name.toCharArray();
	for(int i=ch.length-1; i>=0; i--) {
		System.out.print(ch[i]);
	}
	System.out.println(" ");
	
	
	
	
	//Approach-3
	StringBuffer sb = new StringBuffer(name);
	System.out.println(sb.reverse());
	
	
	
	
	
	//Approach-4
	StringBuilder sbuilder = new StringBuilder(name);
	System.out.println(sbuilder.reverse());
  }
}
