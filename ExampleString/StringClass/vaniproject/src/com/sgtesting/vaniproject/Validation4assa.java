
package com.sgtesting.vaniproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Validation4assa {

	public static WebDriver o1;
	@Test(priority=1)
	public void launch()
	{
		try {
			ChromeOptions options  = new ChromeOptions();                  
			Thread.sleep(800);
			options.addArguments("--remote-allow-origins=*");                     
			Thread.sleep(800);
			o1=  new ChromeDriver(options);                 
			Thread.sleep(800);  

		}catch(Exception e )
		{
			e.printStackTrace();                      
		}
	}
	@Test(priority=2, dataProvider ="navigateurl")
	public void navigate(String k)
	{
		try {

			o1.get(k);                      Thread.sleep(800);
			//validation after naviate so o1.get
			WebElement o2=o1.findElement(By.xpath("//td[@id='headerContainer']"));                      Thread.sleep(800);
			Assert.assertTrue(o2.getText().equals("Please identify yourself"));                      Thread.sleep(800);
		}catch(Exception e )
		{
			e.printStackTrace();                      
		}
	}
	//to avoid hardcoding
	@DataProvider (name="navigateurl")
	public Object[][] geturl()
	{
		return new Object[][] {{"http://localhost:81/login.do"}};                      
	}
	@Test(priority=3, dataProvider="loginadmin")
	public void adminlogin(String a, String b)
	{
		try {

			o1.findElement(By.id("username")).sendKeys(a);                      Thread.sleep(800);
			o1.findElement(By.name("pwd")).sendKeys(b);                      Thread.sleep(800);
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                      Thread.sleep(800);
			WebElement o3= o1.findElement(By.xpath("//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"));                      Thread.sleep(800);
			Assert.assertTrue(o3.getText().equals("Enter Time-Track"));                      Thread.sleep(800);

		}catch(Exception e)
		{
			e.printStackTrace();                      
		}
	}
	@DataProvider (name="loginadmin")
	public Object[][] dologin()
	{
		return new Object[][] {{"admin","manager" }};                      
	}

	@Test(priority=4)
	public void minimise()
	{
		try {
			WebElement o4= o1.findElement(By.xpath("//div[text()='Best Way to Get Started']"));                   
			o1.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();                      Thread.sleep(800);
			Assert.assertFalse(o4.isDisplayed());                   
		}catch(Exception e)
		{
			e.printStackTrace();                      
		}
	}


	@Test(priority=5, dataProvider="openusers")
	public void createuser(String u,String v,String w,String x,String y,String z)
	{
		try {

			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                      Thread.sleep(800);

			//createuser
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();                      Thread.sleep(800);

			//fn
			o1.findElement(By.id("userDataLightBox_firstNameField" )).sendKeys(u);                      Thread.sleep(800);
			//lastn
			o1.findElement(By.id("userDataLightBox_lastNameField" )).sendKeys(v);                      Thread.sleep(800);
			//mail
			o1.findElement(By.id("userDataLightBox_emailField" )).sendKeys(w);                      Thread.sleep(800);
			//username//
			o1.findElement(By.id("userDataLightBox_usernameField" )).sendKeys(x);                      Thread.sleep(800);
			//password
			o1.findElement(By.id("userDataLightBox_passwordField" )).sendKeys(y);                      Thread.sleep(800);
			//retype
			o1.findElement(By.id("userDataLightBox_passwordCopyField" )).sendKeys(z);                      Thread.sleep(800);
			//save
			o1.findElement(By.id("userDataLightBox_commitBtn" )).click();                      Thread.sleep(800);

			//validation
			WebElement o5= o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertTrue(o5.getText().equals("puppy, chintu"));


		}catch(Exception e)
		{
			e.printStackTrace();                    
		}
	}
	@DataProvider(name="openusers")
	public Object[][] createuser()
	{
		return new Object[][] {{"chintu", "puppy", "puppy@gmail.com", "puppydog", "s1234", "s1234"},
			{"billi","kittu", "kittu@gmail.com", "kittubilli","12345","12345"},
			{"drink", "buttermilk", "buttermilk@gmail.com","butterdrink","123456","123456"}};
	}

	@Test(priority=6)
	public void deleteuser() 
	{
		try {
			//open chintu
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();   Thread.sleep(800);
			// dletepath
			o1.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();              Thread.sleep(800);
			TargetLocator o7=o1.switchTo();
			Alert o8=o7.alert();
			o8.accept();
			Thread.sleep(800);
			//open chintu
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();   Thread.sleep(800);
			// dletepath
			o1.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();              Thread.sleep(800);
			TargetLocator o9=o1.switchTo();
			Alert o10=o9.alert();
			o8.accept();
			Thread.sleep(800);
			//open chintu
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();   Thread.sleep(800);
			// dletepath
			o1.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();              Thread.sleep(800);
			TargetLocator o2=o1.switchTo();
			Alert o3=o2.alert();
			o8.accept();
			Thread.sleep(800);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void Logout()
	{
		try {
			o1.findElement(By.xpath("//*[@id='logoutLink']")).click(); 
			WebElement o2=o1.findElement(By.xpath("//td[@id='headerContainer']"));                      Thread.sleep(800);
			Assert.assertTrue(o2.getText().equals("Please identify yourself"));                      Thread.sleep(800);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void closeapp()
	{
		try {
			o1.close(); 

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
