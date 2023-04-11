package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDrive2 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		NavigateURL();
		Closeapp();

	}
	private static void LaunchBrowser()
	{
		try {
		oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void NavigateURL()
	{
		try {
		     oBrowser.get("http://localhost:81/login.do");
		     Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	private static void Closeapp()
	{
		try {
		     oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
