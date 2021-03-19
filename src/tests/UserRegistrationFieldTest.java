package tests;



import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.UserRegistrationPage;
import utils.TestHooks;
import utils.PageManager;

public class UserRegistrationFieldTest extends TestHooks{
	
	public void validateField(String FieldName,String ErrorMessage)
	{
		assertTrue(usrRegistration.IsErrorDisplayed(FieldName)==true);
		assertTrue(usrRegistration.getErrorMessage(FieldName).contains(ErrorMessage));
	}
	
	@Test
	public void VerifyUserNameCannotHaveSpecialCharacter()
	{
		
		usrRegistration.load();
		usrRegistration.setUserName("!@#$%^User");
		validateField("Username","username should not contain special characters/spaces");
	}
	
	@Test
	public void VerifyPasswordValidation()
	{
		
		usrRegistration.load();
		usrRegistration.setUserPassword("1");
		usrRegistration.setConfirmPassword("1");
		validateField("Password","password should contain minimum 8 letters");
		validateField("Confirm Password","password should contain minimum 8 letters");
	
	}
	
		
}
