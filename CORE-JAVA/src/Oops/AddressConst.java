package Oops;

public class AddressConst implements Cloneable{
	public String city;
	
	public AddressConst(String city) {
		this.city = city;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
