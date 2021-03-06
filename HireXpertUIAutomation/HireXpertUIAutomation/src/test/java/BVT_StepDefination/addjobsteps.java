package BVT_StepDefination;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class addjobsteps extends baseclass{

//@bvt 
	
//	@When("^title of page is HireXpert$")
//	public void title_of_page_is_HireXpert() throws Throwable {
//	    
//		String title = loginpage.validateTitle();
//		System.out.println("Title of HireXpert application: " +title);
//	}
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
//		
//	}


	
//	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
//	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
//	    
//		Thread.sleep(4000);
//		
//		registerpage.clickEmployerAgencySignInlink();
//		Thread.sleep(3000);
//		
//		loginpage.emailaddress.sendKeys(arg1);
//		loginpage.password.sendKeys(arg2);
//		loginpage.signin.click();
//		Thread.sleep(5000);
//		loginpage.identifyUserK();
//	}

	@When("^click on Workbench tab$")
	public void click_on_Workbench_tab() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(5000);
	}	

	
	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		Thread.sleep(4500);
		common.submitbtn.click();		
	}

	@Then("^Job should get successfully added and Job should be visible in Job drop down$")
	public void job_should_get_successfully_added_and_Job_should_be_visible_in_Job_drop_down() throws Throwable {
	    
		System.out.println("\nNew job get added..");
	}
	
//	@Then("^click on employer tab and delete the employer if login as agency\\.$")
//	public void click_on_employer_tab_and_delete_the_employer_if_login_as_agency() throws Throwable {
//	    
//		Thread.sleep(3000);
//		workbenchpage.deleteEmployerfromEmployerTabasAgency();
//		}
//		
	
