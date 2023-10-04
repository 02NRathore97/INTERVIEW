package Exception;

public class CustomExceptionLogin {
	public static void main(String[] args) throws LoginException{
		//String user = "Neeraj";
		String user = null;
		if(user == null) {
			throw new LoginException();
		}
		else {
			System.out.println(user);
		}
	}
}
