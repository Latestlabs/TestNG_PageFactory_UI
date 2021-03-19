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
		return driver=DriverManager.getChromeDriver();
	}
		
	public static WebDriver getDriver(Browsers BrowserName)
	{
		switch(BrowserName)
		{
			case CHROME:
				driver=DriverManager.getChromeDriver();
			break;
			
			case FIREFOX:
				driver=DriverManager.getFireFoxDriver();
			break;
			
			case IE:
				driver=DriverManager.getIEDriver();
			break;
			
			case SAFARI:
				driver=DriverManager.getSafariDriver();
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
