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
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void BeforeTestLevel()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BeforeClassLevel()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethodLevel()
	{
		System.out.println("Before Method");
	}
	
	
	
	@AfterSuite
	public void AfterSuiteLevel()
	{
		System.out.println("After Suite");
	}
	
	
	@AfterTest
	public void AfterTestLevel()
	{
		System.out.println("After Test");
	}
	
	@AfterClass
	public void AfterClassLevel()
	{
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void AfterMethodLevel()
	{
		System.out.println("After Method");
	}
}
