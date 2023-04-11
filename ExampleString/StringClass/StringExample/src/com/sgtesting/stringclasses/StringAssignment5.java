package com.sgtesting.stringclasses;

public class StringAssignment5 {

	public static void main(String[] args) {
		Length();
		Length1();

	}
	private static void Length()
	{
		String s1="Harish Lokare";
		int s2=s1.length();
		System.out.println(s2);
	}
	private static void Length1()
	{
		String s1="Harish Lokare";
		char h[]=s1.toCharArray();
		int count=0;
		for(char hl:h)
		{
			count=count+1;
		}
		System.out.println(count);
	}

}
