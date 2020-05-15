package StepDefinationPackageTZ;


import java.io.IOException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class AddCandidateStepDefination extends baseclass {
	
	@When("^login with Employer credential Who already have a Job added$")
	public void login_with_Employer_credential_Who_already_have_a_Job_added() throws InterruptedException  {
		
	Thread.sleep(3000);
	registerpage.employerlogin();
	    
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
	
	
   @When("^fill all the information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
   public void fill_all_the_information(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
       
	   Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	   
   }
	
	@Then("^Click on OK button$")
	public void click_on_OK_button()  {
	   
		addcandidatepage.OKButtonPopup.click();
	}
	
	@Then("^Quit the browser$")
	public void quit_the_browser() {
	   
		//driver.quit();
	}
	
	@Then("^open browser$")
	public void open_browser() throws IOException  {
	    
		baseclass.initialization();
	}

}
