package com.sgtesting.assignments;

import org.openqa.selenium.Alert;         
import org.openqa.selenium.By;         
import org.openqa.selenium.WebDriver;         
import org.openqa.selenium.WebDriver.TargetLocator;         
import org.openqa.selenium.chrome.ChromeDriver;         
import org.openqa.selenium.chrome.ChromeOptions;         

public class Assignment3 {
	public static WebDriver v1=null;         

	
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
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");         Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();       
			Thread.sleep(1000);
		}catch(Exception A)
		{
			A.printStackTrace();        
		}
	}
	public static void minimise()

	{
		try {
			v1.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();       
			Thread.sleep(1000);

		}catch(Exception m)
		{
			m.printStackTrace();        
		}

	}
	public static void usercreate123()
	{
		try {
			//user1 create
			v1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();        
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();       
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("TOM");       
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("JERRY");       
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_emailField")).sendKeys("TOMJERRY@gmail.com");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("TOMJERRY");      
			Thread.sleep(1000);
			v1.findElement(By.name("password")).sendKeys("TOM123JERRY");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("TOM123JERRY");       
			Thread.sleep(1000); 
			v1.findElement(By.id("userDataLightBox_commitBtn")).click();        
			Thread.sleep(1000);
			
			// user 2 creat
			v1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("MOTU");       
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("PATLU");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_emailField")).sendKeys("MOTUPATLU@gmail.com");   
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("MOTUPATLU");      
			Thread.sleep(1000);
			v1.findElement(By.name("password")).sendKeys("MOTU12345");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("MOTU12345");       
			Thread.sleep(1000); 
			v1.findElement(By.id("userDataLightBox_commitBtn")).click();       
			Thread.sleep(1000);
			
			// user 3 create
			v1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();         Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("peppa");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("piggy");       
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_emailField")).sendKeys("piggyharish@gmail.com");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("peppapiggy");       
			Thread.sleep(1000);
			v1.findElement(By.name("password")).sendKeys("piggy123");      
			Thread.sleep(1000);
			v1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("piggy123");        
			Thread.sleep(1000); 
			v1.findElement(By.id("userDataLightBox_commitBtn")).click();        
			Thread.sleep(1000);
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();         
		}
	}
	public static void loginasUSER1()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("TOMJERRY");       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("TOM123JERRY");         Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();      
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();     
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();       
			Thread.sleep(1000);
			//above two lines are for
		}catch(Exception A)
		{
			A.printStackTrace();        
		}
	}
	public static void loginasUSER2()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("MOTUPATLU");       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("MOTU12345");         Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();        
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();      
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();       
			Thread.sleep(1000);

		}catch(Exception A)
		{
			A.printStackTrace();         
		}
	}
	public static void loginasUSER3()       
	{
		try {
			v1.findElement(By.id("username")).sendKeys("peppapiggy");        
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("piggy123");         Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();      
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();      
			Thread.sleep(1000);

		}catch(Exception A)
		{
			A.printStackTrace();         
		}
	}

	public static void modifyuser1()
	{
		try {

			//modify the password- open user
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/table")).click();       
			Thread.sleep(1000);
			// now modify password for user1
			v1.findElement(By.name("password" )).clear();       
			Thread.sleep(1000);			
			v1.findElement(By.name("password" )).sendKeys("Tomnibba");        
			Thread.sleep(1000);
			// now modify retype password for user1
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("Tomnibba");      
			Thread.sleep(1000);
			//save changes
			v1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();       
			Thread.sleep(1000);
			
			
		}catch(Exception A)
		{
			A.printStackTrace();         
		}
	}
	public static void modifyuser2()
	{
		try {

			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();       
			Thread.sleep(1000);
			//clear password cell, modify password
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).clear();      
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("Motu1234nibba");        
			Thread.sleep(1000);
			
			//clear retype password cell, modify password 
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("Motu1234nibba");       
			Thread.sleep(1000);
			
			//save changes
			v1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();     
			Thread.sleep(1000);
			
			
		}catch(Exception A)
		{
			A.printStackTrace();         
		}
	}
	public static void modifyuser3()
	{
		try {

			//click user3
			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();     
			Thread.sleep(1000);
			// for understanding purpose
			v1.findElement(By.xpath("//*[@id='userDataLightBox_lastNameField']")).clear();      
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userDataLightBox_lastNameField']")).sendKeys("PIGGYCAR");       
			Thread.sleep(1000);
			
			//clear password cell, modify password
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).clear();       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("peppapiggy123");        
			Thread.sleep(1000);
			
			//clear retype password cell, modify password 
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();        
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("peppapiggy123");       
			Thread.sleep(1000);
			
			//save changes
			v1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();      
			Thread.sleep(1000);
		
		
			
		}catch(Exception A)
		{
			A.printStackTrace();        
		}
	}
	public static void loginasUSER11()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("TOMJERRY");      
			Thread.sleep(1000);
			
			v1.findElement(By.name("pwd")).sendKeys("Tomnibba");        
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();       
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();     
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();      
			Thread.sleep(1000);
			//above two lines are for
		}catch(Exception A)
		{
			A.printStackTrace();    
		}
	}
	public static void loginasUSER22()
	{
		try {
			v1.findElement(By.id("username")).sendKeys("MOTUPATLU");        
			Thread.sleep(1000);
			
			v1.findElement(By.name("pwd")).sendKeys("Motu1234nibba");      
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();        
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();   
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();       
			Thread.sleep(1000);

		}catch(Exception A)
		{
			A.printStackTrace();       
		}
	}
	public static void loginasUSER33()       
	{
		try {
			v1.findElement(By.id("username")).sendKeys("peppapiggy");       
			Thread.sleep(1000);
			
			v1.findElement(By.name("pwd")).sendKeys("peppapiggy123");       
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id=\'loginButton\']")).click();    
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();     
			Thread.sleep(1000);
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();     
			Thread.sleep(1000);

		}catch(Exception A)
		{
			A.printStackTrace();      
		}
	}

	
	public static void  deleteuser1()
	{
		try {
			
			v1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();      
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();      
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id='userDataLightBox_accountInformationSection']/div[2]")).click();      
			Thread.sleep(1000);
			
			TargetLocator v2=v1.switchTo();       
			Alert v3=v2.alert();        
			String v4= v3.getText();         
			System.out.println(v4);        
			v3.accept();        
			

		}catch(Exception D)
		{
			D.printStackTrace();        
		}
	}
	public static void  deleteuser2()
	{
		try {
			
			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();      
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();      
			Thread.sleep(1000);
			
			TargetLocator v2=v1.switchTo();         
			Alert v3=v2.alert();         
			String v4= v3.getText();        
			System.out.println(v4);         
			v3.accept();        
			


		}catch(Exception D)
		{
			D.printStackTrace();        
		}
	}
	public static void  deleteuser3()
	{
		try {
			
			v1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table")).click();      
			Thread.sleep(1000);
			
			v1.findElement(By.xpath("//*[@id='userDataLightBox_deleteBtn']")).click();      
			Thread.sleep(1000);
			
			TargetLocator v2=v1.switchTo();         
			Alert v3=v2.alert();         
			String v4= v3.getText();        
			System.out.println(v4);        
			v3.accept();       
			


		}catch(Exception D)
		{
			D.printStackTrace();         
		}
	}
	public static void  closeapplication()
	{
		try {
			
			v1.close();
		}catch(Exception D)
		{
			D.printStackTrace();         
		}
	}
}



