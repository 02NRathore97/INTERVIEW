package Oops;

public class ParameterizedConstThis {
	public String name;
	public String surname;
	public ParameterizedConstThis() {
		System.out.println("This is default Constructor");
	}
	public ParameterizedConstThis(String name) {
		this();
		this.name = name;
		System.out.println(name);
	}
	public ParameterizedConstThis(String name , String surname) {
		this(name);
		this.surname = surname;
		System.out.println(surname);
	}
	

}
