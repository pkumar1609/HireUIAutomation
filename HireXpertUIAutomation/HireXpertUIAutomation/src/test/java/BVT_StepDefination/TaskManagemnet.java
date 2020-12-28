package BVT_StepDefination;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.WorkbenchPage;
import utilPackage.baseclass;

public class TaskManagemnet extends baseclass{
	
	public TaskManagemnet() throws IOException 
	{
		super();
	}
	//job task
		
	@Given("^the task should display for logged in user on dashboard page with \"([^\"]*)\" Status$")
	public void the_task_should_display_for_logged_in_user_on_dashboard_page_with_Status(String status) throws Throwable {
		Thread.sleep(2000);
		if(taskpage.assignto.equals(loginpage.logedinuser))
		{
		Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Task Title']//following::p[text()='"+taskpage.addedtask+"']")).isDisplayed(), true);
	    Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Task Title']//following::p[text()='"+taskpage.addedtask+"']//following::p[3]")).getText().strip(), status);
		}
	}

	@Given("^the task should display for logged in user on Task Management page in \"([^\"]*)\" column$")
	public void the_task_should_display_for_logged_in_user_on_Task_Management_page_in_column(String status) throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),'"+status+"')]//following::span[text()='"+taskpage.addedtask+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),'"+status+"')]//following::span[text()='"+taskpage.addedtask+"']//following::p[1]")).getText().strip(), addjobpage.jobname);
		Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),'"+status+"')]//following::span[text()='"+taskpage.addedtask+"']//following::p[2]")).getText().strip(), taskpage.assignto);
	}

	@Then("^Task should also display for logged in user team member on dashboard page with \"([^\"]*)\" Status$")
	public void task_should_also_display_for_logged_in_user_team_member_on_dashboard_page_with_Status(String status) throws Throwable {
		if(taskpage.assignto.equals(loginpage.logedinuser))
		{
		Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Task Title']//following::p[text()='"+taskpage.addedtask+"']")).isDisplayed(), true);
	    Assert.assertEquals(driver.findElement(By.xpath("//th[text()='Task Title']//following::p[text()='"+taskpage.addedtask+"']//following::p[3]")).getText().strip(), status);
		}
	}

	@Then("^the task should display for logged in user team member on Task Management page in \"([^\"]*)\" column$")
	public void the_task_should_display_for_logged_in_user_team_member_on_Task_Management_page_in_column(String status) throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),'"+status+"')]//following::span[text()='"+taskpage.addedtask+"']")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),'"+status+"')]//following::span[text()='"+taskpage.addedtask+"']//following::p[1]")).getText().strip(), addjobpage.jobname);
		Assert.assertEquals(driver.findElement(By.xpath("//th[contains(text(),'"+status+"')]//following::span[text()='"+taskpage.addedtask+"']//following::p[2]")).getText().strip(), taskpage.assignto);
		}

	@Given("^move the task card from \"([^\"]*)\" to \"([^\"]*)\" column$")
	public void move_the_task_card_from_to_column(String column1, String column2) throws Throwable {
		Thread.sleep(2000);	 
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = null;
		if(column2.equals("Blocked"))
		{
		 drop= driver.findElement(By.xpath("//td[3]"));		 
		}
		if(column2.equals("Accepted"))
		{
		 drop = driver.findElement(By.xpath("//td[4]"));		 
		}
		if(column2.equals("Inprogress"))
		{
		 drop = driver.findElement(By.xpath("//td[5]"));		 
		}
		if(column2.equals("Done"))
		{
		 drop = driver.findElement(By.xpath("//td[6]"));		 
		}
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}
	
	@Given("^the task should not display for logged in user on dashboard page with \"([^\"]*)\" Status$")
	public void the_task_should_not_display_for_logged_in_user_on_dashboard_page_with_Status(String arg1) throws Throwable {
		Assert.assertEquals(driver.findElements(By.xpath("//th[text()='Task Title']//following::p[text()='"+taskpage.addedtask+"']")).size()>0, false);
	}

	@Given("^Reload the task$")
	public void reload_the_task() throws Throwable {
	    taskpage.reloadtask();
	    driver.navigate().refresh();
	}
	
	@When("^Apply the filter of task as \"([^\"]*)\" type$")
	public void apply_the_filter_of_task_as_type(String type) throws Throwable {	  
	  select=new Select(taskmanagementpage.taskType);
	  select.selectByVisibleText(type);
	  common.clickOnSearchBtn();
	}
