package com.sgtesting.softassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertEqualsTesting()
	{
		try
		{
			String s1="Testing";
			String s2=new String("Testing");
			soft.assertEquals(s1, s2);
			System.out.println("This step will execute after successful execution of assertEquals");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotEqualsTesting()
	{
		try
		{
			String s1="Testing";
			String s2=new String("Testing");
			soft.assertNotEquals(s1, s2);
			System.out.println("This step will execute after successful execution of assertNotEquals");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}