package com.sgtesting.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

	public static void main(String[] args) {
		regexptesting();
		regexptesting2();
		regexptesting3();
		regexptesting4(); 

	}
	private static void regexptesting()
	{
		String h="Harish Scored 150 Runs in Cricket match between India and Pakistan";
		Pattern p=Pattern.compile("[0-9][0-9][0-9]");
		Matcher m=p.matcher(h);
		boolean v1=m.find();
		System.out.println(v1);
	}
	private static void regexptesting2()
	{
		String p="Harish Scored 150 Runs in Cricket match between India and Pakistan";
		Pattern pa=Pattern.compile("[0-9][0-9][0-9]");
		Matcher m=pa.matcher(p);
		while(m.find())
		{
			System.out.println(m.group());
		}		
	}
	private static void regexptesting3()
	{
		String p="Harish Scored 150 Runs in Cricket match between India and Pakistan";
		Pattern pa=Pattern.compile("[0-9][0-9][0-9]");
		Matcher m=pa.matcher(p);
		String o=m.replaceAll("many");
		System.out.println(o);

	}
	private static void regexptesting4()
	{
		String p="Harish Scored 150 Runs in Cricket match between India and Pakistan";
		Pattern pa=Pattern.compile("[a-zA-Z]+");
		Matcher m=pa.matcher(p);
		while(m.find())
		{
			System.out.println(m.group());
		}

	}


}
