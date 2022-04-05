package com.company.java.primeNumber;

import java.util.Scanner;

public class PrimeExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int start = s.nextInt();
		System.out.println("Enter the second number: ");
		int end = s.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
