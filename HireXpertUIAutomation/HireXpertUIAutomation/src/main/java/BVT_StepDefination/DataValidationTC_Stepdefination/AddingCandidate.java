package DataValidationTC_Stepdefination;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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


	
	@When("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,profiletitle,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn(); 
		addcandidatepage.checkCandidateALreadyPresent();
	}
	
	@When("^get the logged in user details$")
	public void get_the_logged_in_user_details() throws Throwable {
	    updateprofilepopuppage.getDetails();
	}
	
	
	
//	@When("^Assert the details of candidate$")
//	public void assert_the_details_of_candidate(String Username, String CandidateEmail, String profiletitle, String Name, String ContactNumber, String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress, String relocate, String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3, String certificateforskill1, String certificateforskill2) throws Throwable {
//		editcandidatepage.AssertCandidatedetails(Username, CandidateEmail, profiletitle, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//		editcandidatepage.assertSkill(Skill1, Skill2, Skill3, level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
//
//	}

	@When("^Assert the candidate details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void assert_the_candidate_details_and(String Username,String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2) throws Throwable {
		editcandidatepage.AssertCandidatedetails(Username, CandidateEmail, profiletitle, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode);
		editcandidatepage.AssertprobabiltyFields(Salaryoffered, distance, permanentAddress, relocate);
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
		WebElement drag=driver.findElement(By.cssSelector("div.item-box.cdk-drag"));
		WebElement drop=driver.findElement(By.xpath("//th[text()=' New ']//following::div[@id='cdk-drop-list-94']"));
		Action.clickAndHold(drag).moveToElement(drop).release(drop);
		Action.build().perform();
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

	@When("^Click on edit close button$")
	public void click_on_edit_close_button() throws Throwable {
		common.clickOnCloseBtn();
		common.clickOnConfirmYes();
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

@When("^Assert the details on candidate profile page$")
public void assert_the_details_on_candidate_profile_page(DataTable arg1) throws Throwable {
	candidateupdateprofilepage.AssertDetailsOnCandidateProfile(arg1);

}

@When("^Assert the Skills on candidate profile page$")
public void assert_the_Skills_on_candidate_profile_page(DataTable arg1) throws Throwable {
	candidateupdateprofilepage.AssertSkillonSkillAndRolesTab(arg1);

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

@When("^click on view job button$")
public void click_on_view_job_button() throws Throwable {
	 Thread.sleep(2000);
	workbenchpage.viewJobButton.click();
}

@When("^share job with agency \"([^\"]*)\"$")
public void share_job_with_agency(String agyEmailId) throws Throwable {
	sharewithagencypage.shareWithAgency(agyEmailId);
}

@When("^Add job with all details\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void add_job_with_all_details_and(String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2, String remark3, DataTable credentials) throws Throwable {
	addjobpage.addjob(credentials);
	addjobpage.extraInfoOfJob(credentials);
	addjobpage.addSkills(Skill1, Skill2, Skill3, level1, level2, level3, Weightage1, Weightage2, Weightage3, certificate1, certificate2, certificate3, remark1, remark2, remark3);		
	common.ClickSumbit();
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

@When("^Logout as a support user$")
public void logout_as_a_support_user() throws Throwable {
	Thread.sleep(2000);
	explicitwait.until(ExpectedConditions.elementToBeClickable(loginpage.profile));
	Action.moveToElement(loginpage.profile).click().perform();
	Thread.sleep(2000);
	loginpage.Logout.click();
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
		System.out.println("designation"+data.get("designation"));
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
		try
		{
			common.clickOnOKBtn();
		}
		catch(NoSuchElementException e)
		{
			common.clickOnCloseBtn();
			common.clickOnConfirmYes();
		}
		
	}

		@Then("^Enter all the personal and professional details of candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void enter_all_the_personal_and_professional_details_of_candidate(String title, String ContactNumber, String Date, String Country, String CityArea, String Name, String alternateemail, String alternateContact, String Gender, String City, String ZipCode, String currentorganization, String currentdesignation, String currentduration, String jobtype, String shift, String preferredcity, String searchkeyword, String industry, String experience, String expectedCTC, String residentialstatus, String OnNoticePeriod,String LastWorkingDay, String NoticePeriod, String CTC, String Communicationmode, String willingtotravel, String lookingforjob, String relocate, String cv) throws Throwable {
			Thread.sleep(4000);
			addcandidatepage.title.sendKeys(title);
			Assert.assertEquals(addcandidatepage.title.getAttribute("value"), title);
//			addcandidatepage.contactNumber.sendKeys(ContactNumber);
			Thread.sleep(2000);
			addcandidatepage.calenderIcon.click();
//			driver.findElement(By.xpath("//span[text()='"+Date+"']")).click();
			candidateupdateprofilepage.enterdate(Date);
			addcandidatepage.countryId.sendKeys(Country);
			addcandidatepage.cityArea.sendKeys(CityArea);
//			addcandidatepage.name.sendKeys(Name);
			addcandidatepage.alternateEmail.sendKeys(alternateemail);	
			addcandidatepage.alternateContact.sendKeys(alternateContact);
			addcandidatepage.gender.sendKeys(Gender);
			addcandidatepage.city.sendKeys(City);
			addcandidatepage.zipCode.sendKeys(ZipCode);
			candidateupdateprofilepage.CurrentOrganization.sendKeys(currentorganization);
			candidateupdateprofilepage.currentDesignation.sendKeys(currentdesignation);
			candidateupdateprofilepage.currentDuration.sendKeys(currentduration);			
			Thread.sleep(3000);
			addcandidatepage.industry.click();
			driver.findElement(By.xpath("(//span[text()='×'])[1]")).click();
			candidateupdateprofilepage.jobType.sendKeys(jobtype);
			driver.findElement(By.xpath("//span[text()='"+jobtype+"']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[text()='×'])[2]")).click();
			candidateupdateprofilepage.Shift.sendKeys(shift);
			driver.findElement(By.xpath("//span[text()='"+shift+"']")).click();				
			candidateupdateprofilepage.preferredCity.sendKeys(preferredcity);
			driver.findElement(By.xpath("//span[text()='"+preferredcity+"']")).click();		
			candidateupdateprofilepage.searchKeywords.sendKeys(searchkeyword);
			addcandidatepage.industry.sendKeys(industry);
			addcandidatepage.ctc.click();
			addcandidatepage.experienceInYears.clear();
			addcandidatepage.experienceInYears.sendKeys(experience);
			addcandidatepage.ctc.clear();
			addcandidatepage.ctc.sendKeys(CTC);
			addcandidatepage.expectedCTC.sendKeys(expectedCTC);
			addcandidatepage.communicationMode.sendKeys(Communicationmode);
			candidateupdateprofilepage.residentialStatus.sendKeys(residentialstatus);
			candidateupdateprofilepage.willingToTravel.sendKeys(willingtotravel);
			addcandidatepage.onNoticePeriod.sendKeys(OnNoticePeriod);
			if(OnNoticePeriod.contentEquals("Yes"))
			{
				Thread.sleep(5000);
				addcandidatepage.lastWorkingDay.click();
//				driver.findElement(By.xpath("//span[text()='"+LastWorkingDay+"']")).click();
				candidateupdateprofilepage.enterdate(LastWorkingDay);
//				addcandidatepage.datebelowField = driver.findElement(By.xpath("(//div[@class='text-info'])[2]")).getText();
			}	
			else
			{
				addcandidatepage.noticePeriod.sendKeys(NoticePeriod);
			}
			addcandidatepage.LookingforJobfield.sendKeys(lookingforjob);
			candidateupdateprofilepage.readyToRelocate.sendKeys(relocate);
			addcandidatepage.cv.sendKeys(cv);
		}
		
		@Then("^Click on save button$")
		public void click_on_save_button() throws Throwable {
		   common.clickOnSaveBtn();
		}

		@Then("^click ok on success popup$")
		public void click_ok_on_success_popup() throws Throwable {
		   common.clickOnOKBtn();
		}

		@Then("^click on qualification tab$")
		public void click_on_qualification_tab() throws Throwable {
			Thread.sleep(5000);
		    candidateupdateprofilepage.qualificationTab.click();
		}

		@Then("^Fill all the qualification details$")
		public void fill_all_the_qualification_details(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.addQualificationDetails(credentials);
		}
		
		@When("^Click on work experience tab$")
		public void click_on_work_experience_tab() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.workExperienceTab.click();
		}

		@When("^fill all work experience details$")
		public void fill_all_work_experience_details(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillWorkExperienceDetails(credentials);
		}
		
		@When("^Click on skills and designation$")
		public void click_on_skills_and_designation() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.SkillsInformation.click();
		}


		@When("^fill all skills and designation details \"([^\"]*)\"$")
		public void fill_all_skills_and_designation_details(String designation, DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillAllskillsAndDesignationDetails(designation, credentials);

		}
		
		@When("^Click on certificate tab$")
		public void click_on_certificate_tab() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.certificateTab.click();
		}

		@When("^fill all certificate details$")
		public void fill_all_certificate_details(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillAllCertificateDetails(credentials);
		}
		
		@When("^Click on languages tab$")
		public void click_on_languages_tab() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.languageTab.click();
		}

		@When("^Fill all language details$")
		public void fill_all_language_details(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillAllLanguageDetails(credentials);
		}
		@When("^Click on Visa Tab$")
		public void click_on_Visa_Tab() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.visaTab.click();
		}

		@When("^Fill All the deatils of visa$")
		public void fill_All_the_deatils_of_visa(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillAllVisaDetails(credentials);
		}
		
		@When("^Click on Experience details tab$")
		public void click_on_Experience_details_tab() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.experienceTab.click();
		}

		@When("^Fill all experience details$")
		public void fill_all_experience_details(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillAllExperirenceDetails(credentials);
		}
		
		@Then("^Assert the personal and professional details of candidate$")
		public void assert_the_personal_and_professional_details_of_candidate(DataTable credentials) throws Throwable {
			Thread.sleep(4000);
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			{
			Assert.assertEquals(addcandidatepage.title.getAttribute("value"), data.get("title"));	
			Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"), data.get("CandidateEmail"));		
			Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"), data.get("ContactNumber"));		
			Assert.assertEquals(driver.findElement(By.xpath("(//input[@placeholder='Select Date']//following::p)[1]")).getText(), data.get("Date"));
			select=new Select(addcandidatepage.countryId);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("country")+" ");
			Assert.assertEquals(addcandidatepage.cityArea.getAttribute("value"), data.get("CityArea"));	
			Assert.assertEquals(addcandidatepage.name.getAttribute("value"), data.get("Name"));	
			Assert.assertEquals(addcandidatepage.alternateEmail.getAttribute("value"), data.get("alternateemail"));	
			Assert.assertEquals(addcandidatepage.alternateContact.getAttribute("value"), data.get("alternateContact"));	
			Assert.assertEquals(addcandidatepage.gender.getAttribute("value"), data.get("Gender"));	
			Assert.assertEquals(addcandidatepage.city.getAttribute("value"), data.get("City"));	
			Assert.assertEquals(addcandidatepage.zipCode.getAttribute("value"), data.get("ZipCode"));	
			Assert.assertEquals(candidateupdateprofilepage.CurrentOrganization.getAttribute("value"), data.get("currentorganization"));	
			Assert.assertEquals(candidateupdateprofilepage.designation.get(0).getAttribute("value"), data.get("currentdesignation"));	
			Assert.assertEquals(candidateupdateprofilepage.currentDuration.getAttribute("value"), data.get("currentduration"));	
			Assert.assertEquals(driver.findElement(By.xpath("(//ng-select[@placeholder='Select JobType']//span)[1]")).getText(), data.get("jobtype"));
			Assert.assertEquals(driver.findElement(By.xpath("(//ng-select[@placeholder='Select Shift']//span)[1]")).getText(), data.get("shift"));
			Assert.assertEquals(driver.findElement(By.xpath("(//ng-select[@placeholder='Enter Preferred Cities']//span)[1]")).getText(), data.get("preferredcity"));
//			Assert.assertEquals(candidateupdateprofilepage.preferredCity.getAttribute("value"), data.get("preferredcity"));	
			Assert.assertEquals(candidateupdateprofilepage.searchKeywords.getAttribute("value"), data.get("searchkeyword"));	
			Assert.assertEquals(addcandidatepage.industry.getAttribute("value"), data.get("industry"));	
			Assert.assertEquals(addcandidatepage.experienceInYears.getAttribute("value"), data.get("experience"));	
			Assert.assertEquals(addcandidatepage.expectedCTC.getAttribute("value"), data.get("expectedCTC"));	
			Assert.assertEquals(candidateupdateprofilepage.residentialStatus.getAttribute("value"), data.get("residentialstatus"));	
//			Assert.assertEquals(addcandidatepage.onNoticePeriod.getAttribute("value"), data.get(""));	
			select=new Select(addcandidatepage.onNoticePeriod);
			WebElement option = select.getFirstSelectedOption();
			Assert.assertEquals(option.getText(),data.get("OnNoticePeriod"));
			if(data.get("OnNoticePeriod").contentEquals("Yes"))
			{
			Assert.assertEquals(driver.findElement(By.xpath("(//input[@placeholder='Select Date'])[2]//following::p")).getText(), data.get("LastWorkingDay"));
			}
			else
			{
			Assert.assertEquals(addcandidatepage.noticePeriod.getAttribute("value"), data.get("NoticePeriod"));
			}
			Assert.assertEquals(addcandidatepage.ctc.getAttribute("value"), data.get("CTC"));	
			Assert.assertEquals(addcandidatepage.communicationMode.getAttribute("value"), data.get("Communicationmode"));	
			select=new Select(candidateupdateprofilepage.willingToTravel);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), data.get("willingtotravel"));
			select=new Select(addcandidatepage.LookingforJobfield);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), data.get("lookingforjob"));
			select=new Select(candidateupdateprofilepage.readyToRelocate);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), data.get("relocate"));
			Assert.assertEquals(driver.findElement(By.xpath("(//input[@formcontrolname='CVUpload']//following::label)[1]")).getText(), data.get("cv"));	
			}
		}

		@Then("^Assert the qualification details$")
		public void assert_the_qualification_details(DataTable credentials) throws Throwable {
			int i=0;
			
			 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
			   {			  
					if(i<candidateupdateprofilepage.degree.size())
					{

						Assert.assertEquals(candidateupdateprofilepage.major.get(i).getAttribute("value"), data.get("Major"));
						Assert.assertEquals(candidateupdateprofilepage.year.get(i).getAttribute("value"), data.get("year"));
						Assert.assertEquals(candidateupdateprofilepage.grade.get(i).getAttribute("value"), data.get("grade"));
						Assert.assertEquals(candidateupdateprofilepage.college.get(i).getAttribute("value"), data.get("college"));
						Assert.assertEquals(candidateupdateprofilepage.university.get(i).getAttribute("value"), data.get("university"));
						Assert.assertEquals(driver.findElements(By.xpath("//span[@class='ng-value-label']")).get(i).getText(), data.get("country"));
					}
				i++;
			}
		}
		
		@Then("^Assert work experience details$")
		public void assert_work_experience_details(DataTable credentials) throws Throwable {
			int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<candidateupdateprofilepage.organization.size())
				{
					Assert.assertEquals(candidateupdateprofilepage.organization.get(i).getAttribute("value"), data.get("organization"));
					select=new Select(candidateupdateprofilepage.fromMonth.get(i));
					Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), data.get("fromMonth"));
					Assert.assertEquals(candidateupdateprofilepage.fromYear.get(i).getAttribute("value"), data.get("fromYear"));
					select=new Select(candidateupdateprofilepage.toMonth.get(i));
					Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), data.get("toMonth"));
					Assert.assertEquals(candidateupdateprofilepage.toYear.get(i).getAttribute("value"), data.get("toYear"));
					Assert.assertEquals(candidateupdateprofilepage.designation.get(i).getAttribute("value"), data.get("designation"));
					Assert.assertEquals(candidateupdateprofilepage.city.get(i).getAttribute("value"), data.get("city"));
					Assert.assertEquals(driver.findElements(By.xpath("//span[@class='ng-value-label']")).get(i).getText(), data.get("country"));
				}
				i++;
			 }
	}
		
		@Then("^Assert skills and designation \"([^\"]*)\"$")
		public void assert_skills_and_designation(String arg1, DataTable credentials) throws Throwable {
			int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<candidateupdateprofilepage.skills.size())
				{
					Assert.assertEquals(candidateupdateprofilepage.skills.get(i).getAttribute("value"), data.get("skill"));
					select=new Select(candidateupdateprofilepage.expertiselevel.get(i));
					Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), data.get("Expertiselevel"));
					Assert.assertEquals(candidateupdateprofilepage.certificate.get(i).getAttribute("value"), data.get("certificate"));
					Assert.assertEquals(addcandidatepage.designation.get(i).getAttribute("value"), data.get("designation"));
				}
				i++;
			 }
		}

		@Then("^Assert the certificate details$")
		public void assert_the_certificate_details(DataTable credentials) throws Throwable {
			int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<candidateupdateprofilepage.certificate.size())
				{
					Assert.assertEquals(candidateupdateprofilepage.certificate.get(i).getAttribute("value"), data.get("certificate"));
					Assert.assertEquals(candidateupdateprofilepage.year.get(i).getAttribute("value"), data.get("year"));
					Assert.assertEquals(candidateupdateprofilepage.grade.get(i).getAttribute("value"), data.get("grade"));
					Assert.assertEquals(candidateupdateprofilepage.issuingAuthority.get(i).getAttribute("value"), data.get("issuing Authority"));
					Assert.assertEquals(driver.findElements(By.xpath("//span[@class='ng-value-label']")).get(i).getText(), data.get("country"));

				}
				i++;
			 }
		}
		
		@Then("^Assert the languages details$")
		public void assert_the_languages_details(DataTable credentials) throws Throwable {
			int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<candidateupdateprofilepage.certificate.size())
				{
					Assert.assertEquals(candidateupdateprofilepage.language.get(i).getAttribute("value"), data.get("language"));
					select=new Select(candidateupdateprofilepage.proficiency.get(i));
					Assert.assertEquals(select.getFirstSelectedOption().getText().strip(), data.get("proficiency"));
					Assert.assertEquals(candidateupdateprofilepage.certificate.get(i).getAttribute("value"), data.get("certificate"));
					Assert.assertEquals(candidateupdateprofilepage.language.get(i).getAttribute("value"), data.get("language"));

				}
				i++;
			 }
		}
		@Then("^Assert the visa details$")
		public void assert_the_visa_details(DataTable credentials) throws Throwable {
			Thread.sleep(2000);
			int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(i<candidateupdateprofilepage.visaType.size())
				{
					Assert.assertEquals(driver.findElements(By.xpath("//span[@class='ng-value-label']")).get(i).getText(), data.get("country"));
					Assert.assertEquals(candidateupdateprofilepage.visaType.get(i).getAttribute("value"), data.get("VisaType"));
//					Assert.assertEquals(driver.findElements(By.xpath("//input[@placeholder='Select Date']")).get(i).getAttribute("value"), data.get("ValidUpto"));
				}
				i++;
			}
		}
		
		@Then("^Asert the experirnce deatils$")
		public void asert_the_experirnce_deatils(DataTable credentials) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//i[@class='fa fa-pencil'])[2]")).click();
			Thread.sleep(3000);
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
			Assert.assertEquals(addcandidatepage.title.getAttribute("value"), data.get("title"));
			Assert.assertEquals(driver.findElement(By.xpath("//input[@placeholder='Select Date']//following::p")).getAttribute("value"), data.get("ValidUpto"));
			Assert.assertEquals(driver.findElement(By.xpath("(//input[@placeholder='Select Date']//following::p)[2]")).getAttribute("value"), data.get("ValidUpto"));
			Assert.assertEquals(candidateupdateprofilepage.organization.get(0).getAttribute("value"), data.get("organization"));
			Assert.assertEquals(candidateupdateprofilepage.technologies.getAttribute("value"), data.get("technologies"));
			Assert.assertEquals(candidateupdateprofilepage.client.getAttribute("value"), data.get("client"));		 
			 }
		}
		
