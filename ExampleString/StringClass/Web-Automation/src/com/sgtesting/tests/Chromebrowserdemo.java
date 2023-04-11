package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Chromebrowserdemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		LaunchBrowser();
		navigateURL();
		CloseApp();
	}
	private static void LaunchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			oBrowser=new ChromeDriver(options);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CloseApp()
	{
		try
		{
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
}

