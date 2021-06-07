package BVT_StepDefination;

import java.util.List;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class JobCandidateWorkflowRegressionStepDefination extends baseclass{
	

	@When("^Click on Save Button$")
	public void click_on_Save_Button() throws InterruptedException  {
		
		Thread.sleep(3000);
       common.clickOnSaveBtn();
//		Thread.sleep(3000);
       
//		common.clickOnConfirmYes();
		
	}
	
	@Given("^Employee should be added$")
	public void employee_should_be_added(DataTable credentials) throws Throwable {
	    manageemployee.addEmployee(credentials);
	}
	
	
	
	@When("^Click on save button for edit candidate$")
	public void click_on_save_button_for_edit_candidate() throws Throwable {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[text()='Save'])[2]")));
	}

	@Then("^Click on save button to save the updated changes$")
	public void click_on_save_button_to_save_the_updated_changes() throws Throwable {

		Thread.sleep(3000);
	    editcandidatepage.ClickOnSaveBtntoSavetheupdatedDetails();
			

	}
	
	@When("^Click on save btn for skill$")
	public void click_on_save_btn_for_skill() throws InterruptedException  {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='Save'])[1]")).click();

	}

	@Then("^logout as employer and login as new candidate added by employer \"([^\"]*)\" \"([^\"]*)\"$")
	public void logout_as_employer_and_login_as_new_candidate_added_by_employer(String CandidateEmail, String password) throws Throwable {
		loginpage.logoutFromAppK();
		Action.moveToElement(loginpage.login).perform();
		homepage.clickJobseekerCandidateSignInlinklink();
		registerpage.loginwithnewcandidate(CandidateEmail, password);
		if(common.okbtnPopup.size()>0)
		{
			common.clickOnOKBtn();
		}
	}

	@Then("^Click on Profile tab$")
	public void click_on_Profile_tab() throws Throwable {
		Thread.sleep(5000);
		candidateupdateprofilepage.profileTab.click();
		
	}
//
////	@Then("^verify the Auto Populated fields on candidate update profile popup window$")
////	public void verify_the_Auto_Populated_fields_on_candidate_update_profile_popup_window() throws Throwable {
////	    
////		Thread.sleep(3000);
////		updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateCandidateProfile(CandidateEmail, CandidateName, ContactNumber);
////	}
//
//
//	
//	
	@Then("^Select the On Notice Period field and set Last working day on Update Profile page \"([^\"]*)\",\"([^\"]*)\"$")
	public void select_the_On_Notice_Period_field_and_set_Last_working_day_on_Update_Profile_page(String OnNoticePeriod, String LastWorkingDay) throws Throwable {
		select = new Select (addcandidatepage.onNoticePeriod);
		select.selectByVisibleText("Yes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@aria-label='Open Calendar'])[2]")).click();
		Thread.sleep(1000);
		common.enterdate(LastWorkingDay);
		//candidateupdateprofilepage.lastWorkingDay.sendKeys(LastWorkingDay);
		Thread.sleep(2000);
	}

	
	@Then("^Select the On Notice Period field and set Last working day$")
	public void select_the_On_Notice_Period_field_and_set_Last_working_day() throws Throwable {
	    
		Select se = new Select(editcandidatepage.onnoticePeriod);
		se.selectByVisibleText("Yes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Open Calendar'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='datevalue currmonth']//span[contains(text(),'30')]")).click();
//		candidateupdateprofilepage.lastWorkingDay.sendKeys(LastWorkingDay);
		Thread.sleep(2000);
	}



	@Then("^set looking for job as yes$")
	public void set_looking_for_job_as_yes() throws Throwable {
	    
		Thread.sleep(3000);
		
		Select se = new Select(addcandidatepage.LookingforJobfield);
		se.selectByVisibleText("Yes");
	}

//	@Then("^click on ok button$")
//	public void click_on_ok_button() throws Throwable {
//		common.clickOnOKBtn();
//	}
//	
	@Then("^click on Add Designation button$")
	public void click_on_Add_Designation_button() throws Throwable {

		Thread.sleep(5000);
		candidateupdateprofilepage.addRolesButton.click();
	}

	@Then("^add duplicate designation \"([^\"]*)\"$")
	public void add_duplicate_designation(String JobDesignation) throws Throwable {


		Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@formcontrolname='Role'])[2]")).sendKeys(JobDesignation); // enter duplicate role

	}

	@Then("^Click on save btn for designation$")
	public void click_on_save_btn_for_designation() throws Throwable {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("(//button[text()='Save'])[2]")) );
//		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
      
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate designations$")
	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_designations(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}

	@Then("^delete duplicate designation$")
	public void delete_duplicate_designation() throws Throwable {
	    
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[2]//td[2]//button[1]")).click();  // delete 1 duplicate role
		try
		{
		common.clickOnOKBtn();
		}
		catch(NoSuchElementException e) {}
	}

	@Then("^Now Click on Add designation button to add more than ten designation$")
	public void now_Click_on_Add_designation_button_to_add_more_than_ten_designation() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.addTenRoles();
	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten designation$")
	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_designation(String ExpectedAlertMessage) throws Throwable {
	   
		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
	}
//
//	@Then("^click on Delete designation button in front of any designation for candidate$")
//	public void click_on_Delete_designation_button_in_front_of_any_designation_for_candidate() throws Throwable {
//
//		Thread.sleep(3000);
//		candidateupdateprofilepage.deletedesignation.get(3).click();
//		
//	}
//
	@Then("^click on Skills & Roles tab$")
	public void click_on_Skills_Roles_tab() throws Throwable {
	   
		Thread.sleep(3000);
		candidateupdateprofilepage.clickonskillsInformation();
	}
//
	@Then("^add skill, expertise level and certificate \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_skill_expertise_level_and_certificate(String Skill1, String ExpertiseLevel) throws Throwable {
	    
		Thread.sleep(2000);
		candidateupdateprofilepage.skills.get(0).clear();
		candidateupdateprofilepage.skills.get(0).sendKeys(Skill1); // enter 1st skill
		candidateupdateprofilepage.expertiselevel.get(0).sendKeys(ExpertiseLevel);
		
//		WebElement expertiselevel = driver.findElement(By.xpath("(//select[@formcontrolname='ExpertiseLevel'])[1]"));
//		Select select = new Select (expertiselevel);
//		select.selectByVisibleText(ExpertiseLevel);    // set expertise level
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[1]//td[3]//input[1]")).sendKeys("ISTQB"); //Enter certification
	}

	@Then("^add same skill, expertise level and certificate \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_same_skill_expertise_level_and_certificate(String Skill1, String ExpertiseLevel) throws Throwable {
	    
		Thread.sleep(2000);
		candidateupdateprofilepage.skills.get(1).clear();
		candidateupdateprofilepage.skills.get(1).sendKeys(Skill1); // enter 1st skill
		candidateupdateprofilepage.expertiselevel.get(1).sendKeys(ExpertiseLevel);
		driver.findElement(By.xpath("//tr[3]//td[4]//button[1]//i[1]")).click(); // delete 3rd skill	}
		try
		{
		common.clickOnOKBtn();
		}
		catch(NoSuchElementException e) {}
	}
	@Then("^delete duplicate skill$")
	public void delete_duplicate_skill() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[2]//td[4]//button[1]")).click();  // delete 1 duplicate skill
		try
		{
		common.clickOnOKBtn();
		}
		catch(NoSuchElementException e) {}
		common.clickOnSaveBtn();
	}
//	
////	@Then("^delete duplicate role$")
////	public void delete_duplicate_role() throws Throwable {
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("//tr[2]//td[2]//button[1]")).click();  // delete 1 duplicate role
////		Thread.sleep(3000);
////		common.clickOnSaveBtn();
////		Thread.sleep(3000);
////		common.clickOnOKBtn();
////	}
//
//	@Then("^Now Click on Add Skill button to add more than ten skills$")
//	public void now_Click_on_Add_Skill_button_to_add_more_than_ten_skills() throws Throwable {
//	    
//		Thread.sleep(3000);
//		candidateupdateprofilepage.addTenSkills();
//	}
//
	@Then("^click on Delete Skill button in front of any skill for candidate$")
	public void click_on_Delete_Skill_button_in_front_of_any_skill_for_candidate() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.skills.get(3).click();
	}