//----------------------------------------------------------------------------------------
	
@Given("^Go to Task Management tab$")
	public void go_to_Task_Management_tab() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(3000);
		dashboardpage.task.click();
	}
	
	@Then("^task should display on task Management page$")
	public void task_should_display_on_task_Management_page() throws Throwable {		
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='"+taskpage.addedtask+"']")).isDisplayed(), true);			
	}
	
//	Review Candidate
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

	@When("^Review Candidate task should display in new column \"([^\"]*)\"$")
	public void review_Candidate_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='Review candidate "+arg1+" CV for job "+addjobpage.jobname+"']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^move card from new colum to schedule interview column$")
	public void move_card_from_new_colum_to_schedule_interview_column() throws Throwable {
		Thread.sleep(2000);
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[3]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@When("^Review Candidate task should display in done column \"([^\"]*)\"$")
	public void review_Candidate_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='Review candidate "+arg1+" CV for job "+addjobpage.jobname+"']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}


	@Given("^move the candidate card from potential candidate to Schedule Interview column$")
	public void move_the_candidate_card_from_potential_candidate_to_Schedule_Interview_column() throws Throwable {
		Thread.sleep(5000);	    
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("(//td[@class='TableCard' and @id='jobStatusColumn'])[3]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag).moveToElement(drop).release(drop);
		action.perform();		
	}

	@Then("^Schedule interview task should display on task Management page \"([^\"]*)\"$")
	public void schedule_interview_task_should_display_on_task_Management_page(String arg1) throws Throwable {
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='taskmanagmentcard taskmanagmentmediump']//following::span[text()='Please schedule interview of "+arg1+" for job "+addjobpage.jobname+"']")).isDisplayed(), true);	
	}

	@Then("^move the candidate card from Schedule Interview column to pending interview column$")
	public void move_the_candidate_card_from_Schedule_Interview_column_to_pending_interview_column() throws Throwable {
		Thread.sleep(5000);	    
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("(//td[@class='TableCard' and @id='jobStatusColumn'])[4]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag).moveToElement(drop).release(drop);
		action.perform();		
	}

	@Then("^pending interview task should display on task Management page \"([^\"]*)\"$")
	public void pending_interview_task_should_display_on_task_Management_page(String arg1) throws Throwable {
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='taskmanagmentcard taskmanagmentmediump']//following::span[text()='Interview pending for candidate "+arg1+" for job "+addjobpage.jobname+"']")).isDisplayed(), true);	
	}
	
	@Then("^click on Schedule interview task for \"([^\"]*)\"$")
	public void click_on_Schedule_interview_task_for(String name) throws Throwable {
	  taskmanagementpage.searchHere.sendKeys(name);
	  explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Schedule Interview']"))));
	  driver.findElement(By.xpath("//a[text()='Schedule Interview']")).click();
	}
	
	@Then("^fill all interview details and click on Submit button$")
	public void fill_all_interview_details_and_click_on_Submit_button(DataTable credentials) throws Throwable {
	  scheduleinterviewpage.scheduleInterviewOfCandidate(credentials);
	}
	
	@Then("^Schedule interview task should display in Done column of task Management page \"([^\"]*)\"$")
	public void schedule_interview_task_should_display_in_Done_column_of_task_Management_page(String arg1) throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//td[@id='jobStatusColumn']//following::div[@id='cdk-drop-list-205']//following::span[text()='Please schedule interview of "+arg1+" for job "+addjobpage.jobname+"']")).isDisplayed(), true);	
	}
	
	@Then("^move the candidate card from pending Interview column to any other column$")
	public void move_the_candidate_card_from_pending_Interview_column_to_any_other_column() throws Throwable {
		Thread.sleep(5000);	    
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("(//td[@class='TableCard' and @id='jobStatusColumn'])[5]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag).moveToElement(drop).release(drop);
		action.perform();	
	}

	@Then("^pending interview task should display in done columne \"([^\"]*)\"$")
	public void pending_interview_task_should_display_in_done_columne(String arg1) throws Throwable {
		Assert.assertEquals(driver.findElement(By.xpath("//td[6]//span[text()='Interview pending for candidate "+arg1+" for job "+addjobpage.jobname+"']")).isDisplayed(), true);	

	}
	
//	job offering
	
	@When("^move candidate card to offering job column$")
	public void move_candidate_card_to_offering_job_column() throws Throwable {
		Thread.sleep(2000);	    
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("(//div[@class='cdk-drop-list item-list'])[11]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag).moveToElement(drop).release(drop);
		action.perform();
	}


	@Then("^offering job task should display in new column \"([^\"]*)\"$")
	public void offering_job_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='Emplyer shortlisted "+arg1+" to offer job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@Then("^click on offering job task$")
	public void click_on_offering_job_task() throws Throwable {	  
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Offering Job']")));
	}

	@Then("^offering job task should display in done column \"([^\"]*)\"$")
	public void offering_job_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='Emplyer shortlisted "+arg1+" to offer job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
//	job offered
	
	@Then("^move the card from offering job column to job offered column$")
	public void move_the_card_from_offering_job_column_to_job_offered_column() throws Throwable {
		
		Thread.sleep(2000);	  
		executor.executeScript("window.scrollBy(20000,0)", "");
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[12]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@Then("^job offered task should display in new column \"([^\"]*)\"$")
	public void job_offered_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='Job offered to "+arg1+" for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	@Then("^click on job offered task$")
	public void click_on_job_offered_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Job Offered']")));
	}

	@Then("^job offered task should display in done column \"([^\"]*)\"$")
	public void job_offered_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='Job offered to "+arg1+" for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
//	candidate joined task
	
	@Then("^move the card from job offered column to joined column$")
	public void move_the_card_from_job_offered_column_to_joined_column() throws Throwable {
		Thread.sleep(2000);	  
		executor.executeScript("window.scrollBy(20000,0)", "");
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[13]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@Then("^candidate joined task should display in new column \"([^\"]*)\"$")
	public void candidate_joined_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='"+arg1+" joined for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	@Then("^click on candidate joined task$")
	public void click_on_candidate_joined_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Candidate Joined']")));
	}
	
	@Then("^candidate joined task should display in done column \"([^\"]*)\"$")
	public void candidate_joined_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='"+arg1+" joined for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	// Refused to joined
	
	@Then("^move the card joined column to refused to joined column$")
	public void move_the_card_joined_column_to_refused_to_joined_column() throws Throwable {
		Thread.sleep(2000);	  
		executor.executeScript("window.scrollBy(20000,0)", "");
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[14]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@Then("^Refused to joined task should display in new column \"([^\"]*)\"$")
	public void refused_to_joined_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='"+arg1+" refused to join for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@Then("^click on Refused to joined task$")
	public void click_on_Refused_to_joined_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Refused To Joined']")));

	}

	@Then("^Refused to joined task should display in done column \"([^\"]*)\"$")
	public void refused_to_joined_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='"+arg1+" refused to join for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
//	@TaskManagement5
	
	@When("^Share job with agency \"([^\"]*)\"$")
	public void share_job_with_agency(String arg1) throws Throwable {
		sharewithagencypage.shareWithAgency(arg1);
	}

	@When("^move candidate card to reject column$")
	public void move_candidate_card_to_reject_column() throws Throwable {
		Thread.sleep(2000);	  
		executor.executeScript("window.scrollBy(20000,0)", "");
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[15]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@When("^confirmation popup should diplay with Yes and No button and click on Yes buton \"([^\"]*)\"$")
	public void confirmation_popup_should_diplay_with_Yes_and_No_button_and_click_on_Yes_buton(String Name) throws Throwable {
		Assert.assertEquals("Are you sure you want to reject "+Name+" ?", driver.findElement(By.xpath("//h6[@class='text-center mb-0 alert-message']")).getText());
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@When("^select the reason of rejection and cick on submit button$")
	public void select_the_reason_of_rejection_and_cick_on_submit_button() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.selectCandidateRejectionReason();
		
		Thread.sleep(1000);
		common.ClickSumbit();
	}

	@When("^Candidate rejected task should display in new column \"([^\"]*)\"$")
	public void reject_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='"+arg1+" has been rejected for job "+addjobpage.jobname+" with reason Communication Is Not Good by pemp.']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^click on candidate Rejected task$")
	public void click_on_candidate_Rejected_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Candidate Rejected']")));
	}
	
	@When("^Candidate rejected task should display in done column \"([^\"]*)\"$")
	public void reject_task_should_display_in_d_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='"+arg1+" has been rejected for job "+addjobpage.jobname+" with reason Communication Is Not Good by pemp.']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
