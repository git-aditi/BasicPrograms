package com.company.java.printStarPattern;

import java.util.*;

public class DiamondStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		
		int rows = sc.nextInt();
		
		for(i = 1; i<=rows; i++) {
			for(j = rows; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1; k<2*(i-1); k++) {
				System.out.print(" ");
			}
			
			if(i==1) {
				System.out.println("");
			} else {
				System.out.println("*");
			}
		}
		
		for(i=rows-1; i>=1; i--) {
			for( j=rows; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for( k=1; k<2*(i-1); k++) {
				System.out.print(" ");
			}
			
			if(i==1) {
				System.out.println("");
			} else {
				System.out.println("*");
			}
		}
		
		
		
	}

}
