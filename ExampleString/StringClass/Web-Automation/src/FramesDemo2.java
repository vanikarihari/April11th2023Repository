import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FramesDemo2 {
	private static WebDriver o=null;
	public static void main(String[] args) {
		launch();
		navigate();
		framesnavigate();
		close();
	}
	private static void launch()
	{
		try {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			o=new ChromeDriver(option);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			o.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void framesnavigate()
	{
		try {

			o.switchTo().frame(0);
			o.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi']")).click();
			Thread.sleep(1000); o.switchTo().defaultContent();
			o.switchTo().frame("packageFrame");
			o.findElement(By.xpath("//a[text()='BiDi']")).click(); Thread.sleep(1000);
			o.switchTo().defaultContent(); 
			Thread.sleep(2000);
			WebElement frame=o.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
			o.switchTo().frame(frame);
			String content=o.findElement(By.xpath("/html/body/main/div[2]")).getText();
			System.out.println(content);
			o.switchTo().defaultContent();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try {
			o.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
