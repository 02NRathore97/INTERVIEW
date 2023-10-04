//WAP to find last letter of the string
package String;

public class LastWordOfTheString {

	public static void main(String[] args) {
		String name = "Neeraj Singh Rathore";
		
		
		//Approach-1
		String[] arr = name.split(" ");
		String a =  arr[arr.length-1];
		System.out.println(a);

	
		//Approach-2
		int s = name.lastIndexOf(" ");
		for(int i = s; i<name.length();i++) {
			System.out.print(name.charAt(i));
		}


 }
}
