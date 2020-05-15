package TC363K;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilPackage.baseclass;

public class TC363 extends baseclass {
	public TC363() throws IOException 
	{
		super();
	}
	
	@Before()
	public void setup() throws IOException
	{
		baseclass.initialization();
	}
	
	boolean b;
	boolean emp;
//	@Given("^Job must be share to market place$")
//	public void job_must_be_share_to_market_place(DataTable credentials) throws Throwable {
//		
//		loginpage.loginInAppWithEmpK();
//		dashboardpage.openWorkbenchPage();
//		workbenchpage.selectJobK();
//		b= marketplacepage.sharewithmarketplacebtn.isEnabled();
//		System.out.println(b);
//		if(b==true)
//	    {
//			marketplacepage.ClickOnShareWithMarketPlace();
//			marketplacepage.EnterdeatilsOfMarketplace(credentials);
//	    }
//		else
//		{
//	    	System.out.println("selected job is displaying on employer side");
//		}
//
//}
//	@And("^Login with agency one$")
//	public void login_with_agency_one() throws InterruptedException  {
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithAgyK();
//	}
//
//	@And("^click on marketplace tab$")
//	public void click_on_marketplace_tab() throws InterruptedException  {
//		marketplacepage.ClickOnAgyMarketPlaceTab();
//	}
//
//	@And("^Click on Apply button of job$")
//	public void click_on_Apply_button_of_job() throws Throwable {
////		marketpage.clickApplybtnOfParticularJob();
//	}
//
//	@And("^login with Employer$")
//	public void login_with_Employer() throws Throwable {
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithEmpK();
//	}
//
//	@And("^Go to marketplace tab$")
//	public void go_to_marketplace_tab() throws Throwable {
//		marketplacepage.ClickOnMarketPlaceTab();
//	}
//	@Given("^Select job proposal$")
//	public void select_job_proposal() throws Throwable {
////		marketpage.selectjob();
//	}
//
//	@And("^Click on Accept and sign button from Employer$")
//	public void click_on_Accept_and_sign_button_from_Employer() throws Throwable {
////		marketpage.ClickOnReviewBtn();
////		marketpage.clickOnAcceptAndSignbtn();
//	}
//
//	@And("^Again login with agency one$")
//	public void again_login_with_agency_one() throws Throwable {
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithAgyK();
//	}
//	@And("^Click on marketplace tab for agency one$")
//	public void Click_on_marketplace_tab_for_agency_one() throws Throwable {
////		marketpage.ClickOnAgyMarketPlaceTab();
//	}
//	
//	@And("^Click on Review button$")
//	public void click_on_Review_button() throws Throwable {
////		marketpage.ClickOnReviewBtnAgy();
//	}
//	@And("^Click on Accept and sign button from agency$")
//	public void click_on_Accept_and_sign_button_from_agency() throws Throwable {
////		marketpage.clickOnAcceptAndSignbtn();
//	}
//
//	@And("^Login With employer$")
//	public void login_With_employer() throws Throwable {
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithEmpK();
//	}
//
//	@And("^Edit the job from marketplace job section$")
//	public void edit_the_job_from_marketplace_job_section(DataTable credentials) throws Throwable {
//		marketplacepage.ClickOnMarketPlaceTab();
//		marketplacepage.clickOnEditJobProposalBtn();
//		marketplacepage.EnterdeatilsOfMarketplace(credentials);
//	}
//
//	@And("^Now Again login with Agency one$")
//	public void now_Again_login_with_Agency_one()throws Throwable {
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithAgyK();
//	}
//
//	@And("^navigate to agency workbench tab$")
//	public void navigate_to_agency_marketplace_tab() throws Throwable {
//		dashboardpage.openWorkbenchPage();
//	}
//
//	@And("^Select job from jobs drop down$")
//	public void select_job_from_jobs_drop_down() throws Throwable {
//		workbenchpage.selectJobK();
//	}
//
//	@And("^Go to agreement and click on view button$")
//	public void go_to_agreement_and_click_on_view_button() throws Throwable {
//		workbenchpage.clickOnAgreementbtn();
//	}
//	
//	@Then("^all terms and condition remain same for agency one$")
//	public void all_terms_and_condition_remain_same_for_agency(DataTable credentials) throws Throwable {
//		marketplacepage.ClickOnViewAgreement();
//		marketplacepage.ValidatetheRequestDetails(credentials);
//	}
//	@And("^Click on add candidate$")
//	public void click_on_add_candidate() throws Throwable {
////		workbenchpage.clickOnAddCandidate();
//	}
//
//	@And("^Enter All details of candidate$")
//	public void enter_All_details_of_candidate() throws Throwable {
////		workbenchpage.enterEmailId();
////		common.clickOnSaveBtn();
//	}
//
//	@Then("^User should be able to add candidate$")
//	public void user_should_be_able_to_add_candidate() throws Throwable {
////	  driver.getPageSource().contains("can11");
//	}
//	@And("^Login with new agency$")
//	public void login_with_new_agency() throws Throwable {
//		loginpage.logoutFromAppK();
//		loginpage.loginInAppWithAgy2K();
//	}
//
//	@And("^Go to marketplace tab for new agency$")
//	public void go_to_marketplace_tab_for_agency_one() throws Throwable {
//		marketplacepage.ClickOnAgyMarketPlaceTab();
//	}
//
//	@And("^Click on Apply button from new agency$")
//	public void click_on_Apply_button_from_new_agency() throws Throwable {
////		marketpage.clickApplybtnOfParticularJob();
//	}
//
//	@And("^click on review$")
//	public void click_on_review() throws Throwable {
//		marketplacepage.ClickOnReviewBtnAgy();
//	}
//
//	@Then("^All updated terms and condition should show for new agency$")
//	public void all_updated_terms_and_condition_should_show_for_agency(DataTable credentials) throws Throwable {
//		marketplacepage.ValidatetheRequestDetails(credentials);
//	}

	
}
