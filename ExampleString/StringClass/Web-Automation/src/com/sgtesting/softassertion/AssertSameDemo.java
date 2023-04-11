package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class AssertSameDemo {
	
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertSameTesting()
	{
		try
		{
			String s1="Testing";
			String s2=new String("Testing");
			soft.assertSame(s1, s2);
			System.out.println("This step will execute after successful execution of assertSame");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotSameTesting()
	{
		try
		{
			String s1="Testing";
			String s2=new String("TestingNew");
			soft.assertNotSame(s1, s2);
			System.out.println("This step will execute after successful execution of assertNotSame");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}