package com.company.java.printNumberPattern;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 7, i, j;
		for (i = rows; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
