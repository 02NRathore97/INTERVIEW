package Collection;

public class HashCodeEqualsString {
	int id;
	String name;
	int salary;
	public HashCodeEqualsString(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		String str = this.id+this.name+this.salary;
		return str.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
			return false;
		
	if(!(obj instanceof HashCodeEqualsString)) {
		return false;
	} 
	HashCodeEqualsString a =  (HashCodeEqualsString)obj;
	String s1 = this.id+this.name+this.salary;
	String s = a.id+a.name+a.salary;
	//return s1 == s;
	return s.equals(s1);
	}
}
