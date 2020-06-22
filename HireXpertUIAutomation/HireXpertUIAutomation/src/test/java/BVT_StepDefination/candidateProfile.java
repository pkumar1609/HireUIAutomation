package BVT_StepDefination;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Commonfunction;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class candidateProfile extends baseclass {
	
// @bvt @regression1_01

	@When("^enter valid user email address and password for employer and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_employer_and_click_on_Sign_in_button(DataTable dt) throws Throwable {
		
		
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
	    Thread.sleep(5000);
	}
	
	@When("^click on Workbench tab and select job from Jobs drop down$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down(DataTable credentials) throws Throwable {
		dashboardpage.openWorkbenchPage();
		addjobpage.addjob(credentials);
	    Thread.sleep(3000);
	    workbenchpage.selectJobK();
	    
//	    Thread.sleep(3000);
//	    
//	    //verify candidate card count before adding candidate to job
//	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
//		
//		if(dynamicElement.size() != 0) {
//			
//			List<WebElement> element = driver.findElements(By.xpath("//div[@class='item-box cdk-drag']"));
//			candidateupdateprofilepage.beforecount = element.size();
//			System.out.println("\nCard count before adding new candidate: " + candidateupdateprofilepage.beforecount);
//			
//			if(candidateupdateprofilepage.beforecount == 0){
//				
//				System.out.println("Candidate card is not available..");
//			}
//	
//		}
	}
	
	@When("^click on Add Candidate button$")
	public void click_on_Add_Candidate_button() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.addCandidateButton.click();
		
	}
	
	@When("^enter email id of candidate which is not registered previously \"([^\"]*)\"$")
	public void enter_email_id_of_candidate_which_is_not_registered_previously(String CandidateEmail) throws Throwable {

         Thread.sleep(3000);
		
		addcandidatepage.EntercandidateemailT(CandidateEmail);
	}

	@Then("^logout with employer and login with new candidate added by employer \"([^\"]*)\" \"([^\"]*)\"$")
	public void logout_with_employer_and_login_with_new_candidate_added_by_employer(String CandidateEmail, String Password) throws Throwable {

		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		
		registerpage.clickJobseekerCandidateSignInlinklink();
		Thread.sleep(3000);
		
		registerpage.enterCandidateEmailandPassword(CandidateEmail, Password);
		
		Thread.sleep(3000);
		registerpage.ClickSigninbtn();
	}


		@When("^Select expertise level for skills \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_expertise_level_for_skills(String ExpertiseLevel1, String ExpertiseLevel2) throws Throwable {

		Thread.sleep(3000);
		addcandidatepage.Enterexpertilevel(ExpertiseLevel1, ExpertiseLevel2);
	}

	
	@When("^enter email id of candidate which is not registered previously and click on Find button$")
	public void enter_email_id_of_candidate_which_is_not_registered_previously_and_click_on_Find_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addcandidatepage.emailField.sendKeys(data.get(0).get(0));
		Thread.sleep(3000);
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
	}
	
	@When("^Fill all mandatory details and click on Save button$")
	public void fill_all_mandatory_details_and_click_on_Save_button(DataTable dt) throws Throwable {
	    
		addcandidatepage.validatePageTitle();
		
		List<List<String>> data = dt.raw();
		
		addcandidatepage.name.sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		addcandidatepage.contactNumber.sendKeys(data.get(0).get(1));
		Thread.sleep(1000);
		addcandidatepage.designation.sendKeys(data.get(0).get(2));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div[1]/form/div[2]/div[1]/div/div/div[2]")).click();  //click outside 
		
		Select se = new Select(addcandidatepage.gender);
		se.selectByVisibleText(data.get(0).get(3));
	
		Thread.sleep(1000);
		addcandidatepage.noticePeriod.sendKeys(data.get(0).get(4));
		Thread.sleep(1000);
		addcandidatepage.location.sendKeys(data.get(0).get(5));
		Thread.sleep(1000);
		
		se = new Select(addcandidatepage.communicationMode);
		se.selectByVisibleText(data.get(0).get(6));
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div[1]/form/div[2]/div[1]/div/div/div[2]")).click();  //click outside 
		
		se = new Select(addcandidatepage.expertiseLevel);
		se.selectByVisibleText(data.get(0).get(7));
		
		addcandidatepage.uploadResumeDocumentT();
		
		common.clickOnSaveBtn();
	}
	
	@When("^click on Yes button if probability related fields are not filled and observe$")
	public void click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe() throws Throwable {
	    
		common.clickOnConfirmYes();
		Thread.sleep(3000);
	}
	
	@Then("^user should able to add new candidate and candidate should get added in New column$")
	public void user_should_able_to_add_new_candidate_and_candidate_should_get_added_in_New_column() throws Throwable {
	    
		System.out.println("User able to add new candidate without registration..");
		System.out.println("New candidate get added to the job in New column..");
		workbenchpage.clickReloadCandidateButton();
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		
		if(dynamicElement.size() != 0) {
			
	//		String candidateName = "c34";
	//		
	//		WebElement candidateName1 = driver.findElement(By.xpath("//h6[@class='CustomPointer']"));
			
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='item-box cdk-drag']"));
			candidateupdateprofilepage.aftercount = element.size();
			System.out.println("\nCard count after adding candidate: " + candidateupdateprofilepage.aftercount);
			
			int beforecount1 = candidateupdateprofilepage.beforecount + 1;
			
			if(candidateupdateprofilepage.aftercount != 0){
				
				if(candidateupdateprofilepage.aftercount == beforecount1) {
					
					System.out.println("Newly added candidate card is available..");
					
	//				String candidateNameOnCard = candidateName1.getText();
	//				
	//				for(int i = 1; i<=candidateupdateprofilepage.aftercount; i++) {
	//					
	//					if(candidateName.equals(candidateNameOnCard)) {
	//						
	//						System.out.println("Candidate found at "+i+" position..");
	//						Thread.sleep(3000);
	//					}
	//				}
				}	
			}
			
			else {
				
				System.out.println("Newly added candidate card is not available..");
			}
	
		}
		
	}
	
	@Then("^logout with employer and login with new candidate added by employer$")
	public void logout_with_employer_and_login_with_new_candidate_added_by_employer(DataTable dt) throws Throwable {
	    
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		
		registerpage.clickJobseekerCandidateSignInlinklink();
		Thread.sleep(3000);
		
		List<List<String>> data = dt.raw();
		loginpage.emailaddress.sendKeys(data.get(0).get(0));
		loginpage.password.sendKeys(data.get(0).get(1));
		loginpage.signin.click();
		Thread.sleep(5000);
	}
	
	@Then("^logout as candidate and login as same employer$")
	public void logout_as_candidate_and_login_as_same_employer() throws Throwable {
		Thread.sleep(3000);
		workbenchpage.ClickonLogout();
		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();
		Thread.sleep(3000);
		registerpage.employerlogin();

	}

	@Then("^go to workbench and select the same job$")
	public void go_to_workbench_and_select_the_same_job() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.openWorkbenchPage();
		
		 Thread.sleep(3000);

         workbenchpage.selectJob();
		
	}
	
	@Then("^click on close and Yes btn$")
	public void click_on_close_and_Yes_btn() throws Throwable {

		Thread.sleep(3000);
		common.clickOnCloseBtn();
		Thread.sleep(1000);
		common.clickOnConfirmYes();
	}

	
	@Then("^Candidate should be able to login with email id added by user and Update profile pop up will appears$")
	public void Candidate_should_be_able_to_login_with_email_id_added_by_user_and_Update_profile_pop_up_will_appears() throws Throwable {
	    
		System.out.println("\nCandidate able to login with email id added by user..");
		String title = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-candidate-profile/div[1]/h5")).getText();
		System.out.println("\nTitle of page: " + title);
		Thread.sleep(2000);
	}
	
	@Then("^observe the auto-populated fields on the update candidate profile popup$")
	public void observe_the_auto_populated_fields_on_the_update_candidate_profile_popup() throws Throwable {
	    
		candidateupdateprofilepage.autoPopulatedData();
	}
	
	@Then("^all filled information should auto populate if candidate added through employer$")
	public void all_filled_information_should_auto_populate_if_candidate_added_through_employer() throws Throwable {
	    
		System.out.println("\nAll information displayed on Update Profile page of candidate..");
	}
	
	@Then("^observe email id field from candidate profile$")
	public void observe_email_id_field_from_candidate_profile() throws Throwable {
	    
		candidateupdateprofilepage.verifyEmail();
		Thread.sleep(2000);
	}
	
	@Then("^Select the On Notice Period field and set last working day on Update Profile page$")
	public void select_the_On_Notice_Period_field_and_set_last_working_day_on_Update_Profile_page(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		candidateupdateprofilepage.noticePeriodCheckbox.click();
		Thread.sleep(1000);
		candidateupdateprofilepage.lastWorkingDay.sendKeys(data.get(0).get(0));
		Thread.sleep(2000);
	}
	
	@Then("^Click on Save button and again go to Update Profile page$")
	public void click_on_Save_button_and_again_go_to_Update_Profile_page() throws Throwable {
	    
		common.clickOnSaveBtn();
		Thread.sleep(3000);
		workbenchpage.openUpdateProfilePage();
		Thread.sleep(3000);
	}
	
	@Then("^Observe the Last Working Day field$")
	public void observe_the_Last_Working_Day_field() throws Throwable {
	    
		candidateupdateprofilepage.lastWorkingDay.click();
		
		String lastworkingday = candidateupdateprofilepage.lastWorkingDay.getAttribute("value");
		System.out.println("\nLast Working day: " +lastworkingday);
	}
	
	@Then("^Last Working date should get updated properly$")
	public void last_Working_date_should_get_updated_properly() throws Throwable {
	    
		System.out.println("Data displayed properly..");
	}
	
	@Then("^do not make any changes on Update Profile page and click on Close button$")
	public void do_not_make_any_changes_on_Update_Profile_page_and_click_on_Close_button() throws Throwable {
	    
		common.closebtn.click();
		Thread.sleep(2000);
	}
	
	@Then("^update profile page should get closed and candidate dashboard should display$")
	public void update_profile_page_should_get_closed_and_candidate_dashboard_should_display() throws Throwable {
	    
		System.out.println("\nUpdate Profile page get closed and candidate dashboard displayed..");
	}
	
	@Then("^go to Profile section and then Update Profile page$")
	public void go_to_Profile_section_and_then_Update_Profile_page() throws Throwable {
	    
		workbenchpage.openUpdateProfilePage();
		Thread.sleep(3000);
	}
	
	@Then("^click on Add Skill button to add one skill$")
	public void click_on_Add_Skill_button_to_add_one_skill() throws Throwable {
	    
		candidateupdateprofilepage.addSkillButton.click();
	}
	
	@Then("^add skill, expertise level and certificate$")
	public void add_skill_expertise_level_and_certificate(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		candidateupdateprofilepage.skill2.sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		Select se = new Select(candidateupdateprofilepage.expertiseLevel2);
		se.selectByVisibleText(data.get(0).get(1));
		Thread.sleep(1000);
		candidateupdateprofilepage.certificate2.sendKeys(data.get(0).get(2));
		Thread.sleep(1000);
	}
	
	@Then("^add same skill, expertise level and certificate$")
	public void add_same_skill_expertise_level_and_certificate(DataTable dt) throws Throwable {
	    
		candidateupdateprofilepage.addSkillButton.click();
		
		List<List<String>> data = dt.raw();
		candidateupdateprofilepage.skill3.sendKeys(data.get(0).get(0));
		Thread.sleep(1000);
		Select se = new Select(candidateupdateprofilepage.expertiseLevel3);
		se.selectByVisibleText(data.get(0).get(1));
		Thread.sleep(1000);
	}
	
	@Then("^fill other mandatory details and click on Save button$")
	public void fill_other_mandatory_details_and_click_on_Save_button() throws Throwable {
	    
		common.clickOnSaveBtn();
	}
	
	@Then("^error message should display and click on OK button from popup$")
	public void error_message_should_display_and_click_on_OK_button_from_popup() throws Throwable {
	    
		System.out.println("\nError message displayed like: Same skill entered more than one time");
		common.clickOnOKBtn();
	}
	
	@Then("^delete duplicate skill and click on Not Looking For Job checkbox and click on Save button$")
	public void delete_duplicate_skill_and_click_on_Not_Looking_For_Job_checkbox_and_click_on_Save_button() throws Throwable {
	    
		candidateupdateprofilepage.skill3Delete.click();
		
		boolean value = candidateupdateprofilepage.notLookingForJobCheckbox.isSelected();
		
		if(value = true) {
			
			System.out.println("\nNot Looking for job checkbox is selected..");
			candidateupdateprofilepage.notLookingForJobCheckbox.click();
			common.clickOnSaveBtn();
			Thread.sleep(3000);
		}
		else {
			
			System.out.println("\nNot Looking for job checkbox is not selected..");
			candidateupdateprofilepage.notLookingForJobCheckbox.click();
			common.clickOnSaveBtn();
			Thread.sleep(3000);
		}
	}
	
	@Then("^entered certificate should appear in skill section on candidate dashboard$")
	public void entered_certificate_should_appear_in_skill_section_on_candidate_dashboard() throws Throwable {
	    
		workbenchpage.openUpdateProfilePage();
		candidatedashboardpage.findSkillAndCertificate();
		candidatedashboardpage.skillsRefreshButton.click();
		Thread.sleep(3000);
	}
	
	@Then("^again go to update profile and delete certificate value of the skill and click on save button$")
	public void again_go_to_update_profile_and_delete_certificate_value_of_the_skill_and_click_on_save_button() throws Throwable {
	    
		workbenchpage.openUpdateProfilePage();
		Thread.sleep(3000);
		candidateupdateprofilepage.certificate2.clear();
		Thread.sleep(2000);
		common.clickOnSaveBtn();
		Thread.sleep(3000);
		candidatedashboardpage.skillsRefreshButton.click();
		Thread.sleep(3000);
	}
	
	@Then("^again go to update profile and verify Not Looking For Job checkbox$")
	public void again_go_to_update_profile_and_verify_Not_Looking_For_Job_checkbox() throws Throwable {
		
		workbenchpage.openUpdateProfilePage();
		Thread.sleep(2000);
		String certificatevalue = candidateupdateprofilepage.certificate2.getText();
		
		if(certificatevalue.equals("")) {
			System.out.println("\nCertificate deleted successfully..");
		}
		else{
			System.out.println("\nCertificate not deleted..");
		}
		
		boolean value = candidateupdateprofilepage.notLookingForJobCheckbox.isSelected();
		
		if(value = false) {
			
			System.out.println("\nNot Looking for job checkbox is not selected..");
			candidateupdateprofilepage.notLookingForJobCheckbox.click();
			Thread.sleep(3000);
		}
		else {
			
			System.out.println("\nNot Looking for job checkbox is selected..");
			candidateupdateprofilepage.notLookingForJobCheckbox.click();
			Thread.sleep(3000);
		}
	}
	
	@Then("^all changes should be saved$")
	public void all_changes_should_be_saved() throws Throwable {
	    
		System.out.println("\nAll changes displayed properly");
	}
	
	@Then("^Click on Add Skill button to add more than ten skills and observe$")
	public void click_on_Add_Skill_button_to_add_more_than_ten_skills_and_observe() throws Throwable {
	    
		Thread.sleep(3000);
		candidateupdateprofilepage.addTenSkills();
		System.out.println("\nNew skill rows get added..");
	}
	
	@Then("^one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills and error message should display$")
	public void one_job_skill_row_should_get_added_after_clicking_on_Add_Skill_button_and_user_should_able_to_add_only_ten_skills_and_error_message_should_display() throws Throwable {
	    
		System.out.println("User not able to add more than 10 skills");
	    System.out.println("Error message displayed like: Candidate should not add more than 10 skills");
	    Thread.sleep(2000);
	    driver.findElement(By.id("alertModalCloseBtn")).click();
	    Thread.sleep(2000);
	}
	
	@Then("^click on Delete Skill button in front of any skill for candidate$")
	public void click_on_Delete_Skill_button_in_front_of_any_skill_for_candidate() throws Throwable {
	    
		candidateupdateprofilepage.skill3Delete.click();
	}
	
	@Then("^Click on Add Role button and observe$")
	public void click_on_Add_Role_button_and_observe() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.openUpdateProfilePage();
		Thread.sleep(3000);
		candidateupdateprofilepage.addThreeRoles();
		System.out.println("\nNew role rows get added..");
	}
	
	@Then("^one row should get added after clicking on Add Role button and user should able to add only three roles$")
	public void one_row_should_get_added_after_clicking_on_Add_Role_button_and_user_should_able_to_add_only_three_roles() throws Throwable {
	    
		System.out.println("User not able to add more than 3 roles");
	    System.out.println("Error message displayed like: Candidate should not add more than 3 roles");
	    Thread.sleep(2000);
	    driver.findElement(By.id("alertModalCloseBtn")).click();
	    Thread.sleep(2000);
	}
	
	@Then("^click on Delete Role button in front of any role$")
	public void click_on_Delete_Role_button_in_front_of_any_role() throws Throwable {
	    
		candidateupdateprofilepage.role3Delete.click();
	
	}
	
	@Then("^after clicking on Delete Role button present in front of role then that role should get deleted$")
	public void after_clicking_on_Delete_Role_button_present_in_front_of_role_then_that_role_should_get_deleted() throws Throwable {
	    
		System.out.println("Selected role get deleted");
	}


