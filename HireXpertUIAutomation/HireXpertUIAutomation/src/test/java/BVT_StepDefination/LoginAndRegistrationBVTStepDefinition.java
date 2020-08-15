
package BVT_StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class LoginAndRegistrationBVTStepDefinition extends baseclass  {
		
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^click on Register link$")
	public void click_on_Register_link() throws Throwable {

		Thread.sleep(4200);
		registerpage.clickRegister();

	}
	
	@When("^click on Login link$")
	public void click_on_Login_link() throws Throwable {
	   
		Thread.sleep(5000);
		registerpage.clickLogin();
	}


	
	@Then("^verify the fields and buttons present on the register dialog box$")
	public void verify_the_fields_and_buttons_present_on_the_register_dialog_box() throws Throwable {
		
		Thread.sleep(3000);
		registerpage.verifythefieldsonregisterdialogbox();
	}

	@Then("^click on Close button$")
	public void click_on_Close_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Clickclosebtn();
	}

	
	@When("^Click on Yes button of confirmation popup$")
	public void click_on_Yes_button_of_confirmation_popup() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.ClickYesbtn();
	}


	@Then("^Update employer profile \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_employer_profile(String EmployerAddress, String EmployerOrganizationName, String EmployerWebsite, String EmployerCity) throws Throwable {
		
		Thread.sleep(4200);
		updateprofilepopuppage.UpdateProfileEmployer(EmployerAddress, EmployerOrganizationName, EmployerWebsite, EmployerCity);
	}


	@Then("^Update agency profile\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_agency_profile(String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) throws Throwable {

		Thread.sleep(4200);
		updateprofilepopuppage.UpdateProfileAgency(AgencyAddress, AgencyOrganizationName, AgencyWebsite, AgencyCity);
	}


	
	@When("^Update candidate profile \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void update_candidate_profile(String title, String designation, String noticeperiod, String CandidateCity, String industry, String gender, String expertiselevel) throws Throwable {
	   
        Thread.sleep(3000);
        updateprofilepopuppage.UpdateProfileCandidate(title, designation, noticeperiod,industry, CandidateCity, gender);
		Thread.sleep(3000);
		updateprofilepopuppage.DeleteCandidateSkillsandRoles();
		Thread.sleep(3000);
		updateprofilepopuppage.AddCandidateSkillandRole(expertiselevel);
	}


	@When("^enter details of already registered user \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_user(String name, String email, String contactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails(name, email, contactnumber);
	}

	@When("^Select value from dropdown of \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_of(String name, String email, String contactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails1(name, email, contactnumber);
	}

	@Then("^User should get a error message with OK button and click on OK button$")
	public void user_should_get_a_error_message_with_OK_button_and_click_on_OK_button() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.Clickokbtn();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(3000);
		driver.close();
	}
	
	@When("^click on Yes button$")
	public void click_on_Yes_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnConfirmYes();
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {
	    
		Thread.sleep(3000);
		updateprofilepopuppage.Savebutton.click();
	}
	
	@When("^enter all details and email id of a previously registered employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_all_details_and_email_id_of_a_previously_registered_employer(String EmployerName, String EmployerEmail, String EmployerContactNumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registeremployerdetails(EmployerName, EmployerEmail, EmployerContactNumber);
	}

	@When("^enter user type as the candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_user_type_as_the_candidate(String usertype, String timezone, String country) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.alreadyregisterUserdetails1(usertype, timezone, country);
	}

	@Then("^Verify User should get error message as \"([^\"]*)\" with OK button$")
	public void verify_User_should_get_error_message_as_with_OK_button(String ExpectedErrorMessage) throws Throwable {

     String ActualErrorMessage = driver.findElement(By.cssSelector("#alertlineheight")).getText();
     Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage );
	}

	@Then("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@When("^click on update profile link$")
	public void click_on_update_profile_link() throws Throwable {
	   
		Thread.sleep(3000);
	    workbenchpage.openUpdateProfilePage();
	}


	@When("^click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
	    
		Thread.sleep(3000);
		common.ClickSumbit();
	}

	@When("^User should get confirmation message and click on OK button$")
	public void user_should_get_confirmation_message_and_click_on_OK_button() throws Throwable {

		Thread.sleep(3000);
		common.clickOnConfirmYes();
		Thread.sleep(3000);
		common.clickOnOKBtn();
	}

	@When("^click on Signin button$")
	public void click_on_Signin_button() throws Throwable {

		Thread.sleep(3000);
		registerpage.ClickSigninbtn();
	}

	@When("^enter agency details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_agency_details(String AgencyName, String AgencyEmail, String AgencyContactNumber) throws Throwable {

		Thread.sleep(3000);
		registerpage.registerAgencydetails(AgencyName, AgencyEmail, AgencyContactNumber);

	}

	@When("^Select value from dropdown for agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_for_agency(String AgencyUserType, String timezone, String country) throws Throwable {

		Thread.sleep(3000);
		registerpage.registerAgencydetails1(AgencyUserType, timezone, country);
	}

	@When("^enter candidate details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")	
	public void enter_candidate_details(String CandidateName, String CandidateEmail, String CandidateContactNumber) throws Throwable {

		Thread.sleep(3000);
		registerpage.registerCandidatedetails(CandidateName, CandidateEmail, CandidateContactNumber);
	}

	@When("^Select value from dropdown for candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void select_value_from_dropdown_for_candidate(String CandidateUserType, String timezone, String country) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerCandidatedetails1(CandidateUserType, timezone, country);
	}

	@When("^click on Employer-Agency SignIn link$")
	public void click_on_Employer_Agency_SignIn_link() throws Throwable {

		Thread.sleep(3000);
		registerpage.clickEmployerAgencySignInlink();

	}

	@When("^click on Job Seeker\\(Candidate\\) Sign In link$")
	public void click_on_Job_Seeker_Candidate_Sign_In_link() throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.clickJobseekerCandidateSignInlinklink();
	}
	
	@When("^enter details of already registered candidate \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_candidate(String candidatename, String candidateemail, String candidatecontactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerCandidatedetails(candidatename, candidateemail, candidatecontactnumber);
	}

	@Then("^User should get a error message as \"([^\"]*)\"$")
	public void user_should_get_a_error_message_as(String ExpectedErrorMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualErrorMessage = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
	}

	@When("^enter details of already registered agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_agency(String agencyname, String agencyemail, String agencycontactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registerAgencydetails(agencyname, agencyemail, agencycontactnumber);
		
	}

	@When("^enter details of already registered employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_details_of_already_registered_employer(String employername, String employeremail, String employercontactnumber) throws Throwable {
	    
		Thread.sleep(3000);
		registerpage.registeremployerdetails(employername, employeremail, employercontactnumber);
		
	}

	@Then("^Verify User should get error message as \"([^\"]*)\"$")
	public void verify_User_should_get_error_message_as(String ExpectedErrorMessage) throws Throwable {
	    
		Thread.sleep(3000);
		String ActualErrorMessage = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();
		Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
	}

	@When("^Verify that user has redirected to correct page or not after filling the information in update profile$")
	public void verify_that_user_has_redirected_to_correct_page_or_not_after_filling_the_information_in_update_profile() throws Throwable {
	    
		Thread.sleep(3000);
		dashboardpage.VerifyUserIsOnCorrectPage();
		
	}

	@When("^Verify the username by which user is login$")
	public void Verify_the_username_by_which_user_is_login() throws Throwable {
	    
		Thread.sleep(3000);
		workbenchpage.userNameProfile();
		
	}

		@When("^enter employer details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void enter_employer_details(String EmployerName, String EmployerEmail, String EmployerContactNumber) throws Throwable {
		   
			Thread.sleep(3000);
			registerpage.registeremployerdetails(EmployerName, EmployerEmail, EmployerContactNumber);
		}

		@When("^Select value from dropdown for employer \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void select_value_from_dropdown_for_employer(String usertype, String timezone, String country) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.alreadyregisterUserdetails1(usertype, timezone, country);
		}

		@When("^enter employer email and password \"([^\"]*)\" \"([^\"]*)\"$")
		public void enter_employer_email_and_password(String EmployerEmail, String password) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.enterEmployerEmailandPassword(EmployerEmail, password);
		}

		@When("^Update Employer Profile  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void update_Employer_Profile(String EmployerAddress, String EmployerOrganizationName, String EmployerWebsite, String EmployerCity) throws Throwable {

			Thread.sleep(3000);
			updateprofilepopuppage.UpdateProfileEmployer(EmployerAddress, EmployerOrganizationName, EmployerWebsite, EmployerCity);
		}

		@When("^Click on Change Password tab$")
		public void click_on_Change_Password_tab() throws Throwable {
		    
			Thread.sleep(3000);
			workbenchpage.openChangePasswordPage();
		}

		@When("^Enter the Current Password and New Password \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void enter_the_Current_Password_and_New_Password(String password, String newpassword, String confirmpassword) throws Throwable {

			Thread.sleep(3000);
			changepasswordpage.EnterCurrentPassword(password);
			changepasswordpage.EnterNewPassword(newpassword);
			changepasswordpage.EnterConfirmPassword(confirmpassword);
		}

		@When("^Successful pop-up message display as \"([^\"]*)\" with Ok button$")
		public void successful_pop_up_message_display_as_with_Ok_button(String ExpectedSuccessfulMessage) throws Throwable {
			
			String ActualSuccessfulMessage = driver.findElement(By.xpath("//h6[@id='alertlineheight']")).getText();
			Assert.assertEquals(ExpectedSuccessfulMessage, ActualSuccessfulMessage);
		}

		@When("^Click on Ok button$")
		public void click_on_Ok_button() throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.Clickokbtn();
		}

		@When("^click on logout tab$")
		public void click_on_logout_tab() throws Throwable {
		    
			Thread.sleep(3000);
			workbenchpage.ClickonLogout();
		}

		@When("^login as employer with new password \"([^\"]*)\" \"([^\"]*)\"$")
		public void login_as_employer_with_new_password(String EmployerEmail, String newpassword) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.Loginwithemployernewpassword(EmployerEmail, newpassword);
			registerpage.ClickSigninbtn();
		}

		@When("^login as employer with the old password \"([^\"]*)\" \"([^\"]*)\"$")
		public void login_as_employer_with_the_old_password(String EmployerEmail, String password) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.Loginwithemployeroldpassword(EmployerEmail, password);
			registerpage.ClickSigninbtn();
		}
		
		@When("^enter Agency details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void enter_Agency_details(String AgencyName, String AgencyEmail, String AgencyContactNumber) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.registerAgencydetails(AgencyName, AgencyEmail, AgencyContactNumber);
		}

		@When("^Select value from dropdown for Agency \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void select_value_from_dropdown_for_Agency(String AgencyUserType, String timezone, String country) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.registerAgencydetails1(AgencyUserType, timezone, country);
		}

		@When("^enter agency email and password \"([^\"]*)\" \"([^\"]*)\"$")
		public void enter_agency_email_and_password(String AgencyEmail, String password) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.enterAgencyEmailandPassword(AgencyEmail, password);
		}

		@When("^Update Agency Profile  \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
		public void update_Agency_Profile(String AgencyAddress, String AgencyOrganizationName, String AgencyWebsite, String AgencyCity) throws Throwable {
		    
			Thread.sleep(3000);
			updateprofilepopuppage.UpdateProfileAgency(AgencyAddress, AgencyOrganizationName, AgencyWebsite, AgencyCity);
		}

		
		@Then("^Close browser$")
		public void close_browser() throws Throwable {
		    
			Thread.sleep(3000);
			driver.close();
		}

		@When("^login as agency with new password \"([^\"]*)\" \"([^\"]*)\"$")
		public void login_as_agency_with_new_password(String AgencyEmail, String newpassword) throws Throwable {
		  
			Thread.sleep(3000);
			registerpage.Loginwithagencynewpassword(AgencyEmail, newpassword);
			registerpage.ClickSigninbtn();
		}

		@When("^login as agency with old password \"([^\"]*)\" \"([^\"]*)\"$")
		public void login_as_agency_with_old_password(String AgencyEmail, String password) throws Throwable {
		    
			Thread.sleep(3000);
			registerpage.Loginwithemployeroldpassword(AgencyEmail, password);
			registerpage.ClickSigninbtn();
		}
		
		@Then("^User should get error message as \"([^\"]*)\" when he try to login with old password$")
		public void user_should_get_error_message_as_when_he_try_to_login_with_old_password(String ExpectedErrorMessage) throws Throwable {
			
			String ActualErrorMessage = driver.findElement(By.cssSelector("p.error.mb-1.pl-1.pr-1")).getText();
			Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);	
		}

		@When("^Click on Close button on Agency Update Profile popup$")
		public void click_on_Close_button_on_Agency_Update_Profile_popup() throws Throwable {
			
			Thread.sleep(3000);
			updateprofilepopuppage.CloseButton.click();
		}

		@When("^Click on Yes button on the confirmation message$")
		public void click_on_Yes_button_on_the_confirmation_message() throws Throwable {
			
			Thread.sleep(3000);
			registerpage.ClickYesbtn();
		}

		@When("^Click on No button on the confirmation message$")
		public void click_on_No_button_on_the_confirmation_message() throws Throwable {
			
			Thread.sleep(3000);
			updateprofilepopuppage.NoButton.click();
		}
	
		@When("^Click on Update Profile tab$")
		public void click_on_Update_Profile_tab() throws Throwable {
		    
			Thread.sleep(3000);
			workbenchpage.openUpdateProfilePage();
		}
		
		@When("^Make changes in Agency profile \"([^\"]*)\"$")
		public void make_changes_in_Agency_profile(String organizationname) throws Throwable {
		    
			Thread.sleep(3000);
			updateprofilepopuppage.MakeChangesinAgencyUpdateProfile(organizationname);
		}
		
		@When("^Click on Close button on Employer Update Profile popup$")
		public void click_on_Close_button_on_Employer_Update_Profile_popup() throws Throwable {
			
			Thread.sleep(3000);
			updateprofilepopuppage.CloseButton.click();
		}

		@When("^Login with that employer \"([^\"]*)\" \"([^\"]*)\"$")
		public void login_with_that_employer(String EmployerEmail, String password) throws Throwable {

			Thread.sleep(3000);
			registerpage.enterEmployerEmailandPassword(EmployerEmail, password);
		}
	
			@When("^Make changes in Employer profile \"([^\"]*)\"$")
			public void make_changes_in_Employer_profile(String organizationname) throws Throwable {
			    
				Thread.sleep(3000);
				updateprofilepopuppage.MakeChangesinEmployerUpdateProfile(organizationname);
			}
			
			@Then("^verify the Auto Populated fields on agency update profile popup window$")
			public void verify_the_Auto_Populated_fields_on_agency_update_profile_popup_window() throws Throwable {
			    
				Thread.sleep(3000);
				updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateAgencyProfile();
			}
			
			@Then("^verify the Auto Populated fields on employer update profile popup window$")
			public void verify_the_Auto_Populated_fields_on_employer_update_profile_popup_window() throws Throwable {
			    
				Thread.sleep(3000);
				updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateEmployerProfile();
			}
			
			@When("^Login with that candidate \"([^\"]*)\" \"([^\"]*)\"$")
			public void login_with_that_candidate(String CandidateEmail, String password) throws Throwable {
			    
				Thread.sleep(3000);
				registerpage.enterCandidateEmailandPassword(CandidateEmail, password);

			}

			@Then("^verify the Auto Populated fields on candidate update profile popup window$")
			public void verify_the_Auto_Populated_fields_on_candidate_update_profile_popup_window() throws Throwable {
			    
				Thread.sleep(3000);
				updateprofilepopuppage.VerifyAutoPopulatedFieldsOnUpdateCandidateProfile();
			}

			@Then("^Update Candidate Profile \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
			public void update_Candidate_Profile(String title, String designation, String noticeperiod, String CandidateCity, String industry, String gender, String expertiselevel) throws Throwable {
			    
		        Thread.sleep(3000);
		        updateprofilepopuppage.UpdateProfileCandidate(title, designation, noticeperiod, industry, CandidateCity, gender);
//		        Thread.sleep(3000);
//		        addcandidatepage.clickUploadResumeField();
		        Thread.sleep(3000);
		        addcandidatepage.uploadResumeDocumentT();
			}
			
//			@Then("^click on ok button of confirmation popup$")
//			public void click_on_ok_button_of_confirmation_popup() throws Throwable {
//
//				Thread.sleep(3000);
//				common.clickOnOKBtn();
//
//		}

			@Then("^Make changes in candidate profile \"([^\"]*)\"$")
			public void make_changes_in_candidate_profile(String noticeperiod) throws Throwable {
			    
				Thread.sleep(3000);
				updateprofilepopuppage.MakeChangesinCandidateUpdateProfile(noticeperiod);
			}
			
//			@When("^enter candidate email and password  \"([^\"]*)\" \"([^\"]*)\"$")
//			public void enter_candidate_email_and_password(String CandidateEmail, String password) throws Throwable {
//			   
//				Thread.sleep(3000);
//				registerpage.enterCandidateEmailandPassword(CandidateEmail, password);
//			}

			@When("^verify user login as Agency has redirect on correct agency update profile or not$")
			public void verify_user_login_as_Agency_has_redirect_on_correct_agency_update_profile_or_not() throws Throwable {
			    
				updateprofilepopuppage.ToVerifyAgencyisonAgencyUpdateProfilePopupOrNot();
			}

			@Then("^Verify that the critical fields on Update Agency Profile popup are not editable$")
			public void verify_that_the_critical_fields_on_Update_Agency_Profile_popup_are_not_editable() throws Throwable {
			    
				updateprofilepopuppage.verifyEmail();
				
				Thread.sleep(1000);
				
				updateprofilepopuppage.verifylanguage();
			}


			@Then("^Verify that the critical fields on Update Employer Profile popup are not editable$")
			public void verify_that_the_critical_fields_on_Update_Employer_Profile_popup_are_not_editable() throws Throwable {
			    
		        updateprofilepopuppage.verifyEmail();
				
				Thread.sleep(1000);
				
				updateprofilepopuppage.verifylanguage();
			}

			@When("^verify user login as Employer has redirect on correct employer update profile or not$")
			public void verify_user_login_as_Employer_has_redirect_on_correct_employer_update_profile_or_not() throws Throwable {
			    
				updateprofilepopuppage.ToVerifyEmployerisonEmployerUpdateProfilePopupOrNot();
			}

			@When("^verify user login as Candidate has redirect on correct candidate update profile or not$")
			public void verify_user_login_as_Candidate_has_redirect_on_correct_candidate_update_profile_or_not() throws Throwable {
			    
				updateprofilepopuppage.ToVerifyCandidateisonCandidateUpdateProfilePopupOrNot();
			}
				
				@When("^Enter an email id which is not registered and click on submit button \"([^\"]*)\"$")
				public void enter_an_email_id_which_is_not_registered_and_click_on_submit_button(String emailid) throws Throwable {
				    
					Thread.sleep(1000);
					
					forgetpasswordpage.EnterNonregisteredEmailid(emailid);
					
					common.ClickSumbit();
					
				}

				@Then("^Verify that user get an error message as \"([^\"]*)\" or not$")
				public void verify_that_user_get_an_error_message_as_or_not(String ExpectedErrorMessage) throws Throwable {
				   
					String ActualErrorMessage = driver.findElement(By.cssSelector("p.error.mb-1.pl-1.pr-1")).getText();
					Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);	
					
					Thread.sleep(1000);
					
					
				}

				@When("^Login with that agency \"([^\"]*)\" \"([^\"]*)\"$")
				public void login_with_that_agency(String AgencyEmail, String password) throws Throwable {
				   
					Thread.sleep(3000);
					registerpage.enterAgencyEmailandPassword(AgencyEmail, password);
					
				}


				@Given("^Click on forgot password link$")
				public void click_on_forgot_password_link() throws Throwable {
				    
					Thread.sleep(1000);
					forgetpasswordpage.ClickonForgetPasswordLink();
				}
				
				@When("^enter candidate email and password \"([^\"]*)\" \"([^\"]*)\"$")
				public void enter_candidate_email_and_password(String CandidateEmail , String password) throws Throwable {
				   
					Thread.sleep(3000);
					registerpage.enterCandidateEmailandPassword(CandidateEmail, password);
					
				}



			}
























		