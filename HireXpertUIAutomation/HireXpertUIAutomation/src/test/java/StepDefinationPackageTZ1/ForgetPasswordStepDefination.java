package StepDefinationPackageTZ1;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class ForgetPasswordStepDefination extends baseclass {

	@When("^Click on forgot password link$")
	public void click_on_forgot_password_link() throws Throwable {
		
		Thread.sleep(3000);
	  
		forgetpasswordpage.ForgotPasswordLink.click();
	}
	
	@When("^Enter an email id which is not registered and click on submit button \"([^\"]*)\"$")
	public void enter_an_email_id_which_is_not_registered_and_click_on_submit_button(String emailid) throws Throwable {
	    
		Thread.sleep(1000);
		
		forgetpasswordpage.EnterNonregisteredEmailid(emailid);
		
		common.ClickSumbit();
		
	}

	@Then("^Verify that user get an error message as \"([^\"]*)\" or not$")
	public void verify_that_user_get_an_error_message_as_or_not(String ExpectedErrorMessage) throws Throwable {
	   
		String ActualErrorMessage = driver.findElement(By.cssSelector("p.error.mb-1.pl-1.pr-1")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);	
		
		Thread.sleep(1000);
		
		
	}


}
