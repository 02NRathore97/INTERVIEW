
/**
 *  Use of == operator and equals method in java.
 *  
 *   The main  difference of is that == equals  operator is checks the reference/address of the object 
 *   
 *   equals() method checks the values  of the object.
 *   
**/
package String;

public class EqualOperator_EqualMethod {

	public static void main(String[] args) {
		
		
		String name1 = "Neeraj";
		String name2 = "Neeraj";
		String name3 = "Rathore";
		String name4 = new String("Neeraj");
		String name5 = new String("Neeraj");
		String name6 = new String("Rathore");
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		System.out.println(name1 == name6);
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
		System.out.println(name1.equals(name6));
		
		
		
	}

}
