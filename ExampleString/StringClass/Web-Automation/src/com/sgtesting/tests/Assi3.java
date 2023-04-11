package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assi3 {
	private static WebDriver h=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateurl();
		//credentials();
		//minimizewindow();
		//createuser1();
		//Logout();
		//Loginasuser1();
		//minimizewindow2();
		//createuser2();
		//Logout();
		//Loginasuser2();
		//minimizewindow2();
		//createuser3();;
		//Logout();
		//Loginasuser3();
		//minimizewindow2();
		//Logout();
		Loginasuser1();
		minimizewindow2();
		
		
		

	}
	private static void LaunchBrowser()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			h=new ChromeDriver(option);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateurl()
	{
		try {
			h.navigate().to("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void credentials()
	{
		try {
			h.findElement(By.name("username")).sendKeys("admin");
			h.findElement(By.name("pwd")).sendKeys("manager");
			h.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizewindow()
	{
		try {
			h.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1()
	{
		try {
			h.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			h.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			h.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Harish");
			h.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Lokare");
			h.findElement(By.id("userDataLightBox_emailField")).sendKeys("harishlokare@gmail.com");
			h.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Hari");
			h.findElement(By.id("userDataLightBox_passwordField")).sendKeys("7019151815");
			h.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("7019151815");
			h.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			h.findElement(By.xpath("//*[@id='logoutLink']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginasuser1()
	{
		try {
			h.findElement(By.name("username")).sendKeys("Hari");
			h.findElement(By.name("pwd")).sendKeys("7019151815");
			h.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizewindow2()
	{
		try {
			h.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try {
			h.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			h.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			h.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Agastya");
			h.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Pramod");
			h.findElement(By.id("userDataLightBox_emailField")).sendKeys("agastyap@gmail.com");
			h.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Rocky");
			h.findElement(By.id("userDataLightBox_passwordField")).sendKeys("9611334940");
			h.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("9611334940");
			h.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginasuser2()
	{
		try {
			h.findElement(By.name("username")).sendKeys("Rocky");
			h.findElement(By.name("pwd")).sendKeys("9611334940");
			h.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try {
			h.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			h.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			h.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Vedaryan");
			h.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("ganapathi");
			h.findElement(By.id("userDataLightBox_emailField")).sendKeys("vedaryang@gmail.com");
			h.findElement(By.id("userDataLightBox_usernameField")).sendKeys("pushpa");
			h.findElement(By.id("userDataLightBox_passwordField")).sendKeys("9449210812");
			h.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("9449210812");
			h.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Loginasuser3()
	{
		try {
			h.findElement(By.name("username")).sendKeys("pushpa");
			h.findElement(By.name("pwd")).sendKeys("9449210812");
			h.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   
}
