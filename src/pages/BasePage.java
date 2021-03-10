package pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;

import org.openqa.selenium.WebElement;
import utils.*;

public class BasePage extends Page {
	
	protected static WebElement element=null;
	
	
	

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
		PageManager.getDriver().navigate().back();
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
		return true;
	}

	public ArrayList<String> GetDropdownValues() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashSet<String> GetDistinctDropdownValues() {
		// TODO Auto-generated method stub
		return null;
	}

	public SortedSet<String> GetDropdownValues(String SortType) {
		// TODO Auto-generated method stub
		return null;
	}

	public SortedSet<String> GetDistinctDropdownValues(String SortType) {
		// TODO Auto-generated method stub
		return null;
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

	public String Minimize() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Maximize() {
		// TODO Auto-generated method stub
		return null;
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
