package Oops;

public class ConstructorOverloading {
	public int i;
	public String name;
	public String lastname;
	
	
	public ConstructorOverloading() {
		System.out.println("Default.....");	
		}
	public ConstructorOverloading(int i) {
		this.i = i;
		System.out.println(i);
	}
	public ConstructorOverloading(int i, String name) {
		this.i = i;
		this.name = name;
		System.out.println(i +" "+ name);
	}
	public ConstructorOverloading(int i, String name, String lastname) {
		this.i = i;
		this.name = name;
		this.lastname = lastname;
		System.out.println(i +" "+ name +" "+ lastname );
	}
	
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		ConstructorOverloading c1 = new ConstructorOverloading(1);
		ConstructorOverloading c2 = new ConstructorOverloading(1, "Neeraj");
		ConstructorOverloading c3 = new ConstructorOverloading(1, "Neeraj","Rathore");
	}
	
	
}
