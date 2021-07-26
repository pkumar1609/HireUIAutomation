package BVT_StepDefination;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilPackage.baseclass;

import org.apache.commons.io.FileUtils;

public class hooks extends baseclass {

	
	public hooks() throws InterruptedException {
		super();	
	}

	@Before("@login,@register,@forgetPassword,@resetPassword,@JobWorkflow,@jobupdate,@interview,@JobCandidateManagement,@JCWF,@Job,@JobCandidteOffered,@Dashboard,@candidatePool")
	public void CheckUserCreatedBeforeTestExecution() throws InterruptedException, AWTException, IOException {

		System.out.println("Before hook executed to check user created");

		baseclass.initialization();
		createEmployeeandRelatedUsers();
	}
	
	@After()
	public void screenShot(Scenario scenario) throws InterruptedException, IOException {

		System.out.println("Inside after hook: " + rootFolder + "");

		if (scenario.isFailed()) {

			try {
				File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				String filename = scenario.getName().strip();
				System.out.println(rootFolder + "/" + filename + ".png");
				FileUtils.copyFile(screenshotFile, new File(rootFolder + "/" + filename + ".png"));
			} catch (WebDriverException e) {
				System.out.println("expection Thrown :" + e.getMessage());
			} 
			finally {
				 driver.quit();
			}

		} else {
			 driver.quit();
		}
	}

	private void Login(String UserEmail, String Password) throws InterruptedException, IOException, AWTException {
		driver.navigate().refresh();
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginIn(UserEmail, Password);
		loginpage.identifyUserK();
	}

	private void createEmployeeandRelatedUsers() throws InterruptedException, AWTException, IOException {
		String errorMessageForAlreadyRegisteredUser = "";
		Boolean userAlreadyRegistered = false;
		try {
			
			driver.navigate().refresh();
			registerpage.clickRegister();
			registerpage.registeremployerdetails("pemp", "pemp@gmail.com", "6512101234");
			
			registerpage.registerUserdetails("Employer", "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi", "India");
			common.ClickSumbit();
			common.clickOnConfirmYes();

			errorMessageForAlreadyRegisteredUser = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();

			if (errorMessageForAlreadyRegisteredUser.length() > 0
					&& errorMessageForAlreadyRegisteredUser.contains("already register with")) {
				userAlreadyRegistered = true;

				common.clickOnCloseBtn();
				common.clickOnConfirmYes();
			}
		} catch (NoSuchElementException ex) {
			userAlreadyRegistered = false;
			common.clickOnOKBtn();
			loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.loginInNew("pemp@gmail.com", "12345");

			updateprofilepopuppage.UpdateProfile("VimanNagar", "pempORG", "pempORG.com", "Pune");

			common.ClickSumbit();
			loginpage.identifyUserK();

			// add job
			if (!userAlreadyRegistered) {
				dashboardpage.openDashboardPage();
				dashboardpage.AddJob();
				addjobpage.filljobDetailsNew("Software Developer", "IT-Software", "Software Programming", "200000",
						                       "600000", "3", "6", "60", "Pune", "Kharadi", "2");
				common.ClickSumbit();
				common.clickOnOKBtn();
				dashboardpage.openWorkbenchPage();
			}

			// Add employee team member - Manage Employee
			if (!userAlreadyRegistered) {
				manageemployee.addEmployeeNew("Employer", "pe1", "pe1@gmail.com", "Interviewer", "6504123451");
				manageemployee.addEmployeeNew("Employer", "pe2", "pe2@gmail.com", "Recruitment HR",
						"6514123451");
				updateTeamMemberProfile("pe1@gmail.com","12345","Nashik","pempORG","pempORG.com","Nashik");
				updateTeamMemberProfile("pe2@gmail.com","12345","Nashik","pempORG","pempORG.com","Nashik");
				// logout
				loginpage.logoutFromAppK();
				common.logout.click();
				if (common.okbtnPopup.size() > 0) {
					common.clickOnOKBtn();
				}
			}

			registerpage.clickRegister();

			createAgencyandRelatedUsers();

			// Employer logs in again to add employee recruiters
			Login("pemp@gmail.com", "12345");

			// Add employee recruiters - Manage Recruiters
			if (!userAlreadyRegistered) {
				managerecruitmentagencies.addRecruitersNew("pagy", "pagy@gmail.com", "6114101231");
			}
		}
	}

