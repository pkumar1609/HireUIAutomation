package BVT_StepDefination;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.JobReviewPage;
import utilPackage.baseclass;

public class MarketplaceBvt extends baseclass {
	public MarketplaceBvt() throws IOException 
	{
		super();
	}
	
	@Before(order=1)
	public void setup() throws IOException
	{
//		baseclass.initialization();
//		jobreviewpage = new JobReviewPage();
	}

	boolean emp;
	boolean b;
	
	@And("^Select a added job$")
	public void select_a_added_job() throws Throwable {
		
		workbenchpage.selectJobK();	}

	@And("^Click on share job with market place$")
	public void click_on_share_job_with_market_place() throws InterruptedException   {
		marketplacepage.ClickOnShareWithMarketPlace();
	}

	@And("^change information and click on submit$")
	public void change_information_and_click_on_submit(DataTable credentials) throws InterruptedException   {
	    
		marketplacepage.EnterdeatilsOfMarketplace(credentials);
	}
 
	@And("^Click on Employer marketplace tab$")
	public void Click_on_Employer_marketplace_tab() throws Throwable {
		marketplacepage.ClickOnMarketPlaceTab();
	}

	@Then("^Job should be list out in market place page on employer side\\.$")
	public void job_should_be_list_out_in_market_place_page_on_employer_side() throws Throwable {

		boolean jobAddedOnMarketPlace=driver.findElement(By.xpath("//h5[contains(text(), 'Marketplace Jobs')]//following::a[text()='"+addjobpage.jobname+"']")) != null;
		Assert.assertEquals(jobAddedOnMarketPlace, true);
	}

	@And("^Go to agency marketplace tab$")
	public void go_to_agency_marketplace_tab() throws Throwable {
		marketplacepage.ClickOnAgyMarketPlaceTab();
		
	}

	@And("^login as a support user$")
	public void login_as_a_support_user() throws Throwable {
	  loginpage.loginInAppWithSupport();
	}

	@Then("^Logout as a support user$")
	public void logout_as_a_support_user() throws Throwable {
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(loginpage.profile));
		Action.moveToElement(loginpage.profile).click().perform();
		Thread.sleep(2000);
		loginpage.Logout.click();
	 }

	@And("^verify shared job is displaying on support login$")
	public void verify_shared_job_is_displaying_on_support_login() throws Throwable {
		jobreviewpage.verifyJobDisplay();
	}
	
	@And("^Click on approve$")
	public void click_on_approve() throws Throwable {
		jobreviewpage.clickOnApproveButton();
	}

	@Then("^All shared job by any employer should be show for all register agencies$")
	public void all_shared_job_by_any_employer_should_be_show_for_all_register_agencies() throws Throwable {
		marketplacepage.marketPlaceJobAtAgy();
	}
	
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

//	@And("^logout with agency and Login with employer$")
//	public void login_with_employer_to_whom_job_proposal_is_send() throws Throwable {
//		
//		loginpage.logoutFromAppK();
//		 loginpage.ClickOnEmployerAgencySigninLink();
//		loginpage.loginInAppWithEmpK();
//	}

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
	
	
	@And("^Edit the job from marketplace job section$")
	public void edit_the_job_from_marketplace_job_section(DataTable credentials) throws Throwable {
		marketplacepage.ClickOnMarketPlaceTab();
		marketplacepage.clickOnEditJobProposalBtn();
		marketplacepage.EnterdeatilsOfMarketplace(credentials);
	}

	@And("^Go to agreement and click on view button$")
	public void go_to_agreement_and_click_on_view_button() throws Throwable {
		workbenchpage.clickOnAgreementbtn();
	}
	
	@Then("^all terms and condition remain same for agency one$")
	public void all_terms_and_condition_remain_same_for_agency(DataTable credentials) throws Throwable {
		marketplacepage.ClickOnViewAgreement();
		marketplacepage.ValidatetheRequestDetails(credentials);
	}
	@And("^Click on add candidate$")
	public void click_on_add_candidate() throws Throwable {
		workbenchpage.clickOnAddCandidate();
	}
	
	@Then("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail, String Name, String ContactNumber, String String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
		addcandidatepage.checkCandidateALreadyPresent();
	}
	
//	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
//	public void enter_All_details_of_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21, String arg22, String arg23, String arg24, String arg25, String arg26, String arg27, String arg28, String arg29, String arg30, String arg31, String arg32, String arg33, String arg34, String arg35, String arg36, String arg37, String arg38, String arg39) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	
	@Then("^User should be able to add candidate$")
	public void user_should_be_able_to_add_candidate() throws Throwable {
	  driver.getPageSource().contains("can11");
	}
	
	@And("^Login with another agency$")
	public void login_with_another_agency() throws Throwable {
		emailaddress.sendKeys(prop.getProperty("agyid2"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		identifyUserK();
		if(dashboardpage.jobPopup != null)
		{
			common.clickOnOKBtn();
		}
	}

	
	@And("^Click on Apply button from new agency$")
	public void click_on_Apply_button_from_new_agency() throws Throwable {
		marketplacepage.clickApplybtnOfParticularJob();
	}

	@Then("^All updated terms and condition should show for new agency$")
	public void all_updated_terms_and_condition_should_show_for_agency(DataTable credentials) throws Throwable {
		marketplacepage.ValidatetheRequestDetails(credentials);
	}

	@Then("^Select a added job which is from martketplace$")
	public void select_a_added_job_which_is_from_martketplace() throws Throwable {
		select = new Select(workbenchpage.jobDropDown);
		select.selectByVisibleText(addjobpage.jobname+" - Active" );
	
	}
}
