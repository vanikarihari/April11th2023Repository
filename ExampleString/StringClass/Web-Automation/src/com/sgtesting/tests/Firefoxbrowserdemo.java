package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowserdemo {
	public static WebDriver oBrowser= null;


	public static void main(String[] args) {
		LaunchBrowser();
		navigateURL();
		CloseApp();

	}
	public static void LaunchBrowser()
	{
		try
		{
			oBrowser=new FirefoxDriver();

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
