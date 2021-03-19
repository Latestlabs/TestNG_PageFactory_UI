package utils;

import org.openqa.selenium.WebDriver;
import pages.UserRegistrationPage;


public class PageManager {
	
	private static WebDriver driver=null;
	private static UserRegistrationPage _page1=null;
	
	public static WebDriver getDriver()
	{
		if(driver!=null)
		return driver;
		else
		return driver=BrowserManager.getChromeDriver();
	}
		
	public static WebDriver getDriver(Browsers BrowserName)
	{
		switch(BrowserName)
		{
			case CHROME:
				driver=BrowserManager.getChromeDriver();
			break;
			
			case FIREFOX:
				driver=BrowserManager.getFireFoxDriver();
			break;
			
			case IE:
				driver=BrowserManager.getIEDriver();
			break;
			
			case SAFARI:
				driver=BrowserManager.getSafariDriver();
			break;
			default:
			   throw new RuntimeException("Browser not found and automation cannot continue");
		}
		
		return driver;
	}
	
	public static UserRegistrationPage getUserRegistrationPage()
	{
		return _page1==null? new UserRegistrationPage():_page1;
	}
	

}
