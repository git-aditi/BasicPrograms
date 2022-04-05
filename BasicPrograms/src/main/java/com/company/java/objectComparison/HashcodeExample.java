package com.company.java.objectComparison;

public class HashcodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating two instances of the Employee class
		Employee emp1 = new Employee(918,"Maria");
		Employee emp2 = new Employee(918,"Maria");
		
		//invoking hashCode() method
		int a = emp1.hashCode();
		int b = emp2.hashCode();
		
		System.out.println("hashcode of emp1 = " + a);
		System.out.println("hashcode of emp2 = " + b);
		System.out.println("Comparing objects emp1 and emp 2 = " + emp1.equals(emp2)); 
 
	}

}
