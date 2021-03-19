package tests;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.UserRegistrationPage;
import utils.Hooks;
import utils.PageManager;

public class UserRegistrationFieldTest extends Hooks{
	
	UserRegistrationPage usrRegistration=PageManager.getUserRegistrationPage();
	
	@Test
	public void VerifyUserNameCannotHaveSpecialCharacter()
	{
		
		usrRegistration.load();
		usrRegistration.setUserName("!@#$%^User");
		assertEquals(usrRegistration.isError("Username"), true, "Error not displayed");
		assertEquals(usrRegistration.validateErrorMessage("Username","	username should not contain special characters/spaces"), true, "Error message not displayed");
	}
	
	@Test
	public void VerifyPasswordValidation()
	{
		
		usrRegistration.load();
		usrRegistration.setUserPassword("1");
		usrRegistration.setConfirmPassword("1");
		assertEquals(usrRegistration.isError("Password"), true, "Error not displayed");
		assertEquals(usrRegistration.validateErrorMessage("Password","password should contain minimum 8 letters"), true, "Error message not displayed");
		assertEquals(usrRegistration.isError("Confirm Password"), true, "Error not displayed");
		assertEquals(usrRegistration.validateErrorMessage("Confirm Password","password should contain minimum 8 letters"), true, "Error message not displayed");
	}
	
		
}
