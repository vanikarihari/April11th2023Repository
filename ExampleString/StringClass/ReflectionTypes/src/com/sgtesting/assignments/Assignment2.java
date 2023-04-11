package com.sgtesting.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	public static WebDriver v1;
	public static void Launchchrome()
	{
		try {

			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			v1=new ChromeDriver(options);

		}catch(Exception L)
		{
			L.printStackTrace();
		}
	}
	public static void navigate3url()
	{
		try {

			v1.navigate().to("http://localhost:81/login.do");

		}catch(Exception n)
		{
			n.printStackTrace();
		}
	}
	public static void loginasadmin()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("admin");
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
		}catch(Exception A)
		{
			A.printStackTrace();
		}
	}
	public static void minimise()

	{
		try {
			v1.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();

		}catch(Exception m)
		{
			m.printStackTrace();
		}

	}
	public static void user1create()
	{
		try {
			v1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			v1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			v1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("TOM");
			v1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("JERRY");
			v1.findElement(By.id("userDataLightBox_emailField")).sendKeys("TOMJERRY@gmail.com");
			v1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("TOMJERRY");
			v1.findElement(By.name("password")).sendKeys("TOM123JERRY");
			v1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("TOM123JERRY"); 
			v1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(7000);

		}catch(Exception C)
		{
			C.printStackTrace();
		}
	}
	public static void Logout()
	{
		try {
			v1.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginasUSER1()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("TOMJERRY");
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("TOM123JERRY");
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			//above two lines are f
			//


		}catch(Exception A)
		{
			A.printStackTrace();
		}
	}

	public static void user1create2()
	{
		try {
			v1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			v1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			v1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("MOTU");
			v1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("PATLU");
			v1.findElement(By.id("userDataLightBox_emailField")).sendKeys("MOTUPATLU@gmail.com");
			v1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("MOTUPATLU");
			v1.findElement(By.name("password")).sendKeys("MOTU12345");
			v1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("MOTU12345"); 
			v1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(7000);

		}catch(Exception C)
		{
			C.printStackTrace();
		}
	}
	public static void loginasUSER2()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("MOTUPATLU");
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("MOTU12345");
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();

		}catch(Exception A)
		{
			A.printStackTrace();
		}
	}

	public static void user1create3()
	{
		try {
			v1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
			v1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			v1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("peppa");
			v1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("piggy");
			v1.findElement(By.id("userDataLightBox_emailField")).sendKeys("piggyharish@gmail.com");
			v1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("peppapiggy");
			v1.findElement(By.name("password")).sendKeys("piggy123");
			v1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("piggy123"); 
			v1.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(7000);

		}catch(Exception C)
		{
			C.printStackTrace();
		}
	}
	public static void loginasadminandmodifyuser123()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("admin");
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
			//minimise
			v1.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsMenuCloseId\']")).click();
			Thread.sleep(8000);
			
			
			
			
			//modify the password- open user
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/table")).click();
			// now modify password for user1
			v1.findElement(By.name("password" )).clear();			
			v1.findElement(By.name("password" )).sendKeys("Tomnibba");
			// now modify retype password for user1
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("Tomnibba");
			//save changes
			v1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(8000);
			
			
			//click user2
		  	v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();
			//clear password cell, modify password
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).clear();
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("Motu1234nibba");
			//clear retype password cell, modify password 
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("Motu1234nibba");
			//save changes
			v1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			
			
			
			//click user3
			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();
			// for understanding purpose
			v1.findElement(By.xpath("//*[@id='userDataLightBox_lastNameField']")).clear();
			v1.findElement(By.xpath("//*[@id='userDataLightBox_lastNameField']")).sendKeys("PIGGYCAR");
			Thread.sleep(2000);
			//clear password cell, modify password
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).clear();
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("peppapiggy123");
			//clear retype password cell, modify password 
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("peppapiggy123");
			//save changes
			v1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(20000);
		}catch(Exception A)
		{
			A.printStackTrace();
		}
	}
}