package Basics;

public class DiamondPattern {

	public static void main(String[] args) {

		for(int i =1; i<=4; i++) {
			for(int j = 4-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int k = i; k>0; k--) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		
		for(int i =1; i<=4; i++) {
			
			for(int k = i; k>0; k--) {
				
				System.out.print(" ");
			}
			for(int j = 4-i; j>0; j--) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}

	}

}
