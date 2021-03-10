package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends BasePage{

	/** DOM OBJECTS OF PAGE **/
	
	@FindBy(how=How.ID,using="username")
	WebElement t_username;
	
	@FindBy(how=How.ID,using="password")
	WebElement t_password;
	
	@FindBy(how=How.ID,using="Login")
	WebElement b_Login;
	
	
	public Page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/** PAGE BEHAVIORS **/
	
	private void setUserName(String name)
	{
		element=t_username;
		this.SetText(name);
	}
	
	private void setUserPassword(String password)
	{
		element=t_password;
		this.SetText(password);
	}
	
	private void clickLogin()
	{   
		element=b_Login;
		this.Click();
	}
		
	public void Login(String username,String password)
	{
		setUserName(username);
		setUserPassword(password);
		clickLogin();
	}
	
}
