package BVT_StepDefination;


import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class JobUpdateBVTStepDefination extends baseclass {

	
//
	
	@When("^title of page is HireXpert$")
	public void title_of_page_is_HireXpert() throws Throwable {
	    
		String title = loginpage.validateTitle();
		System.out.println("Title of HireXpert application: " +title);
	}
	
	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String emailaddress, String password) throws Throwable {
	   
		Thread.sleep(4000);
	
	registerpage.clickEmployerAgencySignInlink();
	Thread.sleep(3000);

	loginpage.emailaddress.sendKeys(emailaddress);
		loginpage.password.sendKeys(password);		
		loginpage.signin.click();
		
	}
	
//	@Then("^click on employer tab and delete the employer if login as agency\\.$")
//	public void click_on_employer_tab_and_delete_the_employer_if_login_as_agency() throws Throwable {
//	    
//		Thread.sleep(3000);
//		workbenchpage.deleteEmployerfromEmployerTabasAgency();
//		}
	
	
	@When("^make any changes in the job \"([^\"]*)\"$")
	public void make_any_changes_in_the_job(String JobNoticePeriod1) throws Throwable {

		Thread.sleep(3000);
		addjobpage.noticePeriod.clear();
		Thread.sleep(3000);
		addjobpage.noticePeriod.sendKeys(JobNoticePeriod1);
	}
		
	
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
	
	@Then("^click on Job drop down and select recently added job$")
	public void click_on_Job_drop_down_and_select_recently_added_job() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.selectJobK();
	}

	@Then("^click on Edit Job button to make changes in job$")
	public void click_on_Edit_Job_button_to_make_changes_in_job() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.job.click();	
		workbenchpage.editJobButton.click();
	}

	@Then("^again click on Edit Job button and observe the changes$")
	public void again_click_on_Edit_Job_button_and_observe_the_changes() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.clickonthreedot();
		workbenchpage.editJobButton.click();
		Thread.sleep(3000);
		String expectedBudget = editjobpage.budget.getText();
		String expectedNoticePeriod = editjobpage.noticePeriod.getText();
		String actualBudget = editjobpage.budget.getText();
		String actualNoticePeriod = editjobpage.noticePeriod.getText();
		
		if(expectedBudget.equals(actualBudget) && expectedNoticePeriod.equals(actualNoticePeriod)) {
			
			System.out.println("\nUpdated data displayed in the job");
		}
	}
	
	@When("^click on Add Skill button and add some skills$")
	public void click_on_Add_Skill_button_and_add_some_skills() throws Throwable {
	    
		addjobpage.addtenSkills();
		System.out.println("New skill rows get added..");
	}
	
	@When("^click on Delete Skill button in front of any skill$")
	public void click_on_Delete_Skill_button_in_front_of_any_skill() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnOKBtn();
		Thread.sleep(2000);
		addjobpage.deleteSkills();
		Thread.sleep(2000);
		common.clickOnCloseBtn();
		Thread.sleep(2000);
		common.clickOnConfirmYes();
	}
	
//	@When("^click on Add Job button and fill all mandatory details on Add Job popup window \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
//	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window(String JobTitle, String Industry, String JobDesignation, String MinSalary, String MaxSalary, String MinExp, String MaxExp, String NoOfInterviews, String CityArea, String ZipCode, String JobNoticePeriod, String JobSkill1, String JobSkill2) throws Throwable {
//	    
//		addjobpage.addJobforEmployerandAgency(JobTitle, Industry, JobDesignation, MinSalary, MaxSalary, MinExp, MaxExp, NoOfInterviews, CityArea, ZipCode, JobNoticePeriod, JobSkill1, JobSkill2);
//		
//
//	}




//	@When("^make any changes in the job \"([^\"]*)\" \"([^\"]*)\"$")
//	public void make_any_changes_in_the_job(String Budget1, String Noticeperiod) throws Throwable {
//
//		Thread.sleep(3000);
//		editjobpage.updateJobDetails(Budget1, Noticeperiod);
//		
//
//	}

	@When("^Now Click on Add Skill button to add more than fifteen skills$")
	public void now_Click_on_Add_Skill_button_to_add_more_than_fifteen_skills() throws Throwable {

		Thread.sleep(3000);
		for(int i=1;i<15;i++) {
		addjobpage.addskillbutton.click();
	}
}
		
		@Then("^Now Click on Add Skill button to add more than ten skills for candidate$")
		public void now_Click_on_Add_Skill_button_to_add_more_than_ten_skills_for_candidate() throws Throwable {
			Thread.sleep(3000);
			for(int i=0;i<10;i++) {
			addjobpage.addskillbutton.click();
		}

	}

	@Then("^Verify that user get an alert message as \"([^\"]*)\" for adding more than ten skills$")
	public void verify_that_user_get_an_alert_message_as_for_adding_more_than_ten_skills(String ExpectedErrorMessage) throws Throwable {

	Thread.sleep(3000);
    String ActualAlertMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();   
    Assert.assertEquals(ExpectedErrorMessage, ActualAlertMessage);
		
	}



}

	