//
////	@Then("^click on Add Role button$")
////	public void click_on_Add_Role_button() throws Throwable {
////	    
////		candidateupdateprofilepage.addRolesButton.click();
////	}
//
////	@Then("^add duplicate role \"([^\"]*)\"$")
////	public void add_duplicate_role(String JobRole) throws Throwable {
////
////		Thread.sleep(3000);
////        driver.findElement(By.xpath("(//input[@formcontrolname='Role'])[2]")).sendKeys(JobRole); // enter duplicate role
////
////	}
//
////	@Then("^Now Click on Add Role button to add more than ten skills$")
////	public void now_Click_on_Add_Role_button_to_add_more_than_ten_skills() throws Throwable {
////	    
////		Thread.sleep(3000);
////		candidateupdateprofilepage.addTenRoles();
////	}
//
////	@Then("^click on Delete Role button in front of any role for candidate$")
////	public void click_on_Delete_Role_button_in_front_of_any_role_for_candidate() throws Throwable {
////	    
////		Thread.sleep(3000);
////		candidateupdateprofilepage.role3Delete.click();
////		
////	}
//	
//	@Then("^Select the On Notice Period field and set Last working day on Update Profile page \"([^\"]*)\"$")
//	public void select_the_On_Notice_Period_field_and_set_Last_working_day_on_Update_Profile_page(String arg1) throws Throwable {
//
//
//		
//	}
//
//
	@Then("^click on Personal & Professional tab$")
	public void click_on_Personal_Professional_tab() throws Throwable {

		Thread.sleep(3000);
		candidateupdateprofilepage.clickonpersonalprofessionalInformation();

	}

	@Then("^set looking for job as No$")
	public void set_looking_for_job_as_No() throws Throwable {
	   
		Thread.sleep(3000);
		
		Select se = new Select(addcandidatepage.LookingforJobfield);
		se.selectByVisibleText("No");
		
	}
//
//	@Then("^logout as candidate and login as same employer$")
//	public void logout_as_candidate_and_login_as_same_employer() throws Throwable {
//	    
//		Thread.sleep(3000);
//		workbenchpage.ClickonLogout();
//		Thread.sleep(3000);
//		registerpage.clickLogin();
//		Thread.sleep(3000);
//		registerpage.clickEmployerAgencySignInlink();
//		Thread.sleep(3000);
//		registerpage.employerlogin();
//		
//	}
//
//	@Then("^go to workbench and select the same job$")
//	public void go_to_workbench_and_select_the_same_job() throws Throwable {
//	    
//		Thread.sleep(3000);
//		dashboardpage.openWorkbenchPage();
//		
//		 Thread.sleep(3000);
//         workbenchpage.selectJobK();
//	
//	}
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	    
//		Thread.sleep(3000);
//		driver.close();
//	}
	
	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate skills$")
	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_skills(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);	
	}

//	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten skills$")
//	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_skills(String ExpectedAlertMessage) throws Throwable {
//	    
//		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
//		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
//	}
//
////	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding duplicate roles$")
////	public void verify_that_user_get_an_alert_message_as_for_adding_duplicate_roles(String ExpectedAlertMessage) throws Throwable {
////
////		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
////		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
////	}
//
////	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten roles$")
////	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_roles(String ExpectedAlertMessage) throws Throwable {
////
////		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
////		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
////	}
//
//
////2
//	
//	@When("^click on Workbench tab and observe Add Candidate button$")
//	public void click_on_Workbench_tab_and_observe_Add_Candidate_button() throws Throwable {
//	    
//		dashboardpage.openWorkbenchPage();
//	    Thread.sleep(3000);
//	    boolean value = workbenchpage.addCandidateButton.isEnabled();
//	    if(value == true) {
//	    	
//	    	System.out.println("\nAdd Candidate button is enabled without selecting job from jobdropdown");
//	    }
//	    else {
//	    	
//	    	System.out.println("\nAdd Candidate button is disabled without selecting job from jobdropdown");
//	    }
//	}
//	
//
//	@When("^select job from Jobs drop down and observe Add Candidate button$")
//	public void select_job_from_Jobs_drop_down_and_observe_Add_Candidate_button() throws Throwable {
//	    
//		workbenchpage.selectJobK();
//	    Thread.sleep(3000);
//	    boolean value = workbenchpage.addCandidateButton.isEnabled();
//	    if(value == true) {
//	    	
//	    	System.out.println("\nAdd Candidate button is enabled after selecting job from jobdropdown");
//	    }
//	    else {
//	    	
//	    	System.out.println("\nAdd Candidate button is disabled even after selecting job from jobdropdown");
//	    }
//	}
//
//	@When("^click on Close button$")
//	public void click_on_Close_button() throws Throwable {
//	   
//		Thread.sleep(3000);
//		common.closebtn.click();
//		
//	}

	@Then("^confirmation popup message should display with Yes and No buttons and Click on No button$")
	public void confirmation_popup_message_should_display_with_Yes_and_No_buttons_and_Click_on_No_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickNoButton();
	}


	
	@Then("^Set on Notice period field as \"([^\"]*)\" and enter \"([^\"]*)\"$")
	public void set_Notice_period_field_as_and_enter(String onNoticePerid, String lastworkingDay) throws Throwable {
		Thread.sleep(3000);
		Select se = new Select(addcandidatepage.onNoticePeriod);
		se.selectByVisibleText(onNoticePerid);
		if(onNoticePerid.contentEquals("Yes"))
		{			
			Thread.sleep(2000);
			addcandidatepage.calenderIcon.get(0).click();
			Thread.sleep(2000);
			common.enterdate(lastworkingDay);
		}
		else if(onNoticePerid.contentEquals("No"))
		{
			Thread.sleep(1000);
			addcandidatepage.noticePeriod.sendKeys(lastworkingDay);
		}
	}
	
	@Then("^verify that on Notice period field is set as \"([^\"]*)\"$")
	public void verify_that_Notice_period_field_is_set_as(String onNoticePeriod) throws Throwable {
	    select =new Select(addcandidatepage.onNoticePeriod);
		Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), onNoticePeriod);
	}
	
	@When("^change the set notice period days \"([^\"]*)\"$")
	public void change_the_set_notice_period_days(String noticePeriod) throws Throwable {
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.clear();
		Thread.sleep(3000);
		addcandidatepage.noticePeriod.sendKeys(noticePeriod);
	}

	@Then("^verify that notice period field is having updated notice period \"([^\"]*)\"$")
	public void verify_that_notice_period_field_is_having_updated_notice_period(String NoticePeriod) throws Throwable {
		Assert.assertEquals(addcandidatepage.noticePeriod.getAttribute("value"), NoticePeriod);

	}


