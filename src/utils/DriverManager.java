package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {

	private static WebDriver chromedriver=null;
	private static WebDriver firefoxdriver=null;
	private static WebDriver iedriver=null;
	private static WebDriver safaridriver=null;

	
	static WebDriver getChromeDriver()
	{
		return chromedriver==null?new ChromeDriver():chromedriver;
	}
	
	static WebDriver getFireFoxDriver()
	{
		return firefoxdriver==null?new FirefoxDriver():firefoxdriver;
	}
	
	static WebDriver getIEDriver()
	{
		return iedriver==null?new InternetExplorerDriver():iedriver;
	}
	
	static WebDriver getSafariDriver()
	{
		return safaridriver==null?new SafariDriver():safaridriver;
	}
	
}
