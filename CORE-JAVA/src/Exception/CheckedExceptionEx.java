package Exception;

public class CheckedExceptionEx {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void mom() throws Exception {
		son();
	}
	public static void son() throws Exception {
		System.out.println("son.......");
		throw new Exception();
	}
}
