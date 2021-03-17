package BVT_StepDefination;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import cucumber.api.DataTable; 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class AddingCandidate extends baseclass{
	
	int editJobFlag=0;
	
	@When("^Add job with all details\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_job_with_all_details_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
		addjobpage.extraInfoOfJob(credentials);
		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3);		
		common.ClickSumbit();
	}
	
	@When("^click on edit job button$")
	public void click_on_edit_button() throws Throwable {
		explicitwait.until(ExpectedConditions.visibilityOf(workbenchpage.job));
		Thread.sleep(4000);
		workbenchpage.job.click();
		Thread.sleep(2000);
		workbenchpage.editJobButton.click();
	}
	
	@When("^Assert details of add jon on edit job page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void assert_details_of_add_jon_on_edit_job_page_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2,DataTable credentials) throws Throwable {
		  editjobpage.assertJobdetails(credentials);
		  editjobpage.assertjobdskills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3, certificateforskill1, certificateforskill2, credentials);
	}
	
	@Given("^click on edit/view job button$")
	public void click_on_edit_view_job_button() throws Throwable {
		Thread.sleep(4000);
		workbenchpage.job.click();
		editJobFlag=0;
		try
		{
			Thread.sleep(2000);
			workbenchpage.editJobButton.click();
			editJobFlag++;
		}
		catch(NoSuchElementException e)
		{
			Thread.sleep(2000);
			workbenchpage.viewJobButton.click();
		}
	}
	
	
	@Given("^Assert details of added job on edit/view job page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void assert_details_of_added_job_on_edit_view_job_page_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2,DataTable credentials) throws Throwable {
	    if(editJobFlag==1)
	    {
	    	editjobpage.assertJobdetails(credentials);
			editjobpage.assertjobdskills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3, certificateforskill1, certificateforskill2, credentials);
	    }
	    else
	    {
	    
	    }
	}
}
