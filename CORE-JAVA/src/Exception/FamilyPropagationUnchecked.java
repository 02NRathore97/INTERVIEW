package Exception;

public class FamilyPropagationUnchecked {

	public static void main(String[] args){
		dad();
	}

	public static void dad(){
		
		
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());		
			}
	}
	public static void mom()  {
		son();
	}
	public static void son()  {
		RuntimeException e = new RuntimeException("I made a Mistake......");
		throw e;
	}

}
