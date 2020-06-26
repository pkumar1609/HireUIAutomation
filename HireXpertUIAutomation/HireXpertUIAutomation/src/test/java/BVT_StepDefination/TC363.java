package BVT_StepDefination;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\CV (1).doc");
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
	}

	@Then("^User should be able to add candidate$")
	public void user_should_be_able_to_add_candidate() throws Throwable {
	  driver.getPageSource().contains("can11");
	}
	
	@And("^Login with another agency$")
	public void login_with_another_agency() throws Throwable {
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

	@Then("^Select a added job which is from martketplace$")
	public void select_a_added_job_which_is_from_martketplace() throws Throwable {
		select = new Select(workbenchpage.jobDropDown);
		select.selectByVisibleText(addjobpage.jobname1+" - Active" );
	
	}
	
}
