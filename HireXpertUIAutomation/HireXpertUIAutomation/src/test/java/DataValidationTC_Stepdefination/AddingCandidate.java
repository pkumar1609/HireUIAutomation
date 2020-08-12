package DataValidationTC_Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

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
	
	@When("^Add job \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_jobskill_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws Throwable {
		addjobpage.addjob(credentials);
//		addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3);		
//		common.ClickSumbit();
	}

	@When("^Select a added job$")
	public void select_a_added_job() throws Throwable {
		workbenchpage.selectJobK();
	}

	@When("^Click on add candidate$")
	public void click_on_add_candidate() throws Throwable {
		workbenchpage.clickOnAddCandidate();
	}

	
	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		try
		{
		common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
	    {}
		addcandidatepage.checkCandidateALreadyPresent();
	}
	@When("^get the logged in user details$")
	public void get_the_logged_in_user_details() throws Throwable {
	    updateprofilepopuppage.getDetails();
	}
	
	@When("^Assert the details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_the_details_of_candidate_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
		editcandidatepage.AssertCandidatedetails(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress, relocate);
	}
	
	@Given("^Assert the details on candidate details icon\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_the_details_on_candidate_details_icon_and(String Username,String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
		candidatecardsectionpage.AssertDetailsOnCandidateDetails(Username, CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
	}

	
//	public void assert_the_details_on_candidate_details_icon_and(String Username,String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
//		candidatecardsectionpage.AssertDetailsOnCandidateDetails(Username, CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//	}

	
	@When("^verify candidate card is displaying or not in New column \"([^\"]*)\"$")
	public void verify_candidate_card_is_displaying_or_not_in_New_column(String Name) throws Throwable {
		driver.findElement(By.xpath("//th[text()=' New ']//following::span[text()=' "+Name+"']")).isDisplayed();
	}

	@When("^Click on Edit Candidate icon on candidate card \"([^\"]*)\"$")
	public void click_on_Edit_Candidate_icon_on_candidate_card(String Name) throws Throwable {
		candidatecardsectionpage.clickOnEditCandidateIcon(Name);
	}

	@When("^Click Candidate details eye icon on candidate card \\\"([^\\\"]*)\\\"$")
	public void click_Candidate_details_eye_icon_on_candidate_card(String Name) throws Throwable {
		candidatecardsectionpage.clickOnEyeIcon(Name);
	}

	@Given("^team member should be added$")
	public void team_member_should_be_added(DataTable credentials) throws Throwable {
		teampage.verifyTeamAdded(credentials);
	}

	@Given("^Share job with team member$")
	public void share_job_with_team_member(DataTable credentials) throws Throwable {
		taskpage.shareWithTeam(credentials);
	}
	
	@Given("^Give Can see All candidates permission \"([^\"]*)\"$")
	public void give_Can_see_All_candidates_permission(String Teamid) throws Throwable {
		sharewithteampage.canSeeAllCandidate(Teamid);
	}

	@Given("^Click on close button$")
	public void click_on_close_button() throws Throwable {
	    common.clickOnCloseBtn();
	}

	@Given("^Logout from App$")
	public void logout_from_App() throws Throwable {
		Thread.sleep(2000);
		loginpage.logoutFromAppK();
	}

	@Given("^And Go to workbench$")
	public void and_Go_to_workbench() throws Throwable {
		dashboardpage.openWorkbenchPage();
	}
}
