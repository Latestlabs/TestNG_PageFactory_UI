package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test1 {
	
	
	@BeforeSuite
	public void SuiteLevel()
	{
		
	}
	
	
	@BeforeTest
	public void TestLeve()
	{
		
	}
	
	@BeforeClass
	public void ClassLevel()
	{
		
	}
	
	@BeforeMethod
	public void MethodLevel()
	{
		
	}
	
	
	
	
	
	
	
	

}
