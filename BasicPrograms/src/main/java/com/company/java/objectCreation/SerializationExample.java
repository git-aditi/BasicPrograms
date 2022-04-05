package com.company.java.objectCreation;

import java.io.*;

public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//creating the object
			Employee2 emp = new Employee2(19, "Andrew");
			
			//creates a stream and writes the object
			FileOutputStream foout = new FileOutputStream("employee.txt");
//			ObjectOutputStream out = new ObjectOutputStream(employeeout);
//			out.writeObject(emp);
//			out.flush();
//			//closes the output stream
//			out.close();
			System.out.println("Successfully Created");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
