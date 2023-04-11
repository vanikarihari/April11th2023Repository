package com.sgtesting.stringclasses;

public class StringAssignment10 {

	public static void main(String[] args) {
		insertex();
		}
	    private static void insertex()
	    {
	    	String s1=new String("MONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAYSUNDAY");
	    	String str[]=s1.split("DAY");
	    	for(int i=0;i<str.length;i++)
	    	{
	    		
	    		System.out.println(str[i]);
	    	}
	    }
	}