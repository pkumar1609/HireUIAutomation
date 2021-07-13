package pages;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class DashboardPage extends baseclass {

	public int flag;
	public int addJobFlag = 0;
	public String selectedOrganization;
	public String SelectedEmployer;
	public boolean jobAddedByEmp;
	public String skill1 = "Agile";
	public String skill2 = "Java";
	public String skill2Exp2 = "S2(Expert)";
	Select se;
	public String jobname;
	public boolean emp;
	// public String selectDashboardJob;
	public String industryname;
	public String allOptions;

	// Job related

	@FindBy(xpath = "//input[@id='title']")
	public WebElement title;

	@FindBy(xpath = "//input[@formcontrolname='OrganizationId']")
	public WebElement organization;

	@FindBy(xpath = "//input[@formcontrolname='Designation']")
	public WebElement designation;

	@FindBy(xpath = "//input[@placeholder='Enter Functional Area']")
	public WebElement functionalArea;

	@FindBy(xpath = "//input[@formcontrolname='Industry']")
	public WebElement industry;

	@FindBy(xpath = "//input[@placeholder='Enter City Area']")
	public WebElement cityArea;

	@FindBy(xpath = "//input[@placeholder='Enter City']")
	public WebElement city;

	@FindBy(xpath = "//input[@placeholder='Enter Min Salary']")
	public WebElement minsal;

	@FindBy(xpath = "//input[@placeholder='Enter Max Salary']")
	public WebElement maxsal;

	@FindBy(id = "minExperience")
	public WebElement minexp;

	@FindBy(id = "maxExperience")
	public WebElement maxexp;

	@FindBy(id = "totalInterviews")
	public WebElement totalinterviews;

	@FindBy(xpath = "//input[@placeholder='Enter Qualification']")
	public WebElement qualification;

	@FindBy(xpath = "//button[contains(text(),'Add Skill')]")
	public WebElement addskillbutton;

	@FindBy(xpath = "//th[text()='Job Skills']//following::i[@class='fa fa-trash']")
	public List<WebElement> deleteSkill;

	@FindBy(xpath = "//tr[2]//td[6]//button[1]")
	WebElement deleteSkill2;

	@FindBy(xpath = "//tr[3]//td[6]//button[1]")
	public WebElement deleteSkill3;

	@FindBy(xpath = "//tr[1]//td[6]//button[1]")
	public WebElement deleteSkill1;

	@FindBy(xpath = "//button[@title='Add Employer']")
	public WebElement employerplusicon;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	public WebElement employerName;

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[2]")
	public WebElement employerEmail;

	@FindBy(xpath = "//input[@placeholder='Enter Contact Number']")
	public WebElement employerContactNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Organization']")
	public WebElement employerOrganizationName;

	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement employerPlusIconSubmit;

	@FindBy(xpath = "//*[@id=\"style-5\"]/form/div/div/div[1]/div[3]")
	public WebElement click;

	@FindBy(id = "employer")
	public WebElement employer;

	@FindBy(xpath = "//input[@placeholder='Enter Skill']")
	public List<WebElement> jobskill;

	@FindBy(xpath = "//select[@formcontrolname='ExpertiseLevel']")
	public List<WebElement> expertiselevel;

	@FindBy(xpath = "//select[@formcontrolname='Weightage']")
	public List<WebElement> weightage;

	@FindBy(xpath = "//span[@class='checkmark']")
	public List<WebElement> certificateNeeded;

	@FindBy(xpath = "//input[@formcontrolname='Remark']")
	public List<WebElement> remark;

	@FindBy(id = "noticeperiod")
	public WebElement noticePeriod;

	@FindBy(xpath = "//button[@title='Add Employer']")
	public WebElement addEmployee;

	@FindBy(xpath = "//select[@formcontrolname='EmployerId']")
	public WebElement employerId;

	@FindBy(xpath = "//div[@id='jobsActionbtndropdown']//button[text()='Close Job']")
	public WebElement closeJob;

	@FindBy(xpath = "//*[@id=\"style-5\"]/table']")
	public WebElement tblSearchResult;

	@FindBy(xpath = "//*[@id=\"style-5\"]/table/tbody/tr")
	List<WebElement> tableRows;

	@FindBy(xpath = "//*[@id=\"style-5\"]/table/tbody/tr/td")
	List<WebElement> tableColumns;

	@FindBy(xpath = "//*[@id=\"style-5\"]/table/thead/tr/th[8]/span/i")
	public WebElement latestJobUpdtes;

	public int getNoOfRows() {

		return (tableRows.size());
	}

	public int getNoOfColumns() {

		return (tableColumns.size());
	}

	public void setJobName(String job) {
		common.searchField.clear();
		common.searchField.sendKeys(job);
	}

	public boolean SearchJobsByJobName(String jobnames) {

		boolean flag = false;

		for (int i = 1; i < getNoOfRows(); i++) {

			String jobname = tblSearchResult
					.findElement(By.xpath("//*[@id=\"style-5\"]/table/tbody/tr[" + i + "]/td[2]")).getText();
			System.out.println("Search properly" + jobname);

			if (jobname.equals(jobnames)) {
				flag = true;
			}
		}

		return flag;

	}

	// To add new job from dashboard
	public void AddJob() throws InterruptedException {
		executor.executeScript("arguments[0].click();", AddJob);
	}

	public void addjobFromDashboard(DataTable credentials) throws InterruptedException {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			currentTime = LocalDateTime.now();

			if (loginpage.b == true) {
				jobname = dtFormate.format(currentTime) + " Emp";
				title.clear();
				title.sendKeys(jobname);
				organization.clear();
				this.organization.sendKeys(data.get("organization"));
				jobAddedByEmp = true;
			} else if (loginpage.user == "agency") {
				jobAddedByEmp = false;
				jobname = dtFormate.format(currentTime) + " Agy";
				title.sendKeys(jobname);
				select = new Select(employerId);
				List<WebElement> options = select.getOptions();
				boolean b = false;
				for (WebElement option : options) {
					b = option.getText().contains("pemp - ");
					if (b == true) {
						select.selectByVisibleText(option.getText());
					}
				}
				if (employerId.getAttribute("value").equals("Select Employer")) {
					Thread.sleep(2000);
					addEmployee.click();
					Thread.sleep(5000);
					common.emailfield.sendKeys("pemp@gmail.com");
					Thread.sleep(2000);
					common.find.click();
					Thread.sleep(2000);
					common.addSubmitbtn.click();
					select.selectByVisibleText("pemp -");
				}
			}
			if (this.organization.isEnabled()) {
				this.organization.sendKeys(data.get("organization"));
			}

			selectedOrganization = this.organization.getAttribute("value");
			Thread.sleep(1000);
			designation.sendKeys(data.get("designation"));
			functionalArea.sendKeys(data.get("functionalArea"));
			this.industry.sendKeys(data.get("industry"));
			industryname = data.get("industry");
			minsal.sendKeys(data.get("minsal"));
			maxsal.sendKeys(data.get("maxsal"));
			minexp.sendKeys(data.get("minexp"));
			maxexp.sendKeys(data.get("maxexp"));
			this.noticePeriod.sendKeys("45");
			if (city.getAttribute("value").isEmpty()) {
				city.clear();
				city.sendKeys("Pune");
			}
			cityArea.clear();
			cityArea.sendKeys(data.get("location"));
			Thread.sleep(1000);
			se = new Select(totalinterviews);
			se.selectByVisibleText(data.get("totalinterviews"));
			List<WebElement> deletebtn = driver
					.findElements(By.xpath("//th[text()='Job Skills']//following::i[@class='fa fa-trash']"));
			for (int i = 0; i < deletebtn.size(); i++) {
				WebElement btn = deletebtn.get(i);
				Thread.sleep(3000);
				executor.executeScript("arguments[0].click();", btn);
			}
		}
		addJobFlag = 1;
	}

	@FindBy(xpath = "//a[text()='Recruitment ']")
	public WebElement recruitment;

	@FindBy(xpath = "//a[contains(text(),'Hire Express ')]")
	public WebElement hireExpress;

	@FindBy(xpath = "//a[contains(text(),'Applicant Tracking')]")
	public WebElement applicationTracking;

	@FindBy(xpath = "//a[contains(text(),'Interviews')]")
	public WebElement interviews;

	@FindBy(xpath = "//a[text()='Dashboard ']")
	public WebElement dashboard;

	@FindBy(xpath = "//a[contains(text(),'Job Applications')]")
	public WebElement JobApplication;

	@FindBy(xpath = "//h6[contains(text(),'Hey there, looks like you haven’t added a job as features work best when used with a job, You can add a job by clicking Add Job button.')]")
	public List<WebElement> jobPopup;

	@FindBy(xpath = "//a[contains(text(),'CV Store ')] ")
	public WebElement cvStrore;

	@FindBy(xpath = "//a[contains(text(),'CV Parser')] ")
	public WebElement cvParser;

	@FindBy(xpath = "//a[contains(text(),'Job Offered')] ")
	public WebElement jobOffered;

	@FindBy(xpath = "//a[text()='Tasks']")
	public WebElement task;

	@FindBy(xpath = "//a[contains(text(),'Invoice')]")
	public WebElement invoice;

	@FindBy(xpath = "//a[contains(text(),'Configuration')]")
	public WebElement configuration;

	@FindBy(xpath = "(//a[contains(text(),'Manage Employees')])[1]")
	public WebElement manageEmployees;

	@FindBy(xpath = "//span[contains(text(),'Manage Recruiters')]")
	public WebElement manageRecruiters;

	@FindBy(xpath = "//span[contains(text(),'Manage Employers')]")
	public WebElement manageEmployers;

	@FindBy(xpath = "//span[contains(text(),'Manage Vendors')]")
	public WebElement manageVendors;

	@FindBy(xpath = "//a[contains(text(),'Job Updates')]")
	public WebElement jobUpdate;

