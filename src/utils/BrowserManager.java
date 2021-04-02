package utils;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

class BrowserManager {

	private static WebDriver chromedriver=null;
	private static WebDriver firefoxdriver=null;
	private static WebDriver iedriver=null;
	private static WebDriver safaridriver=null;

	
	protected static void autoDownloadChromeDriver()

	{
		 try {
			 
				
				BufferedInputStream in=new BufferedInputStream(new URL("https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_win32.zip").openStream());
			    FileOutputStream fo= new FileOutputStream(ConfigFileReader.rootpath+"\\drivers\\chromedriver_win32.zip");
			    byte db[]=new byte[1024];
			    int bytesRead;
			    while ((bytesRead = in.read(db, 0, 1024)) != -1) {
			        fo.write(db, 0, bytesRead);
			    }
			   
			   
			   
			   } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
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
