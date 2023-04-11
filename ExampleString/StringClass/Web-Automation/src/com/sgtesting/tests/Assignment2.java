package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	private static WebDriver o1=null;

	public static void main(String[] args) {
		specialassai2();
		navigate();
		adminuserlogin();
		minimise();
		createuser1();
		logout();
		loginuser1();
		toskipvedio();
		createuser2();
		logout();
		loginuser2();
		toskipvedio();
		createuser3();
		logout();		
		loginuser3();
		toskipvedio();
		logout();
		loginuser2();
		modif_user3();
		logout();
		loginuser3new();
		logout();
		loginuser1();
		modif_user2();
		logout();
		loginuser2new();
		logout();
		adminuserlogin();
		modif_user1();
		logout();
		loginuser1new();
		logout();
		loginuser2new();
		Deleteuser3();
		logout();
		loginuser1new();
		Deleteuser2();
		logout();
		adminuserlogin();
		Deleteuser1();
		logout();
		close_application();



	}
	private static void specialassai2()
	{
		try {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			o1=new ChromeDriver(options);


		}catch(Exception E)
		{
			E.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			o1.get("http://localhost:81/login.do");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void adminuserlogin()
	{
		try {
			o1.findElement(By.id("username")).sendKeys("admin");                  Thread.sleep(700);
			o1.findElement(By.name("pwd")).sendKeys("manager");                  Thread.sleep(700);
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(700);

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}

	private static void minimise()
	{
		try {
			o1.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();                  Thread.sleep(700);

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void createuser1()
	{
		try {
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(700);
			//click add user
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();                  Thread.sleep(700);
			//first name
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("shimoga");                  Thread.sleep(700);
			//last
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("sagar");                  Thread.sleep(700);
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("sagarshimoga@gmail.com");                  Thread.sleep(700);
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("SAGARSHIMOGGA");                  Thread.sleep(700);
			//password
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("SHISAGAR");                  Thread.sleep(700);
			//retype password
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("SHISAGAR");                  Thread.sleep(700);
			//last create
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();                  Thread.sleep(700);


		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void logout()
	{
		try {
			o1.findElement(By.xpath("//*[@id='logoutLink']")).click();                  Thread.sleep(700);			
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void loginuser1()
	{
		try {
			o1.findElement(By.xpath("//*[@id='username']")).sendKeys("SAGARSHIMOGGA");                  Thread.sleep(700);
			o1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("SHISAGAR");                  Thread.sleep(700);	
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(700);			
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	} private static void toskipvedio()
	{
		try {
			o1.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();                  Thread.sleep(700);




		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}





	private static void createuser2()
	{
		try {
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(700);
			//click add user
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();                  Thread.sleep(700);
			//first name
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("raichuru");                  Thread.sleep(700);
			//last
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("sindhanur");                  Thread.sleep(700);
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("sindanuru@gmail.com");                  Thread.sleep(700);
			//Username
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("RAICHURSIND");                  Thread.sleep(700);
			//password
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("RAICHUR123");                  Thread.sleep(700);
			//retype password
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("RAICHUR123");                  Thread.sleep(700);
			//last create
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();                  Thread.sleep(700);


		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void loginuser2()
	{
		try {
			o1.findElement(By.xpath("//*[@id='username']")).sendKeys("RAICHURSIND");                  Thread.sleep(700);
			o1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("RAICHUR123");                  Thread.sleep(700);	
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(700);			
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void createuser3()
	{
		try {
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(700);
			//click add user
			o1.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();                  Thread.sleep(700);
			//first name
			o1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("benaluru");                  Thread.sleep(700);
			//last
			o1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("rural");                  Thread.sleep(700);
			o1.findElement(By.id("userDataLightBox_emailField")).sendKeys("bengrural@gmail.com");                  Thread.sleep(700);
			//Username
			o1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("BENGARURAL");                  Thread.sleep(700);
			//password
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("BENGALORE12");                  Thread.sleep(700);
			//retype password
			o1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("BENGALORE12");                  Thread.sleep(700);
			//last create
			o1.findElement(By.id("userDataLightBox_commitBtn")).click();                  Thread.sleep(700);


		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void loginuser3()
	{
		try {
			o1.findElement(By.xpath("//*[@id='username']")).sendKeys("BENGARURAL");                  Thread.sleep(700);
			o1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("BENGALORE12");                  Thread.sleep(700);	
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(700);			
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void modif_user3()
	{
		try {
			//useropen
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(700);
			//click on user 3
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();                  Thread.sleep(700);
			//clear old pw
			o1.findElement(By.id("userDataLightBox_passwordField")).clear();                  Thread.sleep(700);

			//clear old retype pw
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();                  Thread.sleep(700);
			//modify 
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");                  Thread.sleep(700);
			// modify retype pw
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("12345");                  Thread.sleep(700);
			// save changes
			o1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();                  Thread.sleep(700);				

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void loginuser3new()
	{
		try {
			o1.findElement(By.xpath("//*[@id='username']")).sendKeys("BENGARURAL");                  Thread.sleep(700);
			o1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("12345");                  Thread.sleep(700);	
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(700);	
			Thread.sleep(700);                  Thread.sleep(700);
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}

	private static void modif_user2()
	{
		try {
			//user open
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(700);
			//click on user 2
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]")).click();                  Thread.sleep(700);
			//clear old pw	
			o1.findElement(By.id("userDataLightBox_passwordField")).clear();                  Thread.sleep(700);

			//clear old retype pw
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();                  Thread.sleep(700);
			//modify 
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");                  Thread.sleep(700);
			// modify retype pw
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("1234");                  Thread.sleep(700);
			// save changes
			o1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();                  Thread.sleep(700);				

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void loginuser2new()
	{
		try {
			o1.findElement(By.xpath("//*[@id='username']")).sendKeys("RAICHURSIND");                  Thread.sleep(700);
			o1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("1234");                  Thread.sleep(700);	
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(700);	
			Thread.sleep(700);                  Thread.sleep(700);
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void modif_user1()
	{
		try {
			//user open
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(700);
			//click on user 2
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();                  Thread.sleep(700);
			//clear old pw


			o1.findElement(By.id("userDataLightBox_passwordField")).clear();                  Thread.sleep(700);

			//clear old retype pw
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).clear();                  Thread.sleep(700);
			//modify  pw
			o1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123");                  Thread.sleep(700);
			// modify retype pw
			o1.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("123");                  Thread.sleep(700);
			// save changes
			o1.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']")).click();                  Thread.sleep(700);				

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void Deleteuser3()
	{
		try {
			//user open
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='userDataLightBox_accountInformationSection']/div[2]")).click(); Thread.sleep(500);

			TargetLocator o2=o1.switchTo();
			Alert o3=o2.alert();
			String o4= o3.getText();
			System.out.println(o4);
			o3.accept();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	
	
	private static void loginuser1new()
	{
		try {
			o1.findElement(By.xpath("//*[@id='username']")).sendKeys("SAGARSHIMOGGA");                  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("123");                  Thread.sleep(500);	
			o1.findElement(By.xpath("//*[@id='loginButton']/div")).click();                  Thread.sleep(500);	
			Thread.sleep(500);                  Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void Deleteuser2()
	{
		try {
			//user open
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")).click();  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='userDataLightBox_accountInformationSection']/div[2]")).click(); Thread.sleep(500);

			TargetLocator o2=o1.switchTo();
			Alert o3=o2.alert();
			String o4= o3.getText();
			System.out.println(o4);
			o3.accept();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	
	
	
	
	
	private static void Deleteuser1()
	{
		try {
			//user open
			o1.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();                  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]")).click();  Thread.sleep(500);
			o1.findElement(By.xpath("//*[@id='userDataLightBox_accountInformationSection']/div[2]")).click(); Thread.sleep(500);

			TargetLocator o2=o1.switchTo();
			Alert o3=o2.alert();
			String o4= o3.getText();
			System.out.println(o4);
			o3.accept();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}
	private static void close_application()
	{
		try {
			o1.close();

		}catch(Exception e)
		{
			e.printStackTrace();   
		}
	}









}