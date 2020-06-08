package MarketplaceStepdefination;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
	
	@Before(order=4)
	public void setup() throws IOException
	{
//		baseclass.initialization();
	}
	
	boolean b;

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

	@And("^Enter All details of candidate$")
	public void enter_All_details_of_candidate() throws Throwable {
		workbenchpage.enterEmailId();
		rb = new Robot();
		rb.setAutoDelay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\TLP33\\Downloads\\CV (1).doc");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.setAutoDelay(3000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);   
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(2000);
		rb.keyPress(KeyEvent.VK_ENTER);   
		rb.setAutoDelay(3000);
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
	}

	@Then("^User should be able to add candidate$")
	public void user_should_be_able_to_add_candidate() throws Throwable {
	  driver.getPageSource().contains("can11");
	  
	  
	}
	
	@And("^logout with employer and Login with another agency$")
	public void logout_with_employer_and_Login_with_another_agency() throws Throwable {
		loginpage.logoutFromAppK();
		loginpage.loginInAppWithAgy2K();
	}
	@And("^Click on Apply button from new agency$")
	public void click_on_Apply_button_from_new_agency() throws Throwable {
		marketplacepage.clickApplybtnOfParticularJob();
	}

	@Then("^All updated terms and condition should show for new agency$")
	public void all_updated_terms_and_condition_should_show_for_agency(DataTable credentials) throws Throwable {
		marketplacepage.ValidatetheRequestDetails(credentials);
	}

	
}
