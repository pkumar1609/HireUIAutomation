package stepDefinition1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class addjobsteps extends baseclass{

//scenario 1:
	@Given("^User is on Home page of application$")
	public void user_is_on_Home_page_of_application() throws Throwable {
		
		baseclass.initialization();
	}

	@When("^title of page is \"([^\"]*)\"$")
	public void title_of_page_is(String arg1) throws Throwable {
	    
		String pageTitle = loginpage.validateTitle();
		System.out.println("Home page of application: " +pageTitle);
	}
	
	@When("^enter valid user \\\"([^\\\"]*)\\\" and \\\"([^\\\"]*)\\\" for registered employer and agency and click on Sign in button$")
	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
	    
		loginpage.emailaddress.sendKeys(arg1);
		loginpage.password.sendKeys(arg2);
		loginpage.signin.click();
		Thread.sleep(6000);
	}

	@When("^click on Workbench tab$")
	public void click_on_Workbench_tab() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(5000);
	}

	@When("^click on Add Job button$")
	public void click_on_Add_Job_button() throws Throwable {
	   
	   workbenchpage.AddJob();
	   Thread.sleep(2000);
	   addjobpage.validateJobPageTitle();
	}

	@When("^fill all mandatory details on Add Job popup window$")
	public void fill_all_mandatory_details_on_Add_Job_popup_window() throws Throwable {
	    
		addjobpage.fillDetails();
	}
	
	@When("^Click on submit button$")
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
		se.selectByVisibleText("Automation1");
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
	    
		addjobpage.budget.clear();
		addjobpage.budget.sendKeys("350000");
		Thread.sleep(1000);
		
	}

//	@Then("^click on submit button$")
//	public void click_on_submit_button() throws Throwable {
//	    
//	}

	@Then("^User should be able to update the job$")
	public void user_should_be_able_to_update_the_job() throws Throwable {
	    
	}

	@Then("^again click on click on Edit Job button and observe the changes$")
	public void again_click_on_click_on_Edit_Job_button_and_observe_the_changes() throws Throwable {
	    
	}

	@Then("^all updated information should be saved in the job$")
	public void all_updated_information_should_be_saved_in_the_job() throws Throwable {
	    
	}

	@When("^click on Add Skill button and add some skills$")
	public void click_on_Add_Skill_button_and_add_some_skills() throws Throwable {
	    
		addjobpage.addSkillButton();
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
