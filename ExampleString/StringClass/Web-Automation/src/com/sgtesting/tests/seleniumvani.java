package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumvani {
	private static WebDriver o1=null;

	public static void main(String[] args) {
		ChromeOpen();
		Navigationurl();
		loginDetails();
		minimise();
		usercreate();
		userscreate();
		//usersdelete();	
		//Logout();
		//loginDetails();
		//	minimise();
		Modifyuser();

	}
	private static void ChromeOpen()
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
	private static void Navigationurl()
	{
		try {
			o1.get("http://localhost:81/login.do");
			Thread.sleep(1000);

		}catch(Exception n)
		{
			n.printStackTrace();

		}
	}
	private static void loginDetails()
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
	private static void usercreate()
	{
		try {
			o1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Vani");
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Shivamurthy");
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("vanishivamurthy@gmail.com");
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("vanimurthy");
			o1.findElement(By.name("password")).sendKeys("vani123shiva");
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("vani123shiva");
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(1000);

		}catch(Exception U)
		{
			U.printStackTrace();
		}
	}
	private static void userscreate()
	{
		try {
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Agastya");
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("rathod");
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("Agastya@gmail.com");
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Agastyarathd");
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Agastya123");
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Agastya123");
			o1.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']")).click();


			Thread.sleep(1000);

		}catch(Exception u1)
		{
			u1.printStackTrace();
		}
	}


	private static void usersdelete()
	{
		try {
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			o1.findElement(By.xpath("//*[@id='userDataLightBox_accountInformationSection']/div[2]")).click();
			TargetLocator o2=o1.switchTo();
			Alert o3=o2.alert();
			String o4= o3.getText();
			System.out.println(o4);
			o3.accept();


		}catch(Exception D)
		{
			D.printStackTrace();
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
	private static void Modifyuser()
	{
		try {
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			o1.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']")).clear();
			o1.findElement(By.xpath("//*[@id='userDataLightBox_firstNameField']")).sendKeys("bharati");
			
			o1.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).clear();

			o1.findElement(By.xpath("//*[@id='userDataLightBox_emailField']")).sendKeys("bharati@gmail.com");
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();
			
			
		}catch(Exception p)
		{
			p.printStackTrace();
		}
	}



}

