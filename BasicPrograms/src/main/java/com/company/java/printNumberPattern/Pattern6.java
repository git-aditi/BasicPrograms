package com.company.java.printNumberPattern;

import java.util.*;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, rows;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		rows = sc.nextInt();
		
		for(i=rows; i>=1; i--) {
			
			for(j= rows; j>=i; j--) {
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}
		
	}

}
