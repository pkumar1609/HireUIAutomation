package BVT_StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class UserRegistrationAfterDBCleanUpStepDefination extends baseclass{

	Boolean userAlreadyRegistered = false;

	@When("^Check LoggedIn User Usertype$")
	public void check_LoggedIn_User_Usertype() throws Throwable {
	  
		loginpage.identifyUserK();
	}
	
	@When("^New Application User registration to HireXpert \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void new_Application_User_registration_to_HireXpert(String LoggedInUserName, String LoginEmail, String ContactNumber, String UserType, String Country, String TimeZone, String Password, String Address, String OrganizationName, String Website, String City) throws Throwable {
	
	    try
	    {
	    	String errorMessageForAlreadyRegisteredUser = "";	
			registerpage.registeremployerdetails(LoggedInUserName, LoginEmail,ContactNumber);		
			registerpage.registerUserdetails(UserType,TimeZone,Country);		
			common.ClickSumbit();
			common.clickOnConfirmYes();
					
		    errorMessageForAlreadyRegisteredUser = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();
		     
		 	if(errorMessageForAlreadyRegisteredUser.length() > 0 && errorMessageForAlreadyRegisteredUser.contains("already register with"))
			{
		 		userAlreadyRegistered = true;
		 		
				common.clickOnCloseBtn();
				common.clickOnConfirmYes();
			}		     
	    }
	    catch(NoSuchElementException ex)
	    {
	    	userAlreadyRegistered = false;
	    	common.clickOnOKBtn();	    	
	    	loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.loginInNew(LoginEmail, "12345");
			updateprofilepopuppage.UpdateProfile(Address, OrganizationName, Website, City);
			common.ClickSumbit();
			loginpage.identifyUserK();
			//add new job
	    }	 
	}

	@When("^User adds new job$")
	public void user_adds_new_job(DataTable credentials) throws Throwable {
	  
		if(!userAlreadyRegistered)
		{
			dashboardpage.openDashboardPage();
			dashboardpage.AddJob();				
			addjobpage.filljobDetails(credentials);		
			common.ClickSumbit();
			common.clickOnOKBtn();
			dashboardpage.openWorkbenchPage();
		}	
	}

	@Given("^Add Manage Recruiters for loggedIn employee$")
	public void add_Manage_Recruiters_for_loggedIn_employee(DataTable credentials) throws Throwable {
	 		
		if(!userAlreadyRegistered)
		{
			managerecruitmentagencies.addRecruiters(credentials);			
		}		
	}


}
