package com.company.java.palindrome;

public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r, sum=0, temp;
		int n=29922; // It is the number variable to be checked for
		// palindrome
		
		temp = n;
		while(n>0) {
			r = n%10; // getting remainder
			sum = (sum*10) + r;
			n = n/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome number!");
		} else {
			System.out.println("Not a Palindrome number.");
		}
		
	}

}
