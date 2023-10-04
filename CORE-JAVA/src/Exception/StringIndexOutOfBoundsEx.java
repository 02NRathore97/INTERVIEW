package Exception;

public class StringIndexOutOfBoundsEx {
	public static void main(String[] args) {
		String name = "Neeraj";
		
	//	System.out.println(name.charAt(3));
		try {
			
			System.out.println(name.charAt(6)); 
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("please check ..........");
		}
		    
	}
}
