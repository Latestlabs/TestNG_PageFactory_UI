package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserManager {

	private static WebDriver chromedriver=null;
	private static WebDriver firefoxdriver=null;
	private static WebDriver iedriver=null;
	private static WebDriver safaridriver=null;

	
	static WebDriver getChromeDriver() 
	{
		
		System.setProperty("webdriver.chrome.driver", ConfigFileReader.getDriverPath()+"\\chromedriver.exe");
		return chromedriver==null?new ChromeDriver():chromedriver;
	}
	
	static WebDriver getFireFoxDriver()
	{
		System.setProperty("webdriver.firefox.driver", ConfigFileReader.getDriverPath()+"\\firefoxdriver.exe");
		return firefoxdriver==null?new FirefoxDriver():firefoxdriver;
	}
	
	static WebDriver getIEDriver()
	{
		System.setProperty("webdriver.ie.driver", ConfigFileReader.getDriverPath()+"\\iedriver.exe");
		return iedriver==null?new InternetExplorerDriver():iedriver;
	}
	
	static WebDriver getSafariDriver()
	{
		System.setProperty("webdriver.safari.driver", ConfigFileReader.getDriverPath()+"\\safaridriver.exe");
		return safaridriver==null?new SafariDriver():safaridriver;
	}
	
	
	
}
