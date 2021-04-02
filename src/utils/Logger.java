package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.ErrorManager;

import org.apache.commons.collections4.FactoryUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.apache.commons.io.FileUtils;

public class Logger {
	
private static ExtentSparkReporter SparkReporter=new ExtentSparkReporter(ConfigFileReader.rootpath+"\\test-output\\ExtentReport.html");
private static ExtentReports ExtentReporter=new ExtentReports();
private static ExtentTest Report;

static
{
	ExtentReporter.attachReporter(SparkReporter);
	
}


public static void CreateTest(String TestName)
{
	Report=ExtentReporter.createTest(TestName);
}

public static void LogStep(String StepDescription,String Status)
{
	
}


public static void TakeScreenShot(String TestName) 
	{
		File ScreenShot=((TakesScreenshot)PageManager.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ScreenShot, new File(ConfigFileReader.rootpath+"\\"+TestName+".jpg"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
