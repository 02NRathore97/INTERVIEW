package String;

public class SpacesInBetween {

	public static void main(String[] args) {
//		String name = "   Nee raj  ";
//		if(name.contains("")) {
//			System.out.println("Plese Enter name without spaces");
//		}else {
//			System.out.println(name);
//		}
		
		
		
		String name = "   Nee raj  ";
		if(name.trim().length()==0 || name.split(" ")!= null) {
			System.out.println("Plese Enter name without spaces");
		}else {
			System.out.println(name);
		}
		
		
	}

}
