package StreamAPI;

public class StreamEmployee {
	int age;
	String name;
	
	//default constructor
	public StreamEmployee() {	}

	//parameterized constructor
	public StreamEmployee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	
	//getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//toString
	@Override
	public String toString() {
		return "StreamEmpoyee [age=" + age + ", name=" + name + "]";
	}	
}
