package Oops;

public class Employee1 implements Cloneable{
	private String name;
	private Address1 address;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address1 getAddress1() {
		return address;
	}
	public void setAddress1(Address1 address) {
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
