package TC361K;

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
	
	@Before()
	public void setup() throws IOException
	{
		baseclass.initialization();
	}
	
	boolean b;
	@Given("^Job must be share to market place$")
	public void job_must_be_share_to_market_place(DataTable credentials) throws Throwable {
		loginpage.loginInAppWithEmpK();
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectJobK();
		b=marketplacepage.sharewithmarketplacebtn.isEnabled();
		if(b==true)
	    {
			marketplacepage.ClickOnShareWithMarketPlace();
			marketplacepage.EnterdeatilsOfMarketplace(credentials);
	    }
		else
		{
	    	System.out.println("selected job is displaying on employer side");
		}
	}

	@And("^Login with agency$")
	public void login_with_agency() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithAgyK();
	}

	@And("^click on marketplace tab$")
	public void click_on_marketplace_tab() throws Throwable {
		marketplacepage.ClickOnAgyMarketPlaceTab();
	}

	@And("^Click on Apply button of job$")
	public void click_on_Apply_button_of_job() throws Throwable {
		marketplacepage.clickApplybtnOfParticularJob();
	}

	@And("^Login with employer to whom job proposal is send$")
	public void login_with_employer_to_whom_job_proposal_is_send() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithEmpK();
	}

	@And("^Go to market place tab$")
	public void go_to_market_place_tab() throws Throwable {
		marketplacepage.ClickOnMarketPlaceTab();
	}
	
	@And("^Select that job in filter on job proposal section$")
	public void select_that_job_in_filter_on_job_proposal_section() throws Throwable {
		marketplacepage.selectjob();
	}

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

	@And("^Now again login with same agency$")
	public void now_again_login_with_same_agency() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithAgyK();
	}

	@And("^Go to market place tab on AgencyProfile$")
	public void go_to_market_place_tab_on_AgencyProfile() throws InterruptedException  {
		marketplacepage.ClickOnAgyMarketPlaceTab();
	}

	@Then("^status should display as employer signed$")
	public void status_should_display_as_employer_signed() throws Throwable {
		marketplacepage.employerSignedstatusAgy();
	}

}
