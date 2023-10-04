package String;
//class final
public final class ImmutableClass {

	
	//attribute final and private
	private final int age;
	private final String name;
	
	
	//parameterized constructor to initialized private attributes
	public ImmutableClass(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//setter methods to accesss the private attributes
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}


	public static void main(String[] args) {
		ImmutableClass a = new ImmutableClass(25, "Neeraj");
		System.out.println("age "+ a.getAge());
		System.out.println("name "+ a.getName());
	}

}
