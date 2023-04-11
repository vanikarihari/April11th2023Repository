package com.sgtesting.assignmenetmethod2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {

	public ActiPage(WebDriver h1)
	{
		PageFactory.initElements(h1, this);
	}
	//WebElements for username textfields
	private static WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	//WebElements for password textfields
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	//WebElements for Login Button
	@FindBy(xpath="//div[text()='Login']")
	private WebElement oLogin;
	public WebElement getlogin()
	{
		return oLogin;
	}
	
	
	
	
	//WebElements for flyout window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getflyoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//WebElements for Logout link
	@FindBy(linkText="logout")
	private WebElement oLogout;	
	public WebElement grtLogout()
	{
		return oLogout;
	}

}
