package Collection;

public class EqualAndHashExample {
	int age;
	String name;
	String lastName;
	
	public EqualAndHashExample() {}

	public EqualAndHashExample(int age, String name, String lastName) {
		super();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		//to check object of another class
		
		//approach-1
		if (obj == null)
			return false;
		
		//approach-2
//		if (!(obj instanceof EqualAndHashExample))
//			return false;

		
		EqualAndHashExample e = (EqualAndHashExample) obj;
		return this.age == e.age;
	}
	@Override
	public String toString() {
		return "EqualAndHashExample [age=" + age + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}
