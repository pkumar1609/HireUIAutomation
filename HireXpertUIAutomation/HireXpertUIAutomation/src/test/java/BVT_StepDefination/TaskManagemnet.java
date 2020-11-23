package BVT_StepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashboardPage;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class TaskManagemnet extends baseclass{
	
	public TaskManagemnet() throws IOException 
	{
		super();
	}
	
	@Given("^Go to Task Management tab$")
	public void go_to_Task_Management_tab() throws Throwable {
//	driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	Thread.sleep(3000);
	  dashboardpage.taskManagemnet.click();
	}
	
	@Then("^task should display on task Management page$")
	public void task_should_display_on_task_Management_page() throws Throwable {
		
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='"+taskpage.addedtask+"']")).isDisplayed(), true);	
		
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
	  scheduleinterviewpage.scheduleInterview(credentials);
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

}

