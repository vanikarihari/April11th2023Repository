package com.sgtesting.vaniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VaniClass {
	public static  WebDriver o1;
	@Test(priority=1)
	private void Launch()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			o1=new ChromeDriver(option);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2,dataProvider="Navigate")
	private void Navigate(String URL)
	{
		try {
			o1.get(URL);
			WebElement o2=o1.findElement(By.id("headerContainer"));
			Assert.assertTrue(o2.getText().equals("Please identify yourself"));

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3, dataProvider="adminlogin")

	private void adminlogin(String UN, String PWD)
	{
		try {
			
			o1.findElement(By.name("username")).sendKeys(UN);
			
			o1.findElement(By.name("pwd")).sendKeys(PWD);
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			WebElement o3=o1.findElement(By.xpath("//td[text()='Enter Time-Track']"));Thread.sleep(2000);
			Assert.assertTrue(o3.getText().equals("Enter Time-Track"));
			Thread.sleep(2000);
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private void minimise()
	{
		try {
			WebElement o4=o1.findElement(By.xpath("//div[text()='Best Way to Get Started']"));
			Thread.sleep(2000);

			o1.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(2000);
			
			Assert.assertFalse(o4.isDisplayed());
			Thread.sleep(2000);
					

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	private void logout()
	{
		try {
			o1.findElement(By.xpath("//*[@id='logoutLink']")).click();

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private void closeap()
	{
		try {
			o1.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@DataProvider(name="Navigate")
	public Object[][] geturl()
	{
		return new Object[][] {{"http://localhost:81/login.do"}};
	}


	@DataProvider(name="adminlogin")
	public Object[][] getlogin()
	{
		return new Object[][] {{"admin","manager"}};
	}


}
