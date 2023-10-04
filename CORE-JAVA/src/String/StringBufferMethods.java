package String;

public class StringBufferMethods {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Neeraj");
		System.out.println(sb.capacity());
	
		sb.append(" Singh");
		System.out.println(sb.capacity());
		sb.append(" Rathore123456789");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(7));
		System.out.println(sb.indexOf("Rathore"));
		System.out.println(sb.replace(0,6,"Vinod"));
		System.out.println(sb.reverse());
		
		

	}

}
