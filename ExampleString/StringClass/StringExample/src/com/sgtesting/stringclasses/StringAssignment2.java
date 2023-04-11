package com.sgtesting.stringclasses;

public class StringAssignment2 {

	public static void main(String[] args) {
		lowercase();
		Uppercase();
		Length();
		replaceDemo();
		compareDemo();
		compareDemo2();
		existencestring();
		showcharacter();
		split();
		valueOf();
		getonechar();
		extractdemo();
		findposdemo();
	}
	private static void lowercase()
	{
		String s=new String("PROGRAM");
		String s1=s.toLowerCase();
		System.out.println("Lowercase: "+s1);
		System.out.println("+++++++++++++++++");
	}
	private static void Uppercase()
	{
		String s=new String("cprogramming");
		String s2=s.toUpperCase();
		System.out.println("Uppercase: "+s2);
		System.out.println("+++++++++++++++++++=");
	}
	private static void Length()
	{
		String s1=new String("Harish Lokare");
		System.out.println("Length of Characters: "+s1.length());
		System.out.println("+++++++++++++++++++=");
	}
	private static void replaceDemo()
	{
		String s="It is a new Place";
		String s1=s.replace("is", "was");
		System.out.println("After alteration: "+s1);
		System.out.println("+++++++++++++++++++=");
	}
	private static void compareDemo()
	{
		String s1="HARISHLOKARE";
		String s2="harishlokare";
		System.out.println("Equal with case sensitive: "+s1.equals(s2));
		System.out.println("Equal without case sensitive: "+s1.equalsIgnoreCase(s2));
		System.out.println("+++++++++++++++++++=");
	}
	private static void compareDemo2()
	{
		String s1="HARISHLOKARE";
		String s2="harishlokare";
		System.out.println("Equal with case sensitive: "+s1.compareTo(s2));
		System.out.println("Equal without case sensitive: "+s1.compareToIgnoreCase(s2));
		System.out.println("+++++++++++++++++++=");
	}
	private static void existencestring()
	{
		String s1="Harish Lokare is a very good boy";
		System.out.println("Existence: "+s1.contains("very"));
		System.out.println("Existence: "+s1.endsWith("boy"));
		System.out.println("+++++++++++++++++++=");
	}
	private static void showcharacter()
	{
		String s1="HarishLokare";
		char ch[]=s1.toCharArray();
		for(char kk:ch)
		{
			System.out.println(kk);
		}
		System.out.println("+++++++++++++++++++=");
	}
	private static void split()
	{
		String s1="Harish, Lokare, is, a, very, good, boy";
		String str[]=s1.split(",");
		for(String kk:str)
		{
			System.out.println(kk);
		}
		System.out.println("+++++++++++++++++++=");
	}
	private static void valueOf()
	{
		int a=125;
		String s1=String.valueOf(a);
		System.out.println(s1);
		double d=12.75;
		String s2=String.valueOf(d);
		System.out.println(d);
		System.out.println("+++++++++++++++++++=");
	}
	private static void getonechar()
	{
		String s1="WXYZABC";
	    char s2=s1.charAt(0);
	    System.out.println(s2);
	    char s3=s1.charAt(5);
	    System.out.println(s3);
	    System.out.println("+++++++++++++++++++=");
	}
	private static void extractdemo()
	{
		String s1="WXYZABCDEFGHIJ";
	    String s2=s1.substring(2);
	    System.out.println(s2);
	    String s3=s1.substring(5);
	    System.out.println(s3);
	    System.out.println("+++++++++++++++++++=");
	}
	private static void findposdemo()
	{
		String s1="Harish is a very good boy";
	    int s2=s1.indexOf("is", 9);
	    System.out.println(s2);
	    int s3=s1.lastIndexOf("very");
	    System.out.println(s3);
	    System.out.println("+++++++++++++++++++=");
	}

}
