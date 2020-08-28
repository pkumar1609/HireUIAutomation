package DataValidationTC_Stepdefination;
import org.openqa.selenium.interactions.Actions;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
	
//	@When("^Click on Job Seeker\\(Candidate\\) Sign In link$")
//	public void click_on_Job_Seeker_Candidate_Sign_In_link() throws Throwable {
//	    
//	}
	
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

	
	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn();
		addcandidatepage.checkCandidateALreadyPresent();
	}
	@When("^get the logged in user details$")
	public void get_the_logged_in_user_details() throws Throwable {
	    updateprofilepopuppage.getDetails();
	}
	
	@When("^Assert the details of candidate \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_the_details_of_candidate_and(String Username,String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2) throws Throwable {
		editcandidatepage.AssertCandidatedetails(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress, relocate);
		editcandidatepage.assertSkill(Skill1,Skill2,Skill3,level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
	}
	
	@When("^Assert the details on candidate details icon\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_the_details_on_candidate_details_icon_and(String Username,String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2) throws Throwable {
		candidatecardsectionpage.AssertDetailsOnCandidateDetails(Username, CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod,LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
		candidatecardsectionpage.assertskill(Skill1,Skill2,Skill3,level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
	}

	@When("^click on Schedule Interview icon from candidate card$")
	public void click_on_Schedule_Interview_icon_from_candidate_card() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.scheduleInterview.click();
	}

	@When("^fill all interview details and click on Submit button$")
	public void fill_all_interview_details_and_click_on_Submit_button(DataTable credentials) throws Throwable {
		scheduleinterviewpage.scheduleInterview(credentials);
	}
	
	
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

//@onupdateprofile

@When("^candidate enters valid credentials \"([^\"]*)\",\"([^\"]*)\"$")
public void candidate_enters_valid_credentials(String Username, String Password) throws Throwable {
	loginpage.emailaddress.sendKeys(Username);
	loginpage.password.sendKeys(Password);
	Thread.sleep(4000);
	loginpage.signin.click();
	try {
//		driver.findElement(By.xpath(""))
		common.clickOnOKBtn();
	}
	catch(NoSuchElementException e )
	{}
}

@When("^Click on Job Seeker\\(Candidate\\) Sign In link$")
public void click_on_Job_Seeker_Candidate_Sign_In_link() throws Throwable {
	Thread.sleep(2000);
	Action.moveToElement(loginpage.login).click().perform();
	homepage.clickJobseekerCandidateSignInlinklink();
}

@When("^click on update profile option$")
public void click_on_update_profile_option() throws Throwable {		
	Thread.sleep(2000);
	Action.moveToElement(loginpage.profile).perform();
	Thread.sleep(2000);
	loginpage.updateProfile.click();
}



@When("^Assert the details on candidate profile page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void assert_the_details_on_candidate_profile_page_and(String Username,String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2) throws Throwable {
	candidateupdateprofilepage.AssertDetailsOnCandidateProfile(CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
	candidateupdateprofilepage.AssertSkillonSkillAndRolesTab(Skill1, Skill2, Skill3, level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
}

//############job validation###############


@When("^Click on hamburger menu$")
public void click_on_hamburger_menu() throws Throwable {
  workbenchpage.clickonthreedot();
}

@When("^click on edit button$")
public void click_on_edit_button() throws Throwable {
	Thread.sleep(2000);
	workbenchpage.editJobButton.click();
}

@When("^Assert details of add jon on edit job page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
public void assert_details_of_add_jon_on_edit_job_page_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2,DataTable credentials) throws Throwable {
	  editjobpage.assertJobdetails(credentials);
	  editjobpage.assertjobdskills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3, certificateforskill1, certificateforskill2, credentials);
}

@When("^click on Edit/view job button$")
public void click_on_Edit_view_job_button() throws Throwable {
   if(loginpage.b==true)
   {
		Thread.sleep(2000);
		workbenchpage.editJobButton.click(); 
   }else
   {
	   Thread.sleep(2000);
	   workbenchpage.viewJobButton.click();
   }
}

@When("^share job with agency \"([^\"]*)\"$")
public void share_job_with_agency(String agyEmailId) throws Throwable {
	sharewithagencypage.shareWithAgency(agyEmailId);
}



//Onmarketplace####

@When("^Click on share job with market place$")
public void click_on_share_job_with_market_place() throws Throwable {
  marketplacepage.ClickOnShareWithMarketPlace();
  common.ClickSumbit();
  common.clickOnConfirmYes();
  common.clickOnOKBtn();
}

@When("^Click on Employer marketplace tab$")
public void click_on_Employer_marketplace_tab() throws Throwable {
	 marketplacepage.ClickOnMarketPlaceTab();
}

@When("^Assert the job details on job title$")
public void assert_the_job_details_on_job_title(DataTable credentials) throws Throwable {
	marketplacepage.assertjobdetails(credentials);
}



@When("^login as a support user$")
public void login_as_a_support_user() throws Throwable {
	  loginpage.loginInAppWithSupport();
}

@When("^verify shared job is displaying on support login$")
public void verify_shared_job_is_displaying_on_support_login() throws Throwable {
	jobreviewpage.verifyJobDisplay();
}

@When("^Click on approve$")
public void click_on_approve() throws Throwable {
	jobreviewpage.clickOnApproveButton();
}

@When("^Go to agency marketplace tab$")
public void go_to_agency_marketplace_tab() throws Throwable {
	marketplacepage.ClickOnAgyMarketPlaceTab();
	
}

@When("^Click on shared job$")
public void click_on_shared_job() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='"+addjobpage.jobname+"']")).click();
	
}

@When("^Click on job displaying in marketplace job section$")
public void click_on_job_displaying_in_marketplace_job_section() throws Throwable {
	Thread.sleep(3000);
   driver.findElement(By.xpath("//a[text()='"+addjobpage.jobname+"']")).click();
}
//@jobboard

@When("^Click on more jobs$")
public void click_on_more_jobs() throws Throwable {
	Thread.sleep(2000);
    driver.findElement(By.xpath("(//a[text()='More Jobs..'])[1]")).click();
}

@When("^Click on view job details button$")
public void click_on_view_job_details_button() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//h6[contains(text(),'"+addjobpage.jobname+"')]//following::button[text()='Job Details ']")).click();
}

