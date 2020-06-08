package BVT_StepDefination;

import java.io.IOException;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class TC359 extends baseclass {
	
	public TC359() throws IOException 
	{
		super();
	}
	
	@Before(order=2)
	public void setup() throws IOException
	{
//		baseclass.initialization();
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

	@And("^Click on Apply button of job$")
	public void click_on_Apply_button_of_job() throws Throwable {
		marketplacepage.clickApplybtnOfParticularJob();
	}

	@And("^logout with agency and Login with employer$")
	public void login_with_employer_to_whom_job_proposal_is_send() throws Throwable {
		
		loginpage.logoutFromAppK();
		 loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginInAppWithEmpK();
	}

	@And("click on Employer marketplace tab$")
	public void go_to_market_place_tab() throws Throwable
	{
		marketplacepage.ClickOnMarketPlaceTab();
	}

	@And("^Select that job in filter on job proposal section$")
	public void select_that_job_in_filter_on_job_proposal_section() throws Throwable {
		marketplacepage.selectjob();
	}

	@And("^Click on reject button of that proposal$")
	public void click_on_reject_button_of_that_proposal() throws InterruptedException {
		
		marketplacepage.ClickOnRejectBtn();
		
	}

	@Then("^Job proposal area should show rejected status$")
	public void job_proposal_area_should_show_rejected_status() throws Throwable {
		marketplacepage.statusOfRequestEmp();
	}


	@Then("^status of that request should show as rejected$")
	public void status_of_that_request_should_show_as_rejected() throws Throwable {
		marketplacepage.statusOfRequestAtAgy();
	}
	
	@Then("^Click on Review button$")
	public void click_on_Review_button() throws Throwable {
		marketplacepage.ClickOnReviewBtnAgy();
	}

	@Then("^Agreement popup should show request information in read only mode$")
	public void agreement_popup_should_show_request_information_in_read_only_mode(DataTable credentials) throws Throwable {
		marketplacepage.ValidatetheRequestDetails(credentials);
	}

}
