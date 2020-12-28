package BVT_StepDefination;



import org.junit.Assert;
import org.openqa.selenium.By;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class b_unblockFunctionalitySteps extends baseclass {
	
	boolean emp;

//@bvt_agencyunblock:
	
//	@Then("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//	public void enter_All_details_of_and(String CandidateEmail,String profiletitle, String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws Throwable {
//		workbenchpage.enterEmailId(CandidateEmail);
//		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,profiletitle,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
//		addcandidatepage.uploadResumeDocument();
//		common.clickOnSaveBtn();
//		try
//		{
//		common.clickOnConfirmYes();
//		}
//		catch(NoSuchElementException e)	
//		{}
//		addcandidatepage.checkCandidateALreadyPresent();
//	}
	
	@Then("^Enter All details of \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\"$")
	public void enter_All_details_of_and(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate,String Skill1, String Skill2, String Skill3, String level1, String level2, String level3, String Weightage1, String Weightage2, String Weightage3, String certificate1, String certificate2, String certificate3, String remark1, String remark2,String remark3,String certificateforskill1, String certificateforskill2) throws Throwable {
		workbenchpage.enterEmailId(CandidateEmail);
		addcandidatepage.EnterAllMandatoryfieldsT(CandidateEmail,Name,ContactNumber,Designation,Date,Gender,OnNoticePeriod,NoticePeriod,LastWorkingDay,experience,CTC,expectedCTC,Country,City,CityArea,ZipCode,Communicationmode,Salaryoffered,distance,permanentAddress,relocate);
		addcandidatepage.addSkill(level1, level2, level3,certificate1, certificate2,certificate3,certificateforskill1, certificateforskill2);
		addcandidatepage.uploadResumeDocument();
		common.clickOnSaveBtn(); 
		addcandidatepage.checkCandidateALreadyPresent();
	}
	
	@When("^Block the agency \"([^\"]*)\"$")
	public void block_the_agency(String agency) throws Throwable {
		sharewithagencypage.searchField.clear();
		sharewithagencypage.searchField.sendKeys(agency);
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		if(isBlockUnblockSelected==false)
		{
			Thread.sleep(2000);
			sharewithagencypage.blockUnblockCheckbox.click();
			common.clickOnConfirmYes();
		}
	}
	
	@When("^click on the Block/Unblock to unblock checkbox present in front of agency whom you shared the job \\\"([^\\\"]*)\\\"$")
	public void click_on_the_Block_Unblock_to_unblock_checkbox_present_in_front_of_the_agency_with_whom_you_shared_the_job(String agyEmailId) throws Throwable {
		sharewithagencypage.searchField.clear();
		sharewithagencypage.searchField.sendKeys(agyEmailId);
		boolean isBlockUnblockSelected=sharewithagencypage.isBlockUnblockSelected.isSelected();
		if(isBlockUnblockSelected==true)
		{
			Thread.sleep(2000);
			sharewithagencypage.blockUnblockCheckbox.click();
			common.clickOnConfirmYes();
		}
	}
	
		@When("^click on the Block/Unblock to unblock checkbox present in front of team with whom you shared the job \\\"([^\\\"]*)\\\"$")
		public void click_on_the_Block_Unblock_to_unblock_checkbox_present_in_front_of_team_with_the_agency_with_whom_you_shared_the_job(String team) throws Throwable {
			sharewithagencypage.searchField.clear();
			sharewithagencypage.searchField.sendKeys(team);
			if(driver.findElement(By.xpath("(//label[@class='check'])[5]")).isSelected())
			{
			}
			else
			{
				Thread.sleep(3000);
				sharewithagencypage.blockUnblockCheckbox.click();
				common.clickOnConfirmYes();
			}
			
			if(driver.findElement(By.xpath("(//label[@class='check'])[5]")).isSelected())
			{
				Thread.sleep(3000);
				sharewithagencypage.blockUnblockCheckbox.click();
				common.clickOnConfirmYes();
			}
		}


	@Then("^Employer should be able to unblock the agency$")
	public void employer_should_be_able_to_unblock_the_agency() throws Throwable {
		
		boolean isUnblock = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected();
		Assert.assertEquals(false, isUnblock);
		
	}
	
	@Then("^Click on close button$")
	public void click_on_close_button() throws Throwable {
		common.clickOnCloseBtn();

	}

	@Then("^click on Add Candidate button$")
	public void click_on_Add_Candidate_button() throws Throwable {
		workbenchpage.clickOnAddCandidate();
	}
//	@Then("^logout with employer and login with Agency valid credentials which you unblocked$")
//	public void logout_with_employer_and_login_with_Agency_valid_credentials_which_you_unblocked(DataTable dt) throws Throwable {
//	    
//		workbenchpage.ClickonLogout();
//		Thread.sleep(3000);
//		
//		registerpage.clickEmployerAgencySignInlink();
//		Thread.sleep(3000);
//		
//		List<List<String>> data = dt.raw();
//		loginpage.emailaddress.sendKeys(data.get(0).get(0));
//		loginpage.password.sendKeys(data.get(0).get(1));
//		loginpage.signin.click();
//		Thread.sleep(5000);
//	}

	@Then("^click on Workbench tab and select job from Jobs drop down for which agency is unblocked$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_agency_is_unblocked() throws Throwable {
	    this.emp=loginpage.b;
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.selectJobK();
		
	}

//	@Then("^click on Add Candidate button$")
//	public void click_on_Add_Candidate_button() throws Throwable {
//	    
//		workbenchpage.addCandidateButton.click();
//		Thread.sleep(3000);
//	}

//	@When("^enter email id of candidate and click on Find button$")
//	public void enter_email_id_of_candidate_and_click_on_Find_button(DataTable dt) throws Throwable {
//	    
//		List<List<String>> data = dt.raw();
//		
//		addcandidatepage.validatePageTitle();
//		addcandidatepage.emailField.click();
//		addcandidatepage.emailField.sendKeys(data.get(0).get(0));
//		addcandidatepage.FindButton.click();
//		Thread.sleep(3000);
//	}
//
//	@Then("^click on OK button from success popup window if you entered email id of registered candidate$")
//	public void click_on_OK_button_from_success_popup_window_if_you_entered_email_id_of_registered_candidate() throws Throwable {
//	    
//		driver.findElement(By.id("alertModalCloseBtn")).click();
//	}
//
//	@Then("^Fill all details and click on Save button$")
//	public void fill_all_details_and_click_on_Save_button() throws Throwable {
//	    
//		addcandidatepage.salaryOffered.sendKeys("300000");
//		common.clickOnSaveBtn();
//	}
//
//	@Then("^click on Yes button if probability related fields are not filled and observe$")
//	public void click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe() throws Throwable {
//	    
//		driver.findElement(By.id("confirmModalBtn")).click();
//		Thread.sleep(2000);
//	}


	@Then("^Unblocked agency should be able add candidate \"([^\"]*)\"$")
	public void unblocked_agency_should_be_able_add_candidate(String Name) throws Throwable {
		boolean candidateDisplay = driver.findElement(By.xpath("//span[text()=' "+Name+"']")) != null;
		Assert.assertEquals(true, candidateDisplay);
	}
	
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//	    
//		Thread.sleep(5000);
//		driver.close();
//	}
	
	

//@bvt_teamunblock:
//	@When("^enter valid user \"([^\"]*)\" and \"([^\"]*)\" for registered employer and agency and click on Sign in button$")
//	public void enter_valid_user_and_for_registered_employer_and_agency_and_click_on_Sign_in_button(String arg1, String arg2) throws Throwable {
//	    
//		loginpage.emailaddress.sendKeys(arg1);
//		loginpage.password.sendKeys(arg2);
//		loginpage.signin.click();
//		Thread.sleep(5000);
//	}

//	@When("^click on Share With Team button and select the Share checkbox present in front of the team member$")
//	public void click_on_Share_With_Team_button_and_select_the_Share_checkbox_present_in_front_of_the_team_member(DataTable dt) throws Throwable {
//	    
//		List<List<String>> data = dt.raw();
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		if(dynamicElement.size() != 0){
//			
//			System.out.println("\nSearching team member with Employer..");
//			
//			workbenchpage.shareWithTeamButton.click();
//			Thread.sleep(3000);
//			
//			sharewithteampage.searchField.click();
//			sharewithteampage.searchField.sendKeys(data.get(0).get(0));
//			
//			sharewithteampage.shareCheckbox.click();
//			Thread.sleep(2000);
//		}
//		
//		else{
//			
//			System.out.println("\nSearching team member with Agency..");
//			
//			workbenchpage.shareWithTeamButton.click();
//			Thread.sleep(3000);
//			
//			sharewithteampage.searchField.click();
//			sharewithteampage.searchField.sendKeys(data.get(0).get(1));
//			
//			sharewithteampage.shareCheckbox.click();
//			Thread.sleep(2000);
//		}
//		
//		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		
//	}
//
//	@When("^click on Block/Unblock checkbox present in front of the team member with whom you shared the job$")
//	public void click_on_Yes_button_from_confirmation_popup_and_select_the_Block_Unblock_checkbox_present_in_front_of_the_team_member_with_whom_you_shared_the_job() throws Throwable {
//	    
////		common.clickOnConfirmYes();
////		
//		sharewithteampage.blockUnblockCheckbox.click();
//
//	}

//	@When("^now again click on Block/Unblock checkbox present in front of the team member which is blocked previously to unblock that team member$")
//	public void now_again_click_on_Block_Unblock_checkbox_present_in_front_of_the_team_member_which_is_blocked_previously_to_unblock_that_team_member() throws Throwable {
//	    
//		if(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected())
//		{
//			Thread.sleep(2000);
//			sharewithagencypage.blockUnblockCheckbox.click();
//		}
//		else
//		{
//			
//		}
//		
//	}

	
	@Then("^User should be able to unblock the team member$")
	public void User_should_be_able_to_unblock_the_team_member() throws Throwable {
	    Thread.sleep(2000);
		boolean isblock = driver.findElement(By.xpath("(//label[@class='check'])[4]")).isSelected();
		Assert.assertEquals(false, isblock);
	}
//
//	@Then("^logout with logged in user and login with team member valid credentials which you unblocked$")
//	public void logout_with_logged_in_user_and_login_with_team_member_valid_credentials_which_you_unblocked(DataTable dt) throws Throwable {
//	    
//		List<List<String>> data = dt.raw();
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		if(dynamicElement.size() != 0){
//
//			System.out.println("\nLogout with Employer and login with Employer team member..");
//			
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//			
//			registerpage.clickEmployerAgencySignInlink();
//			Thread.sleep(3000);
//			
//			loginpage.emailaddress.sendKeys(data.get(0).get(0));
//			loginpage.password.sendKeys(data.get(0).get(0));
//			loginpage.signin.click();
//			Thread.sleep(5000);
//		}
//		
//		else{
//
//			System.out.println("\nLogout with Agency and login with Agency team member..");
//			
//			workbenchpage.ClickonLogout();
//			Thread.sleep(3000);
//			
//			registerpage.clickEmployerAgencySignInlink();
//			Thread.sleep(3000);
//			
//			loginpage.emailaddress.sendKeys(data.get(0).get(0));
//			loginpage.password.sendKeys(data.get(0).get(1));
//			loginpage.signin.click();
//			Thread.sleep(5000);
//		}
//		
//		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		
//	}
//
//	@Then("^click on Workbench tab and select job from Jobs drop down for which team member is unblocked$")
//	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down_for_which_team_member_is_unblocked() throws Throwable {
//	    
//		dashboardpage.openWorkbenchPage();
//		Thread.sleep(3000);
//		workbenchpage.se = new Select(workbenchpage.jobDropDown);
//		workbenchpage.se.selectByVisibleText("Automation1 - Active");
//		Thread.sleep(3000);
//	}
//	
//	@Then("^click on Add Candidate button and enter email id of candidate and click on the Find button$")
//	public void click_on_Add_Candidate_button_and_enter_email_id_of_candidate_and_click_on_the_Find_button(DataTable dt) throws Throwable {
//	    
//		List<List<String>> data = dt.raw(); 
//		
//		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		if(dynamicElement.size() != 0){
//			
//			workbenchpage.addCandidateButton.click();
//			Thread.sleep(3000);
//			addcandidatepage.validatePageTitle();
//			addcandidatepage.emailField.click();
//			addcandidatepage.emailField.sendKeys(data.get(0).get(0));
//			addcandidatepage.FindButton.click();
//			Thread.sleep(3000);
//		}
//		
//		else{
//
//			workbenchpage.addCandidateButton.click();
//			Thread.sleep(3000);
//			addcandidatepage.validatePageTitle();
//			addcandidatepage.emailField.click();
//			addcandidatepage.emailField.sendKeys(data.get(0).get(1));
//			addcandidatepage.FindButton.click();
//			Thread.sleep(3000);
//		}
//		
//		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
//	}

	
	@Then("^Unblocked team member should be able add candidate \"([^\"]*)\"$")
	public void unblocked_team_member_should_be_able_add_candidate(String Name) throws Throwable {
		boolean candidateDisplay = driver.findElement(By.xpath("//span[text()=' "+Name+"']")) != null;
		Assert.assertEquals(true, candidateDisplay);
		common.clickOnOKBtn();
	} 
	
	
//	@After("@bvt_agencyunblock, @bvt_teamunblock")
//	public void tearDown() throws InterruptedException
//	{
//		dashboardpage.openWorkbenchPage();
//		workbenchpage.selectJobK();
//		workbenchpage.clickOnCloseJobButton();
//	}

}
