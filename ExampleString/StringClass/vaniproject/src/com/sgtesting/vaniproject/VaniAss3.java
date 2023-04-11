package com.sgtesting.vaniproject;

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

public class VaniAss3 {
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
	@Test(priority=5,dataProvider="userdetails")
	private void createuser(String a,String b,String c,String d,String e,String f)
	{
		try {

			o.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();                  
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(a);                 
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(b);                
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_emailField")).sendKeys(c);                
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_usernameField")).sendKeys(d);                 
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_passwordField")).sendKeys(e);                 
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(f);                 
			Thread.sleep(1000);
			o.findElement(By.id("userDataLightBox_commitBtn")).click();               
			Thread.sleep(1000);
			//validation
			WebElement ele=o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertTrue(ele.getText().equals("bat, cricket"));
			Thread.sleep(1000);
		}catch(Exception g)
		{
			g.printStackTrace();
		}
	}
	@Test(priority=6,dataProvider="modifyname")
	private void modifyuser(String n)
	{
		try {
			o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']")).clear();
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']")).sendKeys(n);
			Thread.sleep(1000);
			o.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);
			WebElement ele=o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertFalse(ele.getText().equals("Jerry, Tom"));
			Thread.sleep(1000);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void deleteuser() 
	{
		try 
		{ //open chintu
			o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(800); // dletepath
			o.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(800);
			TargetLocator o7=o.switchTo(); 
			Alert o8=o7.alert();
			o8.accept();
			Thread.sleep(800); 
			WebElement ele=o.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]"));
			Assert.assertTrue(ele.getText().equals("System, Administrator"));

		}catch(Exception e) 
		{ 
			e.printStackTrace();
		}
	}

	@Test(priority=8) 
	private void Logout()
	{ 
		try {
			o.findElement(By.id("logoutLink")).click(); 
			Thread.sleep(2000);

		}catch(Exception e)
		{ 
			e.printStackTrace();
		}

	}

	@Test(priority=9) 
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
	@DataProvider(name="userdetails")
	public Object[][] getdetails()
	{
		return new Object[][] {{"cricket","Bat","batandball@gmail.com","ball","bat123","bat123"}};
	}
	@DataProvider(name="modifyname")
	public Object[][] getmodify()
	{
		return new Object[][] {{"ball"}};
	}

}
