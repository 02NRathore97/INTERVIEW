package Oops;

public class BParameterizedConstSuper extends AParameterizedConstSuper{
	public String surname;
	public BParameterizedConstSuper(String surname) {
		super();
	// super("Neeraj");
	 this.surname = surname;
	 System.out.println(surname);
}
}
