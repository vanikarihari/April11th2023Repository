package com.sgtesting.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptDemo2 {
    public static WebDriver o;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		getTitle();
		getURL();

	}
	private static void launchBrowser()
	{
		try
		{
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			o=new ChromeDriver(options);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURL()
	{
		try
		{
			o.navigate().to("file:///E:/Example/Seleniumnotes/Sample.html");
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void getTitle()
	{
		try
		{
			JavascriptExecutor js=(JavascriptExecutor) o;
			String n=(String) js.executeScript("var k=document.title;return k;");
			System.out.println("Title of the page: "+n);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void getURL()
	{
		try
		{
		   JavascriptExecutor js=(JavascriptExecutor) o;
		   String b=(String) js.executeScript("let f=document.URL;return f;");
		   System.out.println("url of web page "+b);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		private static void displayLinksCount()
		{
			try
			{
			   JavascriptExecutor js=(JavascriptExecutor) o;
			   String b=(String) js.executeScript("let f=document.URL;return f;");
			   System.out.println("url of web page "+b);
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
	}



}
