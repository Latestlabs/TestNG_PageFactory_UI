package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 extends BasePage{

	/** DOM OBJECTS OF PAGE **/
	@FindBy(how=How.ID,using="username")
	WebElement element;
	
	private Page1()
	{
		
	}
	
	/** PAGE BEHAVIORS **/
	
	public void setUserName(String name)
	{
	   
		set(name);
	}
	
}
