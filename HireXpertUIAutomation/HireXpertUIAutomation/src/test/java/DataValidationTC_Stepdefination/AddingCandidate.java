package DataValidationTC_Stepdefination;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class AddingCandidate extends baseclass{

	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
		baseclass.initialization();
	}

	@When("^title of login page is Home$")
	public void title_of_login_page_is_Home() throws Throwable {
		agenciespage.getTitle();
	}

	@When("^Click on Employer-Agency Signin link$")
	public void click_on_Employer_Agency_Signin_link() throws Throwable {
		loginpage.ClickOnEmployerAgencySigninLink();
	}

	@When("^Employer enters valid credentials \"([^\"]*)\",\"([^\"]*)\"$")
	public void employer_enters_valid_credentials(String Username, String Password) throws Throwable {
		  loginpage.loginIn(Username, Password);
	}

	@When("^Go to workbench$")
	public void go_to_workbench() throws Throwable {
		dashboardpage.openWorkbenchPage();

	}

	@When("^Add job$")
	public void add_job(DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
	}

	@When("^Select a added job$")
	public void select_a_added_job() throws Throwable {
		workbenchpage.selectJobK();
	}

	@When("^Click on add candidate$")
	public void click_on_add_candidate() throws Throwable {
		workbenchpage.clickOnAddCandidate();
	}

	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String Date, String Name, String ContactNumber,String OnNoticePeriod, String experience, String CTC,String expectedCTC, String Country, String City, String Salaryoffered, String distance, String permanentAddress, String relocate, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(Name, ContactNumber, Date, OnNoticePeriod,experience,CTC,expectedCTC,Country,City,Salaryoffered,distance,permanentAddress,relocate, Designation, Gender, NoticePeriod, Location, Communicationmode);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
		addcandidatepage.checkCandidateALreadyPresent();
	}

	@When("^verify candidate card is displaying or not in New column \"([^\"]*)\"$")
	public void verify_candidate_card_is_displaying_or_not_in_New_column(String Name) throws Throwable {
		driver.findElement(By.xpath("//th[text()=' New ']//following::span[text()=' "+Name+"']")).isDisplayed();
	}

	@When("^Click on Edit Candidate icon on candidate card$")
	public void click_on_Edit_Candidate_icon_on_candidate_card() throws Throwable {
		candidatecardsectionpage.clickOnEditCandidateIcon();
	}

	@When("^Assert the details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_the_details_of_candidate_and(String CandidateEmail,String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws Throwable {
		editcandidatepage.AssertCandidatedetails(CandidateEmail, Name, ContactNumber, Designation, Gender, NoticePeriod, Location, Communicationmode);
	}
	
	@When("^Click Candidate details eye icon on candidate card$")
	public void click_Candidate_details_eye_icon_on_candidate_card() throws Throwable {
		
	}
}
