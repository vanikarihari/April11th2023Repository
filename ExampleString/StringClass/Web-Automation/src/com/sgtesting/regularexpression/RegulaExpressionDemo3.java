package com.sgtesting.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaExpressionDemo3 {

	public static void main(String[] args) {
		//Matches();
		//find();
		//group();
		//Startposition();
		//endposition();
		allactions();

	}
	private static void allactions()
	{
		
		Pattern p=Pattern.compile("Vani");
		Matcher m=p.matcher("Vani nibba Vani nibbi Vani billi");
		while(m.find())
		{
			System.out.print(m.group()+"  "+m.end()+"  "+m.start());
				
			
						
		}		
	}

	private static void Matches()
	{
		Pattern p=Pattern.compile("Vani");
		Matcher m=p.matcher("Vani");
		boolean v=m.matches();
		System.out.println(v);	
	}
	private static void find()
	{
		
		Pattern p=Pattern.compile("Vani");
		Matcher m=p.matcher("Vani nibba Vani nibbi Vani billi");
		int count=0;
		while(m.find())
		{
			count=count+1;			
		}
		System.out.println(count);
	}
	private static void group()
	{
		
		Pattern p=Pattern.compile("Vani");
		Matcher m=p.matcher("Vani nibba Vani nibbi Vani billi");
		while(m.find())
		{
			System.out.println(m.group());			
		}		
	}
	private static void Startposition()
	{
		
		Pattern p=Pattern.compile("Vani");
		Matcher m=p.matcher("Vani nibba Vani nibbi Vani billi");
		while(m.find())
		{
			System.out.println(m.start());			
		}		
	}
	private static void endposition()
	{
		Pattern p=Pattern.compile("billi");
		Matcher m=p.matcher("billi tail is to cute and i cut billi tail");
		while(m.find())
		{
			System.out.println(m.end());
		}
	}
	
	



}
