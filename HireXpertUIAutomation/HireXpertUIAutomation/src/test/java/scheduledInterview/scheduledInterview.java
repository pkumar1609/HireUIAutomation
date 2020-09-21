package scheduledInterview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class scheduledInterview extends baseclass {
	
	@Given("^User is on Home page of application$")
	public void user_is_on_Home_page_of_application() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^title of page is HireXpert$")
	public void title_of_page_is_HireXpert() throws Throwable {
	    
		String title = loginpage.validateTitle();
		System.out.println("Title of page: " + title);
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
		Thread.sleep(3000);
	}

	@When("^select job from jobs drop down$")
	public void select_job_from_jobs_drop_down() throws Throwable {
	    
		workbenchpage.selectJob();
		Thread.sleep(3000);
	}

	@When("^click on Add Candidate button and one new candidate for the job$")
	public void click_on_Add_Candidate_button_and_one_new_candidate_for_the_job(DataTable dt) throws Throwable {
	    
				List<List<String>> data = dt.raw();
		
				driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
				
				List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
				if(dynamicElement.size() != 0){
					
					System.out.println("\nUser logged in as Employer..");
					
					workbenchpage.addCandidateButton.click();
					Thread.sleep(1000);
					addcandidatepage.validatePageTitle();
					addcandidatepage.emailField.sendKeys(data.get(0).get(0));
					addcandidatepage.FindButton.click();
					Thread.sleep(3000);
					addcandidatepage.OKButtonPopup.click();
					addcandidatepage.salaryOffered.sendKeys("300000");
					Thread.sleep(1000);
					addcandidatepage.saveButton.click();
					driver.findElement(By.id("confirmModalBtn")).click();
					Thread.sleep(3000);
				}
				
				else{
					
					System.out.println("\nUser logged in as Agency..");
					
					workbenchpage.addCandidateButton.click();
					Thread.sleep(1000);
					addcandidatepage.validatePageTitle();
					addcandidatepage.emailField.sendKeys(data.get(0).get(1));
					addcandidatepage.FindButton.click();
					Thread.sleep(3000);
					addcandidatepage.OKButtonPopup.click();
					addcandidatepage.salaryOffered.sendKeys("250000");
					Thread.sleep(1000);
					addcandidatepage.saveButton.click();
					driver.findElement(By.id("confirmModalBtn")).click();
					Thread.sleep(3000);
				}
				
				driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}

	@When("^observe candidate is getting added in New column$")
	public void observe_candidate_is_getting_added_in_New_column() throws Throwable {
	    
		System.out.println("Candidate get added in New column");
	}

	@When("^click on Schedule Interview icon from candidate card$")
	public void click_on_Schedule_Interview_icon_from_candidate_card() throws Throwable {
	    
		workbenchpage.scheduleInterview.click();
		Thread.sleep(3000);
	}

	@When("^fill all interview details and click on Submit button$")
	public void fill_all_interview_details_and_click_on_Submit_button(DataTable credentials) throws Throwable {
	    
		scheduleinterviewpage.fillInterviewDetails();
		Thread.sleep(2000);
		scheduleinterviewpage.submitButton.click();
		Thread.sleep(3000);
		System.out.println("\nNew interview scheduled..");
	}

	@When("^click on close button from Interview details page$")
	public void click_on_close_button_from_Interview_details_page() throws Throwable {
	    
		scheduleinterviewpage.closeButton.click();
		Thread.sleep(2000);
	}
	
	@When("^observe the interview date and time displayed on candidate card below Assign To field$")
	public void observe_the_interview_date_and_time_displayed_on_candidate_card_below_Assign_To_field() throws Throwable {
	    
		String interview = workbenchpage.candidateCardInterviewDetails.getText();
		System.out.println("Interview Details on candidate card: " + interview);
	}

	@When("^click on Edit Interview icon in front of interview details like date and time$")
	public void click_on_Edit_Interview_icon_in_front_of_interview_details_like_date_and_time() throws Throwable {
	    
		workbenchpage.candidateCardEditInterview.click();
		Thread.sleep(3000);
	}

	@When("^make some changes in interview details and click on Submit button$")
	public void make_some_changes_in_interview_details_and_click_on_Submit_button() throws Throwable {
	    
		String interviewTitle =  scheduleinterviewpage.title.getAttribute("value");
		
		String interviewLeftTitle = scheduleinterviewpage.scheduledInterviewLeftTitle.getText();
		
		if(interviewTitle.equals(interviewLeftTitle)) {
			
			System.out.println("\nScheduled interviews get added at left side on schedule interview page");
		}
		else {
			System.out.println("\nScheduled interviews not get added at left side on schedule interview page");
		}
		
		scheduleinterviewpage.hours.clear();
		scheduleinterviewpage.hours.sendKeys("11");
		Thread.sleep(1000);
		Select se = new Select(scheduleinterviewpage.duration);
		se.selectByIndex(3);
		scheduleinterviewpage.submitButton.click();
		Thread.sleep(3000);
	}

	@Then("^User should be able to update scheduled interview details and updated details should display properly$")
	public void user_should_be_able_to_update_scheduled_interview_details_and_updated_details_should_display_properly() throws Throwable {
		
		System.out.println("\nUser able to update the scheduled interview details from Edit Interview icon of candidate card..");
	}

	@Then("^click on Edit Interview icon present on the left corner just beside of Cancel Interview icon$")
	public void click_on_Edit_Interview_icon_present_on_the_left_corner_just_beside_of_Cancel_Interview_icon() throws Throwable {
	    
		scheduleinterviewpage.editInterviewIcon.click();
		Thread.sleep(2000);
	}

	@Then("^make some changes and click on Submit button$")
	public void make_some_changes_and_click_on_Submit_button() throws Throwable {
	    
		scheduleinterviewpage.calendar.clear();
		Thread.sleep(1000);
		scheduleinterviewpage.calendar.sendKeys("29/05/2020");
		Thread.sleep(1000);
		scheduleinterviewpage.submitButton.click();
		Thread.sleep(3000);
	}

	@Then("^updated details should display properly$")
	public void updated_details_should_display_properly() throws Throwable {
	    
		System.out.println("\nUser able to update interview details from Interview Details page..");
	}

	@Then("^click on Interviews tab$")
	public void click_on_Interviews_tab() throws Throwable {
	    
		dashboardpage.openInterviewsPage();
		Thread.sleep(3000);
	}

	@Then("^Select the filters for which you want candidate interview details and click on Search button$")
	public void select_the_filters_for_which_you_want_candidate_interview_details_and_click_on_Search_button() throws Throwable {
	    
		interviewspage.selectJob();
		Thread.sleep(2000);
		interviewspage.fromdate.clear();
		interviewspage.fromdate.sendKeys("29/05/2020");
		Thread.sleep(2000);
		interviewspage.todate.clear();
		interviewspage.todate.sendKeys("29/05/2020");
		Thread.sleep(2000);
		interviewspage.searchButton.click();
	}

	@Then("^Interview details should be reflect according to the filter applied$")
	public void interview_details_should_be_reflect_according_to_the_filter_applied() throws Throwable {
	    
		interviewspage.findInterviewDetails();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(5000);
		driver.quit();
	}

}
