package com.sgtesting.prototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentPrototype4 {
	public static WebDriver o;	
	@Test(priority=1)
	private void launchbrowser()
	{
		try {
			ChromeOptions o1=new ChromeOptions();
			o1.addArguments("--remote-allow-origins=*");
			o=new ChromeDriver(o1);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=2,dataProvider="url")
	private void Navigate(String url)
	{
		try {

			o.navigate().to(url);
			WebElement ele=o.findElement(By.xpath("//td[text()='Please identify yourself']"));
			//validation
			Assert.assertTrue(ele.getText().equals("Please identify yourself"));
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=3,dataProvider="Logindata")
	private void adminLogin(String un,String pwd)
	{
		try {

			o.findElement(By.name("username")).sendKeys(un);
			Thread.sleep(2000);
			o.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id='loginButton']/div")).click();	
			Thread.sleep(2000);
			//validation
			WebElement ele=o.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(ele.getText().equals("Enter Time-Track"));
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=4)
	private void Minimize()
	{
		try {
			o.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
			WebElement ele=o.findElement(By.xpath("//div[text()='Best Way to Get Started']"));
			Assert.assertFalse(ele.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5,dataProvider="customer")
	private void createcustomer(String h,String g)
	{
		try {
			o.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys(h);
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys(g);
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();
			Thread.sleep(1000);	
			WebElement ele=o.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]"));
			Assert.assertTrue(ele.getText().equals("Harish"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority =6)
	private void deletecustomer()
	{
		try {
			o.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(1000);
			WebElement ele=o.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]"));
			Assert.assertFalse(ele.getText().equals("Harish"));

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7) 
	private void Logout()
	{ 
		try {
			o.findElement(By.id("logoutLink")).click(); 
			Thread.sleep(2000);
			WebElement ele=o.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(ele.getText().equals("Please identify yourself"));
			Thread.sleep(2000);

		}catch(Exception e)
		{ 
			e.printStackTrace();
		}

	}

	@Test(priority=8) 
	private void CloseAppln()
	{
		try { 
			o.close();

		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}

	}
	@DataProvider(name="Logindata")
	public Object[][] getLogin()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="url")
	public Object[][] geturl()
	{
		return new Object[][] {{"http://localhost:81/login.do"}};
	}
	@DataProvider(name="customer")
	public Object[][] getcustomer()
	{
		return new Object[][] {{"Harish","Harish is a trusted customer"}};
	}
}
