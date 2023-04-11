package com.sgtesting.vaniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class vanivalidation2 {
	public static WebDriver c1;
	@Test(priority=1)
	public void launch()
	{
		try {
			ChromeOptions options  = new ChromeOptions();     Thread.sleep(800);                  
			options.addArguments("--remote-allow-origins=*");     Thread.sleep(800);                      
			c1=  new ChromeDriver(options);     Thread.sleep(800);                      
		}catch(Exception e )
		{
			e.printStackTrace();                           
		}
	}
	@Test(priority=2, dataProvider="Navigate")
	public void navigate(String z)
	{
		try {
			c1.get("http://localhost:81/login.do");     Thread.sleep(800);

			WebElement o1= c1.findElement(By.xpath(z));     Thread.sleep(800);
			Assert.assertTrue(o1.getText().equals("Please identify yourself"));     Thread.sleep(800);

		}catch(Exception e)
		{
			e.printStackTrace();     
		}
	}
	@DataProvider(name="Navigate")
	public Object [][] navigateget()

	{
		return new Object[][] {{"//*[@id='headerContainer']"}};     
	}


	@Test(priority=3, dataProvider="adlogin")
	public void login(String x, String y)
	{
		try {
			c1.findElement(By.xpath("//*[@id='username']")).sendKeys(x);     Thread.sleep(800);
			c1.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys(y);     Thread.sleep(800);
			c1.findElement(By.xpath("//*[@id='loginButton']/div")).click();     Thread.sleep(800);

			WebElement o3= c1.findElement(By.xpath("//*[@id='enterTTMainContent']/table[1]/tbody/tr[1]/td[1]/div/table/tbody/tr/td"));     Thread.sleep(800);
			Assert.assertTrue(o3.getText().equals("Enter Time-Track"));     Thread.sleep(800);

		}catch(Exception e )
		{
			e.printStackTrace();                           
		}
	}
	@DataProvider(name="adlogin")
	public Object[][] createlogin()
	{
		return new Object[][] {{"admin", "manager"}};     

	}


	@Test(priority=4)
	public void minimise()
	{
		try {
			WebElement o4= c1.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuWrapper']/div[1]/div[1]/div[2]"));    
			Thread.sleep(1000);
			c1.findElement(By.xpath("//*[@id='gettingStartedShortcutsMenuCloseId']")).click();    
			Thread.sleep(1000);
			Assert.assertFalse(o4.isDisplayed());    

		}catch(Exception e )
		{
			e.printStackTrace();                        
		}
	}
	@Test(priority=5, dataProvider="customercreate")
	public void customer(String a, String b )
	{
		try {
			//task
			c1.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();     Thread.sleep(800);
			
			//add new
			c1.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();     Thread.sleep(800);
			//new customer
			c1.findElement(By.xpath("/html/body/div[14]/div[1]")).click();     Thread.sleep(800); 
			//customername
			c1.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys(a);     Thread.sleep(800);
			//description
			c1.findElement(By.xpath("//*[@id='customerLightBox_descriptionField']")).sendKeys(b);     Thread.sleep(800);
			//end 
			c1.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']")).click();     Thread.sleep(800);
			//validation
			WebElement o5= c1.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[2]"));
		Assert.assertTrue(o5.getText().equals("billimeow"));
		}catch(Exception e )
		{
			e.printStackTrace();                        
		}
	}
	@DataProvider (name="customercreate")
	public Object[][] createget()
	{
		return new Object[][]{{"billimeow","billi is a cute cat. cats are mamals which feed their babies and lay babies just like humans" }};    
	}
	@Test(priority=6)
	public void deletecustomer()
	{
		try {
			//setting
			c1.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();     Thread.sleep(800);
			//actions
			c1.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();     Thread.sleep(800);
			//delete 
			c1.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();     Thread.sleep(800);
			
			c1.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();     Thread.sleep(800);
			
		
		}catch(Exception e )
		{
			e.printStackTrace();                      
		}
	}
	@Test(priority=7)
	public void Logout()
	{
		try {
			c1.findElement(By.xpath("//*[@id='logoutLink']")).click();     Thread.sleep(800); 
			//webelemnt
			WebElement o7=c1.findElement(By.xpath("//td[@id='headerContainer']"));     Thread.sleep(800);                      Thread.sleep(800);     Thread.sleep(800);
			Assert.assertTrue(o7.getText().equals("Please identify yourself"));     Thread.sleep(800);                      Thread.sleep(800);     Thread.sleep(800);
			c1.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();    
		}
	}
	
}