////3

	@When("^Add a comment greater than (\\d+) characters$")
	public void add_a_comment_greater_than_characters(int arg1) throws Throwable {
	    
		Thread.sleep(3000);
		candidatecardsectionpage.addCommentSection.sendKeys("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		
	}

	
	@Then("^Verify that user get an error message as \"([^\"]*)\" for adding comment greater than specified characters$")
	public void verify_that_user_get_an_error_message_as_for_adding_comment_greater_than_specified_characters(String ExpectedErrorMessage) throws Throwable {
	   
		Thread.sleep(3000);
		String ActualErrorMessage = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
	}

	@Then("^error message should display and Save button should be disabled$")
	public void error_message_should_display_and_Save_button_should_be_disabled() throws Throwable {
	    
       boolean value = common.savebtn.isEnabled();
		
		if(value == true) {
			
			System.out.println("\nSave button is enabled when error message displayed");
		}
		else {
			
			System.out.println("\nSave button is disabled when error message displayed");
		}
	}

	@Then("^add comment with or below (\\d+) characters and click on Save button$")
	public void add_comment_with_or_below_characters_and_click_on_Save_button(int arg1) throws Throwable {
	    
		Thread.sleep(2000);
		candidatecardsectionpage.addCommentSection.clear();
		Thread.sleep(2000);
		candidatecardsectionpage.addCommentSection.sendKeys("This is comment for candidate..");
		Thread.sleep(2000);
		common.clickOnSaveBtn();
		Thread.sleep(3000);
	}

	@Then("^comment should get added below Save button with Delete Comment icon$")
	public void comment_should_get_added_below_Save_button_with_Delete_Comment_icon() throws Throwable {

		candidatecardsectionpage.addedNewComment = candidatecardsectionpage.addedComment.getText();
		System.out.println("\nAdded comment: " + candidatecardsectionpage.addedNewComment);
		
		if(candidatecardsectionpage.addedNewComment.equals(candidatecardsectionpage.newComment)) {
			
			System.out.println("\nNew comment get added..");
		}
		else {
			System.out.println("\nNew comment not getting added..");
		}
		
//      boolean value = driver.findElement(By.cssSelector("span.text-danger.CustomerPonter")).isEnabled();
//		
//		if(value == true) {
//			
//			System.out.println("\nDelete icon is displayed when comment is saved.");
//		}
//		else {
//			
//			System.out.println("\nDelete icon is not displayed when comment is saved.");
//		
//		}
	}
	
//	
	@Then("^click on Delete Comment icon to delete the comment and comment should get deleted$")
	public void click_on_Delete_Comment_icon_to_delete_the_comment_and_comment_should_get_deleted() throws Throwable {
	    
		candidatecardsectionpage.deleteCommentIcon.click();
		Thread.sleep(3000);
		WebElement spaceBelowSaveButton = driver.findElement(By.xpath("//div[@class='scroll-box']"));
		String str = spaceBelowSaveButton.getText();
		System.out.println("\nData below Save button: " + str);
		
		if(str.equals(candidatecardsectionpage.addedNewComment)) {
			
			System.out.println("\nComment not getting deleted..");
		}
		else {
			
			System.out.println("\nComment get deleted..");
		}
	}
//	

	@When("^Click on Comment icon from candidate card to add comment \"([^\"]*)\"$")
	public void click_on_Comment_icon_from_candidate_card_to_add_comment(String Name) throws Throwable {

        Thread.sleep(3000);
        candidatecardsectionpage.clickOncommentsIcon(Name);
	}
//
//
//	
////	@When("^Click on Add Candidate button$")
////	public void click_on_Add_Candidate_button() throws Throwable {
////
////         Thread.sleep(3000);
////		workbenchpage.clickOnAddCandidate();
////	}
//
//	@Then("^click on employer tab and delete the employer if login as agency$")
//	public void click_on_employer_tab_and_delete_the_employer_if_login_as_agency() throws Throwable {
//
//		Thread.sleep(3000);
//		workbenchpage.deleteEmployerfromEmployerTabasAgency();
//
//	}
//
//
//	
//	
////	4
//	
//
	@Then("^Observe candidate get moved in Rejected column automatically$")
	public void observe_candidate_get_moved_in_Rejected_column_automatically() throws Throwable {
	    

	}
	@Then("^Now move that candidate from Rejected column to any other column and observe$")
	public void now_move_that_candidate_from_Rejected_column_to_any_other_column_and_observe() throws Throwable {
//		executor.executeScript("scrollTo(3000,0);"); 
		executor.executeScript("arguments[0].scrollIntoView(true);", candidatecardsectionpage.candidateCard);
		candidatecardsectionpage.dragAndDropCardToThirdColumn();
	}
//
//	@Then("^Click on Questionnaire tab$")
//	public void click_on_Questionnaire_tab() throws Throwable {
//	    
//		Thread.sleep(3000);
//		workbenchpage.clickonthreedot();
//		Thread.sleep(4200);
//		workbenchpage.clickonAddQuestionarybtn();
//	}
//
//	@Then("^Enter first question \"([^\"]*)\" and marks \"([^\"]*)\"$")
//	public void enter_first_question_and_marks(String QUESTION1, String QMARKS1) throws Throwable {
//	    
//		Thread.sleep(3000);
//        addquestionarypage.AddQUESTION1(QUESTION1);
//        addquestionarypage.AddMARKS1(QMARKS1);
//	}
//
//	@Then("^Enter the answer \"([^\"]*)\" \"([^\"]*)\"  and enter Marks \"([^\"]*)\" \"([^\"]*)\" for first question$")
//	public void enter_the_answer_and_enter_Marks_for_first_question(String ANSWER1, String ANSWER2, String MARKS1, String MARKS2) throws Throwable {
//	    
//		Thread.sleep(3000);
//		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
//		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
//	}
//
//	@Then("^click on Save Changes button$")
//	public void click_on_Save_Changes_button() throws Throwable {
//	    
//		Thread.sleep(3000);
//		addquestionarypage.clickOnSaveChangesButton();
//	}
//
//	@Then("^Enter the cutoff & rejection percentage \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_the_cutoff_rejection_percentage(String cuttoffpercentage, String rejectionpercentage) throws Throwable {
//
//		Thread.sleep(3000);
//        addquestionarypage.EntercuttoffPercentageT(cuttoffpercentage);
//        Thread.sleep(3000);
//        addquestionarypage.EnterRejectionPercentageT(rejectionpercentage);
//	}
//
//	@Then("^click on submit$")
//	public void click_on_submit() throws Throwable {
//
//		Thread.sleep(3000);
//		common.ClickSumbit();
//
//	}
//
//	@Then("^Collect Answer icon should reflect on candidates card for giving answers$")
//	public void collect_Answer_icon_should_reflect_on_candidates_card_for_giving_answers() throws Throwable {
//		Assert.assertEquals(driver.findElement(By.xpath("//button[@title='Collect Answer']")).isDisplayed(), true);
//	}
//	
	@When("^Click on Reject Candidate icon from candidate card to reject the candidate \"([^\"]*)\"$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_to_reject_the_candidate(String Name) throws Throwable {

		candidatecardsectionpage.clickOnRejectCandidateIcon(Name);
		Thread.sleep(3000);
		candidatecardsectionpage.selectRejectReason();
		common.addComment();
		common.ClickSumbit();
	}

////5

	@When("^move both candidates in Interview Pending one column$")
	public void move_both_candidates_in_Interview_Pending_one_column() throws Throwable {


		WebElement drag1 = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("(//td[@id='jobStatusColumn'])[4]")); // interview peneding column 1
		WebElement drag2 = candidatecardsectionpage.candidateCard;
		
		Action.clickAndHold(drag1).moveToElement(drop).release(drop);
		Action.build().perform();
		Thread.sleep(2000);
		Action.clickAndHold(drag2).moveToElement(drop).release(drop);
		Action.build().perform();
		
	}

	@When("^Click on Reject Candidate icon from candidate card and reject that candidate \"([^\"]*)\"$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_and_reject_that_candidate(String Name) throws Throwable {

		candidatecardsectionpage.clickOnRejectCandidateIcon(Name);
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		candidatecardsectionpage.selectRejectReason();
	}
	
	@Then("^Click on Reject Candidate icon from candidate card for second candidate \"([^\"]*)\"$")
	public void click_on_Reject_Candidate_icon_from_candidate_card_for_second_candidate(String Name1) throws Throwable {

		Thread.sleep(3000);
		candidatecardsectionpage.clickOnRejectCandidateIcon(Name1);
		
	}

	@Then("^click on No from confirmation popup and observe$")
	public void click_on_No_from_confirmation_popup_and_observe() throws Throwable {
        
		Thread.sleep(3000);
		common.clickNoButton();

	}
	
	@Then("^Click on show all rejected candidate checkbox$")
	public void click_on_show_all_rejected_candidate_checkbox() throws Throwable {
		Thread.sleep(2000);
	    executor.executeScript("arguments[0].click();", workbenchpage.showAllRejectedCandidates);
	}

	@Then("^both candidates should not display in same column$")
	public void both_candidates_should_not_display_in_same_column() throws Throwable {



	}
