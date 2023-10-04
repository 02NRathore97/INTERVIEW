package IO;

import java.io.Serializable;

public class StudentSerial implements Serializable{
	 int id;
	//int id;
	//transient String name;
	 String name;
	
	
	public StudentSerial(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "StudentSerial [id=" + id + ", name=" + name + "]";
	}
	
	
}
