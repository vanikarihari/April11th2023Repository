package com.sgtesting.vanireflection;

import java.lang.reflect.Method;

public class ReflectionCase1 {

	public static void main(String[] args) {
		Sample s=new Sample();
		try {
			Method p[]=	s.getClass().getDeclaredMethods();
			for(int i=0; i<p.length; i++)
			{
				String m=p[i].getName();
				if(m.startsWith("disp"))
				{
					p[i].invoke(s, null);
					System.out.println(m);
				}
			    
			}

			}catch(Exception e)
			{
				e.printStackTrace();
			}



		}
	}



