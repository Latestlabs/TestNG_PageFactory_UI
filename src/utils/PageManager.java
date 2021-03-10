package utils;

import org.openqa.selenium.WebDriver;
import pages.Page1;


public class PageManager {
	
	private static WebDriver driver=null;
	private static Page1 _page1=null;
	
	public static WebDriver getDriver()
	{
		if(driver!=null)
		return driver;
		else
		throw new RuntimeException("Browser is not initialized for the driver");
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
	
	public static Page1 getPage1()
	{
		return _page1==null? new Page1(driver):_page1;
	}
	

}
