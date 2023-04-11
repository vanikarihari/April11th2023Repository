package com.sgtesting.softassertion;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	
	SoftAssert soft=new SoftAssert();
	@Test(enabled = false)
	public void assertNullTesting()
	{
		try
		{
			File f1=null;
			soft.assertNull(f1);
			System.out.println("This step will execute after successful execution of assertNull");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void assertNotNullTesting()
	{
		try
		{
			File f1=null;
			f1=new File("E:\\EXAMPLE");
			soft.assertNotNull(f1);
			System.out.println("This step will execute after successful execution of assertNotNull");
			soft.assertAll();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}