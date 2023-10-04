package Basics;

public class NumberReverse {
	public static void main(String[] args) {
		int a = 153;
		int x = a;
		int rev = 0;

		while(a!=0) {
			rev = rev*10+a%10;
			a=a/10;
		}
		System.out.println(rev);
		
	}

}
