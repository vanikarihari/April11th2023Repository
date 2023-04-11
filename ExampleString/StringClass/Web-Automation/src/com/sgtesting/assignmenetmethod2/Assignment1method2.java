package com.sgtesting.assignmenetmethod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1method2 {
	public static WebDriver o1;
	public static ActiPage o2=null;

	public static void main(String[] args) {
		launchbrowser();
		NavigateURL();
		loginasadmin();

	}
	private static void launchbrowser()
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
	private static void NavigateURL()
	{
		try {
			o1.navigate().to("http://localhost:81/login.do");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasadmin()
	{
		try {
			o2.getusername().sendKeys("admin");
			o2.getpassword().sendKeys("manager");
			o2.getlogin().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
