package com.company.java.objectComparison;

public class Employee {

	private int regno;
	private String name;
	
	
	//constructor of Employee class
	public Employee(int regno, String name) {
		this.regno = regno;
		this.name = name;
	}


	public int getRegno() {
		return regno;
	}


	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	//overriding equals() method
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		
		if(obj==this) {
			return true;
		}
		
		return this.getRegno() == ((Employee) obj).getRegno();
	}
	
	
	
}
