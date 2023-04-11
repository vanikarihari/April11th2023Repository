package com.sgtesting.vanireflection;

public class ReflectionCase4 {

	public static void main(String[] args) {
		try {
		Class.forName("com.sgtesting.vanireflection.Sample2");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
