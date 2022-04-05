package com.company.java.randomNumber;

import java.util.Random;

public class RandomNumberExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an object of Random class
		Random random = new Random();
		
		//Generates random integers 0 to 49
		int x = random.nextInt(50);
		
		//Generates random integers from 0 to 999
		int y = random.nextInt(1000);
		
		//Prints random integer values
		System.out.println("Randomly generated integer values");
		System.out.println(x);
		System.out.println(y);
		
		//Generates random double values
		double a = random.nextDouble();
		double b = random.nextDouble();
		
		//Prints random double values
		System.out.println("Randomly generated double values");
		System.out.println(a);
		System.out.println(b);
		
		//Generates random float values
		float f = random.nextFloat();
		float i = random.nextFloat();
				
		//Prints random float values
		System.out.println("Randomly generated float values");
		System.out.println(f);
		System.out.println(i);
		
		//Generates random long values
		long p = random.nextLong();
		long q = random.nextLong();
				
		//Prints random long values
		System.out.println("Randomly generated long values");
		System.out.println(p);
		System.out.println(q);
		
		//Generates random boolean values
		boolean m = random.nextBoolean();
		boolean n = random.nextBoolean();
				
		//Prints random boolean values
		System.out.println("Randomly generated boolean values");
		System.out.println(m);
		System.out.println(n);
		
		
	}

}