//
////6
//	
	@When("^upload candidate resume in document format$")
	public void upload_candidate_resume_in_document_format() throws Throwable {

		Thread.sleep(3000);
        addcandidatepage.uploadResumeDocumentT();
		
	}

	@When("^verify the error message displayed as \"([^\"]*)\"$")
	public void verify_the_error_message_displayed_as(String ExpectedAlertMessage) throws Throwable {

		String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
		Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);

	}

	@When("^upload candidate resume in pdf file format$")
	public void upload_candidate_resume_in_pdf_file_format() throws Throwable {

		Thread.sleep(3000);
        addcandidatepage.uploadResumeDocumentinPdfformatT();
		
	}
	
	@When("^upload candidate resume in zip file format$")
	public void upload_candidate_resume_in_zip_file_format() throws Throwable {
	    
		Thread.sleep(3000);
        addcandidatepage.uploadResumeDocumentinZipformatT();
		
	}


	@When("^upload candidate resume in text file format$")
	public void upload_candidate_resume_in_text_file_format() throws Throwable {
	    
		Thread.sleep(3000);
        addcandidatepage.uploadResumeDocumentintextformatT();
	}

	@When("^upload candidate resume in PNG file format$")
	public void upload_candidate_resume_in_PNG_file_format() throws Throwable {

		Thread.sleep(3000);
        addcandidatepage.uploadResumeDocumentinPNGformatT();
	}

	
//	@Given("^click on Job Seeker\\(Candidate\\) Sign In link$")
//	public void click_on_Job_Seeker_Candidate_Sign_In_link() throws Throwable {
//		Thread.sleep(2000);
//		Action.moveToElement(loginpage.login).click().perform();
//		homepage.clickJobseekerCandidateSignInlinklink();
//	}
//
//	@Given("^enter candidate email and password \"([^\"]*)\" \"([^\"]*)\"$")
//	public void enter_candidate_email_and_password(String CandidateEmail, String password) throws Throwable {
//
//	  Thread.sleep(3000);
//      registerpage.Emailaddress.sendKeys(CandidateEmail);
//      registerpage.Password.sendKeys(password);
//		
//	}
//
//	@Given("^click on Signin button$")
//	public void click_on_Signin_button() throws Throwable {
//
//		Thread.sleep(3000);
//       registerpage.ClickSigninbtn();
//	}
//	
////	7
//
//	
//	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
//	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String emailaddress, String password) throws Throwable {
//	   
//		Thread.sleep(4000);
//	
//	registerpage.clickEmployerAgencySignInlink();
//	Thread.sleep(3000);
//
//	loginpage.emailaddress.sendKeys(emailaddress);
//		loginpage.password.sendKeys(password);		
//		loginpage.signin.click();
//		
//	}
//
//	@Given("^click on Workbench tab$")
//	public void click_on_Workbench_tab() throws Throwable {
//
//		Thread.sleep(3000);
//		dashboardpage.openWorkbenchPage();
//	}
//
////	@Given("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
////	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
////
////		Thread.sleep(3000);
////		addjobpage.addJobforEmployerandAgency(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
////	}
//	
////	@Given("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
////	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String JobTitle, String JobDesignation, String Industry, String JobRole, String JobLocation, String JobBudget, String MinExp, String MaxExp, String NoOfInterviews, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
////
////		Thread.sleep(3000);
////		addjobpage.addJobforEmployerandAgency(JobTitle, JobDesignation, Industry, JobRole, JobLocation, JobBudget, MinExp, MaxExp, NoOfInterviews, JobNoticePeriod, JobSkill1, JobSkill2);
////		
////	}
//	
////	@When("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
////	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
////	    
////		addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
////		
////
////	}
//
//
//	@Given("^click on Job drop down and select recently added job$")
//	public void click_on_Job_drop_down_and_select_recently_added_job() throws Throwable {
//
//		Thread.sleep(3000);
//		workbenchpage.selectJobK();
//	}
//
//	@Given("^click on Edit Job button to update skills and number of interview$")
//	public void click_on_Edit_Job_button_to_update_skills_and_number_of_interview() throws Throwable {
//
//		Thread.sleep(3000);
//		workbenchpage.job.click();
//		workbenchpage.editJobButton.click();
//	}

	@When("^select number of interview except previously selected number \"([^\"]*)\"$")
	public void select_number_of_interview_except_previously_selected_number(String NoOfInterview1) throws Throwable {
		Thread.sleep(1000);
		Select se = new Select(addjobpage.totalinterviews);
		se.selectByVisibleText(NoOfInterview1);
	}
	

	@When("^again click on Edit Job button and observe the number of interviews \"([^\"]*)\"$")
	public void again_click_on_Edit_Job_button_and_observe_the_number_of_interviews(String NoOfInterview1) throws Throwable {		
		
//		executor.executeScript("arguments[0].click();", );
		Thread.sleep(4000);
		executor.executeScript("arguments[0].click();",workbenchpage.job);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",workbenchpage.editJobButton);
		explicitwait.until(ExpectedConditions.visibilityOf(addjobpage.totalinterviews));
		select = new Select(addjobpage.totalinterviews);
		Assert.assertEquals(driver.findElement(By.xpath("//select[@id='totalInterviews']//option[contains(text(),'"+NoOfInterview1+"')]")).getText(), NoOfInterview1);
	}
	
	@When("^click on Add Skill button and add one new skill \"([^\"]*)\"$")
	public void click_on_Add_Skill_button_and_add_one_new_skill(String skill4) throws Throwable {
		
		executor.executeScript("arguments[0].scrollIntoView();", addjobpage.addskillbutton);
		Thread.sleep(3000);
//		executor.executeScript("arguments[0].click();",addjobpage.addskillbutton);
		addjobpage.addskillbutton.click();	
		addjobpage.addNewSkill1(skill4);		
		common.ClickSumbit();
	}
	
//	@Given("^click on submit button$")
//	public void click_on_submit_button() throws Throwable {
//
//		Thread.sleep(3000);
//		common.submitbtn.click();
//	}
//
//	@Given("^again click on Edit Job button and observe the number of interviews$")
//	public void again_click_on_Edit_Job_button_and_observe_the_number_of_interviews() throws Throwable {
//
//		Thread.sleep(3000);
//		workbenchpage.clickonthreedot();
//		Thread.sleep(3000);
//		workbenchpage.editJobButton.click();
//		Thread.sleep(3000);
//	}
//	

//	
////	@Given("^click on Add Skill button and add one new skill$")
////	public void click_on_Add_Skill_button_and_add_one_new_skill() throws Throwable {
////
////		addjobpage.addskillbutton.click();
////		Thread.sleep(3000);
////	    addjobpage.addNewSkill3();
////	    Thread.sleep(3000);
////	    common.ClickSumbit();
////	}

	@Then("^Newly Added skills should be reflect in candidate profile which are already added for that job \"([^\"]*)\"$")
	public void newly_Added_skills_should_be_reflect_in_candidate_profile_which_are_already_added_for_that_job(String Skill4) throws Throwable {
		
		String txt=editcandidatepage.jobskill.get(3).getAttribute("value");
		Assert.assertEquals(txt.substring(0, txt.indexOf("(")).strip(), Skill4);
	}
	
