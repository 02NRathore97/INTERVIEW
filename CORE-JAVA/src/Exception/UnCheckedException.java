package Exception;

public class UnCheckedException extends Exception{
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		mom();
	}
	public static void mom(){
		son();
	}
	public static void son(){
		System.out.println("son.......");
		throw new RuntimeException();
	}
}