//	Employer Section

	@FindBy(xpath = "//h5[text()='Employers ']//following::input[@name='search']")
	public WebElement employerSearchfield;

	@FindBy(xpath = "//button[@title='Employers']")
	public WebElement addEmployer;

	@FindBy(xpath = "//h5[contains(text(),'Employers')]//following::button[@title='Delete']")
	public static WebElement Employersdeletebtn;

	@FindBy(xpath = "//h5[contains(text(),'Employers')]//following::button[@id='btnGroupDrop1']")
	public static WebElement employersActions;

//	agency

	@FindBy(xpath = "//button[@title='Recruitment Agencies']")
	public WebElement addAgencyButton;

	@FindBy(xpath = "//h5[text()='Recruitment Agencies ']//following::input[@name='search']")
	public WebElement agencySearch;

//	teamMember

	@FindBy(xpath = "//button[@title='Team Members']")
	public WebElement AddTeamButton;

	@FindBy(xpath = "//h5[text()='Team Members ']//following::input[@name='search']")
	public WebElement teamMemberSearchField;

//	ApplicationCommonElements

	@FindBy(xpath = "//select[@id='job']")
	public WebElement selectJob;

	@FindBy(xpath = "//button[@title='Add Candidate']")
	public WebElement AddCandidate;

	@FindBy(xpath = "//button[@title='Add Job']")
	public WebElement AddJob;

	@FindBy(xpath = "//td[@class='text-center w-6 w-5-desk-4 align-middle']")
	public WebElement Id;

	@FindBy(xpath = "(//td//following::button)[1]")
	public WebElement actionDropdown;

	@FindBy(xpath = "//button[contains(text(),'View Job Description')]")
	public WebElement viewJobDescription;

	@FindBy(xpath = "//div[@id='jobsActionbtndropdown']//button[text()='Edit Job']")
	public WebElement editJob;

	@FindBy(xpath = "//div[@id='jobsActionbtndropdown']//button[text()='Reopen Job']")
	public WebElement reopenJob;

	@FindBy(xpath = "//div[@id='jobsActionbtndropdown']//button[text()='Clone Job']")
	public WebElement cloneJob;

	@FindBy(xpath = "//div[@id='jobsActionbtndropdown']//button[text()='Unhold Job']")
	public WebElement UnHoldJob;

	public String namevalidate;
	public static String ele;
	public static String jobId;
	public static String JobDesignation;

	public DashboardPage() {

		PageFactory.initElements(driver, this);
	}

	public void openWorkbenchPage() throws InterruptedException {

		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(2000);
		applicationTracking.click();
	}

	public void openInterviewsPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(3000);
		interviews.click();
	}

	public void openHireExpressPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(3000);
		hireExpress.click();
	}

	public void openDashboardPage() throws InterruptedException {
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", dashboard);
//		try {
//			common.clickOnCloseBtn();
//		}
//		catch(NoSuchElementException e)
//		{}
	}

	public void openManageEmployeePage() throws InterruptedException {
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageEmployees.click();
		Thread.sleep(2000);
	}

	public void openManageEmployerPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageEmployers.click();
		Thread.sleep(2000);
	}

	public void openManageRecruitersPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageRecruiters.click();
		Thread.sleep(2000);
	}

	public void openManageVendorsPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageVendors.click();
		Thread.sleep(2000);
	}

	public void openCvStorePage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).build().perform();
		dashboardpage.cvStrore.click();
	}

	public void openCvParserPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).build().perform();
		dashboardpage.cvParser.click();
	}

	public void openJobOfferedPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).build().perform();
		dashboardpage.jobOffered.click();
	}

	public void VerifyUserIsOnCorrectPage() {
		Action.moveToElement(loginpage.myAccount).perform();
		if (loginpage.user == "employer") {
//		Assert.assertEquals(loginpage.employer.get(0).isDisplayed(), true);
			Assert.assertEquals(loginpage.loggedInUser.getAttribute("title"), "Employer");
//		loginpage.employer.get(0).click();
		} else if (loginpage.user == "agency") {
//	  	Assert.assertEquals(loginpage.agency.get(0).isDisplayed(), true);
			Assert.assertEquals(loginpage.loggedInUser.getAttribute("title"), "Agency");
//	  	loginpage.agency.get(0).click();
		} else if (loginpage.user == "candidate") {
//	  	Assert.assertEquals(loginpage.candidate.get(0).isDisplayed(), true);	
//	  	loginpage.candidate.get(0).click();
			Assert.assertEquals(loginpage.loggedInUser.getAttribute("title"), "Candidate");
		}
	}

	public void clickonJobApplicationLInk() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(2000);
		JobApplication.click();
	}

	public void openJobUpdatesPage() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(2000);
		jobUpdate.click();
	}

