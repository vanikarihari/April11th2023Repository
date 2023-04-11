package com.sgtesting.reflectionmethod;

import java.lang.reflect.Method;

public class Case1Example {

	public static void main(String[] args) {
		Sample o=new Sample();
		try {
			Method a[]=o.getClass().getDeclaredMethods();
			for(int i=0;i<a.length;i++)
			{
				String w=a[i].getName();
				System.out.println(w);
				a[i].invoke(o, null);
			}
		}catch(Exception f)
		{
			f.printStackTrace();	
		}
	}
}
