package RegressionTc;

import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class BelliconOnCandidateCard extends baseclass {
	
	
	@When("^Add a new Job as employer with at list one skill \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void add_a_new_Job_as_employer_with_at_list_one_skill(String Title, String Designation, String Industry, String JobRole, String Location, String Budget, String MinExp, String MaxExp, String NoOfInterviews) throws Throwable {
	    
		Thread.sleep(3000);

		workbenchpage.AddJob();
		
		Thread.sleep(3000);
		
		addjobpage.filljobDetails(Title, Designation, Industry, JobRole, Location, Budget, MinExp, MaxExp, NoOfInterviews);
		
		Thread.sleep(3000);
		
		addjobpage.addNewSkill1();
		
		Thread.sleep(3000);
		
        addjobpage.addNewSkill2();
        
        Thread.sleep(3000);
		
		//addjobpage.deleteSkills();         // Delete 2nd skill
		
		Thread.sleep(3000);
		
		addjobpage.deleteSkill3.click();   // Delete 3rd skill
		
		Thread.sleep(3000);
		
		common.submitbtn.click();

		
	}
	
	@When("^upload candidate resume$")
    public void upload_candidate_resume() throws Throwable {
  
	Thread.sleep(3000);
   addcandidatepage.uploadResumeDocumentT();
  }
	
	@When("^Keep expertise level as Not answer \"([^\"]*)\" \"([^\"]*)\"$")
	public void keep_expertise_level_as_Not_answer(String ExpertiseLevel1, String ExpertiseLevel2) throws Throwable {
	    
		 Thread.sleep(3000);
		addcandidatepage.EnterexpertilevelofskillasNotanswered(ExpertiseLevel1, ExpertiseLevel2);
	}

	@Then("^select different expertise level for the skill which is having expert level as not answer \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_different_expertise_level_for_the_skill_which_is_having_expert_level_as_not_answer(String expertiselevel1, String expertiselevel2) throws Throwable {
	    
		Thread.sleep(3000);
		addcandidatepage.Enterexpertilevel(expertiselevel1, expertiselevel2);
	}


	@Then("^The candidate whose skill expert level is set as Not answer for that candidate card there should show bell icon$")
	public void the_candidate_whose_skill_expert_level_is_set_as_Not_answer_for_that_candidate_card_there_should_show_bell_icon() throws Throwable {

		Thread.sleep(3000);
		
		candidatecardsectionpage.verifyBellIconOnCandidateCard();
	
	}

	
	@When("^Click on Edit Candidate icon on candidate card \"([^\"]*)\"$")
	public void click_on_Edit_Candidate_icon_on_candidate_card(String Name) throws Throwable {
	    
		Thread.sleep(3000);
		candidatecardsectionpage.clickOnEditCandidateIcon(Name);
	}


	@Then("^when user set expertise level other than Not answer in edit candidate at that time bell icon should removed from candidate card$")
	public void when_user_set_expertise_level_other_than_Not_answer_in_edit_candidate_at_that_time_bell_icon_should_removed_from_candidate_card() throws Throwable {
	    
         Thread.sleep(3000);
		
		candidatecardsectionpage.verifyBellIconOnCandidateCard();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
	    
		Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	    Thread.sleep(3000);
		common.clickOnConfirmYes();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
