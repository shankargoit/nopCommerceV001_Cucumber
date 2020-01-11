package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	public WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	public WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	@CacheLookup
	public WebElement btnLogin;
	
	@FindBy(linkText ="Logout")
	@CacheLookup
	public WebElement lnkLogout;
	
	public void setUserName(String userName)
	{
		txtEmail.clear();
		txtEmail.sendKeys(userName);
	}
	
	public void setPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickLogOut()
	{
		lnkLogout.click();
	}

}