// @regression1_02

	@When("^click on Add Candidate button and one new candidate for the job and click on Find button$")
	public void click_on_Add_Candidate_button_and_one_new_candidate_for_the_job_and_click_on_Find_button(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		if(dynamicElement.size() != 0){
			
			System.out.println("\nUser logged in as Employer..");
			
			workbenchpage.addCandidateButton.click();
			Thread.sleep(1000);
			addcandidatepage.validatePageTitle();
			addcandidatepage.emailField.sendKeys(data.get(0).get(0));
			addcandidatepage.FindButton.click();
			Thread.sleep(3000);
			common.clickOnOKBtn();
		}
		
		else{
			
			System.out.println("\nUser logged in as Agency..");
			
			workbenchpage.addCandidateButton.click();
			Thread.sleep(1000);
			addcandidatepage.validatePageTitle();
			addcandidatepage.emailField.sendKeys(data.get(0).get(1));
			addcandidatepage.FindButton.click();
			Thread.sleep(3000);
			common.clickOnOKBtn();
		}
		
		driver.manage().timeouts().implicitlyWait(utilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	@When("^fill mandatory details$")
	public void fill_mandatory_details() throws Throwable {
	    
		addcandidatepage.salaryOffered.sendKeys("300000");
		Thread.sleep(1000);
	}
	
	@When("^click on Browse button and Upload file with any format like document$")
	public void click_on_Browse_button_and_Upload_file_with_any_format_like_document() throws Throwable {
	    
		addcandidatepage.clickUploadResumeField();
		addcandidatepage.uploadResumeDocument();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Then("^click on Save button$")
	public void click_on_Save_button() throws Throwable {
	    
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
		Thread.sleep(5000);
	}
	
	@Then("^User should be able to upload cv in document format$")
	public void user_should_be_able_to_upload_cv_in_document_format() throws Throwable {
	    
		System.out.println("\nUser able to upload resume in document file format..");
	}
	
	@Then("^click on Edit Candidate icon from candidate card$")
	public void click_on_Edit_Candidate_icon_from_candidate_card() throws Throwable {
	    
		candidatecardsectionpage.clickOnEditCandidateIcon();
		Thread.sleep(3000);
	}
	
	@Then("^click on Browse button and upload another file with different format like executable file format and click on Save button$")
	public void click_on_Browse_button_and_upload_another_file_with_different_format_like_executable_file_format_and_click_on_Save_button() throws Throwable {
	    
		addcandidatepage.clickUploadResumeField();
		editcandidatepage.uploadResumeExecutableFile();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
		Thread.sleep(16000);
	}
	
	@Then("^User should be able to upload cv in executable file format$")
	public void user_should_be_able_to_upload_cv_in_executable_file_format() throws Throwable {
	    
		System.out.println("\nUser able to upload resume in executable file format..");
	}
	
	@Then("^click on Browse button and upload another file with different format like zip file format and click on Save button$")
	public void click_on_Browse_button_and_upload_another_file_with_different_format_like_zip_file_format_and_click_on_Save_button() throws Throwable {
	    
		addcandidatepage.clickUploadResumeField();
		editcandidatepage.uploadResumeZipFile();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		common.clickOnSaveBtn();
		common.clickOnConfirmYes();
		Thread.sleep(7000);
	}
	
	@Then("^User should be able to upload cv in zip format$")
	public void user_should_be_able_to_upload_cv_in_zip_format() throws Throwable {
	    
		System.out.println("\nUser able to upload resume in ZIP file format..");
	}
	
	@Then("^click on Browse button and upload another file with different format like PDF file format$")
	public void click_on_Browse_button_and_upload_another_file_with_different_format_like_PDF_file_format() throws Throwable {
	    
		addcandidatepage.clickUploadResumeField();
		editcandidatepage.uploadResumePDFFile();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Then("^User should be able to upload cv in PDF file format$")
	public void user_should_be_able_to_upload_cv_in_PDF_file_format() throws Throwable {
	    
		System.out.println("\nUser able to upload resume in PDF file format..");
	}
	
	@Then("^click on Browse button and upload another file with different format like text file format$")
	public void click_on_Browse_button_and_upload_another_file_with_different_format_like_text_file_format() throws Throwable {
	    
		addcandidatepage.clickUploadResumeField();
		editcandidatepage.uploadResumeTextFile();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Then("^User should be able to upload cv in text file format$")
	public void user_should_be_able_to_upload_cv_in_text_file_format() throws Throwable {
	    
		System.out.println("\nUser able to upload resume in text file format..");
	}
	
	@Then("^click on Browse button and upload another file with different format like PNG file format$")
	public void click_on_Browse_button_and_upload_another_file_with_different_format_like_PNG_file_format() throws Throwable {
	    
		addcandidatepage.clickUploadResumeField();
		editcandidatepage.uploadResumePNGFile();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Then("^User should be able to upload cv in PNG file format$")
	public void user_should_be_able_to_upload_cv_in_PNG_file_format() throws Throwable {
	    
		System.out.println("\nUser able to upload resume in PNG file format..");
	}


// @regression1_03

	@When("^click on Workbench tab and observe Add Candidate button$")
	public void click_on_Workbench_tab_and_observe_Add_Candidate_button() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
	    Thread.sleep(3000);
	    boolean value = workbenchpage.addCandidateButton.isEnabled();
	    if(value == true) {
	    	
	    	System.out.println("\nAdd Candidate button is enabled without selecting job..");
	    }
	    else {
	    	
	    	System.out.println("\nAdd Candidate button is disabled without selecting job..");
	    }
	}
	
	@Then("^select job from Jobs drop down and observe Add Candidate button$")
	public void select_job_from_Jobs_drop_down_and_observe_Add_Candidate_button() throws Throwable {
	    
		workbenchpage.selectJob();
	    Thread.sleep(3000);
	    boolean value = workbenchpage.addCandidateButton.isEnabled();
	    if(value == true) {
	    	
	    	System.out.println("\nAdd Candidate button is enabled after selecting job..");
	    }
	    else {
	    	
	    	System.out.println("\nAdd Candidate button is disabled even after selecting job..");
	    }
	}
	
	@Then("^observe On Notice Period field$")
	public void observe_On_Notice_Period_field() throws Throwable {
		
		boolean value = addcandidatepage.OnNoticePeriodCheckbox.isSelected();
		if(value == true) {
			
			System.out.println("\nLast Working Day field displayed when On Notice Period is selected..");
			
			addcandidatepage.OnNoticePeriodCheckbox.click();
			Thread.sleep(2000);
			boolean val = addcandidatepage.OnNoticePeriodCheckbox.isSelected();
			if(val = true) {
				System.out.println("\nNotice Period (Days) field is displayed when On Notice Period is not selected..");
			}
		}
		
		else {
			
			System.out.println("\nNotice Period (Days) field is displayed when On Notice Period is not selected..");
			
			addcandidatepage.OnNoticePeriodCheckbox.click();
			Thread.sleep(2000);
			boolean val = addcandidatepage.OnNoticePeriodCheckbox.isSelected();
			if(val = true) {
				System.out.println("Last Working Day field displayed when On Notice Period is selected..");
			}
		}
	}
	
	@Then("^unchecked the On Notice Period field and enter zero in Notice Period field and click on Close button$")
	public void unchecked_the_On_Notice_Period_field_and_enter_zero_in_Notice_Period_field_and_click_on_Close_button() throws Throwable {
	    
		addcandidatepage.OnNoticePeriodCheckbox.click();
		addcandidatepage.noticePeriod.clear();
		Thread.sleep(1000);
		addcandidatepage.noticePeriod.sendKeys("0");
		common.closebtn.click();
		Thread.sleep(1000);
	}
	
	@Then("^confirmation popup message should display with Yes and No buttons and Click on No button$")
	public void confirmation_popup_message_should_display_with_Yes_and_No_buttons_and_click_on_No_button() throws Throwable {
	    
		System.out.println("\nConfirmation message displayed with Yes and No buttons");
		common.clickNoButton();
		Thread.sleep(1000);
	}
	
	@Then("^User should able to add candidate after entering zero value in Notice Period field$")
	public void user_should_able_to_add_candidate_after_entering_zero_value_in_Notice_Period_field() throws Throwable {
	    
		System.out.println("\nUser able to add candidate with 0 notice period..");
	}
	
	@Then("^set another value in Notice Period in Edit Candidate page and click on Close button$")
	public void set_another_value_in_Notice_Period_in_Edit_Candidate_page_and_click_on_Close_button() throws Throwable {
	    
		addcandidatepage.noticePeriod.clear();
		Thread.sleep(1000);
		addcandidatepage.noticePeriod.sendKeys("20");
		common.closebtn.click();
		Thread.sleep(1000);
	}
	
	@Then("^confirmation popup message should display with Yes and No buttons and Click on Yes button$")
	public void confirmation_popup_message_should_display_with_Yes_and_No_buttons_and_Click_on_Yes_button() throws Throwable {
	    
		System.out.println("\nConfirmation message displayed with Yes and No buttons");
		common.clickOnConfirmYes();
		Thread.sleep(1000);
	}
	
	@Then("^Workbench page should display$")
	public void Workbench_page_should_display() throws Throwable {
	    
		System.out.println("\nWorkbench page is displayed..");
	}


//@regression1_04


	@When("^Click on Comment icon from candidate card to add comment$")
	public void click_on_Comment_icon_from_candidate_card_to_add_comment() throws Throwable {
	    
		candidatecardsectionpage.comments.click();
		Thread.sleep(3000);
	}
	
	@When("^Add a comment greater than (\\d+) characters and observe$")
	public void add_a_comment_greater_than_characters_and_observe(int arg1) throws Throwable {
	    
		candidatecardsectionpage.addCommentSection.sendKeys("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		
		String error = candidatecardsectionpage.errorMessageComments.getText();
		System.out.println("\nError message displayed like: " + error);
	}
	
	@Then("^error message should display and Save button should be disabled$")
	public void error_message_should_display_and_Save_button_should_be_disabled() throws Throwable {
	    
		boolean value = common.savebtn.isEnabled();
		
		if(value == true) {
			
			System.out.println("\nSave button is enabled when error message displayed..");
		}
		else {
			
			System.out.println("\nSave button is disabled when error message displayed..");
		}
	}
	
	@Then("^add comment with or below (\\d+) characters and click on Save button$")
	public void add_comment_with_or_below_characters_and_click_on_Save_button(int arg1, DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		Thread.sleep(2000);
		candidatecardsectionpage.addCommentSection.clear();
		candidatecardsectionpage.addCommentSection.sendKeys(data.get(0).get(0));
		candidatecardsectionpage.newComment = candidatecardsectionpage.addCommentSection.getAttribute("value");
		System.out.println("\nNew comment: " + candidatecardsectionpage.newComment);
		common.clickOnSaveBtn();
		Thread.sleep(3000);
	}
	
	@Then("^comment should get added below Save button with Delete Comment icon$")
	public void comment_should_get_added_below_Save_button_with_Delete_Comment_icon() throws Throwable {
	    
		candidatecardsectionpage.addedNewComment = candidatecardsectionpage.addedComment.getText();
		System.out.println("\nAdded comment: " + candidatecardsectionpage.addedNewComment);
		
		if(candidatecardsectionpage.addedNewComment.equals(candidatecardsectionpage.newComment)) {
			
			System.out.println("\nNew comment get added..");
		}
		else {
			System.out.println("\nNew comment not getting added..");
		}
	}
	
	@Then("^click on Delete Comment icon to delete the comment and comment should get deleted$")
	public void click_on_Delete_Comment_icon_to_delete_the_comment_and_comment_should_get_deleted() throws Throwable {
	    
		candidatecardsectionpage.deleteCommentIcon.click();
		Thread.sleep(3000);
		WebElement spaceBelowSaveButton = driver.findElement(By.xpath("//div[@class='scroll-box']"));
		String str = spaceBelowSaveButton.getText();
		System.out.println("\nData below Save button: " + str);
		
		if(str.equals(candidatecardsectionpage.addedNewComment)) {
			
			System.out.println("\nComment not getting deleted..");
		}
		else {
			
			System.out.println("\nComment get deleted..");
		}
	}


//@regression1_05

	@When("^observe candidate is added or not if not added then add new candidate$")
	public void observe_candidate_is_added_or_not_if_not_added_then_add_new_candidate(DataTable dt) throws Throwable {
	    
		//verify candidate card count before adding candidate to job
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
		
		if(dynamicElement.size() != 0) {
			
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='item-box cdk-drag']"));
			candidateupdateprofilepage.beforecount = element.size();
			
			if(candidateupdateprofilepage.beforecount == 0){
				
				workbenchpage.addCandidateButton.click();
				Thread.sleep(3000);
				
				List<List<String>> data = dt.raw();
				
				addcandidatepage.emailField.sendKeys(data.get(0).get(0));
				addcandidatepage.FindButton.click();
				Thread.sleep(3000);
				addcandidatepage.salaryOffered.sendKeys("300000");
				Thread.sleep(1000);
				common.clickOnSaveBtn();
				common.clickOnConfirmYes();
				Thread.sleep(3000);
				System.out.println("\nNew candidate get added to the job in New column..");
			}
			else {
				
				System.out.println("\nCandidate is present in new column..");
			}
		}		
	}
	
	@Then("^Observe candidate get moved in Rejected column automatically$")
	public void observe_candidate_get_moved_in_Rejected_column_automatically() throws Throwable {
	    
		Thread.sleep(2000);
//		candidatecardsectionpage.verifyRejectedColumnData();
	}
	
	@Then("^Now move that candidate from Rejected column to any other column and observe$")
	public void now_move_that_candidate_from_Rejected_column_to_any_other_column_and_observe() throws Throwable {
	    
		candidatecardsectionpage.dragAndDropCardToThirdColumn();
		System.out.println("\nCard get moved to another column..");
	}
	
	@Then("^Click on Add Questionnaire button$")
	public void click_on_Add_Questionnaire_button() throws Throwable {
	    
		workbenchpage.AddQuestionarybtn.click();
		Thread.sleep(3000);
	}
	
	@Then("^Enter a Question and enter Marks accordingly to that question$")
	public void enter_a_Question_and_enter_Marks_accordingly_to_that_question(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addquestionarypage.AddQuestiontextbox.sendKeys(data.get(0).get(0));
		addquestionarypage.TotalMarksofQuestion.sendKeys(data.get(0).get(1));
		Thread.sleep(1000);
	}
	
	@Then("^Enter the answers and Marks accordingly to the answer$")
	public void enter_the_answers_and_Marks_accordingly_to_the_answer(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addquestionarypage.Answer1.sendKeys(data.get(0).get(0));
		addquestionarypage.Marks1.sendKeys(data.get(0).get(1));
		addquestionarypage.Answer2.sendKeys(data.get(0).get(2));
		addquestionarypage.Marks2.sendKeys(data.get(0).get(3));
		Thread.sleep(1000);
	}
	
	@Then("^click on Save Changes button$")
	public void click_on_Save_Changes_button() throws Throwable {
	    
		addquestionarypage.clickOnSaveChangesButton();
	}
	
	@Then("^Enter the cutoff & rejection percentage$")
	public void enter_the_cutoff_rejection_percentage(DataTable dt) throws Throwable {
	    
		List<List<String>> data = dt.raw();
		
		addquestionarypage.CuttoffPercentage.sendKeys(data.get(0).get(0));
		addquestionarypage.RejectionPercentage.sendKeys(data.get(0).get(1));
	}
	
	@Then("^Collect Answer icon should reflect on candidates card for giving answers$")
	public void collect_Answer_icon_should_reflect_on_candidates_card_for_giving_answers() throws Throwable {
	    
		workbenchpage.verifyCollectAnswericonT();
	}



}
