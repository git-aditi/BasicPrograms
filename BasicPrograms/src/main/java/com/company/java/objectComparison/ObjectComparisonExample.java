package com.company.java.objectComparison;

public class ObjectComparisonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating constructor of the Double class
		Double x = new Double(123.45);
		
		//creating constructor of the Long class
		Long y = new Long(98875);
		
		//invoking the equals() method
		System.out.println("Objects are not equal, hence it returns " + x.equals(y));
		System.out.println("Objects are equal, hence it returns " + x.equals(123.45));
		
	}

}