//	Shared job and closed job task
	
	@When("^job Shared task should display in new column \"([^\"]*)\"$")
	public void shared_job_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()=\"pemp shared a job '"+addjobpage.jobname+".'\"]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^click on job Shared task$")
	public void click_on_Shared_job_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Job Shared']")));
	}

	@When("^job Shared task should display in done column \"([^\"]*)\"$")
	public void shared_job_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()=\"pemp closed a job '"+addjobpage.jobname+".'\"]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^Close that job$")
	public void close_that_job() throws Throwable {
		 workbenchpage.clickOnCloseJobButton();
	}

	@When("^closed job task should display in new column \"([^\"]*)\"$")
	public void closed_job_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()=\"pemp closed a job '"+addjobpage.jobname+".'\"]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	@When("^click on closed job task$")
	public void click_on_closed_job_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Closed Job']")));
	}

	@When("^closed job task should display in done column \"([^\"]*)\"$")
	public void closed_job_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='pemp closed a job '"+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	//Generate invoice task
	
	@When("^move the candidate card from potential candidate to joined column$")
	public void move_the_candidate_card_from_potential_candidate_to_joined_column() throws Throwable {
		Thread.sleep(2000);	  
		WebElement drag = candidatecardsectionpage.candidateCard;
		WebElement drop = driver.findElement(By.xpath("//td[13]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
	}

	@When("^apply filter of task type as \"([^\"]*)\"$")
	public void apply_filter_of_task_type_as(String filter) throws Throwable {	
		select= new Select(taskmanagementpage.taskType);
		select.selectByVisibleText(filter);
		common.clickOnSearchBtn();
	}

	@When("^Generate invoice task should display in new column \"([^\"]*)\"$")
	public void generate_invoice_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()='Please Generate invoice for "+arg1+" for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^click on Generate invoice task$")
	public void click_on_Generate_invoice_task() throws Throwable {
		executor.executeScript("arguments[0].click()", driver.findElement(By.xpath("//td[2]//a[text()='Generate Invoice']")));
	}

	@When("^Fill all details of invoice$")
	public void fill_all_details_of_invoice(DataTable credentials) throws Throwable {
	    invoicepage.generateInvoice(credentials);
	}

	@When("^Generate invoice task should display in done column \"([^\"]*)\"$")
	public void generate_invoice_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()='Please Generate invoice for "+arg1+" for job "+addjobpage.jobname+".']"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	//pending invoice
	
	@When("^click on reload task$")
	public void click_on_reload_task() throws Throwable {
	  Thread.sleep(1000);
	  explicitwait.until(ExpectedConditions.visibilityOf(taskmanagementpage.reloadTask));
	  taskmanagementpage.reloadTask.click();
	}

	@When("^Pending invoice task should display in new column \"([^\"]*)\"$")
	public void pending_invoice_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[text()=\"There is an invoice pending for '"+arg1+"' for job '"+addjobpage.jobname+"'\"]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^Go to invoice tab$")
	public void go_to_invoice_tab() throws Throwable {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(2000);
		dashboardpage.invoice.click();
	}

	@When("^move the invoice card from pending invoice to paid invoice$")
	public void move_the_invoice_card_from_pending_invoice_to_paid_invoice() throws Throwable {
		Thread.sleep(2000);	  
		WebElement drag = driver.findElement(By.xpath("//td[2]//div[@class='cdk-drag item-box']"));	
		WebElement drop = driver.findElement(By.xpath("//td[3]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
		Thread.sleep(2000);	
	}

	@When("^Pending invoice task should display in done column \"([^\"]*)\"$")
	public void pending_invoice_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[6]//span[text()=\"There is an invoice pending for '"+arg1+"' for job '"+addjobpage.jobname+"'\"]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	//Invoice payment
	
	@When("^move the invoice card from paid invoice to Invoice payment recieved column$")
	public void move_the_invoice_card_from_paid_invoice_to_Invoice_payment_recieved_column() throws Throwable {
		Thread.sleep(2000);	  
		WebElement drag = driver.findElement(By.xpath("//td[3]//div[@class='cdk-drag item-box']"));	
		WebElement drop = driver.findElement(By.xpath("//td[4]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
		Thread.sleep(2000);	
	}

	@When("^Invoice Payment task should display in new column \"([^\"]*)\"$")
	public void invoice_Payment_task_should_display_in_new_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[2]//span[contains(text(),\"Please verify invoice payment is Paid for '"+arg1+"' for job '"+addjobpage.jobname+"'\")]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}

	@When("^move the invoice card from paid Invoice payment recieved to Closed column$")
	public void move_the_invoice_card_from_paid_Invoice_payment_recieved_to_Closed_column() throws Throwable {
		Thread.sleep(2000);	  
		WebElement drag = driver.findElement(By.xpath("//td[4]//div[@class='cdk-drag item-box']"));	
		WebElement drop = driver.findElement(By.xpath("//td[5]"));		   		
	    Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(drag);
		executor.executeScript("arguments[0].scrollIntoView()", drop);
		action.moveToElement(drop).release(drop).perform();
		Thread.sleep(2000);	
	}
	
	@When("^click on Yes button on Confirmation popup$")
	public void click_on_Yes_button_on_Confirmation_popup() throws Throwable {
	   common.clickOnConfirmYes();
	}

	@When("^Invoice Payment task should display in done column \"([^\"]*)\"$")
	public void invoice_Payment_task_should_display_in_done_column(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//td[5]//span[contains(text(),\"Please verify invoice payment is Paid for '"+arg1+"' for job '"+addjobpage.jobname+"'\")]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	
//	Marketplace Task
	

	@Then("^Proposal Received task should display in \"([^\"]*)\" column with agency name \"([^\"]*)\"$")
	public void proposal_Received_task_should_display_in_column_with_agency_name(String status, String agencyEmail) throws Throwable {
		CharSequence agencyName = agencyEmail.subSequence(0, agencyEmail.indexOf("@"));
		WebElement element = null;
		if(status.contentEquals("New"))
		{
		element = driver.findElement(By.xpath("//td[2]//span[text()='Received proposal from "+agencyName+" for job "+addjobpage.jobname+", please have a look on this proposal.']"));
		}
		else if(status.contentEquals("Done"))
		{
		element = driver.findElement(By.xpath("//td[6]//span[text()='Received proposal from "+agencyName+" for job "+addjobpage.jobname+", please have a look on this proposal.']"));
		}
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	
	
	@After("@task")
	public void Endtest() throws InterruptedException
	{
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectJobK();
		workbenchpage.clickOnCloseJobButton();
	}
}

