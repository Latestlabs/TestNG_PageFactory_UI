package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.ConfigFileReader;
import utils.PageManager;

public class UserRegistrationPage extends BasePage{
	

	/** DOM OBJECTS OF PAGE **/
	
	String URL=ConfigFileReader.getURL();
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Title')]/following-sibling::td/select")
	WebElement s_Title;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Username')]/following-sibling::td/input")
	WebElement t_UserName;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Password')]/following-sibling::td/input")
	WebElement t_Password;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Confirm Password')]/following-sibling::td/input")
	WebElement t_ConfirmPassword;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Email id')]/following-sibling::td/input")
	WebElement t_EmailId;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Confirm Email id')]/following-sibling::td/input")
	WebElement t_ConfirmEmailId;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Type of User')]/following-sibling::td/select")
	WebElement s_UserType;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Date of Birth')]/following-sibling::td/input")
	WebElement d_DateOfBirth;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Gender')]/following-sibling::td/select")
	WebElement s_Gender;
	
	@FindBy(how=How.XPATH,using="//input[@value='Register']")
	WebElement b_Register;
	
	@FindBy(how=How.XPATH,using="//input[@value='View Users']")
	WebElement b_ViewUsers;	
	
	@FindBy(how=How.XPATH,using="//input[@value='Auto-Fill data']")
	WebElement b_AutoFillData;
	
	@FindBy(how=How.XPATH,using="//input[@value='Delete']")
	WebElement b_DeleteRegisteredUsers;
	
	public UserRegistrationPage()
	{
		
		PageFactory.initElements(PageManager.getDriver(), this);
	
	}
	
	/** PAGE BEHAVIORS **/
	
	public void load()
	{
	   this.NavigateTo(URL);
	}
	
	
	public void setTitle(String title)
	{
		element=this.s_Title;
		this.SelectDropdownValue(title,"ByText");
		this.PressTab();
	}
	
	public void setUserName(String name)
	{
		element=this.t_UserName;
		this.SetText(name);
		this.PressTab();
	}
	
	public void setUserPassword(String password)
	{
		element=this.t_Password;
		this.SetText(password);
		this.PressTab();
	}
	
	public void setConfirmPassword(String password)
	{
		element=this.t_ConfirmPassword;
		this.SetText(password);
		this.PressTab();
	}
	
	public void setEmailId(String mailId)
	{
		element=this.t_EmailId;
		this.SetText(mailId);
		this.PressTab();
	}
	
	public void setConfirmEmailId(String mailId)
	{
		element=this.t_ConfirmEmailId;
		this.SetText(mailId);
		this.PressTab();
	}
	
	public void setUserType(String UserType)
	{
		element=this.s_UserType;
		this.SelectDropdownValue(UserType,"ByText");
		this.PressTab();
	}
	
	public void setDate(String Date)
	{
		element=this.d_DateOfBirth;
		this.SetText(Date);
		this.PressTab();
	}
	
	public void setGender(String Gender)
	{
		element=this.s_Gender;
		this.SelectDropdownValue(Gender,"ByIndex");
		this.PressTab();
	}
	
	public void ClickRegister()
	{
		element=this.b_Register;
		this.Click();
	}
	
	public void ClickViewUsers()
	{
		element=this.b_ViewUsers;
		this.Click();
	}
	
	public void ClickAutoFillData()
	{
		element=this.b_AutoFillData;
		this.Click();
	}
	
	public void ClickDelete()
	{
		element=this.b_DeleteRegisteredUsers;
		this.Click();
	}
	
	public boolean validateErrorMessage(String FieldName,String ErrorMessage)
	{
		WebElement Error=PageManager.getDriver().findElement(By.xpath("//td[contains(text(),'"+ FieldName +"')]/following-sibling::td[3]/span"));
		boolean iserror=false;
		if(Error.isDisplayed())
		{
		   if(Error.getText()==ErrorMessage)
		    {
		    	iserror=true;
		    }
		}
		else
		{
			throw new RuntimeException("No Error Message validation");
		}
		
		return iserror;
	}
	
	public boolean isError(String FieldName)
	{
		WebElement Error=PageManager.getDriver().findElement(By.xpath("//td[contains(text(),'"+ FieldName +"')]/following-sibling::td/i"));
		boolean iserror=false;
		
		   if(Error.getAttribute("style")=="color:red;")
		    {
		    	iserror=true;
		    }
	
		
		return iserror;
	}
	
}
