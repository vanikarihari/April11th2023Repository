package com.sgtesting.prototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AssignmentPrototype1 {
	public static WebDriver h;
    @Test(priority=1)
    private void launchbrowser()
	{
		try {
			ChromeOptions o1=new ChromeOptions();
			o1.addArguments("--remote-allow-origins=*");
			h=new ChromeDriver(o1);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
    @Test(priority=2,dataProvider="url")
    private void Navigate(String url)
	{
		try {
			
			h.navigate().to(url);
			WebElement ele=h.findElement(By.xpath("//td[text()='Please identify yourself']"));
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
			
			h.findElement(By.name("username")).sendKeys(un);
			Thread.sleep(2000);
			h.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(2000);
			h.findElement(By.xpath("//*[@id='loginButton']/div")).click();	
			Thread.sleep(2000);
			//validation
			WebElement ele=h.findElement(By.xpath("//td[text()='Enter Time-Track']"));
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
			h.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
			WebElement ele=h.findElement(By.xpath("//div[text()='Best Way to Get Started']"));
			Assert.assertFalse(ele.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
    @Test(priority=5)
    private void Logout()
	{
		try {
			h.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
    @Test(priority=6)
    private void CloseAppln()
	{
		try {
			//h.close();
			
		}catch(Exception e)
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
}
