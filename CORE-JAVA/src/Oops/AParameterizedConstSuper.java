package Oops;

public class AParameterizedConstSuper {
	public String name;
	
	public AParameterizedConstSuper() {
		System.out.println("Default.........");	
		}
	public AParameterizedConstSuper(String name) {
		
		this.name = name;
		System.out.println(name);
	}
}
