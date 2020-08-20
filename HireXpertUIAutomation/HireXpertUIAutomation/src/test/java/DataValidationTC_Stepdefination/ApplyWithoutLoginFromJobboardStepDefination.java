package DataValidationTC_Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilPackage.baseclass;

public class ApplyWithoutLoginFromJobboardStepDefination extends baseclass{
	
	@Given("^Open browser$")
	public void open_browser() throws Throwable {

		Thread.sleep(5000);
		baseclass.initialization();
	}

	@Given("^click on Login link$")
	public void click_on_Login_link() throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.clickLogin();
	}

	@Given("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String emailaddress, String password) throws Throwable {

		Thread.sleep(4000);
		
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);

		loginpage.emailaddress.sendKeys(emailaddress);
			loginpage.password.sendKeys(password);		
			loginpage.signin.click();
	}

	@Given("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {

		Thread.sleep(3000);
		addjobpage.addJobforEmployerandAgency(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
		
	}

	@Given("^logout from application$")
	public void logout_from_application() throws Throwable {

		Thread.sleep(3000);
		workbenchpage.ClickonLogout();

	}

	@Then("^login with the same user \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_the_same_user_and(String emailaddress, String password) throws Throwable {

         Thread.sleep(4000);
		
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);

		loginpage.emailaddress.sendKeys(emailaddress);
			loginpage.password.sendKeys(password);		
			loginpage.signin.click();
	}


	@Given("^Login as employer \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_as_employer(String EmployerEmailAddress, String Password) throws Throwable {
	 	  
		    Thread.sleep(3000);
			registerpage.clickLogin();
			Thread.sleep(3000);
			registerpage.clickEmployerAgencySignInlink();
			Thread.sleep(3000);
			registerpage.Emailaddress.sendKeys(EmployerEmailAddress);
		    registerpage.Password.sendKeys(Password);
		    Thread.sleep(3000);
		    registerpage.Signinbtn.click();
	}

	
	@Given("^Verify the details on Job card displayed on left side pannel \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void verify_the_details_on_Job_card_displayed_on_left_side_pannel(String Title, String OrganizationName, String Location, String City, String Country, String MinExp, String MaxExp, String Budget, String Industry, String Designation) throws Throwable {


		Thread.sleep(3000);
		jobboardpage.verifyTheJobDataOnJobBoard(Title, OrganizationName, Location, City, Country, MinExp, MaxExp, Budget, Industry, Designation);
		
	}

	@Given("^Verify all the details of the job after clicking on Job Details button$")
	public void verify_all_the_details_of_the_job_after_clicking_on_Job_Details_button() throws Throwable {


		
	}


	@Given("^Go to Workbench$")
	public void go_to_Workbench() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();

	}

	@Given("^Add a new Job as employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_a_new_Job_as_employer(String JobTitle, String JobDesignation, String Industry, String JobRole, String Location, String budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
	    
		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.filljobDetails(JobTitle, JobDesignation, Industry, JobRole, Location, budget, MinExp, MaxExp, NoOfInterviews);
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill2();
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();
		
		Thread.sleep(3000);
		
		common.submitbtn.click();

	}

	@Given("^Verify that job is added or not$")
	public void verify_that_job_is_added_or_not() throws Throwable {
	    
	}

	@Given("^Select the same job from job drop down$")
	public void select_the_same_job_from_job_drop_down() throws Throwable {
	   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='Reload Job']")).click();
		Thread.sleep(3000);
        workbenchpage.selectjobT();
	}

	@Given("^logout as employer$")
	public void logout_as_employer() throws Throwable {
	   
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
	}

	@Given("^login as support user and approve the job$")
	public void login_as_support_user_and_approve_the_job() throws Throwable {
		
		Thread.sleep(3000);
		registerpage.loginlink.click();
		Thread.sleep(3000);
		registerpage.EmployerAgencySignInlink.click();
		Thread.sleep(3000);
		loginpage.loginInAppWithSupport();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'Job Review')]")).click();
	    Thread.sleep(3000);
	    Select se = new Select(driver.findElement(By.xpath("//select[@id='jobDropdown']")));
	    se.selectByVisibleText("Review");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@title='Search']")).click();
	    Thread.sleep(3000);
