package com.sgtesting.stringclasses;

public class StringAssignment6 {

	public static void main(String[] args) {
		vowelcount();

	}
	private static void vowelcount()
	{
		String s="HarishLokare";
		String s1=s.toLowerCase();
		System.out.println(s1);
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1;
			}
		}
			System.out.println(count);
		}
			
		
	

}
