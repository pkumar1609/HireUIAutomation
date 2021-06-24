package BVT_StepDefination;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
	
	@When("^user enters valid credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_enters_valid_credentials(String Username, String Password) throws Throwable {
		loginpage.loginIn(Username, Password);
	}
	
	
	
	//add this in login&Register StepDef file
	@When("^Vendor user enters valid credentials \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void vendor_user_enters_valid_credentials(String Username, String Password, String VendorOrg, String VendorOrgWebsite, String City, String VendorAddress) throws Throwable {

	  loginpage.loginInAsVendor(Username, Password);
				
		try {
			  WebElement updateProfileDialogTitle = driver.findElement(By.xpath("//h5[contains(text(),'Update Profile')]"));
			  if(updateProfileDialogTitle.isDisplayed())
			  {
				driver.findElement(By.xpath("//input[@placeholder='Enter Organization']")).sendKeys(VendorOrg);
				driver.findElement(By.xpath("//input[@placeholder='Enter Website']")).sendKeys(VendorOrgWebsite);
				driver.findElement(By.xpath("//input[@placeholder='Enter City' and @formcontrolname='CityId']")).sendKeys(City);
				driver.findElement(By.xpath("//textarea[@id='agencyaddress' and @placeholder='Enter Address']")).sendKeys(VendorAddress);
				common.ClickSumbit();
			  }
		    }
		catch(NoSuchElementException e)
		{
			dashboardpage.openDashboardPage();
		}
	}

	
	@Then("^login with registered agency$")
	public void login_with_registered_agency() throws Throwable {
		registerpage.enterEmployerEmailandPassword();
		registerpage.ClickSigninbtn();
	}
	
	@And("^Select a added job$")
	public void select_a_added_job() throws Throwable {	
		workbenchpage.selectJobK();
		}

	@And("^Click on share job with market place$")
	public void click_on_share_job_with_market_place() throws InterruptedException   {
		marketplacepage.ClickOnShareWithMarketPlace();
	}

	@And("^change information and click on submit$")
	public void change_information_and_click_on_submit(DataTable credentials) throws InterruptedException   {
	    
		marketplacepage.EnterdeatilsOfMarketplace(credentials);
	}
	
	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
	   common.clickOnSearchBtn();
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
		explicitwait.until(ExpectedConditions.elementToBeClickable(loginpage.myAccount));
		Action.moveToElement(loginpage.myAccount).click().perform();
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

//	@Then("^If popup proposal limit popup displayed then repeat all above step with new agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void if_popup_proposal_limit_popup_displayed_then_repeat_all_above_step_with_new_agency(String Address, String AgencyOrganizationName,String AgencyWebsite,String AgencyCity) throws Throwable {
//		if(marketplacepage.proposalLimitPopup.size()>0)
//		{
//			common.clickOnOKBtn();
//			loginpage.logoutFromAppK();
//			registerpage.clickRegister();
//			registerpage.registerUser();
//			registerpage.clickLogin();
//			registerpage.clickEmployerAgencySignInlink();
//			registerpage.enterEmployerEmailandPassword();
//			registerpage.ClickSigninbtn();
//			updateprofilepopuppage.UpdateProfile(Address, OrganizationName, Website, City);
//			common.ClickSumbit();
//			marketplacepage.ClickOnAgyMarketPlaceTab();
//			marketplacepage.clickApplybtnOfParticularJob();
//		}
//	}
	
	@Then("^login with new agency credentials$")
	public void login_with_new_agency_credentials() throws Throwable {
		registerpage.enterEmployerEmailandPassword();
	}
	
	@And("click on Employer marketplace tab$")
	public void go_to_market_place_tab() throws Throwable
	{
		marketplacepage.ClickOnMarketPlaceTab();
	}

	@And("^Select that job in filter on job proposal section$")
	public void select_that_job_in_filter_on_job_proposal_section() throws Throwable {
		Thread.sleep(2000);
		marketplacepage.jobDropdown.click();
		WebElement element = driver.findElement(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		explicitwait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		common.clickOnSearchBtn();
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
	
	@When("^Enter basic details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_basic_details_of_candidate(String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}
		
	@Then("^User should be able to add candidate$")
	public void user_should_be_able_to_add_candidate() throws Throwable {
	  driver.getPageSource().contains("can11");
	}
	
	@And("^Login with another agency$")
	public void login_with_another_agency() throws Throwable {
		loginpage.emailaddress.sendKeys("pagy1@gmail.com");
		loginpage.password.sendKeys("12345");
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();",loginpage.signin);
		loginpage.identifyUserK();
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
	
	@Then("^delete the added job$")
	public void delete_the_added_job() throws Throwable {
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectJobK();
		workbenchpage.clickOnCloseJobButton();
	}
	
//	@After("@market")
//	public void Endtest() throws InterruptedException
//	{		
//		loginpage.logoutFromAppK();
//		loginpage.ClickOnEmployerAgencySigninLink();
//		loginpage.loginIn("pagy@gmail.com", "12345");
//		dashboardpage.openWorkbenchPage();
//		Thread.sleep(4000);
//		workbenchpage.jobDropDown.click();
//		List<WebElement> element = driver.findElements(By.xpath("//option[contains(text(),'"+addjobpage.jobname+"')]"));
//		if(element.size()>0)
//		{
//			Thread.sleep(2000);
//			element.get(0).click();
//			workbenchpage.clickOnCloseJobButton();
//		}
//		loginpage.logoutFromAppK();
//		loginpage.ClickOnEmployerAgencySigninLink();
//		loginpage.loginIn("pemp@gmail.com", "12345");
//		Thread.sleep(4000);
//		workbenchpage.jobDropDown.click();
//		if(element.size()>0)
//		{
//			Thread.sleep(2000);
//			element.get(0).click();
//			workbenchpage.clickOnCloseJobButton();
//		}
//	}
	
	
}