////	8
//
	@Then("^Click on Candidate name from candidate card and observe the skills$")
	public void click_on_Candidate_name_from_candidate_card_and_observe_the_skills() throws Throwable {
	    
		candidatecardsectionpage.clickOnCandidateNameFromCandidateCard();
		Thread.sleep(3000);
		candidatecardsectionpage.observeAllPresentSkills();
	}
	
	@Then("^Delete one skill from Skills section$")
	public void delete_one_skill_from_Skills_section() throws Throwable {
		Thread.sleep(2000);
		addjobpage.deleteSkill.get(addjobpage.deleteSkill.size()-1).click();
	}

	@Then("^click on Close button from candidate Details page$")
	public void click_on_Close_button_from_candidate_Details_page() throws Throwable {
	    
		Thread.sleep(2000);
		common.closebtn.click();
		Thread.sleep(2000);
	}
//	
//	@Then("^click on Edit Job button to make changes in job$")
//	public void click_on_Edit_Job_button_to_make_changes_in_job() throws Throwable {
//		Thread.sleep(3000);
//		workbenchpage.clickonthreedot();
//		Thread.sleep(3000);
//		workbenchpage.editJobButton.click();
//		Thread.sleep(3000);
//		String title1 = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-edit-job/div[1]/h5")).getText();
//		System.out.println("\nTitle of page: " + title1);
//	}
//	


	@When("^observe deleted skill not displayed \"([^\"]*)\"$")
	public void observe_deleted_skill_not_displayed(String Skill3) throws Throwable {
		executor.executeScript("arguments[0].scrollIntoView();", editcandidatepage.jobskill.get(0));
		Assert.assertEquals(editcandidatepage.jobskill.size()>2, false);
			
	}
	
	@Then("^click on Close button from Edit Candidate page$")
	public void click_on_Close_button_from_Edit_Candidate_page() throws Throwable {	    

		common.clickOnCloseBtn();
//		if(common.confimYes != null)
//		{
//			common.clickOnConfirmYes();
//		}
	}

	@Then("^deleted skills should display on Candidate Details page \"([^\"]*)\"$")
	public void deleted_skills_should_display_on_Candidate_Details_page(String Skill3) throws Throwable {
	    Assert.assertEquals(Skill3.length()>0, true);
	}
	
	@Then("^delete all added skills$")
	public void delete_all_added_skills() throws Throwable {	
		List<WebElement> deletebtn = driver.findElements(By.xpath("//th[text()='Job Skills']//following::i[@class='fa fa-trash']"));
		for(int i=0;i<deletebtn.size();i++)                        
			{
				WebElement btn = deletebtn.get(i);
				Thread.sleep(3000);
				btn.click(); 
			}
	}

	@Then("^observe deleted job skill should not show when employer is going to add new candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void observe_deleted_job_skill_should_not_show_when_employer_is_going_to_add_new_candidate(String Skill1, String Skill2, String Skill3) throws Throwable {
		 
		 Assert.assertEquals(addcandidatepage.jobskill.size()>0, false);
	}
//		
////		9
//		
//		@Given("^click on Team tab and add one new team member by clicking on Add button for agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//		public void click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button_for_agency(String agyteam, String AgencyteammemberemailId, String AgencyteammemberNo) throws Throwable {
//
//			Thread.sleep(1000);
//			dashboardpage.openTeamPage();
//			Thread.sleep(1000);
//			teampage.AddTeamButton.click();
//			Thread.sleep(1000);
//			teampage.TeamMemberEmail.sendKeys(agyteam);
//			Thread.sleep(2000);
//			common.find.click();
////			teampage.TeamMemberName.sendKeys(AgencyteammemberemailId);
////			teampage.TeamMemberContactNumber.sendKeys(AgencyteammemberNo);
////			Thread.sleep(3000);
//			common.ClickSumbit();
//		}
//
//		@Given("^click on Close button from Team Members window$")
//		public void click_on_Close_button_from_Team_Members_window() throws Throwable {
//
//			Thread.sleep(3000);
//			teampage.closeTeamPage();
//		}
//		
//		@Then("^logout with agency team member$")
//		public void logout_with_agency_team_member() throws Throwable {
//		    
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//		}
//
//		@Given("^logout with agency owner$")
//		public void logout_with_agency_owner() throws Throwable {
//
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//		}
//
//		@Then("^Job should get successfully added and Job should be visible in Job drop down$")
//		public void job_should_get_successfully_added_and_Job_should_be_visible_in_Job_drop_down() throws Throwable {
//
//
//		}
//
//		@Then("^click on Workbench tab and select the job which is added by agency team member$")
//		public void click_on_Workbench_tab_and_select_the_job_which_is_added_by_agency_team_member() throws Throwable {
//
//			Thread.sleep(3000);
//			dashboardpage.openWorkbenchPage();
//			Thread.sleep(3000);
//			workbenchpage.selectJobK();
//		}
//
//		@Then("^new candidate should get added in New column$")
//		public void new_candidate_should_get_added_in_New_column() throws Throwable {
//
//
//		}
//	
//		@Then("^click on reload button$")
//		public void click_on_reload_button() throws Throwable {
//
//			Thread.sleep(3000);
//			workbenchpage.ReloadJobButton.click();
//
//		}
//		
//		@Then("^delete the agency team member \"([^\"]*)\"$")
//		public void delete_the_agency_team_member(String AgencyteammemberemailId) throws Throwable {
//		    
//			Thread.sleep(3000);
//			dashboardpage.openTeamPage();
//			Thread.sleep(3000);
//			teampage.searchField.sendKeys(AgencyteammemberemailId);
//			Thread.sleep(3000);
//			teampage.deletebtn.click();
//			Thread.sleep(3000);
//			common.clickOnConfirmYes();
//			Thread.sleep(3000);
//			common.clickOnCloseBtn();
//		}
//		
//		@When("^upload candidate resume$")
//	    public void upload_candidate_resume() throws Throwable {
//	  
//		Thread.sleep(3000);
//	    addcandidatepage.uploadResumeDocumentT();
//	    }
//
//		@When("^Enter basic details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//		public void enter_basic_details_of_candidate(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
//			workbenchpage.enterEmailId(CandidateEmail);
//			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//			addcandidatepage.uploadResumeDocument();
//			common.clickOnSaveBtn();
//			addcandidatepage.checkCandidateALreadyPresent();
//		}
//		
//		@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
//		public void enter_All_details_of_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
//			workbenchpage.enterEmailId(CandidateEmail);
//			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
//			addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
//			addcandidatepage.uploadResumeDocument();
//			common.clickOnSaveBtn(); 
//			addcandidatepage.checkCandidateALreadyPresent();
//		}
//		
//		@When("^Enter All details of except the expertise level \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
//		public void enter_All_details_of_except_the_expertise_level_and(String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
//			workbenchpage.enterEmailId(CandidateEmail);
//			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//			addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
//			addcandidatepage.uploadResumeDocument();
//			common.clickOnSaveBtn();
//			addcandidatepage.checkCandidateALreadyPresent();
//		}
//		
//		public void checkCandidateALreadyPresent() throws InterruptedException
//		{
//			try {
//				driver.findElement(By.xpath("//h6[contains(text(),'This candidate is already added to this job either by you or somebody else.')]")).isDisplayed();
//				System.out.println("This candidate is already added to this job either by you or somebody else");
//				common.clickOnOKBtn();
//				Thread.sleep(2000);
//				common.clickOnCloseBtn();
//				common.clickOnConfirmYes();
//			}
//			catch(NoSuchElementException e )
//			{}
//		}
////		@When("^Keep expertise level as Not answer \"([^\"]*)\" \"([^\"]*)\"$")
////		public void keep_expertise_level_as_Not_answer(String ExpertiseLevel1, String ExpertiseLevel2) throws Throwable {
////		    
////			 Thread.sleep(3000);
////			addcandidatepage.EnterexpertilevelofskillasNotanswered(ExpertiseLevel1, ExpertiseLevel2);
////		}
//
////		@Then("^select different expertise level for the skill which is having expert level as not answer \"([^\"]*)\" \"([^\"]*)\"$")
////		public void select_different_expertise_level_for_the_skill_which_is_having_expert_level_as_not_answer(String expertiselevel1, String expertiselevel2,String expertiselevel3) throws Throwable {
////		    
////			Thread.sleep(3000);
////			addcandidatepage.Enterexpertilevel(ExpertiseLevel1, ExpertiseLevel2, ExpertiseLevel3);;
////		}
	
	@When("^Enter All details except skills \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_All_details_except_skills(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.uploadResumeDocument();
	}

		
		@When("^enter as expertise level as \"([^\"]*)\"$")
		public void enter_as_expertise_level_as(String arg1) throws Throwable {
		   for(int i=0;i<3;i++)
		   {
			   select= new Select(addcandidatepage.expertiselevel.get(i)); 
			   select.selectByIndex(0);
		   }
		}
		
		@Then("^select different expertise level for the skill which is having expert level as not answer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void select_different_expertise_level_for_the_skill_which_is_having_expert_level_as_not_answer(String expertiseLevel, String expertiseLeve2, String expertiseLeve3) throws Throwable {
			Thread.sleep(2000);
			executor.executeScript("window.scrollBy(0,10000)");		
			Thread.sleep(2000);
			select= new Select(addcandidatepage.expertiselevel.get(0));
			select.selectByVisibleText(expertiseLevel);					
			select= new Select(addcandidatepage.expertiselevel.get(1));
			select.selectByVisibleText(expertiseLevel);		
			select= new Select(addcandidatepage.expertiselevel.get(2));
			select.selectByVisibleText(expertiseLevel);			    
		}


		@Then("^The candidate whose skill expert level is set as Not answer for that candidate card there should show bell icon$")
		public void the_candidate_whose_skill_expert_level_is_set_as_Not_answer_for_that_candidate_card_there_should_show_bell_icon() throws Throwable {
			Thread.sleep(3000);			
			candidatecardsectionpage.verifyBellIconOnCandidateCard();		
		}
		
		@Given("^Share job with agency owner \"([^\"]*)\"$")
		public void share_job_with_agency_owner(String team) throws Throwable {
		   Thread.sleep(3000);
		   workbenchpage.shareJob.click();
		   workbenchpage.shareWithTeamButton.click();		   
		   select=new Select(sharewithteampage.selectTeam);
		   select.selectByVisibleText(team);
		   Thread.sleep(2000);
		   common.apply.click();
		   common.clickOnConfirmYes();
		}
		
