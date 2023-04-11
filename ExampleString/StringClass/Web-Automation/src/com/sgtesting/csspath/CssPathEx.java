package com.sgtesting.csspath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssPathEx {
	private static WebDriver o=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		//absolutecsspath();
		//UsingTagname();
		//usingtagnameandattributevalueid();
		//idattributevalue();
		//tagnamewithclassattributevalue();
		//classattributevalue();
		//tagnamewithvalueattributevalue();
		//	tagnamemultipleattribute();
		//	tagnamewithpartialattributevalue();
		tagnamewithparentelement();


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
	private static void absolutecsspath()
	{
		try {
			o.findElement(By.cssSelector("html body div form input")).sendKeys("admin");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void UsingTagname()
	{
		try {
			o.findElement(By.cssSelector("input")).sendKeys("jerry");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void usingtagnameandattributevalueid()
	{
		try {
			o.findElement(By.cssSelector("input#uid1user1name1")).sendKeys("vani");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void idattributevalue()
	{
		try {
			o.findElement(By.cssSelector("#uid1user1name1")).sendKeys("mouse");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	private static void tagnamewithclassattributevalue()
	{
		try {
			o.findElement(By.cssSelector("input.user1name1")).sendKeys("billi");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void classattributevalue()
	{
		try {
			o.findElement(By.cssSelector(".user1name1")).sendKeys("tom");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	private static void tagnamewithvalueattributevalue()
	{
		try {
			o.findElement(By.cssSelector("input[value='Submit']")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void valueattributevalue()
	{
		try {
			o.findElement(By.cssSelector("[value='Submit']")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void tagnamemultipleattribute()
	{
		try {
			o.findElement(By.cssSelector("input[id='uid1user1name1'][name='user1name1']")).sendKeys("hari");

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void tagnamewithpartialattributevalue()	{
		try {
			//startswith^
			o.findElement(By.cssSelector("input[id^='uid1']")).sendKeys("giri");
			//contains*
			o.findElement(By.cssSelector("input[name*='1word']")).sendKeys("vinay");
			//endswith
			o.findElement(By.cssSelector("input[id$='ton1']")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void tagnamewithparentelement()	{
		try {

			o.findElement(By.cssSelector("form#frm3>input")).sendKeys("giri");


		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}
}
