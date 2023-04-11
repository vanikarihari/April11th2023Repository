package com.sgtesting.parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test(dataProvider = "credentials")
	public void testingData(String user,String pwd)
	{
		System.out.println(user+" ---> "+pwd);
	}
	
	@DataProvider(name = "credentials")
	public Object[][] getCredentails()
	{
		return new Object[][] {{"demoUser1","Welcome1"},
			{"demoUser2","Welcome2"},
			{"demoUser3","Welcome3"}
			};
	}

}