//		
//		@When("^Click on Edit Candidate icon on candidate card \"([^\"]*)\"$")
//		public void click_on_Edit_Candidate_icon_on_candidate_card(String Name) throws Throwable {
//		    
//			Thread.sleep(5000);
//			candidatecardsectionpage.clickOnEditCandidateIcon(Name);
//		}
//
//
		@Then("^when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card$")
		public void when_user_set_expertise_level_other_than_Not_answer_in_edit_candidate_at_that_time_bell_icon_should_removed_from_candidate_card() throws Throwable {		    
			boolean bellicon = driver.findElements(By.xpath("//span[@title='Skill information is missing']")).size()>0;
			Assert.assertEquals(bellicon, false);
		}
		
		@Then("^The candidate whose skill expert level is set as Not for that candidate card there should show bell icon$")
		public void the_candidate_whose_skill_expert_level_is_set_as_Not_for_that_candidate_card_there_should_show_bell_icon() throws Throwable {
			boolean bellicon = driver.findElement(By.xpath("//span[@title='Skill information is missing']")).isDisplayed();
			Assert.assertEquals(bellicon, true);
		}
//
//		@When("^click on save button$")
//		public void click_on_save_button() throws Throwable {		    
//			Thread.sleep(3000);
//		    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
//		    Thread.sleep(3000);
//			common.clickOnConfirmYes();
//		}
//			
////	11	
//		@Given("^Open browser$")
//		public void open_browser() throws Throwable {
//		    
//			Thread.sleep(3000);
//			baseclass.initialization();
//			
//		}
//
//		@When("^click on Employer-Agency SignIn link$")
//		public void click_on_Employer_Agency_SignIn_link() throws Throwable {
//		    
//			Thread.sleep(3000);
//			registerpage.clickEmployerAgencySignInlink();
//		}
//
//		
//		@When("^Go to Workbench$")
//		public void go_to_Workbench() throws Throwable {
//		   
//			Thread.sleep(3000);
//			dashboardpage.openWorkbenchPage();
//
//		}
//
////		@When("^Add a new Job as employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
////		public void add_a_new_Job_as_employer(String JobTitle, String JobDesignation, String Industry, String JobRole, String JobLocation, String JobBudget, String MinExp, String MaxExp, String NoOfInterviews, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
////			
////			Thread.sleep(3000);
////
////			workbenchpage.AddJob();
////			
////			Thread.sleep(3000);
////			
////            addjobpage.filljobDetails(JobTitle, JobDesignation, Industry, JobRole, JobLocation, JobBudget, MinExp, MaxExp, NoOfInterviews, JobNoticePeriod);
////			
////			Thread.sleep(3000);
////			
////			addjobpage.addNewSkill1(JobSkill1);
////			
////			Thread.sleep(3000);
////			
////			addjobpage.addNewSkill2(JobSkill2);
////			
////			
////			Thread.sleep(3000);
////			
////			addjobpage.deleteSkill3.click();
////			
////			Thread.sleep(3000);
////			
////			common.submitbtn.click();
////
////		}
//
//		@When("^Verify that job is added or not$")
//		public void verify_that_job_is_added_or_not() throws Throwable {
//		    
//	Thread.sleep(3000);
//			
//			driver.findElement(By.id("jobDropdown")).click();
//			boolean jobdisplayed = driver.findElement(By.xpath("//option[contains(text(),'Engineer - Active')]")).isDisplayed();
//			
//			Assert.assertEquals(true, jobdisplayed);
//			
//			{         
//				  try   
//				  {    
//				    if(driver.findElement(By.xpath("//option[contains(text(),'Engineer - Active')]")).isDisplayed())
//				     
//				    {      
//				       System.out.println("Job got added Successfully");
//				    }    
//				  }      
//				  catch(NoSuchElementException e)     
//				  {       
//					  System.out.println("Job not got added");
//				  }       
//				}
//		}
//
//		@When("^Select the same job from job drop down$")
//		public void select_the_same_job_from_job_drop_down() throws Throwable {
//		    
//			 Thread.sleep(3000);
//
//	         workbenchpage.selectJobK();
//			
//		}
//
//
//		@When("^Enter valid \"([^\"]*)\"$")
//		public void enter_valid(String CandidateEmail) throws Throwable {
//		    
//	        Thread.sleep(3000);
//			
//			addcandidatepage.EntercandidateemailT(CandidateEmail);
//
//		}
//
//		@When("^click on find button$")
//		public void click_on_find_button() throws Throwable {
//		    
//			 Thread.sleep(3000);
//				
//			 addcandidatepage.clickonFindbtn();
//		}
//		
//
//		
//		@When("^fill all the information \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
//		public void fill_all_the_information_and(String profiletitle, String CandidateEmail, String Name, String ContactNumber, String Designation, String  Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String  CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress, String relocate) throws Throwable {
//
//			Thread.sleep(3000);
//			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//			Thread.sleep(3000);
//			addcandidatepage.uploadResumeDocumentT();
//
//		}
//
//		
//		@When("^Verify candidate is displayed on workbench$")
//		public void verify_candidate_is_displayed_on_workbench() throws Throwable {
//		   
//			Thread.sleep(3000);
//			workbenchpage.verifyCandidateAddedDisplayedOnWorkbenchOrNot();
//		}
//
//		@Then("^click on close job button and delete the job$")
//		public void click_on_close_job_button_and_delete_the_job() throws Throwable {
//		    
//			Thread.sleep(3000);
//			workbenchpage.clickOnCloseJobButton();
//			
////			Thread.sleep(3000);
////			common.clickOnConfirmYes();
//			
//		}
//		
////		@When("^Add a new Job as employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
////		public void add_a_new_Job_as_employer(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
////
////			Thread.sleep(3000);
////			addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
////
////		}		
////		@When("^Add a new Job as agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
////		public void add_a_new_Job_as_agency(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
////
////			Thread.sleep(3000);
////			addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
////
////		}
//		
//		@Then("^Select the same job from job drop down \"([^\"]*)\" \"([^\"]*)\"$")
//		public void select_the_same_job_from_job_drop_down(String Title, String OrganizationName) throws Throwable {
//
////			Thread.sleep(3000);
////			driver.findElement(By.xpath("//button[@title='Reload Job']")).click();
//			Thread.sleep(5000);
//	        workbenchpage.selectjobT(Title, OrganizationName);
//
//		}
//		
		@Then("^Click on save btn$")
		public void click_on_save_btn() throws Throwable {
			
			Thread.sleep(3000);			
//          common.savebtn.click();
            executor.executeScript("arguments[0].click();",common.savebtn);

		}

