package tests;



import static org.testng.Assert.assertEquals;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.UserRegistrationPage;
import utils.TestHooks;
import utils.Logger;
import utils.PageManager;


@Listeners(utils.TestListener.class)	

public class UserRegistrationFieldTest extends TestHooks{
	
	public void validateField(String FieldName,String ErrorMessage)
	{
		assertTrue(usrRegistration.IsErrorDisplayed(FieldName)==true);
		assertTrue(usrRegistration.getErrorMessage(FieldName).contains(ErrorMessage));
	}
	
	public void validateAlert(String Message)
	{
		assertTrue(usrRegistration.getAlertMessage().contains(Message));
	}
	
	@Test
	public void VerifyUserNameCannotHaveSpecialCharacter()
	{
		
		usrRegistration.load();
		usrRegistration.setUserName("!@#$%^User");
		validateField("Username","username should not contain special characters/spaces");
		
	}
	
	@Test
	public void VerifyPasswordFieldMinimum8Letters()
	{
		
		usrRegistration.load();
		usrRegistration.setUserPassword("1");
		usrRegistration.setConfirmPassword("1");
		validateField("Password","password should contain minimum 8 letters");
		validateField("Confirm Password","password should contain minimum 8 letters");
	
	}
	
	@Test
	public void VerifyPasswordAtleastUpperCase()
	{
		
		usrRegistration.load();
		usrRegistration.setUserPassword("123password");
		usrRegistration.setConfirmPassword("123password");
		validateField("Password","password should contain atleast one uppercase letter");
		validateField("Confirm Password","password should contain atleast one uppercase letter");
	
	}	
	
	@Test
	public void VerifyPasswordAtleastOneNumber()
	{
		
		usrRegistration.load();
		usrRegistration.setUserPassword("Password");
		usrRegistration.setConfirmPassword("Password");
		validateField("Password","password should contain atleast one number");
		validateField("Confirm Password","password should contain atleast one number");
	
	}	
	
	@Test
	public void VerifyEmailIdCannotBeBlank()
	{
		
		usrRegistration.load();
		usrRegistration.setEmailId("");
		usrRegistration.setConfirmEmailId("");
		validateField("Email id","Email id cannot be empty");
		validateField("Confirm Email id","Email id cannot be empty");
	
	}	
	
	
	@Test
	public void VerifyRegisteredUsersAreDeleted()
	{
		usrRegistration.load();
		usrRegistration.ClickDelete();
		validateAlert("All users deleted successfully.");
		usrRegistration.AcceptAlert();
	}

}
