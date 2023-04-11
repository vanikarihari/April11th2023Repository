package com.sgtesting.stringclasses;

public class StringAssignment12 {

	public static void main(String[] args) {
		wordcount();
		reverse();
	}
	private static void wordcount()
	{
		String s=new String("The Temple is at the top of the Hill");
		int count=0;
		boolean isWord=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				isWord= false;
			}
			else if(!isWord)
			{
				isWord=true;
				count++;
			}
		}
		System.out.println(count);
		System.out.println("++++++++++++++++");
	}
	private static void reverse()
	{
		String s=new String("The Temple is at the top of the Hill");
		String words[]=s.split(" ");
		String rev="";
		for(String word:words)
		{
			String revWords="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWords+=word.charAt(i);
			}
			rev+=revWords+"";
		}
		System.out.println("Original String: "+s);
		System.out.println("Reversed String: "+rev);
	}
	
}
