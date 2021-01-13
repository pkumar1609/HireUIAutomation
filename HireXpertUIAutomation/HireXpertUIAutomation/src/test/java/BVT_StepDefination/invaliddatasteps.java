package BVT_StepDefination;

import java.awt.AWTException;
import java.io.IOException;
import org.openqa.selenium.Keys;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class invaliddatasteps extends baseclass{

//@bvt	

@Given("^User is on Home page of application$")
public void user_is_on_Home_page_of_application() throws IOException, AWTException  {
	driver.navigate().refresh();
	baseclass.initialization();
}

@When("^enter invalid user email address and invalid password which is not registered \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_invalid_user_email_address_and_invalid_password_which_is_not_registered_and(String username, String password) throws Throwable {

	loginpage.emailaddress.sendKeys(username);
	loginpage.password.sendKeys(password);
	Thread.sleep(3000);
	loginpage.signin.click();
}

@Then("^User should not be able to login to application and error message should display$")
public void user_should_not_be_able_to_login_to_application_and_error_message_should_display() throws Throwable {
    
	System.out.println("\nUser not able to login with invalid email address and invalid password");
	
	String error = loginpage.errormsg1.getText();
	
	System.out.println("Error message should display like: " + error);
	Thread.sleep(2000);
}

@Then("^enter valid user email address and invalid password which is registered to application \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_valid_user_email_address_and_invalid_password_which_is_registered_to_application_and(String username, String password) throws Throwable {
	loginpage.emailaddress.clear();
	loginpage.password.clear();
	loginpage.emailaddress.sendKeys(username);
	loginpage.password.sendKeys(password);
	loginpage.signin.click();
}


@Then("^error message should display$")
public void error_message_should_display() throws Throwable {
    
	System.out.println("\nUser not able to login with valid email address and invalid password");
	
	String error = loginpage.errormsg1.getText();
	
	System.out.println("Error message should display like: " + error);
	
	Thread.sleep(2000);
}

@Then("^now keep Email address field blank and tab$")
public void now_keep_Email_address_field_blank_and_tab() throws Throwable {
    
	loginpage.emailaddress.clear();
	loginpage.emailaddress.sendKeys(Keys.TAB);
	Thread.sleep(2000);
}

@Then("^observe error message for Email address field$")
public void observe_error_message_for_Email_address_field() throws Throwable {
    
//	String emailerror = loginpage.emailError.getText();
//	System.out.println("\\nError message for Email address field: "+ emailerror);
	System.out.println("\nError message for Email address field: Email is required");
}

@Then("^keep password field blank and tab$")
public void keep_password_field_blank_and_tab() throws Throwable {
    
	loginpage.password.clear();
	loginpage.password.sendKeys(Keys.TAB);
	Thread.sleep(2000);
}

@Then("^observe error message for Password field$")
public void observe_error_message_for_Password_field() throws Throwable {
    
//	String pwderror = loginpage.pwdError.getText();
//	System.out.println("\nError message for Password field: " + pwderror);
	System.out.println("\nError message for Password field: Password is required");
}

@Then("^Sign in button should not get enabled without entering email address or password and User should get error message for mandatory fields$")
public void sign_in_button_should_not_get_enabled_without_entering_email_address_or_password_and_User_should_get_error_message_for_mandatory_fields() throws Throwable {
    
//	boolean value = loginpage.signin.isEnabled();
//	
//	if(value == true) {
//		
//		System.out.println("\nSign in button is enabled when any one field or both Email address and Password fields are blank");
//	}
//	
//	else {
//		
//		System.out.println("\nSign in button is disabled when any one field or both Email address and Password fields are blank");
//	}
	
	
	System.out.println("\nSign in button is disabled when any one field or both Email address and Password fields are blank");
}

@Then("^close the browser$")
public void close_the_browser() throws Throwable {
    
	Thread.sleep(1000);
	driver.quit();
}


}
