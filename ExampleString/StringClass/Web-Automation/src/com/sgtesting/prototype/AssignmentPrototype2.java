package com.sgtesting.prototype;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentPrototype2 {
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
	@Test(priority=5,dataProvider="userdetails")
	private void createuser(String a,String b,String c,String d,String e,String f)
	{
		try {

			h.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  
			Thread.sleep(1000);
			h.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();                  
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(a);                 
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(b);                
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_emailField")).sendKeys(c);                
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_usernameField")).sendKeys(d);                 
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_passwordField")).sendKeys(e);                 
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(f);                 
			Thread.sleep(1000);
			h.findElement(By.id("userDataLightBox_commitBtn")).click();               
			Thread.sleep(1000);
			//validation
			WebElement ele=h.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertTrue(ele.getText().equals("Lokare, Harish"));
			Thread.sleep(1000);
		}catch(Exception g)
		{
			g.printStackTrace();
		}
	}

	@Test(priority=6)
	public void deleteuser() 
	{
		try 
		{ //open chintu
			h.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(800); // dletepath
			h.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(800);
			TargetLocator o7=h.switchTo(); 
			Alert o8=o7.alert();
			o8.accept();
			Thread.sleep(800); 
			WebElement ele=h.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertTrue(ele.getText().equals("System, Administrator"));

		}catch(Exception e) 
		{ 
			e.printStackTrace();
		}
	}

	@Test(priority=7) 
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

	@Test(priority=8) 
	private void CloseAppln()
	{
		try { 
			h.close();

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
	@DataProvider(name="userdetails")
	public Object[][] getdetails()
	{
		return new Object[][] {{"Harish","Lokare","lokarehari@gmail.com","harish","lokare123","lokare123"}};
	}
}
