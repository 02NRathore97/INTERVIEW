//WAP to find length of the String
package String;

public class LengthOfTheString {

	public static void main(String[] args) {
		String name = "Neeraj Rathore";
		
		//Approach-1
		int x = 0;
		char[] ch = name.toCharArray();
		for(char c : ch) {
			x++;
		}
			System.out.println(x);
		
	
	
	//Approach-2
	int y = 0;
	char[] ch1 = name.toCharArray();
	for(int i = 0;i<ch1.length; i++ ) {
		if(ch[i]!=' ') {
			y++;
		}
	}
	System.out.println(y);

	
	//Approach-3
	int z=0;
	for(int i= 0; i<name.length(); i++) {
		if(name.charAt(i)!=' ') {
			z++;
		}
	}
	System.out.println(z);
	}
}
