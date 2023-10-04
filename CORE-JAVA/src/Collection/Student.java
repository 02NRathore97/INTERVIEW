package Collection;

public class Student implements Comparable<Student>{

	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	
	public String toString() {
		return "Student[id = "+id+", name = "+name+"]";
	}
	
	
	@Override
	public int compareTo(Student o) {
		//return  this.name.compareTo(o.name);
		//return  o.id-this.id;		//Descending
		//return this.id-o.id;		//Ascending
		if(this.id-o.id==0) {
			return  0;
		}
			
		return this.id-o.id;
	}
	
	

}
