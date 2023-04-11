package com.sgtesting.stringclasses;

public class StringAssignment11 {

	public static void main(String[] args) {
		swappingex();

	}
	private static void swappingex()
	{
		String s1="Bangalore";
		String s2="Mysore";
		System.out.println("Before swapping: "+s1);
		System.out.println("Before swapping: "+s2);
		System.out.println("+++++++++++++++=");
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("after swapping: "+s1);
		System.out.println("after swapping: "+s2);
	}

}