//	@Then("^click on Employers tab at the top and verify user able to delete the employer or not when agency is logged in$")
//	public void click_on_Employers_tab_at_the_top_and_verify_user_able_to_delete_the_employer_or_not_when_agency_is_logged_in() throws Throwable {
//	    
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		if(dynamicElement.size() != 0){
//
//			System.out.println("\nEmployer tab not present for Employer user..");
//		}
//		
//		else{
//			
//			dashboardpage.openEmployersPage();
//			Thread.sleep(3000);
//			employerspage.searchEmployer();	
//			Thread.sleep(2000);
//			employerspage.deleteSearchedEmployer();
//			Thread.sleep(2000);
//			
//			String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
//			String ExpectedAlertMessage = "Job is added for this employer. First you need to close the job for this employer then you can delete the employer.";
//			
//			Assert.assertEquals(ExpectedAlertMessage, ActualAlertMessage);
//			
//			driver.findElement(By.id("alertModalCloseBtn")).click();
//			Thread.sleep(1000);
//            common.clickOnCloseBtn();
//            Thread.sleep(2000);
//			dashboardpage.openWorkbenchPage();
//			Thread.sleep(5000);
//			
//			
//		}
//			
//	}
	
//	@Then("^click on Job drop down and select recently added job$")
//	public void click_on_Job_drop_down_and_select_recently_added_job() throws Throwable {
//	    
//		Thread.sleep(3000);
//		workbenchpage.selectJob();
//	}
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
//	

	@Then("^User should be able to update the job$")
	public void user_should_be_able_to_update_the_job() throws Throwable {
	    
		System.out.println("User able to update job details..");
	}

//	@Then("^again click on Edit Job button and observe the changes$")
//	public void again_click_on_Edit_Job_button_and_observe_the_changes() throws Throwable {
//		Thread.sleep(3000);
//		workbenchpage.clickonthreedot();
//		workbenchpage.editJobButton.click();
//		Thread.sleep(3000);
//		String expectedBudget = editjobpage.budget.getText();
//		String expectedNoticePeriod = editjobpage.noticePeriod.getText();
//		String actualBudget = editjobpage.budget.getText();
//		String actualNoticePeriod = editjobpage.noticePeriod.getText();
//		
//		if(expectedBudget.equals(actualBudget) && expectedNoticePeriod.equals(actualNoticePeriod)) {
//			
//			System.out.println("\nUpdated data displayed in the job");
//		}
//	}

	@Then("^all updated information should be saved in the job$")
	public void all_updated_information_should_be_saved_in_the_job() throws Throwable {
	    
		System.out.println("User able to update the job details..");
		Thread.sleep(1000);
	}

//	@When("^click on Add Skill button and add some skills$")
//	public void click_on_Add_Skill_button_and_add_some_skills() throws Throwable {
//	    
//		addjobpage.addtenSkills();
//		System.out.println("New skill rows get added..");
//	}
	
	@Then("^one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills$")
	public void one_job_skill_row_should_get_added_after_clicking_on_Add_Skill_button_and_user_should_able_to_add_only_ten_skills() throws Throwable {
	    
		System.out.println("\nUser not able to add more than 10 skills");
	    System.out.println("Error message displayed like: User should not add more than 10 skills");
	    Thread.sleep(2000);
	    driver.findElement(By.id("alertModalCloseBtn")).click();
	    Thread.sleep(2000);
	}

//	@When("^click on Delete Skill button in front of any skill$")
//	public void click_on_Delete_Skill_button_in_front_of_any_skill() throws Throwable {
//	    
//		Thread.sleep(2000);
//		addjobpage.deleteSkills();
//		Thread.sleep(2000);
//		common.clickOnCloseBtn();
//		Thread.sleep(2000);
//		common.clickOnConfirmYes();
//	}

	

	@Then("^after clicking on Delete Skill button present in front of skill then that skill row should get deleted$")
	public void after_clicking_on_Delete_Skill_button_present_in_front_of_skill_then_that_skill_row_should_get_deleted() throws Throwable {
	    
		System.out.println("\nSelected skill get deleted");
	}
	

// @regression1_01	

	
	@Then("^add one new candidate for the job and click on Find button$")
	public void add_one_new_candidate_for_the_job_and_click_on_Find_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addcandidatepage.emailField.sendKeys(data.get(0).get(0));
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}
	
	@Then("^Fill mandatory details$")
	public void fill_mandatory_details() throws Throwable {
	    
		addcandidatepage.salaryOffered.sendKeys("300000");
		Thread.sleep(1000);
	}
	
	@Then("^new candidate should get added in New column$")
	public void new_candidate_should_get_added_in_New_column() throws Throwable {
	    
		System.out.println("\nNew candidate get added to the job in New column..");
	}

	@Then("^click on Edit Job button to update skills and number of interview$")
	public void click_on_Edit_Job_button_to_update_skills_and_number_of_interview() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.job.click();
		workbenchpage.editJobButton.click();		
	}

	@Then("^select number of interview except previously selected number$")
	public void select_number_of_interview_except_previously_selected_number() throws Throwable {
	    
		editjobpage.updateNoOfInterviews();
	}

//	@Then("^again click on Edit Job button and observe the number of interviews$")
//	public void again_click_on_Edit_Job_button_and_observe_the_number_of_interviews() throws Throwable {
//		Thread.sleep(2000);
//		workbenchpage.editJobButton.click();
//		select = new Select(addjobpage.totalinterviews);
//		Assert.assertEquals(select.getFirstSelectedOption().getText(), expected);
//	}




//	@Then("^enter skill details and click on submit button$")
//	public void enter_skill_details_and_click_on_submit_button(DataTable dt) throws Throwable {
//	    
//		List<List<String>> data = dt.raw();
//		Select se;
//		
//		addjobpage.jobskill3.sendKeys(data.get(0).get(0));
//		
//		se = new Select(addjobpage.expertiselevel3);
//		se.selectByVisibleText(data.get(0).get(1));
//		
//		se = new Select(addjobpage.weightage3);
//		se.selectByVisibleText(data.get(0).get(2));
//		
//		addjobpage.clickOnSubmitButton();
//		Thread.sleep(3000);
//	}
//
//	@Then("^observe Skills section for newly added skill$")
//	public void observe_Skills_section_for_newly_added_skill() throws Throwable {
//	    
//		String skill = addjobpage.jobskill3.getAttribute("value");
//		System.out.println("\nNew added skill: " + skill);
//	}
//
//	@Then("^Newly Added skills should be reflect in candidate profile which are already added for that job$")
//	public void newly_Added_skills_should_be_reflect_in_candidate_profile_which_are_already_added_for_that_job() throws Throwable {
//	    
//		System.out.println("Newly Added skills reflected in candidate profile..");
//	}
//	
	
	
// @regression1_02	
	
	


	


	

	
//@regression1_03	
	