	//New
	private void createAgencyandRelatedUsers() throws InterruptedException {

		String errorMessageForAlreadyRegisteredUser = "";
		Boolean userAlreadyRegistered = false;

		try {
			registerpage.registeremployerdetails("pagy", "pagy@gmail.com", "6114101231");
			registerpage.registerUserdetails("Agency", "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi", "India");
			common.ClickSumbit();
			common.clickOnConfirmYes();

			errorMessageForAlreadyRegisteredUser = driver.findElement(By.cssSelector("div.col-md-12.error")).getText();

			if (errorMessageForAlreadyRegisteredUser.length() > 0
					&& errorMessageForAlreadyRegisteredUser.contains("already register with")) {

				userAlreadyRegistered = true;
				common.clickOnCloseBtn();
				common.clickOnConfirmYes();
			}
		} catch (NoSuchElementException ex) {
			userAlreadyRegistered = false;
			common.clickOnOKBtn();
			loginpage.ClickOnEmployerAgencySigninLink();
			loginpage.loginInNew("pagy@gmail.com", "12345");
			updateprofilepopuppage.UpdateProfile("Chennai", "pagyORG", "pagyORG.com", "Chennai");
			common.ClickSumbit();
			loginpage.identifyUserK();

			// Add agency team member - Manage Employee
			if (!userAlreadyRegistered) {
				manageemployee.addEmployeeNew("Agency", "pa1", "pa1@gmail.com","Recruitment Agency Head", "7304123451");
				manageemployee.addEmployeeNew("Agency", "pa2", "pa2@gmail.com","Recruitment Agency Head", "7512223451");
				
				updateTeamMemberProfile("pa1@gmail.com","12345","Gwalior","pagyORG","pagyORG.com","Gwalior");
				updateTeamMemberProfile("pa2@gmail.com","12345","Mumbai","pagyORG","pagyORG.com","Mumbai");
			}

			// Add agency vendors - Manage Vendors
			if (!userAlreadyRegistered) {
								
				loginpage.ClickOnEmployerAgencySigninLink();
				loginpage.loginInNew("pagy@gmail.com", "12345");
				
				managevendor.addVendorNew("pagvdr1", "pagvdr1@gmail.com", "4101362101");

				// logout
				loginpage.logoutFromAppK();
				common.logout.click();
				if (common.okbtnPopup.size() > 0) {
					common.clickOnOKBtn();
				}
			}
		}
	}

	public void updateTeamMemberProfile(String TeammemberLoginUN,String Password,String Address, String OrganizationName, String Website, String City) throws InterruptedException
	{
		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
		common.clickOnOKBtn();
		}
		loginpage.ClickOnEmployerAgencySigninLink();
		loginpage.loginInNew(TeammemberLoginUN, Password);//team member login
		updateprofilepopuppage.UpdateProfile(Address, OrganizationName, Website, City);
		common.ClickSumbit();
		loginpage.logoutFromAppK();
		common.logout.click();
		if (common.okbtnPopup.size() > 0) {
		common.clickOnOKBtn();
		}
	}
	
	
//@After()
//public void deleteJob() throws InterruptedException
//{
//	if(addjobpage.addJobFlag==1)
//	{
//		dashboardpage.openWorkbenchPage();
//		workbenchpage.selectJobK();
//		workbenchpage.deleteJob();
//	}
//	addjobpage.addJobFlag=0;
//}

}
