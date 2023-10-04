package Basics;

public class Palindrom {

	public static void main(String[] args) {
		int a = 131;
		int n=a;
		int r;
		int sum=0;
		
		while(n>0) {
			r=n%10;
			sum= sum*10+r;
			n=n/10;
		}
		if(sum == a) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
	}

}
