
package RegisterStepDefinationPackage;

import org.openqa.selenium.By;   
import com.hirexpert.qa.base.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition extends Testbase  {
		
	//HomePage hp = new HomePage(); ==> defined in Testbase class

	@Given("^User open browser$")
	public void User_open_browser() {
		
		Testbase.initialization();
		
	}
	
	@When("^click on Register link$")
	
	public void click_on_Register_link() throws InterruptedException {
		
		Thread.sleep(3000);
	    
		hp.clickRegister();
	
	}
	
	@Then ("^verify the fields and buttons present on the register dialog box$")
	public void verify_the_fields_and_buttons_present_on_the_register_dialog_box () {
		
		hp.verifythefieldsonregisterdialogbox();
	}
	
	@When("^click on Close button$")
	public void click_on_Close_button1() throws InterruptedException {
		
		Thread.sleep(3000);
	   
		hp.Clickclosebtn();
		
    }
	

	@When("^enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter(String name, String email, String contactnumber)  {
		
		hp.enterName(name);
		hp.enterEmail(email);
		hp.enterContactNumber(contactnumber);
		
	}
	
	@When("^Select value from dropdown of \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_of(String usertype, String timezone, String country) {
	
		hp.selectUserType(usertype);
		hp.selectTimeZone(timezone);
		hp.selectCountry(country);
	}
	
	@When("^Click on Yes button of confirmation popup$")
	public void Click_on_Yes_button_of_confirmation_popup() throws InterruptedException  {
		
		Thread.sleep(3000);
	    
		hp.ClickYesbtn();
	}
	

	@When("^click on Submit button$")
	public void click_on_Submit_button() throws InterruptedException {

		
		Thread.sleep(3000);
	    
		hp.ClickSubmitbtn();
	}
	

	@Then("^User should get confirmation message and click on OK button$")
	public void user_should_get_confirmation_message_and_click_on_OK_button() throws InterruptedException {
		
		Thread.sleep(3000);
	   
        hp.Clickokbtn();
	}
	
	@Then("^enter \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter(String emailaddress, String password) throws InterruptedException  {
		
		Thread.sleep(3000);
		
		hp.enteremailaddress(emailaddress);
		hp.enterpassword(password);
	    
	}

	@Then("^click on Signin button$")
	public void click_on_Signin_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		
		hp.ClickSigninbtn();
	   
	}
	
	@When("^Close the browser$")
	public void Close_the_browser() {
		
		driver.quit();
	}
	
	}
		


		