package Exception;

public class FamilyPropagationChecked {

	public static void main(String[] args) throws MistakeException {
		dad();
	}

	public static void dad() throws MistakeException{
		mom();
		
//		try {
//			mom();
//		} catch (MistakeException e) {
//			System.out.println(e.getMessage());		
//			}
	}
	public static void mom() throws MistakeException {
		son();
	}
	public static void son() throws MistakeException {
		MistakeException e = new MistakeException();
		throw e;
	}
}
