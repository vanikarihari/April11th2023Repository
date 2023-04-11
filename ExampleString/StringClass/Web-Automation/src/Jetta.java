import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jetta {
	Jetta(WebDriver o3)
	{
		PageFactory.initElements(o3, this);
	}
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}

	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement signin;
	public WebElement loginaction()
	{
		return signin;
	}



	//webelements for user
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a")
	private WebElement useropenaction;
	public WebElement getuseropen()
	{
		return useropenaction;
	}


	// webelements for add user
	@FindBy(xpath="//*[@id='createUserDiv']/div")
	private WebElement adduseract;
	public WebElement getadduser()
	{
		return adduseract;
	}
	//webelement for firstname (it has id so no xpath route)
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	//webelement for lastname
	private WebElement lastName;
	public WebElement getlastname()
	{
		return lastName;
	}
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusernameforuser()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getuserDataLightBox_passwordField()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']")
	private WebElement Endcreate;
	public WebElement getendcreate()
	{
		return Endcreate;
	}

	private WebElement gettingStartedShortcutsMenuCloseId;
	public WebElement minimizeact()
	{
		return gettingStartedShortcutsMenuCloseId;
	}


	private WebElement logoutLink;
	public WebElement logoutaction()
	{
		return logoutLink;
	}


}
