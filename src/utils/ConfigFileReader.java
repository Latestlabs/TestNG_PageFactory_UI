package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;





public class ConfigFileReader 
{

	private static Properties appConfig=null;

	
	static
	{
		try 
		{
			FileReader propertyFile= new FileReader("C:\\Users\\Jeevakumar\\eclipse-workspace\\PageFactory_Testng_TestFramework\\configs\\appconfig.properties");
			appConfig=new Properties();
			appConfig.load(propertyFile);
			
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
	}
	
	public static String getURL()
	{
		return appConfig.getProperty("Appurl");
	}
	
	
	public static String getDriverPath()
	{
		return appConfig.getProperty("Driverpath");
	}
	
	public static String getWaitTime()
	{
		return appConfig.getProperty("WAIT_TIME");
	}
	
	
	
	
}
