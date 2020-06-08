package BVT_StepDefination;

import java.io.IOException;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilPackage.baseclass;

public class TC361 extends baseclass {
	public TC361() throws IOException 
	{
		super();
	}
	
	@Before(order=3)
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}
	
	boolean b;
	
	@And("^Click on review button of that proposal$")
	public void click_on_review_button_of_that_proposal() throws Throwable {
		
		marketplacepage.ClickOnReviewBtn();
	}

	@And("^Now click on accept and sign button$")
	public void now_click_on_accept_and_sign_button() throws Throwable {
		marketplacepage.clickOnAcceptAndSignbtn();
	}

	@Then("^the status should be change as Employer signed$")
	public void the_status_should_be_change_as_Employer_signed() throws Throwable {
		marketplacepage.employerSignedstatus();
	}

	@Then("^status should display as employer signed$")
	public void status_should_display_as_employer_signed() throws Throwable {
		marketplacepage.employerSignedstatusAgy();
	}

}
