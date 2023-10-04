//WAP to count the character in string
package String;

public class OccurenceOfAnyOneLetterInString {
	public static void main(String[] args) {
		String name = "Neeraj";
		
		int j = 0;
		for(int i = 0; i<name.length(); i++) {
			char c = name.charAt(i);
			
			String k = name.valueOf(c);
			
			if(k.matches("j")) {
				j++;
			}
		}
		System.out.println(j);
	}
}
