package BVT_StepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
		
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Please schedule interview of "+arg1+" for job "+addjobpage.jobname+"']")).isDisplayed(), true);	
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
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Interview pending for candidate "+arg1+" for job "+addjobpage.jobname+"']")).isDisplayed(), true);	

	}

}
