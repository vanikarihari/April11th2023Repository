import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsigJetta {
     private static WebDriver a1=null;
     private static Jetta a2=null;
	public static void main(String[] args) {
		 launch();
		 navigate();
		 adminLogin();
		 minimize();
		 useropenaction();
		 adduser();
		 userdetailsfillup();
		 Logout();
		 close();
		 
	}
	private static void launch()
	{
		try {
			ChromeOptions g1=new ChromeOptions();
			g1.addArguments("--remote-allow-origins=*");
			a1=new ChromeDriver(g1);
			a2=new Jetta(a1);
		
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			a1.get("http://localhost:81/login.do");
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adminLogin()
	{
		try {
			a2.getusername().sendKeys("admin");
			Thread.sleep(1000);
			a2.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			a2.loginaction().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try {
			a2.minimizeact().click();
			Thread.sleep(1000);
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void useropenaction()
	{
		try {
			a2.getuseropen().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adduser()
	{
		try {
			a2.getadduser().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userdetailsfillup()
	{
		try {
			a2.getfirstname().sendKeys("sharwanand");
			a2.getlastname().sendKeys("teluguactor");
			a2.getemail().sendKeys("sharwa@gmail.com");
			a2.getusernameforuser().sendKeys("SHARWA");
			a2.getuserDataLightBox_passwordField().sendKeys("1234"); 
			
			a2.getpasswordCopy().sendKeys("1234");
			a2.getendcreate().click();
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private static void Logout()
	{
		try {
			a2.logoutaction().click();
			Thread.sleep(1000);
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try {
		a1.close();
		Thread.sleep(1000);
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
