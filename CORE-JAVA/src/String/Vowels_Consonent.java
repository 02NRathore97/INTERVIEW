//WAP to count vowel and consonant
package String;

public class Vowels_Consonent {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		String name = "Neeraj Rathore";
		
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i)== 'a' || name.charAt(i)== 'e' || name.charAt(i)== 'i' || name.charAt(i) == 'o' || name.charAt(i)== 'u') {
				x++;
			}else if(name.charAt(i)>='a' && name.charAt(i)<='z'){
				y++;
			}
		}
		System.out.println("vowels = "+ x);
		System.out.println("consonants = "+ y);
	}

}
