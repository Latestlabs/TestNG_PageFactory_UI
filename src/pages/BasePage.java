package pages;

import org.openqa.selenium.WebElement;

public class BasePage {
	
	protected static WebElement element=null;
	
	
	
	protected void click()
	{
		element.click();
	}
	
	protected boolean set(String textToBeSet)
	{
		element.sendKeys(textToBeSet);
		return textToBeSet.equals(element.getText());
	}
	
	protected boolean clear()
	{
		element.clear();
		return element.getText().equals("");
	}
	

}
