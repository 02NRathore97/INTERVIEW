package Basics;

public class PrimeNumber {

	public static void main(String[] args) {
		int t = 15;
		int count = 0;
		
		for(int i=2; i<t; i++) {
			if(t%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}

	}

}
