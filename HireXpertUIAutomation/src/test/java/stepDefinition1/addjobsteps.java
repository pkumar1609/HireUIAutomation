package stepDefinition1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class addjobsteps extends baseclass{

	@Given("^User is on Home page of application$")
	public void user_is_on_Home_page_of_application() throws Throwable {
		
		baseclass.initialization();
	}

	@When("^title of page is HireXpert$")
	public void title_of_page_is_HireXpert() throws Throwable {
	    
		String pageTitle = loginpage.validateTitle();
		System.out.println("Home page of application: " +pageTitle);
	}
	
	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
	    
		loginpage.emailaddress.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);
		loginpage.signin.click();
		Thread.sleep(5000);
	}

	@When("^click on Workbench tab$")
	public void click_on_Workbench_tab() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(5000);
	}	
	
	@When("^click on Add Job button and fill all mandatory details on Add Job popup window$")
	public void click_on_Add_Job_button_and_fill_all_mandatory_details_on_Add_Job_popup_window() throws Throwable {
	   
		//Set implict wait to 0
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
		 //If list size is non-zero, element is present
			System.out.println("\nUser logged in as Employer..");
			
			workbenchpage.AddJob();
			Thread.sleep(2000);
			addjobpage.validateJobPageTitle();
			
			addjobpage.fillDetails();
			Thread.sleep(1000);
			addjobpage.addNewSkill1();
			addjobpage.addNewSkill2();
			addjobpage.deleteSkills();
		}
		
		else{
			
		 //Else if size is 0, then element is not present
			System.out.println("\nUser logged in as Agency..");
			
			workbenchpage.AddJob();
			Thread.sleep(2000);
			addjobpage.validateJobPageTitle();
			
			addjobpage.fillDetails();
			Thread.sleep(1000);
			addjobpage.addNewSkill1();
			addjobpage.addNewSkill2();
			addjobpage.deleteSkills();
			
			Thread.sleep(2000);
			addjobpage.employerplusicon.click();
			Thread.sleep(3000);
			addjobpage.fillEmployerDetailsPlusIcon();
			
			driver.findElement(By.xpath("/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")).click();
			System.out.println("Agency added new employer for the job..");
			
			Thread.sleep(3000);
			addjobpage.employerDropDown();
			Thread.sleep(2000);
		}
		
		//Revert back to default value of implicit wait
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}
	
	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	    
		addjobpage.clickOnSubmitButton();
		Thread.sleep(3000);
	}

	@Then("^Job should get successfully added and Job should be visible in Job drop down$")
	public void job_should_get_successfully_added_and_Job_should_be_visible_in_Job_drop_down() throws Throwable {
	    
		System.out.println("\nNew job get added..");
	}

	@Then("^click on Job drop down and select recently added job$")
	public void click_on_Job_drop_down_and_select_recently_added_job() throws Throwable {
	    
		Select se = new Select(workbenchpage.jobDropDown);
		se.selectByVisibleText("Automation1 - Active");
		Thread.sleep(3000);
	}

	@Then("^click on Edit Job button to make changes in job$")
	public void click_on_Edit_Job_button_to_make_changes_in_job() throws Throwable {
	    
		workbenchpage.editJobButton.click();
		Thread.sleep(3000);
		String title1 = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/add-edit-job/div[1]/h5")).getText();
		System.out.println("Title of page: " + title1);
	}

	@Then("^make any changes in the job$")
	public void make_any_changes_in_the_job() throws Throwable {
	    
		editjobpage.updateJobDetails();
		Thread.sleep(3000);
	}

	@Then("^User should be able to update the job$")
	public void user_should_be_able_to_update_the_job() throws Throwable {
	    
		System.out.println("User able to update job details..");
	}

	@Then("^again click on Edit Job button and observe the changes$")
	public void again_click_on_Edit_Job_button_and_observe_the_changes() throws Throwable {
	    
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

	@Then("^all updated information should be saved in the job$")
	public void all_updated_information_should_be_saved_in_the_job() throws Throwable {
	    
		System.out.println("User able to update the job details..");
		Thread.sleep(1000);
	}

	@When("^click on Add Skill button and add some skills$")
	public void click_on_Add_Skill_button_and_add_some_skills() throws Throwable {
	    
		addjobpage.addSkillButton();
		System.out.println("New skill rows get added..");
	}
	
	@Then("^one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills$")
	public void one_job_skill_row_should_get_added_after_clicking_on_Add_Skill_button_and_user_should_able_to_add_only_ten_skills() throws Throwable {
	    
		System.out.println("\nUser not able to add more than 10 skills");
	    System.out.println("Error message displayed like: User should not add more than 10 skills");
	    Thread.sleep(2000);
	    driver.findElement(By.id("alertModalCloseBtn")).click();
	    Thread.sleep(2000);
	}

	@When("^click on Delete Skill button in front of any skill$")
	public void click_on_Delete_Skill_button_in_front_of_any_skill() throws Throwable {
	    
		addjobpage.deleteSkills();
	}

	@Then("^after clicking on Delete Skill button present in front of skill then that skill row should get deleted$")
	public void after_clicking_on_Delete_Skill_button_present_in_front_of_skill_then_that_skill_row_should_get_deleted() throws Throwable {
	    
		System.out.println("\nSelected skill get deleted");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(5000);
		driver.quit();
	}
	
}
