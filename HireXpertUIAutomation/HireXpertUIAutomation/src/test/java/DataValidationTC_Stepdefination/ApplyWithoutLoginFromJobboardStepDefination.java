package DataValidationTC_Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import utilPackage.baseclass;

public class ApplyWithoutLoginFromJobboardStepDefination extends baseclass{
	
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {

		baseclass.initialization();
	}

	@Given("^Click on More Jobs link on Home Page$")
	public void click_on_More_Jobs_link_on_Home_Page() throws Throwable {
	    
		Thread.sleep(2000);
		homepage.clickonMoreJobsLink();
	}

	@Given("^Select all mandatory filters and click on search button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_all_mandatory_filters_and_click_on_search_button(String industry, String designation, String role, String experience, String city) throws Throwable {
	    
		Thread.sleep(2000);
		jobboardpage.selectIndustryType(industry);
		Thread.sleep(2000);
		jobboardpage.enterdesignation(designation);
		Thread.sleep(2000);
		jobboardpage.enterrole(role);
		Thread.sleep(2000);
		jobboardpage.enterexperience(experience);
		Thread.sleep(2000);
		jobboardpage.entercity(city);
		Thread.sleep(2000);
		jobboardpage.clickonSearchBtn();
	}


	@Given("^On the left side panel list of jobs will display with Job Details button$")
	public void on_the_left_side_panel_list_of_jobs_will_display_with_Job_Details_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Click on Job Details button of a respective job where you want to apply$")
	public void click_on_Job_Details_button_of_a_respective_job_where_you_want_to_apply() throws Throwable {
		
		Thread.sleep(3000);
		jobboardpage.clickonJobDetailsBtn();
	}

	@Given("^Full information of the job will display with Apply button$")
	public void full_information_of_the_job_will_display_with_Apply_button() throws Throwable {
	    
		
	}

	@Given("^Click on Apply Button$")
	public void click_on_Apply_Button() throws Throwable {
	    
		Thread.sleep(3000);
		jobboardpage.clickonApplyBtn();
	}

	@Given("^Dialog box window display with Login and Apply without Login button$")
	public void dialog_box_window_display_with_Login_and_Apply_without_Login_button() throws Throwable {
	    
		Thread.sleep(3000);
		jobboardpage.verifyApplyJobDialogBoxDisplayedorNot();
		
		Thread.sleep(3000);
		jobboardpage.verifyLoginBtnOnApplyJobDialogBox();
		
		Thread.sleep(3000);
		jobboardpage.verifyApplyWithoutLoginBtnOnApplyJobDialogBox();
	}

	@Given("^Click on Apply Without Login button$")
	public void click_on_Apply_Without_Login_button() throws Throwable {
	    
		Thread.sleep(3000);
		jobboardpage.clickonApplyWithoutLoginBtn();
	}

	
	@Given("^fill all the mandatory details of candidate and click on Apply button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_the_mandatory_details_of_candidate_and_click_on_Apply_button(String CandidateEmail, String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String CommunicationMode, String Experience, String CTC, String ExpectedCTC, String City, String ZipCode, String CityArea, String DateOfBirth,String ExpertiseLevel1, String ExpertiseLevel2) throws Throwable {
	    
		Thread.sleep(3000);
		jobboardpage.ApplycandidateWithoutLoginforaJobOnJobBoard(CandidateEmail, Name, ContactNumber, Designation, Gender, NoticePeriod, CommunicationMode, Experience, CTC, ExpectedCTC, City, ZipCode, CityArea, DateOfBirth);
		
		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentT();
		
		Thread.sleep(3000);
		addcandidatepage.Enterexpertilevel(ExpertiseLevel1, ExpertiseLevel2);
		
		Thread.sleep(3000);
		jobboardpage.clickonApplyBtn();
	}


	
	@Then("^successful message should display as \"([^\"]*)\" with Ok button$")
	public void successful_message_should_display_as_with_Ok_button(String ExpectedSuccessfulMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualSuccessfulMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
	    Assert.assertEquals(ExpectedSuccessfulMessage, ActualSuccessfulMessage);
	    
	    Thread.sleep(3000);
	    common.clickOnOKBtn();
	}

	@Then("^login with the same employer of Job$")
	public void login_with_the_same_employer_of_Job() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Go to job application$")
	public void go_to_job_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Select the job from drop-down$")
	public void select_the_job_from_drop_down() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Verify that candidate is displaying in the job on job application or not$")
	public void verify_that_candidate_is_displaying_in_the_job_on_job_application_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