@Then("^Assert the details on job board page$")
public void assert_the_details_on_job_board_page(DataTable credentials) throws Throwable {
	Thread.sleep(3000);
	for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	{
		 Assert.assertEquals(driver.findElement(By.xpath("//h5[text()='"+addjobpage.jobname+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//h6[text()=' "+data.get("organisation")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//h6[text()=' "+data.get("designation")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//p[text()=' "+data.get("location")+", "+data.get("city")+", "+data.get("country")+" - "+data.get("zipcode")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//p[text()=' "+data.get("noofvacancies")+" Openings ']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//p[text()=' "+data.get("minexp")+" - "+data.get("maxexp")+" Years']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//p[text()=' "+data.get("budget")+" PA ']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Industry']//following::td[text()='"+data.get("industry")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Job Role']//following::td[text()='"+data.get("jobrole")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Qualification']//following::td[text()='"+data.get("qualification")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Cash Benefit']//following::td[text()='"+data.get("cashBenefit")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Job Type']//following::td[text()='"+data.get("jobType")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Shift']//following::td[text()='"+data.get("Shift")+" ("+data.get("ShiftTimings")+")']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Notice Period']//following::td[text()='"+data.get("Shift")+" Days ']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Total Interviews']//following::td[text()='"+data.get("totalinterviews")+"']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Mandatory Skills']//following::span[text()='"+data.get("Skill1")+" ("+data.get("level1")+") ']")).isDisplayed(), true);			
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Preferred Skills ']//following::span[text()='"+data.get("Skill2")+" ("+data.get("level1")+") ']")).isDisplayed(), true);
		 Assert.assertEquals(driver.findElement(By.xpath("//strong[text()='Optional Skills ']//following::span[text()='"+data.get("Skill3")+" ("+data.get("level3")+") ']")).isDisplayed(), true);


		
	}
}
//@candidatedetails

	@When("^Click register link$")
	public void click_register_link() throws Throwable {
		Thread.sleep(2000);
		registerpage.clickRegister();
	}
	
	@When("^Enter all details on register page \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_details_on_register_page(String Name, String CandidateEmail , String ContactNumber, String UserType, String timezone, String country) throws Throwable {
		registerpage.registerCandidatedetails1(UserType, timezone, country);
		registerpage.registerCandidatedetails(Name, CandidateEmail, ContactNumber);
		common.ClickSumbit();
		common.clickOnConfirmYes();
		common.clickOnOKBtn();
	}
	
	@When("^Enter all personal and professional details of candidate$")
	public void enter_all_details_of_candidate(DataTable credentials) throws Throwable {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		{
		addcandidatepage.title.sendKeys(data.get("title"));
		addcandidatepage.contactNumber.sendKeys(data.get("ContactNumber"));
		addcandidatepage.date.sendKeys(data.get("Date"));
		addcandidatepage.countryId.sendKeys(data.get("Country"));
		addcandidatepage.cityArea.sendKeys(data.get("CityArea"));
		addcandidatepage.name.sendKeys(data.get("Name"));
		addcandidatepage.alternateEmail.sendKeys(data.get("alternateemail"));		
		addcandidatepage.alternateContact.sendKeys(data.get("alternateContact"));
		addcandidatepage.gender.sendKeys(data.get("Gender"));
		addcandidatepage.city.sendKeys(data.get("City"));
		addcandidatepage.zipCode.sendKeys(data.get("ZipCode"));
		addcandidatepage.CurrentOrganization.sendKeys(data.get("currentorganization"));
		addcandidatepage.currentDesignation.sendKeys(data.get("currentdesignation"));
		addcandidatepage.currentDuration.sendKeys(data.get("currentduration"));
		driver.findElement(By.xpath("//span[text()='×']")).click();
		addcandidatepage.jobType.sendKeys(data.get("jobtype"));
		addcandidatepage.Shift.sendKeys(data.get("shift"));
		addcandidatepage.searchKeywords.sendKeys(data.get("searchkeyword"));
		addcandidatepage.industry.sendKeys(data.get("industry"));
		addcandidatepage.experienceInYears.sendKeys(data.get("experience"));
		addcandidatepage.ctc.sendKeys(data.get("CTC"));
		addcandidatepage.expectedCTC.sendKeys(data.get("expectedCTC"));
		addcandidatepage.communicationMode.sendKeys(data.get("Communicationmode"));
		addcandidatepage.residentialStatus.sendKeys(data.get("residentialstatus"));	
		
//		addcandidatepage..sendKeys(data.get(""));
//		addcandidatepage..sendKeys(data.get(""));
//		addcandidatepage..sendKeys(data.get(""));
		}
	}
	
	}
