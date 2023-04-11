package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		NavigateURL();
		//Closeapp();

	}
	private static void LaunchBrowser()
	{
		try {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		oBrowser=new ChromeDriver(options);
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
