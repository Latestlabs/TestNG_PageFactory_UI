package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.*;

public class BasePage extends Page {
	
	protected static WebElement element=null;
	private Select selement=null;


	protected void MoveBack() {
		// TODO Auto-generated method stub
		PageManager.getDriver().navigate().back();
	}

	public void MoveForward() {
		// TODO Auto-generated method stub
		PageManager.getDriver().navigate().forward();
	}

	public void Refresh() {
		// TODO Auto-generated method stub
		PageManager.getDriver().navigate().refresh();
	}

	public void Click() {
		// TODO Auto-generated method stub
		element.click();
	}

	public boolean SetText(String text) {
		// TODO Auto-generated method stub
		element.sendKeys(text);
		return element.getText().equals(text);
	}

	public String GetText() {
		// TODO Auto-generated method stub
		return element.getText();
	}

	public String GetPageTitle() {
		// TODO Auto-generated method stub
		return PageManager.getDriver().getTitle();
	}

	public boolean SelectDropdownValue(String Value, String Type) {
		// TODO Auto-generated method stub
		selement=new Select(element);
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

	public ArrayList<String> GetDropdownValues() {
		// TODO Auto-generated method stub
		selement=new Select(element);
		
		return (ArrayList<String>) selement.getOptions().iterator();
	}

	public LinkedHashSet<String> GetDistinctDropdownValues() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<String>(GetDropdownValues());
	}

	public SortedSet<String> GetDropdownValues(String SortType) {
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

	public SortedSet<String> GetDistinctDropdownValues(String SortType) {
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

	public boolean UploadFile(String FilePath) {
		// TODO Auto-generated method stub
		element.sendKeys(FilePath);
		return element.getText().equals(FilePath);
	}

	public boolean DownloadFile(String FilePath) {
		// TODO Auto-generated method stub
		return false;
	}

	public String GetAlertContent() {
		// TODO Auto-generated method stub
		return PageManager.getDriver().switchTo().alert().getText();
	}

	public void SetAlertContent(String text) {
		// TODO Auto-generated method stub
		PageManager.getDriver().switchTo().alert().sendKeys(text);
	}

	public boolean CloseAlert(String Input) {
		// TODO Auto-generated method stub
		PageManager.getDriver().switchTo().alert().dismiss();
		return !(PageManager.getDriver().switchTo().alert() != null);
	}

	public boolean DoubleClick() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean LeftClick() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean RightClick() {
		// TODO Auto-generated method stub
		return false;
	}

	public String MouseOverAndGetValue(String TypeOfValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean MouseOverAndClick(String ClickType, String ClickValue) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ClosePage(String WindowId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean LoadPage(String URL) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean PageScroll() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean PageZoom(String Type) {
		// TODO Auto-generated method stub
		return false;
	}

	public void Minimize() {
		// TODO Auto-generated method stub
		PageManager.getDriver().manage().window();
	}

	public void Maximize() {
		// TODO Auto-generated method stub
		PageManager.getDriver().manage().window().maximize();
	}
	public boolean SelectRadioButton(String Value) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean SelectCheckBox(String Value) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<String> GetSelectedValues() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
