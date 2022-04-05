package com.company.java.objectCreation;

import java.lang.reflect.*;

public class CreateObjectExample5 {
	
	private String str;
	
	public CreateObjectExample5() {
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Constructor<CreateObjectExample5> constructor = CreateObjectExample5.class.getDeclaredConstructor();
			CreateObjectExample5 r = constructor.newInstance();
			r.setName("JavaTPoint");
			System.out.println(r.str);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
