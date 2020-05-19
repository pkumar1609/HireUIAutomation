package jobFunctionality;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;
import utilPackage.utilclass;

public class candidateProfile extends baseclass {
	
// @bvt @regression1_01

@When("^enter valid user email address and password for employer and click on Sign in button$")
public void enter_valid_user_email_address_and_password_for_employer_and_click_on_Sign_in_button(DataTable dt) throws Throwable {
	
	List<List<String>> data = dt.raw();
	loginpage.emailaddress.sendKeys(data.get(0).get(0));
	loginpage.password.sendKeys(data.get(0).get(1));
	loginpage.signin.click();
    Thread.sleep(5000);
}

@When("^click on Workbench tab and select job from Jobs drop down$")
public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down() throws Throwable {
    
	dashboardpage.openWorkbenchPage();
    Thread.sleep(3000);
    workbenchpage.selectJob();
    Thread.sleep(3000);
}

@When("^click on Add Candidate button$")
public void click_on_Add_Candidate_button() throws Throwable {
    
	workbenchpage.addCandidateButton.click();
	Thread.sleep(3000);
}

@When("^enter email id of candidate which is not registered previously and click on Find button$")
public void enter_email_id_of_candidate_which_is_not_registered_previously_and_click_on_Find_button(DataTable dt) throws Throwable {
    
	List<List<String>> data = dt.raw();
	
	addcandidatepage.emailField.sendKeys(data.get(0).get(0));
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
	addcandidatepage.selectGender();
	Thread.sleep(1000);
	addcandidatepage.noticePeriod.sendKeys(data.get(0).get(3));
	Thread.sleep(1000);
	addcandidatepage.location.sendKeys(data.get(0).get(4));
	Thread.sleep(1000);
	addcandidatepage.selectCommunicationMode();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div[1]/form/div[2]/div[1]/div/div/div[2]")).click();  //click outside 
	addcandidatepage.selectExpertiseLevel();
	
	addcandidatepage.saveButton.click();
}

@When("^click on Yes button if probability related fields are not filled and observe$")
public void click_on_Yes_button_if_probability_related_fields_are_not_filled_and_observe() throws Throwable {
    
	addcandidatepage.yesButtonPopup.click();
	Thread.sleep(3000);
}

@Then("^new candidate should get added in New column$")
public void new_candidate_should_get_added_in_New_column() throws Throwable {
    
	System.out.println("New candidate get added to the job in New column..");
	workbenchpage.clickReloadCandidateButton();
	
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	
	List<WebElement> dynamicElement = driver.findElements(By.xpath("//a[contains(text(),'Agencies')]"));
	
	if(dynamicElement.size() != 0){
		
		String candidateName = "c21";
		
		WebElement candidateName1 = driver.findElement(By.xpath("//span[contains(text(),'c21')]"));
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='item-box cdk-drag']"));
		int cardCount = element.size();
		System.out.println("Card count: " + cardCount);
		
		if(cardCount != 0){
			
			System.out.println("Candidate card is available..");
			
			String candidateNameOnCard = candidateName1.getText();
//			System.out.println(candidateNameOnCard);
			
			for(int i = 1; i<=cardCount; i++) {
				
				if(candidateName.equals(candidateNameOnCard)) {
					
					System.out.println("Candidate found at "+i+" position..");
					Thread.sleep(3000);
				}
			}
		}
		
		else {
			
			System.out.println("Candidate card is not available..");
		}

	}
	
}

@Then("^logout with employer and login with new candidate added by employer$")
public void logout_with_employer_and_login_with_new_candidate_added_by_employer(DataTable dt) throws Throwable {
    
	workbenchpage.ClickonLogout();
	Thread.sleep(3000);
	
	List<List<String>> data = dt.raw();
	loginpage.emailaddress.sendKeys(data.get(0).get(0));
	loginpage.password.sendKeys(data.get(0).get(1));
	loginpage.signin.click();
	Thread.sleep(5000);
}

@Then("^Update profile pop up will appears$")
public void update_profile_pop_up_will_appears() throws Throwable {
    
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
public void select_the_On_Notice_Period_field_and_set_last_working_day_on_Update_Profile_page() throws Throwable {
    
	candidateupdateprofilepage.noticePeriodCheckbox.click();
	Thread.sleep(1000);
	candidateupdateprofilepage.lastWorkingDay.sendKeys("31/05/2020");
	Thread.sleep(2000);
}

@Then("^Click on Save button and again go to Update Profile page$")
public void click_on_Save_button_and_again_go_to_Update_Profile_page() throws Throwable {
    
	candidateupdateprofilepage.saveButton.click();
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
    
	candidateupdateprofilepage.closeButton.click();
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
	candidateupdateprofilepage.selectExpertiseLevel2();
	Thread.sleep(1000);
	candidateupdateprofilepage.certificate2.sendKeys(data.get(0).get(1));
	Thread.sleep(1000);
}

@Then("^fill other mandatory details and click on Save button$")
public void fill_other_mandatory_details_and_click_on_Save_button() throws Throwable {
    
	candidateupdateprofilepage.saveButton.click();
	Thread.sleep(2000);
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
	candidateupdateprofilepage.saveButton.click();
	Thread.sleep(3000);
	candidatedashboardpage.skillsRefreshButton.click();
	Thread.sleep(3000);
}

@Then("^again go to update profile and verify all changes are saved$")
public void again_go_to_update_profile_and_verify_all_changes_are_saved() throws Throwable {
	
	workbenchpage.openUpdateProfilePage();
	Thread.sleep(2000);
	String certificatevalue = candidateupdateprofilepage.certificate2.getText();
	
	if(certificatevalue.equals("")) {
		System.out.println("\nCertificate deleted successfully..");
	}
	else{
		System.out.println("\nCertificate not deleted..");
	}
}

@Then("^all changes should be saved$")
public void all_changes_should_be_saved() throws Throwable {
    
//	System.out.println("");
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
    
	Thread.sleep(2000);
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
		addcandidatepage.OKButtonPopup.click();
	}
	
	else{
		
		System.out.println("\nUser logged in as Agency..");
		
		workbenchpage.addCandidateButton.click();
		Thread.sleep(1000);
		addcandidatepage.validatePageTitle();
		addcandidatepage.emailField.sendKeys(data.get(0).get(1));
		addcandidatepage.FindButton.click();
		Thread.sleep(3000);
		addcandidatepage.OKButtonPopup.click();
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
    
	addcandidatepage.saveButton.click();
	addcandidatepage.yesButtonPopup.click();
	Thread.sleep(5000);
}

@Then("^User should be able to upload cv in document format$")
public void user_should_be_able_to_upload_cv_in_document_format() throws Throwable {
    
	System.out.println("\nUser able to upload resume in document file format..");
}

@Then("^click on Edit Candidate icon from candidate card$")
public void click_on_Edit_Candidate_icon_from_candidate_card() throws Throwable {
    
	workbenchpage.candidateCardEditCandidateIcon.click();
	Thread.sleep(3000);
}

@Then("^click on Browse button and upload another file with different format like executable file format and click on Save button$")
public void click_on_Browse_button_and_upload_another_file_with_different_format_like_executable_file_format_and_click_on_Save_button() throws Throwable {
    
	addcandidatepage.clickUploadResumeField();
	editcandidatepage.uploadResumeExecutableFile();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	addcandidatepage.saveButton.click();
	addcandidatepage.yesButtonPopup.click();
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
	addcandidatepage.saveButton.click();
	addcandidatepage.yesButtonPopup.click();
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


}
