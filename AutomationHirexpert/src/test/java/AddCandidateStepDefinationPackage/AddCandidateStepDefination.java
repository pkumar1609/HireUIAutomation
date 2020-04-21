package AddCandidateStepDefinationPackage;

import com.hirexpert.qa.base.Testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCandidateStepDefination extends Testbase {
	
	@Given("^Open browser$")
	public void Open_browser() {
		
		Testbase.initialization();
		
	}
	
	@When("^login with Employer credential Who already have a Job added$")
	public void login_with_Employer_credential_Who_already_have_a_Job_added() throws InterruptedException  {
		
	Thread.sleep(3000);
	hp.employerlogin();
	    
	}

	
	@When("^Go to Workbench and select the job from drop down$")
	public void go_to_Workbench_and_select_the_from_drop_down() throws InterruptedException {
	   
		Thread.sleep(3000);
		wp.ClickWorkbenchbtn();
		wp.selectjob();
	    
	}

	@When("^Click on Add Candidate button\\.$")
	public void click_on_Add_Candidate_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		wp.ClickAddCandidatebtn();
	
	}

	@When("^Enter valid \"([^\"]*)\"$")
	public void enter_valid(String CandidateEmail) throws InterruptedException {
		
		Thread.sleep(3000);
		wp.Entercandidateemail(CandidateEmail);
	   
	}

	@When("^click on find button$")
	public void click_on_find_button() throws InterruptedException {
		
		Thread.sleep(3000);
		wp.ClickFindbtn();
	    
	}
	@When("^Fill all the information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_the_information(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws InterruptedException{
		
		Thread.sleep(3000);
		wp.EnterAllMandatoryfields(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	   
	}

	@Then("^Click on save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		wp.ClickSavebtn();
	   
	}
	@When("^login with Agency credential Who already have a Job added$")
	public void login_with_Agency_credential_Who_already_have_a_Job_added()  {
	    
		hp.agencylogin();
	}

	@Then("^Click on OK button$")
	public void click_on_OK_button()  {
	   
		wp.ClickCandidateOKbtn();
	}
	
	@Then("^Quit the browser$")
	public void quit_the_browser() {
	   
		driver.quit();
	}
	@Then("^open browser$")
	public void open_browser()  {
	    
		Testbase.initialization();
	}

}
