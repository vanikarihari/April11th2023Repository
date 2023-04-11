package com.sgtesting.stringclasses;

public class Stringassignment8 {

	public static void main(String[] args) {
		tochararray();
		charat();
		substring();
	}
	private static void tochararray()
	{
		String s="HARISHLOKARE";
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println(" ");
		System.out.println("+++++++++++++++++");
	}
	private static void charat()
	{
		String s="HARISHLOKARE";
		for(int i=s.length()-1;i>=0;i--)
		{
			char s1=s.charAt(i);
			System.out.print(s1);
			
		}
		System.out.println(" ");
		System.out.println("++++++++++++++");
	}
	private static void substring()
	{
		String s="HARISHLOKARE";
		String s1=s.substring(0, 12);
		{
			System.out.print(s1);
		}
	}
}