//	@When("^click on Team tab and add one new team member by clicking on Add button for agency$")
//	public void click_on_Team_tab_and_add_one_new_team_member_by_clicking_on_Add_button_for_agency(DataTable dt) throws Throwable {
//	    
//		List<List<String>> data = dt.raw();
//		Thread.sleep(3000);
//
//		teampage.AddTeamButton.click();
//		Thread.sleep(3000);
//		teampage.TeamMemberName.sendKeys(data.get(0).get(0));
//		teampage.TeamMemberEmail.sendKeys(data.get(0).get(1));
//		teampage.TeamMemberContactNumber.sendKeys(data.get(0).get(2));
//		common.submitbtn.click();
//		System.out.println("\nNew team member get added by agency..");
//		Thread.sleep(3000);
//	}

	@When("^logout with agency owner$")
	public void logout_with_agency_owner() throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
	}

	@When("^enter valid user email address and password for agency team member and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_agency_team_member_and_click_on_Sign_in_button(DataTable dt) throws Throwable {
	    
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}
	
//	@When("^click on Workbench tab and click on Add Job button and fill all mandatory details on Add Job popup window for agency team member$")
//	public void click_on_Workbench_tab_and_click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window_for_agency_team_member(DataTable dt) throws Throwable {
//	    
//		dashboardpage.openWorkbenchPage();
//		Thread.sleep(3000);
//		
//		List<List<String>> data = dt.raw();
//		Select se;
//		
//		workbenchpage.AddJob();
//		Thread.sleep(2000);
//		addjobpage.validateJobPageTitle();
//		
//		addjobpage.title.sendKeys(data.get(0).get(0));
//		addjobpage.designation.sendKeys(data.get(0).get(1));
//		addjobpage.industry.sendKeys(data.get(0).get(2));
//		addjobpage.jobrole.sendKeys(data.get(0).get(3));
//		addjobpage.location.sendKeys(data.get(0).get(4));
//		addjobpage.budget.sendKeys(data.get(0).get(5));
//		addjobpage.minexp.sendKeys(data.get(0).get(6));
//		addjobpage.maxexp.sendKeys(data.get(0).get(7));
//		se = new Select(addjobpage.totalinterviews);
//		se.selectByVisibleText(data.get(0).get(8));
//		
//		Thread.sleep(1000);
//		addjobpage.addNewSkill1();
//		addjobpage.addNewSkill2();
//		
//		Thread.sleep(2000);
//		addjobpage.employerplusicon.click();
//		Thread.sleep(3000);
//		addjobpage.fillEmployerDetailsPlusIcon();
//		
//		driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")).click(); // submit button
//		System.out.println("Agency added new employer for the job..");
//		
//		Thread.sleep(3000);
//		addjobpage.employerDropDown();
//		Thread.sleep(2000);
//	}
	
	
	
	@Then("^click on Workbench tab and select the job which is added by agency team member$")
	public void click_on_Workbench_tab_and_select_the_job_which_is_added_by_agency_team_member(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		
		Select se = new Select(workbenchpage.jobDropDown);
		se.selectByVisibleText(data.get(0).get(0));
		Thread.sleep(3000);
	}
	
//	@When("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
//
//		Thread.sleep(3000);
//		addjobpage.addJobforEmployerandAgency(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
//	}
//
//	@When("^make any changes in the job \"([^\"]*)\" \"([^\"]*)\"$")
//	public void make_any_changes_in_the_job(String Budget1, String Noticeperiod) throws Throwable {
//
//		Thread.sleep(3000);
//		editjobpage.updateJobDetails(Budget1, Noticeperiod);
//		
//
//	}
//
//	@When("^Now Click on Add Skill button to add more than ten skills$")
//	public void now_Click_on_Add_Skill_button_to_add_more_than_ten_skills() throws Throwable {
//
//		Thread.sleep(3000);
//		addjobpage.addtenSkills();
//
//	}
//
//	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten skills$")
//	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_skills(String ExpectedErrorMessage) throws Throwable {
//
//    String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
//    
//    Assert.assertEquals(ExpectedErrorMessage, ActualAlertMessage);
//		
//	}
//
//
//
}
