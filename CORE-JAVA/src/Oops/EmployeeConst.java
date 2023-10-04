package Oops;

public class EmployeeConst implements Cloneable{
	public String name;
	public AddressConst add;
	
	public EmployeeConst(String name) {
		this.name = name;
		add = new AddressConst("Indore");
	}
	
	protected Object clone() throws CloneNotSupportedException {
		EmployeeConst e = (EmployeeConst)super.clone();
		//e.add = (AddressConst) add.clone();
		return e;
	}
}
