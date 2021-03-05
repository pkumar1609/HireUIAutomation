package BVT_StepDefination;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class HireXpressStepDefination extends baseclass{
	
	@When("^Go to HireExpress$")
	public void go_to_HireExpress() throws Throwable {
	    dashboardpage.openHireExpressPage();
	}

	@When("^Click on add job button on hireXpress page$")
	public void click_on_add_job_button_on_hireXpress_page() throws Throwable {
	    hirexpresspage.addJob.click();
	}

	@When("^Add job from hire Express$")
	public void add_job_from_hire_Express(DataTable credentials) throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(hirexpresspage.addCandidate));
		addjobpage.addjob(credentials);
	}

	@When("^Click on Add Candidate button on hireExpress$")
	public void click_on_Add_Candidate_button_on_hireExpress() throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(hirexpresspage.addCandidate));
		hirexpresspage.addCandidate.click();
	}

	@When("^select the added job$")
	public void select_the_added_job() throws Throwable {
	   select=new Select(hirexpresspage.selectJob);
	   select.selectByVisibleText(addjobpage.jobname);			   
	}

}
