package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Hooks {

	@BeforeSuite
	public void BeforeSuiteLevel()
	{
		
	}
	
	
	@BeforeTest
	public void BeforeTestLevel()
	{
		
	}
	
	@BeforeClass
	public void BeforeClassLevel()
	{
		
	}
	
	@BeforeMethod
	public void BeforeMethodLevel()
	{
		
	}
	
	
	
	@AfterSuite
	public void AfterSuiteLevel()
	{
		
	}
	
	
	@AfterTest
	public void AfterTestLevel()
	{
		
	}
	
	@AfterClass
	public void AfterClassLevel()
	{
		
	}
	
	@AfterMethod
	public void AfterMethodLevel()
	{
		
	}
}
