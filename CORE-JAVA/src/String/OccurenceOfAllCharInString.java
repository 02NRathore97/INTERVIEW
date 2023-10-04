//WAP to count the occurrence of character in string
package String;

public class OccurenceOfAllCharInString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Neeraj");
		String s = sb.toString();
		String name = s.toLowerCase();
		
		int count = 0;
		
		for(char a='a'; a<='z'; a++) {
			for(int i = 0; i<name.length(); i++) {
				if(a == name.charAt(i)) {
				count++;
			}
		}
		if(count!=0) {
			System.out.println(a +" "+count);
			count = 0;
		}
	  }
   }
}
