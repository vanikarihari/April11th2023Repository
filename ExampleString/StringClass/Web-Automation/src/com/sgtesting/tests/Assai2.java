package com.sgtesting.tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assai2 { 
	private static WebDriver o1=null;

	public static void main(String[] args) {
		Chromeassai2();
		Navigatetouserurl();
		loginDetailsbelw();
		minimise();
		usercreate1();
		usercreate2();
		usercreate3();
		Logout();
		loginasuser1();
		activetime();		
		Logoutuser1();
		loginasuser2();
		activetime();
		Logoutuser2();
		loginasuser3();
		activetime();
		Modifyuser3();
		Logoutuser3();
	}
	private static void Chromeassai2()
	{
		try {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			o1=new ChromeDriver(options);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigatetouserurl()
	{
		try {
			o1.get("http://localhost:81/login.do");
			Thread.sleep(1000);

		}catch(Exception n)
		{
			n.printStackTrace();

		}
	}
	private static void loginDetailsbelw()
	{
		try {
			o1.findElement(By.name("username")).sendKeys("admin");
			o1.findElement(By.name("pwd")).sendKeys("manager");
			o1.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();

		}catch(Exception l)
		{
			l.printStackTrace();
		}
	}
	private static void minimise()
	{
		try {
			o1.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();


		}catch (Exception m)
		{
			m.printStackTrace();
		}
	}
	private static void usercreate1()
	{
		try {
			o1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("vinay");
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("umapathi");
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("vinay@gmail.com");
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("vinayumapathi");
			o1.findElement(By.name("password")).sendKeys("vinayvani");
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("vinayvani"); 
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(7000);

		}catch(Exception U)
		{
			U.printStackTrace();
		}
	}

	private static void usercreate2()
	{
		try {
			o1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Shashi");
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Ravi");
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("shashi@gmail.com");
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Shashiravi");
			o1.findElement(By.name("password")).sendKeys("shashisagar");
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("shashisagar"); 
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(7000);

		}catch(Exception m)
		{
			m.printStackTrace();
		}
	}

	private static void usercreate3()
	{
		try {
			o1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("akon");
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("singer");
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("akonsinger@gmail.com");
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("akonofficial");
			o1.findElement(By.name("password")).sendKeys("akon123");
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("akon123");
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(9000);

		}catch(Exception m)
		{
			m.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			o1.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginasuser1()
	{
		try {
			o1.findElement(By.name("username")).sendKeys("vinayumapathi");
			o1.findElement(By.name("pwd")).sendKeys("vinayvani");
			o1.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();     
			Thread.sleep(5000);

		}catch(Exception l)
		{
			l.printStackTrace();
		}
	}
	private static void activetime()
	{
		try {
			o1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();     
			Thread.sleep(5000);

		}catch(Exception l)
		{
			l.printStackTrace();
		}
	}
	
	
	
	
	private static void Logoutuser1()
	{
		try {
			o1.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginasuser2()
	{
		try {
			o1.findElement(By.name("username")).sendKeys("Shashiravi");
			o1.findElement(By.name("pwd")).sendKeys("shashisagar");
			o1.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();  

		}catch(Exception l)
		{
			l.printStackTrace();
		}
	}
	private static void Logoutuser2()
	{
		try {
			o1.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void loginasuser3()
	{
		try {
			o1.findElement(By.name("username")).sendKeys("akonofficial");
			o1.findElement(By.name("pwd")).sendKeys("akon123");
			o1.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click(); 
			Thread.sleep(7000);

		}catch(Exception l)
		{
			l.printStackTrace();
		}
	}

	private static void Modifyuser3()
	{
		try {
			
			
			
			
			
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			
			o1.findElement(By.id("userDataLightBox_firstNameField")).clear();
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("AKONSINGERAMERICA");
		
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).clear();

			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("AKON1@23");
			
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("AKON1@23");
			
			
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(7000);


		}catch(Exception p)
		{
			p.printStackTrace();
		}
	}
	private static void Logoutuser3()
	{
		try {
			o1.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
