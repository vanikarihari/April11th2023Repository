package com.sgtesting.reflectionmethod;

import java.lang.reflect.Method;

public class Case2Example {

	public static void main(String[] args) {
		Sample o=new Sample();
		try {
			Method p[]=o.getClass().getMethods();
			for(int r=0;r<p.length;r++)
			{
				String names=p[r].getName();
				if(names.startsWith("di"))
				{
					p[r].invoke(o, null);
				}
			}


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
