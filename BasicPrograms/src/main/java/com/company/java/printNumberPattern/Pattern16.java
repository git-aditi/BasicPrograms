package com.company.java.printNumberPattern;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, rows = 9;

		// Prints upper half pattern

		for (i = rows; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		// Prints lower half pattern

		for (i = 2; i <= rows; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

	}

}
