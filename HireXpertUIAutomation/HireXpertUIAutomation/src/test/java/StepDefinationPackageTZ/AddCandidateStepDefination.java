package StepDefinationPackageTZ;


import java.io.IOException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class AddCandidateStepDefination extends baseclass {
	
	@When("^login with Employer credential Who already have a Job added with skills$")
	public void login_with_Employer_credential_Who_already_have_a_Job_added_with_skills() throws Throwable {

		Thread.sleep(3000);
		registerpage.employerlogin();
	}

	@When("^login with Agency credential Who already have a Job added with skills$")
	public void login_with_Agency_credential_Who_already_have_a_Job_added_with_skills() throws Throwable {

		Thread.sleep(3000);
		registerpage.agencylogin();
	}
	
	@When("^Go to Workbench and select the job from drop down$")
	public void go_to_Workbench_and_select_the_from_drop_down() throws InterruptedException {
	   
		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();
		workbenchpage.selectjobT();
	    
	}

	@When("^Click on Add Candidate button\\.$")
	public void click_on_Add_Candidate_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		workbenchpage.addCandidateButton.click();
	
	}

	@When("^Enter valid \"([^\"]*)\"$")
	public void enter_valid(String CandidateEmail) throws InterruptedException {
		
		Thread.sleep(3000);
		addcandidatepage.EntercandidateemailT(CandidateEmail);
	   
	}

	@When("^click on find button$")
	public void click_on_find_button() throws InterruptedException {
		
		Thread.sleep(3000);
		addcandidatepage.FindButton.click();
	    
	}
	
	@When("^fill all the information and keep the expertise level for skills as not answered \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_the_information_and_keep_the_expertise_level_for_skills_as_not_answered(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	   

	}
	
  
	
	@Then("^Click on OK button$")
	public void click_on_OK_button() throws InterruptedException  {
	   
		common.clickOnOKBtn();
	}
	
	@Then("^Quit the browser$")
	public void quit_the_browser() {
	   
		//driver.quit();
	}
	
	@Then("^open browser$")
	public void open_browser() throws IOException  {
	    
		baseclass.initialization();
	}

	

	@When("^Verify that bell icon is displayed on candidate card as the expertise level for skills is not answered$")
	public void verify_that_bell_icon_is_displayed_on_candidate_card_as_the_expertise_level_for_skills_is_not_answered() throws Throwable {

          Thread.sleep(3000);
          candidatecardsectionpage.verifyBellIconOnCandidateCard();
	}

	@When("^Select the expertise level for candidate skill$")
	public void select_the_expertise_level_for_candidate_skill() throws Throwable {


	}

	@When("^Verify that bell icon is not displayed on candidate card as the expertise level for skills is answered$")
	public void verify_that_bell_icon_is_not_displayed_on_candidate_card_as_the_expertise_level_for_skills_is_answered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