//	    String ApproveBtn="(//a[contains(text(),'"+addjobpage.jobname+"')]//following::button[text()='Approve'])[1]";	
	    driver.findElement(By.xpath("//button[@title='Approve']")).click();
	    Thread.sleep(3000);
	    common.clickOnOKBtn();
		
	}

	@Given("^logout as support user$")
	public void logout_as_support_user() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		
	}

	@Given("^Click on More Jobs link on Home Page$")
	public void click_on_More_Jobs_link_on_Home_Page() throws Throwable {
	    
		Thread.sleep(2000);
		homepage.clickonMoreJobsLink();
	}

	@Given("^Select all mandatory filters and click on search button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_all_mandatory_filters_and_click_on_search_button(String industry, String jobdesignation, String role, String experience, String city) throws Throwable {
	    
		Thread.sleep(2000);
		jobboardpage.selectIndustryType(industry);
		Thread.sleep(2000);
		jobboardpage.enterdesignation(jobdesignation);
		Thread.sleep(2000);
		jobboardpage.enterrole(role);
		Thread.sleep(2000);
		jobboardpage.enterexperience(experience);
		Thread.sleep(2000);
		jobboardpage.entercity(city);
		Thread.sleep(2000);
		jobboardpage.clickonSearchBtn();
	}


	@Given("^Click on Job Details button of a respective job where you want to apply$")
	public void click_on_Job_Details_button_of_a_respective_job_where_you_want_to_apply() throws Throwable {
		
		Thread.sleep(3000);
		jobboardpage.clickonJobDetailsBtn();
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
	public void fill_all_the_mandatory_details_of_candidate_and_click_on_Apply_button(String CandidateEmail, String Name, String ContactNumber, String designation, String DateOfBirth, String Gender, String NoticePeriod, String Experience, String CTC, String ExpectedCTC, String City, String CityArea, String ZipCode, String CommunicationMode, String ExpertiseLevel1, String ExpertiseLevel2) throws Throwable {
	    
		Thread.sleep(3000);
		jobboardpage.ApplycandidateWithoutLoginforaJobOnJobBoard(CandidateEmail, Name, ContactNumber, designation, DateOfBirth, Gender, NoticePeriod, Experience, CTC, ExpectedCTC, City, CityArea, ZipCode, CommunicationMode);
		
		Thread.sleep(3000);
		addcandidatepage.uploadResumeDocumentT();
		
		Thread.sleep(3000);
		addcandidatepage.Enterexpertilevel(ExpertiseLevel1, ExpertiseLevel2);
		
		Thread.sleep(3000);
//		jobboardpage.clickonApplyBtn();
		driver.findElement(By.xpath("//button[@class='btn Cbtn-primary'][contains(text(),'Apply')]")).click();
	}


	
	@Then("^successful message should display as \"([^\"]*)\" with Ok button$")
	public void successful_message_should_display_as_with_Ok_button(String ExpectedSuccessfulMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualSuccessfulMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
	    Assert.assertEquals(ExpectedSuccessfulMessage, ActualSuccessfulMessage);
	    
	    Thread.sleep(3000);
	    common.clickOnOKBtn();
	}



	@Then("^Go to job application$")
	public void go_to_job_application() throws Throwable {
	    
		 Thread.sleep(3000);
		 dashboardpage.clickonJobApplicationLInk();
		 
	}

	
	@Then("^login with the same employer of Job \"([^\"]*)\" \"([^\"]*)\"$")
	public void login_with_the_same_employer_of_Job(String EmployerEmailAddress, String Password) throws Throwable {
	   
 Thread.sleep(3000);
		 
		 jobboardpage.clickOnLoginBtn();
		 Thread.sleep(3000);
		 jobboardpage.clickOnEmployerAgencySignInlinkOnJobBoard();
		 Thread.sleep(3000);
		 jobboardpage.loginWithsameemployerofJob(EmployerEmailAddress, Password);
	}

	@Then("^Select the job from drop-down \"([^\"]*)\"$")
	public void select_the_job_from_drop_down(String Job) throws Throwable {
	    
		Thread.sleep(3000);
		jobapplicationspage.selectjob(Job);
		
		Thread.sleep(3000);
		jobapplicationspage.SearchBtn.click();
	}

	@Then("^Verify that candidate data displayed on job applications section \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void verify_that_candidate_data_displayed_on_job_applications_section(String CandidateName, String CandidateDesignation, String CityArea, String City, String Country, String Experience, String  CTC, String ExpectedCTC, String  NoticePeriod, String Title) throws Throwable {
	    
       Thread.sleep(3000);
		
		jobapplicationspage.verifycandidatedatadisplayedinJobApplicationSection(CandidateName, CandidateDesignation, CityArea, City, Country, Experience, CTC, ExpectedCTC, NoticePeriod, Title);
		
		
	}
	
	@Then("^click on View Details button$")
	public void click_on_View_Details_button() throws Throwable {

		 Thread.sleep(3000);
		jobapplicationspage.viewdetailsBtn.click();
	}

	@Then("^click on Yes button of confirmation message$")
	public void click_on_Yes_button_of_confirmation_message() throws Throwable {

		Thread.sleep(3000);
		common.clickOnConfirmYes();
		
	}
	
	@Then("^Verify that candidate data displayed after clicking on View Details button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void verify_that_candidate_data_displayed_after_clicking_on_View_Details_button(String CandidateName, String Title, String CandidateDesignation, String CityArea, String City, String Country, String ZipCode, String Experience, String CTC, String ExpectedCTC, String NoticePeriod, String ContactNumber, String DateOfBirth, String CandidateEmail, String Communicationmode, String Gender) throws Throwable {

    Thread.sleep(3000);
	jobapplicationspage.verifycandidatedataafterclickingOnViewdetails(CandidateName, Title, CandidateDesignation, CityArea, City, Country, ZipCode, Experience, CTC, ExpectedCTC, NoticePeriod, ContactNumber, DateOfBirth, CandidateEmail, Communicationmode, Gender);
	
	}


		
		
		
}