//	@training
		
		@When("^clck on training tab$")
		public void clck_on_training_tab() throws Throwable {
			Thread.sleep(3000);
			candidateupdateprofilepage.trainingsTab.click();
		}
		
		@When("^fill all training details$")
		public void fill_all_training_details(DataTable credentials) throws Throwable {
			candidateupdateprofilepage.fillAllTrainingDetails(credentials);
		}
		
		@When("^save the changes$")
		public void save_the_changes() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			common.clickOnOKBtn();			
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
			common.clickOnOKBtn();			
		}
		
		@Then("^Assert the training deatils$")
		public void assert_the_training_deatils(DataTable credentials) throws Throwable {
			int i=0;
			
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(i<candidateupdateprofilepage.TotalExperience.size())
				{
				Assert.assertEquals(driver.findElements(By.xpath("//input[@id='Title']")).get(i).getAttribute("value"), data.get("title1"));
				Assert.assertEquals(candidateupdateprofilepage.TotalExperience.get(i).getAttribute("value"), data.get("experirence"));
				Assert.assertEquals(candidateupdateprofilepage.remark.get(i).getAttribute("value"), data.get("reamrk1"));
				Assert.assertEquals(candidateupdateprofilepage.attendedIn.get(i).getAttribute("value"), data.get("attendedYear"));	
				}				
				i++;
			 }
			
			int j=i;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(j<=candidateupdateprofilepage.remark.size())
				{
				Assert.assertEquals(driver.findElements(By.xpath("//input[@id='Title']")).get(j).getAttribute("value"), data.get("title2"));	
				Assert.assertEquals(candidateupdateprofilepage.remark.get(j).getAttribute("value"), data.get("remark2"));	
				}
				j++;
			 }
		}
		
		@When("^click on social links tab$")
		public void click_on_social_links_tab() throws Throwable {
			Thread.sleep(2000);
			candidateupdateprofilepage.sociallinkTab.click();
		}
		
		@Then("^fill all social link details$")
		public void fill_all_social_link_details(DataTable credentials) throws Throwable {
		   candidateupdateprofilepage.fillAllSocialLinkDetails(credentials);
		}
		
		@Then("^Assert the social link details$")
		public void assert_the_social_link_details(DataTable credentials) throws Throwable {
			int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(i<candidateupdateprofilepage.link.size())
				{
					Assert.assertEquals(driver.findElements(By.xpath("//input[@id='Title']")).get(i).getAttribute("value"), data.get("title"));	
					Assert.assertEquals(candidateupdateprofilepage.link.get(i).getAttribute("value"), data.get("link"));	
			    }
				i++;
			}
		}
		
		@When("^Click on Aditional Details tab$")
		public void click_on_Aditional_Details_tab() throws Throwable {
			Thread.sleep(3000);
			candidateupdateprofilepage.aditionalTab.click();
		}

		@When("^fill all Aditional details$")
		public void fill_all_Aditional_details() throws Throwable {
			candidateupdateprofilepage.fillAllAdditinalDetails();
		}
		
		@Then("^Assert the additional details$")
		public void assert_the_additional_detaails() throws Throwable {
			Thread.sleep(5000);
			candidateupdateprofilepage.coverLetter.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("Coverletter"));
			candidateupdateprofilepage.achievements.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("acheivment"));
			candidateupdateprofilepage.testimonials.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("testimonals"));
			candidateupdateprofilepage.references.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("refresnces"));
			candidateupdateprofilepage.extracurricular.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("extracurriculam"));
			candidateupdateprofilepage.profileSummary.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("profilesummary"));
			candidateupdateprofilepage.declaration.click();
			Assert.assertEquals(candidateupdateprofilepage.textArea.getText(), prop.getProperty("declaration"));

		}
		
		@When("^enter candidate email \"([^\"]*)\"$")
		public void enter_candidate_email(String CandidateEmail) throws Throwable {
			workbenchpage.enterEmailId(CandidateEmail);
			common.clickOnOKBtn();

		}
