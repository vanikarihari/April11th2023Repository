package com.sgtesting.vanireflection;
class Demo
{
	static void Milk()
	{
		System.out.println("constructor");
	}
	
	static
	{
		Milk();
		System.out.println("static block");
	}
}
public class DemoClass {

	public static void main(String[] args) {
		Demo o1=new Demo();
	

	}

}
