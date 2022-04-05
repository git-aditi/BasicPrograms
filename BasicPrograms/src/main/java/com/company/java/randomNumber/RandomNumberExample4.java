package com.company.java.randomNumber;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generate random integers between 0 to 999
		int a = ThreadLocalRandom.current().nextInt();
		int b = ThreadLocalRandom.current().nextInt();
		
		//Print random integer values
		System.out.println("Randomly generated integer values:");
		System.out.println(a);
		System.out.println(b);
		
		//Generate random double values
		double c = ThreadLocalRandom.current().nextDouble();
		double d = ThreadLocalRandom.current().nextDouble();

		//Print random doubles
		System.out.println("Randomly generated double values:");
		System.out.println(c);
		System.out.println(d);
		
		//Generate random boolean 
		boolean e = ThreadLocalRandom.current().nextBoolean();
		boolean f = ThreadLocalRandom.current().nextBoolean();
		
		//Print random Boolean
		System.out.println("Random generated boolean values:");
		System.out.println(e);
		System.out.println(f);
		
	}

}