//		@When("^Assert the candidate details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
//		public void assert_the_candidate_details_and(String Username, String CandidateEmail, String Name, String ContactNumber, String Designation, String Date, String Gender, String OnNoticePeriod, String NoticePeriod, String LastWorkingDay, String experience, String CTC, String expectedCTC, String Country, String City, String CityArea, String ZipCode, String Communicationmode, String Salaryoffered, String distance, String permanentAddress, String relocate, String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3, String certificateforskill1, String certificateforskill2) throws Throwable {
//			editcandidatepage.AssertCandidatedetails(Username, CandidateEmail, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode, Salaryoffered, distance, permanentAddress, relocate);
//			editcandidatepage.assertSkill(Skill1, Skill2, Skill3, level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
//		}
		
	
		@When("^Assert the candidate details when candidate is already register\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
		public void assert_the_candidate_details_when_candidate_is_already_register_and(String Username,String CandidateEmail,String profiletitle,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2) throws Throwable {
			editcandidatepage.AssertCandidatedetails(Username, CandidateEmail, profiletitle, Name, ContactNumber, Designation, Date, Gender, OnNoticePeriod, NoticePeriod, LastWorkingDay, experience, CTC, expectedCTC, Country, City, CityArea, ZipCode, Communicationmode);
			editcandidatepage.assertSkill(Skill1, Skill2, Skill3, level1, level2, level3, certificate1, certificate2, certificate3, certificateforskill1, certificateforskill2);
		
		}
		
}