//	Employer 

	public void clickOnAddButton(String profile) throws InterruptedException {
		Thread.sleep(3000);
		executor.executeScript("arguments[0].scrollIntoView();", AddTeamButton);
		if (profile.contentEquals("Employers")) {
			executor.executeScript("arguments[0].scrollIntoView();", addEmployer);
			Thread.sleep(2000);
			addEmployer.click();
			System.out.println("emplyer is selected");
		} else if (profile.contentEquals("Recruitment Agencies")) {
			executor.executeScript("arguments[0].scrollIntoView();", addAgencyButton);
			Thread.sleep(2000);
			executor.executeScript("arguments[0].click();", addAgencyButton);
//		addAgencyButton.click();			
		} else if (profile.contentEquals("Team Members")) {
			executor.executeScript("arguments[0].scrollIntoView();", AddTeamButton);
			Thread.sleep(2000);
			AddTeamButton.click();
		}
	}

	public void deleteUser(String team) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("(//td[contains(text(),'" + team + "')]//following::button[@id='btnGroupDrop1'])[1]")).click();
		driver.findElement(By.xpath("(//td[contains(text(),'" + team + "')]//following::button[text()='Delete'])[1]"))
				.click();
		common.clickOnConfirmYes();
	}

	public void deleteTeamMembers(String team) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("(//td[contains(text(),'" + team + "')]//following::button[@id='btnGroupDrop1'])[1]")).click();
		driver.findElement(By.xpath("(//td[contains(text(),'" + team + "')]//following::button[text()='Delete'])[1]"))
				.click();
		common.clickOnConfirmYes();

		transferJobAndDataToOtherUser();
	}

	public void transferJobAndDataToOtherUser() throws InterruptedException {
		Thread.sleep(1000);
		WebElement deleteDialog = driver.findElement(By.xpath("//h5[contains(text(),'Delete')]"));

		if (deleteDialog.isDisplayed()) {
			WebElement dropDown = driver.findElement(By.xpath("//select[@formcontrolname='EmployeeId']"));
			Select se = new Select(dropDown);
			se.selectByVisibleText("pe1");

			WebElement deleteButton = driver.findElement(By.xpath("//app-delete-employee/div[3]/button[2]"));
			if (deleteButton.isDisplayed()) {
				deleteButton.click();
			}
		}
	}

	public void clickOnLatestJobUpdate() throws InterruptedException {
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.visibilityOf(latestJobUpdtes));
		executor.executeScript("arguments[0].click();", latestJobUpdtes);
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.visibilityOf(latestJobUpdtes));
		executor.executeScript("arguments[0].click();", latestJobUpdtes);

	}

}
