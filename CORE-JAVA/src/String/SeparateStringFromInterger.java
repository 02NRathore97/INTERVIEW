//WAP to remove Integer
package String;

public class SeparateStringFromInterger {

	public static void main(String[] args) {
		String name="Neer12a69j";
		String result = "";
		int count = 0;
		int num = 0 ;
		
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				result = result + ch[i];
			}else {
				 count++;
				
			}
		}
		System.out.println(result);
		System.out.println(count);
	
	
	}

}