//		@When("^click on Add Candidate button$")
//		public void click_on_Add_Candidate_button() throws Throwable {
//
//			Thread.sleep(5000);
//			workbenchpage.clickOnAddCandidate();
//		}
//
//		
		@When("^Drag the candidate card from that column to rejected column$")
		public void drag_the_candidate_card_from_that_column_to_rejected_column1() throws Throwable {

			   WebElement drag = candidatecardsectionpage.candidateCard;
//			   WebElement drop1 = candidatecardsectionpage.InterviewPendingthreecolumn;
//			   WebElement dropa=candidatecardsectionpage.allColumn.get(6);
//			   WebElement dropb=candidatecardsectionpage.allColumn.get(9);
			   int getRejectedColumnLocation=candidatecardsectionpage.allColumn.size()-1;
			   WebElement drop2 = candidatecardsectionpage.allColumn.get(getRejectedColumnLocation);
			   Action.clickAndHold(drag);
			   JavascriptExecutor js = (JavascriptExecutor)driver;
		       js.executeScript("arguments[0].scrollIntoView(true);", drop2);
		       Action.clickAndHold(drag).moveToElement(drop2).release(drop2).perform();

		}
		
//		@When("^confirmation popup should diplay with Yes and No button and click on Yes buton \"([^\"]*)\"$")
//		public void confirmation_popup_should_diplay_with_Yes_and_No_button_and_click_on_Yes_buton(String Name) throws Throwable {
//			Assert.assertEquals("Are you sure you want to reject "+Name+" ?", driver.findElement(By.xpath("//h6[@class='text-center mb-0 alert-message']")).getText());
//			Thread.sleep(3000);
//			common.clickOnConfirmYes();
//		}
//		
//
////		
//		@When("^select the reason of rejection and cick on submit button$")
//		public void select_the_reason_of_rejection_and_cick_on_submit_button() throws Throwable {
//		    
//			Thread.sleep(3000);
//			workbenchpage.selectCandidateRejectionReason();
//			
//			Thread.sleep(1000);
//			common.ClickSumbit();
//		}

		@Then("^drag the candidate card from rejected column to any other column$")
		public void drag_the_candidate_card_from_rejected_column_to_any_other_column() throws Throwable {
			Thread.sleep(5000);
		    executor.executeScript("window.scrollBy(5000,0)", "");		    
			WebElement drag = candidatecardsectionpage.candidateCard;
//			int locationOfJoinedColumn=candidatecardsectionpage.allColumn.size()-3;
			WebElement drop = driver.findElement(By.xpath("(//td[@class='TableCard' and @id='jobStatusColumn'])[8]"));		   		
//		    executor.executeScript("arguments[0].scrollIntoView(true);", drag);
		    Actions action = new Actions(driver);
//			explicitwait.until(ExpectedConditions.elementToBeClickable(drag));
			Thread.sleep(3000);
			action.clickAndHold(drag).moveToElement(drop).release(drop);
//			action.dragAndDrop(drag, drop).build();
			action.perform();			
		}

		
