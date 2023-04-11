package com.sgtesting.reflectionmethod;

import java.lang.reflect.Method;

public class Case6Example {

	public static void main(String[] args) {
		Sample3 o1=new Sample3();
		
		try {
			Class s[]=new Class[2];
			s[0]=String.class;
			s[1]=String.class;
			Method m=o1.getClass().getMethod("getPersonDetails", s);
			m.invoke(o1, new String("Harish"),new String("Raichur"));
			
			Class p[]=new Class[1];
			p[0]=Integer.TYPE;
			Method v=o1.getClass().getMethod("displayEmpNumber", p);
			v.invoke(o1, 1);
			
			Class h[]=new Class[1];
			h[0]=String.class;
			Method sp=o1.getClass().getDeclaredMethod("showStateName", h);
			sp.invoke(o1, new String("Karnataka"));
				
		} catch (Exception e) 
		{
			e.printStackTrace();
		} 

	}

}