package com.company.java.printNumberPattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		n=sc.nextInt();
		
		for(i=1; i<=n; i++) {
			
			for(j=i; j>=1; j--) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
