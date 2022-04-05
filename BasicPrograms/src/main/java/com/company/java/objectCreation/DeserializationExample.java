package com.company.java.objectCreation;

import java.io.*;

public class DeserializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//creating a stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
			Employee2 e = (Employee2)in.readObject();
			//prints the data of the serialized object
			System.out.println(e.empid + " " + e.empname);
			//closing the input stream
			in.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