//		@Then("^Add team member$")
//		public void add_team_member(DataTable credentials) throws Throwable {
//			dashboardpage.enterAllDetails(profile, credentials);
//		}
//
//		@Then("^logout with employer and login as employer team member$")
//		public void logout_with_employer_and_login_as_employer_team_member() throws Throwable {
//		    
//			Thread.sleep(3000);
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//			registerpage.clickEmployerAgencySignInlink();
//			Thread.sleep(3000);
//			registerpage.loginwithEmployerTeamMember();
//			
//		}
//
//
//		@Then("^logout as employer team member and login as employer$")
//		public void logout_as_employer_team_member_and_login_as_employer() throws Throwable {
//
//			Thread.sleep(3000);
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//			registerpage.clickEmployerAgencySignInlink();
//			Thread.sleep(3000);
//	        registerpage.employerlogin();
//		}
//
//		@Then("^delete the team member$")
//		public void delete_the_team_member(String team) throws Throwable {
//		   
//			Thread.sleep(3000);
//			teampage.deleteteamK(team);
//			
//		}
//
//		@Then("^add a team member to agency$")
//		public void add_a_team_member_to_agency() throws Throwable {
//		    
//			Thread.sleep(3000);
//			dashboardpage.openTeamPage();
//			Thread.sleep(3000);
//			teampage.clickOnAddBtnK();
//			Thread.sleep(3000);
//			teampage.fillAgencyTeamMemberDetails();
//			Thread.sleep(3000);
//			common.ClickSumbit();
//			
//		}
//
//		@Then("^logout with agency and login as agency team member$")
//		public void logout_with_agency_and_login_as_agency_team_member() throws Throwable {
//		    
//			Thread.sleep(3000);
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//			registerpage.clickEmployerAgencySignInlink();
//			Thread.sleep(3000);
//			registerpage.loginwithAgencyTeamMember();
//		}
//
//		@Then("^logout as agency team member and login as agency$")
//		public void logout_as_agency_team_member_and_login_as_agency() throws Throwable {
//		    
//			Thread.sleep(3000);
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//			registerpage.clickEmployerAgencySignInlink();
//			Thread.sleep(3000);
//	        registerpage.agencylogin();
//		}
//		
////		@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
////		public void enter_All_details_of_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
////			workbenchpage.enterEmailId(CandidateEmail);
////			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
////			addcandidatepage.addSkill(level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
////			addcandidatepage.uploadResumeDocument();
////			common.clickOnSaveBtn();
////			addcandidatepage.checkCandidateALreadyPresent();
////		}


		@When("^Add job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
		public void add_jobskill_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws Throwable 
		{
			addjobpage.addjob(credentials);
			addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3);		
			common.ClickSumbit();
//			common.clickOnOKBtn();
		}
	
		@Then("^verify the Auto Populated fields on candidate update profile popup window \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
		public void verify_the_Auto_Populated_fields_on_candidate_update_profile_popup_window(String Username, String CandidateEmail, String profiletitle, String Name, String ContactNumber, String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String relocate) throws Throwable {
		    candidateupdateprofilepage.AssertDetailsOnCandidateProfile(Username, CandidateEmail, profiletitle, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode,relocate);
		    
		    
		}
		
		@Then("^Add mandatory details on candidate profile page and save the details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void add_mandatory_details_on_candidate_profile_page(String jobtype, String shift,String title) throws Throwable {
			if(candidateupdateprofilepage.title.getAttribute("value").isEmpty())
			{
				candidateupdateprofilepage.title.sendKeys(title);
			}
			if(addjobpage.functionalArea.getAttribute("value").isEmpty())
			{
				addjobpage.functionalArea.sendKeys("java");
			}
			if(candidateupdateprofilepage.Shift.getText().contentEquals(shift))
			{
				candidateupdateprofilepage.Shift.sendKeys(shift);
				driver.findElement(By.xpath("//span[contains(text(),'"+shift+"')]")).click();
			}
			if(candidateupdateprofilepage.jobType.getText().contentEquals(jobtype))
			{				
				candidateupdateprofilepage.jobType.sendKeys(jobtype);
				driver.findElement(By.xpath("//span[contains(text(),'"+jobtype+"')]")).click();
			}	
			if(addcandidatepage.cv.getText().isEmpty())
			{
				addcandidatepage.cv.sendKeys("C:\\Selenium\\CV.docx");
			}	
		    common.clickOnSaveBtn();
			common.clickOnOKBtn();
		}
		
		@When("^verify candidate card is displaying or not in New column \"([^\"]*)\"$")
		public void verify_candidate_card_is_displaying_or_not_in_New_column(String Name) throws Throwable {
			explicitwait.until(ExpectedConditions.elementToBeClickable(candidatecardsectionpage.editCandidate));
			driver.findElement(By.xpath("//th[text()=' New ']//following::span[text()=' "+Name+"']")).isDisplayed();

		}
		@When("^move the candidate card from potential candidate to new column$")
		public void move_the_candidate_card_from_potential_candidate_to_new_column() throws Throwable {
			Thread.sleep(2000);	  
			WebElement drag = candidatecardsectionpage.candidateCard;
			WebElement drop = driver.findElement(By.xpath("//td[2]"));		   		
		    Actions action = new Actions(driver);
			Thread.sleep(3000);
			action.clickAndHold(drag);
			executor.executeScript("arguments[0].scrollIntoView()", drop);
			action.moveToElement(drop).release(drop).perform();
		}
		
//reg13


		@Given("^verify By default hide contacts drop-down value is \"([^\"]*)\" for \"([^\"]*)\"$")
		public void verify_By_default_hide_contacts_drop_down_value_is_for(String Hidecontact, String CandidateEmail) throws Throwable {
			workbenchpage.enterEmailId(CandidateEmail);
			select=new Select(addcandidatepage.hideContact);
			Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), Hidecontact);
		}
		
		@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\" and select \"([^\"]*)\" in Hide Candidate Contact$")
		public void enter_All_details_of_and_and_select_in_Hide_Candidate_Contact(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2,String hideContact) throws Throwable {			
			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
			select=new Select(addcandidatepage.hideContact);
			select.selectByVisibleText(hideContact);
			addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
			addcandidatepage.uploadResumeDocument();
			common.clickOnSaveBtn(); 
			addcandidatepage.checkCandidateALreadyPresent();
		}
		
		@Given("^Click on Candidate name from candidate card \"([^\"]*)\"$")
		public void click_on_Candidate_name_from_candidate_card(String Name) throws Throwable {
		    candidatecardsectionpage.clickOnEyeIcon(Name);
		}

		@Given("^Verify Email and contact no should not display for employer$")
		public void verify_Email_and_contact_no_should_not_display_for_employer() throws Throwable {
		   Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Email Id ']//following::td[text()='Hidden By Agency']")).isDisplayed(), true);
		   Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Contact No. ']//following::td[contains(text(),'Hidden By Agency')]")).isDisplayed(), true);
		}
		
		@Given("^Verify Email and contact no should not display for employer on edit candidate page$")
		public void verify_Email_and_contact_no_should_not_display_for_employer_on_edit_candidate_page() throws Throwable {
		   Thread.sleep(5000);
		   System.out.println("data"+addcandidatepage.emailField.getAttribute("value"));
		   Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"),"Hidden By Agency");
		   Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"),"Hidden By Agency");
		   
		}
		
		@Given("^set hide contacts drop-down value as \"([^\"]*)\"$")
		public void set_hide_contacts_drop_down_value_as(String hideContact) throws Throwable {
			select=new Select(addcandidatepage.hideContact);
			select.selectByVisibleText(hideContact);
			Thread.sleep(2000);
			editcandidatepage.saveButton.click();
		}

//		@Given("^Verify Email \"([^\"]*)\" and contact no \"([^\"]*)\" should display for employer$")
//		public void verify_Email_and_contact_no_should_display_for_employer(String candidateEmail, String contactNumber) throws Throwable {
//		Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Email Id ']//following::td[contains(text(),'"+candidateEmail+"')]")).isDisplayed(), true);
//		Assert.assertEquals(driver.findElement(By.xpath("//strong[contains(text(),'Contact No.')]//following::td[contains(text(),'"+contactNumber+"')]")).isDisplayed(), true);
//		}
//
//		@Given("^Verify Email \"([^\"]*)\" and contact no \"([^\"]*)\" should display for employer on edit candidate page$")
//		public void verify_Email_and_contact_no_should_display_for_employer_on_edit_candidate_page(String candidateEmail, String contactNumber) throws Throwable {
//			Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"), candidateEmail);
//			Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"), contactNumber);		
//		}
		
		@When("^Share job with agency/team \"([^\"]*)\"$")
		public void share_job_with_agency_team(String Sharewith) throws Throwable {
		    if(loginpage.b==true)
		    {
		    	sharewithagencypage.shareWithAgency(Sharewith);
		    }
		    else
		    {
		    	sharewithteampage.shareWithTeam(Sharewith);
		    }
		}
		
		@Given("^Give Can see All candidates permission \"([^\"]*)\"$")
		public void give_Can_see_All_candidates_permission(String Teamid) throws Throwable {
			sharewithteampage.canSeeAllCandidate(Teamid);
		}
		
		@When("^candidate card should display in screened column$")
		public void candidate_card_should_display_in_screened_column() throws Throwable {
		   explicitwait.until(ExpectedConditions.visibilityOf(candidatecardsectionpage.candidateCard));
		   Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),' Screened ')]//span[text()='1']")).isDisplayed(), true);
		}

		@When("^Select the same question and edit the question and answers \"([^\"]*)\" \"([^\"]*)\"$")
		public void select_the_same_question_and_edit_the_question_and_answers(String oldQuestion, String newQuestion) throws Throwable {
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//td[contains(text(),'"+oldQuestion+"')]//following::i[@ngbtooltip='Edit']")).click();
		   addquestionarypage.EditQuestionT(newQuestion);
		   explicitwait.until(ExpectedConditions.elementToBeClickable(addquestionarypage.SaveChangesBtn));
		   addquestionarypage.SaveChangesBtn.click();		   
		}

		@When("^Verify both old and new question should display in sections \"([^\"]*)\" \"([^\"]*)\"$")
		public void verify_both_old_and_new_question_should_display_in_sections(String oldQuestion, String newQuestion) throws Throwable {
		   Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'Job Questions')]//following::strong[contains(text(),'1 : "+oldQuestion+"')]")).isDisplayed(), true);
		   Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'Revised Job Questions')]//following::strong[contains(text(),'1 : "+newQuestion+"')]")).isDisplayed(), true);

		}
		
		@When("^In Revised job question section \\(New question \\) Give answer \"([^\"]*)\" \"([^\"]*)\"$")
		public void in_Revised_job_question_section_New_question_Give_answer(String question, String answer) throws Throwable {
			 addquestionarypage.answerthequestion(question, answer);
		}
		
		@When("^Verify the result should be correct$")
		public void verify_the_result_should_be_correct() throws Throwable {
		  Assert.assertEquals(candidatecardsectionpage.passIcon.isDisplayed(), true);
		}
		
//		jobcan4
		
		@When("^Upload the resume and click on find button$")
		public void upload_the_resume_and_click_on_find_button() throws Throwable {
			addcandidatepage.uploadResumeDocument();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//button[contains(text(),'Find')])[2]")).click();
		}

		@When("^Enter all required details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
		public void enter_all_required_details_of_candidate_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
			addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
			addcandidatepage.candidateMandatoryDetails(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
			addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
			common.clickOnSaveBtn(); 
			addcandidatepage.checkCandidateALreadyPresent();
		}
	}
	
