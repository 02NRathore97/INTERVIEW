package String;

public class PalindromString {

	public static void main(String[] args) {
		String str = "Nayal";
		boolean flage = true;
		String name = str.toLowerCase();
		
		for(int i = 0; i<name.length()/2; i++) {
			if(name.charAt(i)!= name.charAt(name.length()-i-1)) {
				flage = false;
			}else {
				flage = true;
			}
		}
		System.out.println("palindrom = "+flage);

	}

}
