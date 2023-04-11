package com.sgtesting.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		matchesDemo();
		Find() ;
		countofmatching();
		groupofmatching();
		Startsend();
		Replace();
		splitarray();

	}
	private static void matchesDemo()
	{
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("Java");
		boolean v=m.matches();
		System.out.println(v);
		System.out.println("++++++++++++++");
	}
	private static void Find() 
	{
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("Java jdk Java jre jvm Java");
		boolean l=m.find();
		System.out.println(l);
		System.out.println("++++++++++++++");
	}
	private static void countofmatching()
	{
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("Java JDK Java JRE JVM Java");
		int count=0;
		while(m.find())
		{
			count=count+1;
		}
		System.out.println(count);
		System.out.println("++++++++++++++");
	}
	private static void groupofmatching()
	{
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("Java JDK Java JRE JVM Java");
		while(m.find())
		{
			System.out.println(m.group());
		}
		System.out.println("++++++++++++++");
	}
	private static void Startsend()
	{
		Pattern p=Pattern.compile("Harish");
		Matcher m=p.matcher("Harish is a great person,Harish is also a Legend,Harish is also called as Hari");
		while(m.find())
		{
			System.out.println(m.group() +" "+ m.start()+" " +m.end());
		}
		System.out.println("++++++++++++++");
	}
	private static void Replace()
	{
		Pattern p=Pattern.compile("Harish");
		Matcher m=p.matcher("Harish is a great person,Harish is also a Legend,Harish is also called as Hari");
		String k=m.replaceAll("Hari");
		System.out.println(k);
		System.out.println("++++++++++++++");
	}
	private static void splitarray()
	{
		Pattern p=Pattern.compile(",");
		String j[]=p.split("Harish,Lokare,Civil Engineer,Quantity Surveyor");
		for(String d:j)
		{
			System.out.println(d);
		}
		System.out.println("++++++++++++++");
	}

}
