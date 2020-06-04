package BVT_StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class ScreeningTabStepDefination extends baseclass {

	
	@When("^login with Employer credential$")
	public void login_with_Employer_credential() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.employerlogin();
	}



	@When("^Go to Workbench tab and select the job from job drop down$")
	public void go_to_Workbench_tab_and_select_the_job_from_job_drop_down() throws InterruptedException {
		
		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectjobT();
	}

	@When("^Click on Add Questionnaire$")
	public void click_on_Add_Questionnaire() throws InterruptedException {
		
		Thread.sleep(3000);
		workbenchpage.AddQuestionarybtn.click();
	}
	
	@When("^Add question and click on save changes button \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_question_and_click_on_save_changes_button(String QUESTION1 , String QMARKS1, String ANSWER1, String ANSWER2, String MARKS1, String MARKS2) throws Throwable {
	    
		Thread.sleep(3000);
		addquestionarypage.AddQUESTION1(QUESTION1);
		addquestionarypage.AddMARKS1(QMARKS1);
		addquestionarypage.AddANSWERS1(ANSWER1, ANSWER2);
		addquestionarypage.AddMARKS1(MARKS1, MARKS2);
		addquestionarypage.SaveChangesBtn.click();
	}


	@When("^Click on  Collect Answers icon on candidate card\\.$")
	public void click_on_Collect_Answers_icon_on_candidate_card() throws Throwable {
		
		Thread.sleep(3000);
		workbenchpage.candidateCardCollectAnswericon.click();
	}

	@When("^Fill all the Questions answers$")
	public void fill_all_the_Questions_answers() throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-job-question-answer[1]/div[2]/div[1]/div[1]/label[1]/span[2]")).click();

	}

	@When("^Click on submit$")
	public void click_on_submit() throws Throwable {
		
		Thread.sleep(3000);
		common.ClickSumbit();
	}

	@When("^Click on screening tab$")
	public void click_on_screening_tab() throws Throwable {

		Thread.sleep(3000);
        workbenchpage.ClickonScreeningBtn();
	}

	@Then("^verify the status of candidate$")
	public void verify_the_status_of_candidate() throws Throwable {
	    
		
		{         
			  try   
			  {    
			    if(driver.findElement(By.xpath("//td[contains(text(),'Failed')]")).isDisplayed())
			     
			    {      
			       System.out.println("As Candidate gave wrong answer his status is displayed as Failed on Screening details page.");
			    }    
			  }      
			  catch(NoSuchElementException e)     
			  {       
				  System.out.println("As Candidate gave correct answer his status is displayed as Passed on Screening details page.");
			  }       
			}
		}

}
