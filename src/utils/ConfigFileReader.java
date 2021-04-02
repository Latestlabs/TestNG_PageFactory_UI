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
	public static String rootpath;
	
	static
	{
		try 
		{
			
			rootpath=new File(".").getCanonicalPath();
			FileReader propertyFile= new FileReader(rootpath+"\\configs\\appconfig.properties");
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
		String filepath="";
		try {
		filepath=new File(".").getCanonicalPath()+appConfig.getProperty("Driverpath");
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		return filepath;
	}
	
	public static int getWaitTime()
	{
		return Integer.parseInt(appConfig.getProperty("Waittime"));
	}
	
	
	
	
}
