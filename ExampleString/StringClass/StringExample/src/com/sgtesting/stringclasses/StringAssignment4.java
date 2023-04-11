package com.sgtesting.stringclasses;

public class StringAssignment4 {

	public static void main(String[] args) {
		appenddemo();
		insertdemo();
		deletedemo();
		reversedemo();

	}
	private static void appenddemo()
	{
		StringBuffer s=new StringBuffer("Harish");
		System.out.println(s);
		s.append(" Lokare ");
		System.out.println(s);
		s.append(1);
		System.out.println(s);
		System.out.println("+++++++++++++++");	
	}
	private static void insertdemo()
	{
		StringBuffer s2=new StringBuffer("Harish Lokare");
		StringBuffer s3=s2.insert(6, " has surname called");
		System.out.println(s3);	
	}
	private static void deletedemo()
	{
		StringBuffer s2=new StringBuffer("Harish Lokare");
		StringBuffer s3=s2.delete(6, 13);
		System.out.println(s3);	
		System.out.println("+++++++++++++++");	
	}
	private static void reversedemo()
	{
		StringBuffer s2=new StringBuffer("Harish Lokare");
		StringBuffer s3=s2.reverse();
		System.out.println(s3);
		System.out.println("+++++++++++++++");	
	}

}
