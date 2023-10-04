package Exception;



public class NullPointerExceptionEx {
	public static void main(String[] args) {
		String name = null;
		
		try {
		
		System.out.println(name.charAt(0));
		
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Exception.......");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			System.out.println(e.getStackTrace());
			e.printStackTrace();
			
		}
		
		
//		}catch(StringIndexOutOfBoundsException | NullPointerException e){
//	
//			System.out.println("please check..........");
//		}
	}
}
