package com.company.java.printNumberPattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {
			int n=8;
			
			for(int j=1; j<=n-i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=i; k>=1; k--) {
				System.out.print(k);
			}
			
			for(int l=2; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		for(int i=3; i>=1; i--) {
			int n=8;
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=i; k>=1; k--) {
				System.out.print(k);
			}
			
			for(int l=2; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
