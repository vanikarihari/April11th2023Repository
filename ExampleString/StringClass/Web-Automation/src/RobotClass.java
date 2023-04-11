
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotClass {
	public static WebDriver oBrowser;

	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		login();
		minimizeFlyOutWindow();
		importTasks();

	}
	private static void launchBrowser()
	{
		try
		{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		oBrowser=new ChromeDriver(options);
	    }catch (Exception e)
	     {
		    e.printStackTrace();
	     }
    } 
	private static void navigateURL()
	{
		try
		{
		  oBrowser.navigate().to("http://localhost:81/login.do");
		  Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
   
	private static void login()
	{
		try
		{
		  oBrowser.findElement(By.id("username")).sendKeys("admin");
		  oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
		  oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		  Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void importTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("dropzoneClickableArea")).click();
			Thread.sleep(2000);
			String filepath="E:\\Example\\Sample.csv";
			copyFilePath(filepath);
			Thread.sleep(2000);
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void copyFilePath(String filepath)
	{
		StringSelection stringSelection=new StringSelection(filepath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	/*
	 * Toolkit toolkit=Toolkit.getDefaultToolkit();
	 *  Clipboard clipboard=toolkit.getSystemClipboard();
	 * clipboard.setContents(stringSelection, null);
	 */
	}
	}