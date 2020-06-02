package AddCandidateStepDefinationPackageT;


import java.io.IOException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class AddCandidateStepDefination extends baseclass {
	
	@Given("^Open browser$")
	public void open_browser() throws Throwable {

		baseclass.initialization();
	}

	@When("^click on Employer-Agency SignIn link$")
	public void click_on_Employer_Agency_SignIn_link() throws Throwable {

		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		
	}


	@Given("^Again Open browser$")
	public void again_Open_browser() throws Throwable {

		Thread.sleep(3000);
		baseclass.initialization();
	}



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
	@When("^Fill all the information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void fill_all_the_information(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws InterruptedException{
		
		Thread.sleep(3000);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	   
	}

	@Then("^Click on save button$")
	public void click_on_save_button() throws InterruptedException  {
		
		Thread.sleep(3000);
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
	   
	}
	

	@Then("^Click on OK button$")
	public void click_on_OK_button() throws InterruptedException  {
	   
		common.clickOnOKBtn();
	}
	
	@Then("^Quit the browser$")
	public void quit_the_browser() {
	   
		//driver.quit();
	}
	
}
