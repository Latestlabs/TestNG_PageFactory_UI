package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.*;

public class BasePage extends Page {
	
	protected static WebElement element=null;
	private Select selement=null;
	private WebDriverWait explicit_wait= new WebDriverWait(PageManager.getDriver(),5000);


	protected void MoveBack() {
		// TODO Auto-generated method stub
		PageManager.getDriver().navigate().back();
	}
	
		
	protected void PressTab()
	{
		explicit_wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(Keys.TAB);;
		
	}

	protected void MoveForward() {
		// TODO Auto-generated method stub
		PageManager.getDriver().navigate().forward();
	}

	protected void Refresh() {
		// TODO Auto-generated method stub
		PageManager.getDriver().navigate().refresh();
	}

	protected void Click() {
		// TODO Auto-generated method stub
		explicit_wait.until(ExpectedConditions.visibilityOf(element)).click();
	}

	protected boolean SetText(String text) {
		// TODO Auto-generated method stub
		explicit_wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		return element.getText().equals(text);
	}

	protected String GetText() {
		// TODO Auto-generated method stub
		return explicit_wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}

	protected String GetPageTitle() {
		// TODO Auto-generated method stub
		return PageManager.getDriver().getTitle();
	}

	protected boolean SelectDropdownValue(String Value, String Type) {
		// TODO Auto-generated method stub
		selement=new Select(explicit_wait.until(ExpectedConditions.visibilityOf(element)));
		switch (Type)
		{
		case "ByValue":
			selement.selectByValue(Value);
			break;
		case "ByText":
			selement.selectByVisibleText(Value);
			break;
		case "ByIndex":
			selement.selectByIndex(Integer.parseInt(Value));
			break;
		}
		
		return selement.getFirstSelectedOption().getText().equals(Value);
	}

	protected ArrayList<String> GetDropdownValues() {
		// TODO Auto-generated method stub
		selement=new Select(explicit_wait.until(ExpectedConditions.visibilityOf(element)));
		
		return (ArrayList<String>) selement.getOptions().iterator();
	}

	protected LinkedHashSet<String> GetDistinctDropdownValues() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<String>(GetDropdownValues());
	}

	protected SortedSet<String> GetDropdownValues(String SortType) {
		// TODO Auto-generated method stub
		SortedSet<String> sortList=null;
		if(SortType.equals("ASC"))
		{
		sortList=new TreeSet<String>(GetDropdownValues());
		}
		else
		{
		sortList=new TreeSet<String>(Collections.reverseOrder());
		sortList.addAll(GetDropdownValues());
		}
		
		return sortList;
		}

	protected SortedSet<String> GetDistinctDropdownValues(String SortType) {
		// TODO Auto-generated method stub
		SortedSet<String> sortList=null;
		if(SortType.equals("ASC"))
		{
		sortList=new TreeSet<String>(GetDistinctDropdownValues());
		}
		else
		{
		sortList=new TreeSet<String>(Collections.reverseOrder());
		sortList.addAll(GetDistinctDropdownValues());
		}
		
		return sortList;
		
	}

	protected boolean UploadFile(String FilePath) {
		// TODO Auto-generated method stub
		explicit_wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(FilePath);
		return element.getText().equals(FilePath);
	}

	protected boolean DownloadFile(String FilePath) {
		// TODO Auto-generated method stub
		return false;
	}

	protected String GetAlertContent() {
		// TODO Auto-generated method stub
		return PageManager.getDriver().switchTo().alert().getText();
	}

	protected void SetAlertContent(String text) {
		// TODO Auto-generated method stub
		PageManager.getDriver().switchTo().alert().sendKeys(text);
	}

	protected boolean CloseAlert(String Input) {
		// TODO Auto-generated method stub
		PageManager.getDriver().switchTo().alert().dismiss();
		return PageManager.getDriver().switchTo().alert() == null;
	}

	protected boolean DoubleClick() {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean LeftClick() {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean RightClick() {
		// TODO Auto-generated method stub
		return false;
	}

	protected String MouseOverAndGetValue(String TypeOfValue) {
		// TODO Auto-generated method stub
		return null;
	}

	protected boolean MouseOverAndClick(String ClickType, String ClickValue) {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean ClosePage(String WindowId) {
		// TODO Auto-generated method stub
		return false;
	}

	protected void LoadPage(String URL) {
		// TODO Auto-generated method stub
		PageManager.getDriver().get(URL);
	}

	protected boolean PageScroll() {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean PageZoom(String Type) {
		// TODO Auto-generated method stub
		return false;
	}

	protected void Minimize() {
		// TODO Auto-generated method stub
		PageManager.getDriver().manage().window();
	}

	protected void Maximize() {
		// TODO Auto-generated method stub
		PageManager.getDriver().manage().window().maximize();
	}
	protected boolean SelectRadioButton(String Value) {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean SelectCheckBox(String Value) {
		// TODO Auto-generated method stub
		return false;
	}

	protected ArrayList<String> GetSelectedValues() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
