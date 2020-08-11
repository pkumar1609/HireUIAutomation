package RegressionTc;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;
import utilPackage.baseclass;

public class JobCandidateWorkflowRegressionStepDefination extends baseclass{
	
//	@Given("^User open browser$")
//	public void user_open_browser() throws Throwable {
//	    
//		baseclass.initialization();
//	}

	@Given("^click on Login link$")
	public void click_on_Login_link() throws Throwable {
	   
		Thread.sleep(3000);
		registerpage.clickLogin();
	}

	@When("^click on Add Candidate button$")
	public void click_on_Add_Candidate_button() throws Throwable {
	    
          Thread.sleep(3000);
		  workbenchpage.clickOnAddCandidate();

//		  Thread.sleep(3000);
//			workbenchpage.addCandidateButton.click();
	}

	@When("^enter email id of candidate which is not registered previously and click on Find button \"([^\"]*)\"$")
	public void enter_email_id_of_candidate_which_is_not_registered_previously_and_click_on_Find_button(String CandidateEmail) throws Throwable {
	    
     Thread.sleep(2000);
		
		addcandidatepage.EntercandidateemailT(CandidateEmail);
		Thread.sleep(2000);
		addcandidatepage.clickonFindbtn();
		
	}

	@When("^upload candidate resume and click on save button$")
	public void upload_candidate_resume_and_click_on_save_button() throws Throwable {
	    
		Thread.sleep(3000);
		 addcandidatepage.uploadResumeDocumentT();
		 Thread.sleep(3000);
		common.clickOnSaveBtn();

	}
	
	@When("^Click save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
       common.clickOnSaveBtn();
		
	}
	
	@When("^Click on save btn$")
	public void click_on_save_btn() throws InterruptedException  {
		
		Thread.sleep(3000);
       driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		
	}
	
	
	@When("^Click on save btn for role$")
	public void click_on_save_btn_for_role() throws InterruptedException  {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
      
		
	}

	@Then("^user should able to add new candidate and candidate should get added in New column$")
	public void user_should_able_to_add_new_candidate_and_candidate_should_get_added_in_New_column() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.verifyCandidateAddedDisplayedOnWorkbenchOrNot();
	}

	@Then("^logout as employer and login as new candidate added by employer \"([^\"]*)\" \"([^\"]*)\"$")
	public void logout_as_employer_and_login_as_new_candidate_added_by_employer(String CandidateEmail, String password) throws Throwable {

		Thread.sleep(5000);
		workbenchpage.ClickonLogout();
		Thread.sleep(5000);
		registerpage.clickLogin();
		Thread.sleep(5000);
		registerpage.clickJobseekerCandidateSignInlinklink();
    	Thread.sleep(5000);
    	registerpage.loginwithnewcandidate(CandidateEmail, password);
	}
	
	@Then("^click on ok button of confirmation popup$")
	public void click_on_ok_button_of_confirmation_popup() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@Then("^Click on Profile tab$")
	public void click_on_Profile_tab() throws Throwable {
	    
		Thread.sleep(3000);
		candidateupdateprofilepage.profileTab.click();
		
	}

	@Then("^verify the Auto Populated fields on candidate update profile popup window$")
	public void verify_the_Auto_Populated_fields_on_candidate_update_profile_popup_window() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateCandidateProfile();
		
	}

	
	@Then("^Select the On Notice Period field and set Last working day on Update Profile page \"([^\"]*)\"$")
	public void select_the_On_Notice_Period_field_and_set_Last_working_day_on_Update_Profile_page(String LastWorkingDay) throws Throwable {
	    
		Select se = new Select(candidateupdateprofilepage.noticePeriodCheckbox);
		se.selectByVisibleText("Yes");
		Thread.sleep(1000);
		candidateupdateprofilepage.lastWorkingDay.sendKeys(LastWorkingDay);
		Thread.sleep(2000);
	}

	@Then("^set looking for job as yes$")
	public void set_looking_for_job_as_yes() throws Throwable {
	    
		Thread.sleep(3000);
		
		Select se = new Select(candidateupdateprofilepage.LookingforJobfield);
		se.selectByVisibleText("Yes");
	}

	@Then("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@Then("^click on Skills & Roles tab$")
	public void click_on_Skills_Roles_tab() throws Throwable {
	   
		Thread.sleep(3000);
		candidateupdateprofilepage.clickonskillsInformation();
	}

	@Then("^add skill, expertise level and certificate \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_skill_expertise_level_and_certificate(String Skill1, String ExpertiseLevel) throws Throwable {
	    
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@formcontrolname='Skill'])[1]")).sendKeys(Skill1); // enter 1st skill
		Thread.sleep(3000);
		WebElement expertiselevel = driver.findElement(By.xpath("(//select[@formcontrolname='ExpertiseLevel'])[1]"));
		Select select = new Select (expertiselevel);
		select.selectByVisibleText(ExpertiseLevel);    // set expertise level
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[1]//td[3]//input[1]")).sendKeys("ISTQB"); //Enter certification
	}

	@Then("^add same skill, expertise level and certificate \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_same_skill_expertise_level_and_certificate(String Skill2, String ExpertiseLevel) throws Throwable {
	    
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@formcontrolname='Skill'])[2]")).sendKeys(Skill2); // enter 2nd skill
        Thread.sleep(3000);
		WebElement expertiselevel = driver.findElement(By.xpath("(//select[@formcontrolname='ExpertiseLevel'])[2]"));
		Select select = new Select (expertiselevel);
		select.selectByVisibleText(ExpertiseLevel);    // set expertise level
		
		driver.findElement(By.xpath("//tr[3]//td[4]//button[1]//i[1]")).click(); // delete 3rd skill
		
	}

	@Then("^delete duplicate skill$")
	public void delete_duplicate_skill() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[2]//td[4]//button[1]")).click();  // delete 1 duplicate skill
		Thread.sleep(3000);
		common.clickOnSaveBtn();
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}
	
	@Then("^delete duplicate role$")
	public void delete_duplicate_role() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[2]//td[2]//button[1]")).click();  // delete 1 duplicate role
