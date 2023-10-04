package Basics;

public class RightAngleTriangle {
	public static void main(String[] args) {
		
		// Pattern-1
		for(int i = 0; i <5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		
		
		
		//Pattern-2
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=i; j++ ) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		
		//Pattern-3
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=i; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
