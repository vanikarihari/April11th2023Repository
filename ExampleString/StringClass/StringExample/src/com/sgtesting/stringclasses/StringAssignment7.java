package com.sgtesting.stringclasses;

public class StringAssignment7 {

	public static void main(String[] args) {
		palindrome();

	}
     private static void palindrome()
     {
    	 String s="radar";
    	 boolean isp=true;
    	 for(int i=0;i<s.length()/2;i++)
    	 if(s.charAt(i)!=s.charAt(s.length()-1-i))
    	 {
    		 isp=false;
    		 break;
    	 }
     
    	 if(isp)
    	 {
    		 System.out.println("Given word is palindrome");
    	 }
    	 else
    	 {
    		 System.out.println("Given word is not palindrome");
    	 } 
     }
}
