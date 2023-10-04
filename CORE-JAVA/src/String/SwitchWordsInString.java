package String;

public class SwitchWordsInString {

	public static void main(String[] args) {

		String name = "Neeraj Singh Rathore";
		
		
		//Approach-1
		String[] a = name.split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = a.length-1; i>=0; i--) {
			sb.append(a[i]).append(" ");
		}
		//String rev = sb.toString();
		//System.out.println(rev);
		
		System.out.println(sb);


	
	//Approach-2
	for(int i = a.length-1; i>=0; i--) {
		String rev = a[i] +" ";
		System.out.print(rev);
	}
  }
}