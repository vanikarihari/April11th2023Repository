package com.sgtesting.stringclasses;

public class Stringassignment9 {

	public static void main(String[] args) {
		insertex();
	}
    private static void insertex()
    {
    	String s1=new String("MONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAYSUNDAY");
    	StringBuilder s2=new StringBuilder();
    	for(int i=0;i<s1.length();i++)
    	{
    		char ch=s1.charAt(i);
    		s2.append(ch);
    		if(ch=='Y')
    		{
    			s2.append(",");
    		}
    	}
    		System.out.print(s2.toString());
    }
}