//		Thread.sleep(3000);
//		common.clickOnSaveBtn();
//		Thread.sleep(3000);
//		common.clickOnOKBtn();
	}

	@Then("^Now Click on Add Skill button to add more than ten skills$")
	public void now_Click_on_Add_Skill_button_to_add_more_than_ten_skills() throws Throwable {
	    
		Thread.sleep(3000);
		candidateupdateprofilepage.addTenSkills();
	}

	@Then("^click on Delete Skill button in front of any skill for candidate$")
	public void click_on_Delete_Skill_button_in_front_of_any_skill_for_candidate() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.skill3Delete.click();
	}

	@Then("^click on Add Role button$")
	public void click_on_Add_Role_button() throws Throwable {
	    
		candidateupdateprofilepage.addRolesButton.click();
	}

	@Then("^add duplicate role \"([^\"]*)\"$")
	public void add_duplicate_role(String JobRole) throws Throwable {

		Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@formcontrolname='Role'])[2]")).sendKeys(JobRole); // enter duplicate role

	}

	@Then("^Now Click on Add Role button to add more than ten skills$")
	public void now_Click_on_Add_Role_button_to_add_more_than_ten_skills() throws Throwable {
	    
		Thread.sleep(3000);
		candidateupdateprofilepage.addTenRoles();
	}

	@Then("^click on Delete Role button in front of any role for candidate$")
	public void click_on_Delete_Role_button_in_front_of_any_role_for_candidate() throws Throwable {
	    
		Thread.sleep(3000);
		candidateupdateprofilepage.role3Delete.click();
		
	}

	@Then("^click on Personal & Professional tab$")
	public void click_on_Personal_Professional_tab() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.clickonpersonalprofessionalInformation();

	}

	@Then("^set looking for job as No$")
	public void set_looking_for_job_as_No() throws Throwable {
	   
		Thread.sleep(3000);
		
		Select se = new Select(candidateupdateprofilepage.LookingforJobfield);
		se.selectByVisibleText("No");
	}

	@Then("^logout as candidate and login as same employer$")
	public void logout_as_candidate_and_login_as_same_employer() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		registerpage.clickLogin();
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		registerpage.employerlogin();
		
	}

	@Then("^go to workbench and select the same job$")
	public void go_to_workbench_and_select_the_same_job() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();
		
		 Thread.sleep(3000);
         workbenchpage.selectJob();
	
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(3000);
		driver.close();
	}
	
	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate skills$")
	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_skills(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);	
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten skills$")
	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_skills(String ExpectedAlertMessage) throws Throwable {
	    
		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate roles$")
	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_roles(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten roles$")
	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_roles(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}


//2
	
	@When("^click on Workbench tab and observe Add Candidate button$")
	public void click_on_Workbench_tab_and_observe_Add_Candidate_button() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
	    Thread.sleep(3000);
	    boolean value = workbenchpage.addCandidateButton.isEnabled();
	    if(value == true) {
	    	
	    	System.out.println("\nAdd Candidate button is enabled without selecting job from jobdropdown");
	    }
	    else {
	    	
	    	System.out.println("\nAdd Candidate button is disabled without selecting job from jobdropdown");
	    }
	}
	

	@When("^select job from Jobs drop down and observe Add Candidate button$")
	public void select_job_from_Jobs_drop_down_and_observe_Add_Candidate_button() throws Throwable {
	    
		workbenchpage.selectJob();
	    Thread.sleep(3000);
	    boolean value = workbenchpage.addCandidateButton.isEnabled();
	    if(value == true) {
	    	
	    	System.out.println("\nAdd Candidate button is enabled after selecting job from jobdropdown");
	    }
	    else {
	    	
	    	System.out.println("\nAdd Candidate button is disabled even after selecting job from jobdropdown");
	    }
	}

	@When("^click on Close button$")
	public void click_on_Close_button() throws Throwable {
	   
		Thread.sleep(3000);
		common.closebtn.click();
		
	}

	@Then("^confirmation popup message should display with Yes and No buttons and Click on No button$")
	public void confirmation_popup_message_should_display_with_Yes_and_No_buttons_and_Click_on_No_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickNoButton();
	}

	@Then("^change the set notice period days$")
	public void change_the_set_notice_period_days() throws Throwable {
	   
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.clear();
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.sendKeys("45");
		
	}


	@When("^login with Agency credential$")
	public void login_with_Agency_credential() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.agencylogin();
	}

	@Then("^click on employer tab and delete the employer$")
	public void click_on_employer_tab_and_delete_the_employer() throws Throwable {
	    
		dashboardpage.openEmployersPage();
		Thread.sleep(3000);
		employerspage.searchEmployer();	
		Thread.sleep(2000);
		employerspage.deleteSearchedEmployer();
		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}




}