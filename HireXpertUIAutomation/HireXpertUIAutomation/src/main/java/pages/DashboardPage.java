package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
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

	@FindBy(xpath = "//a[text()='Recruitment ']")
	public WebElement recruitment;
	
	@FindBy(xpath = "//a[contains(text(),'Hire Express ')]")
	public WebElement hireExpress;
	
	@FindBy(xpath = "//a[contains(text(),'Applicant Tracking')]")
	public WebElement applicationTracking;
	
	@FindBy(xpath = "//a[contains(text(),'Interviews')]")
	public WebElement interviews;
	
	@FindBy(xpath= "//a[text()='Dashboard ']")
	public WebElement dashboard ;
	
	@FindBy(xpath= "//a[contains(text(),'Job Applications')]")
	public WebElement JobApplication ;
	
	@FindBy(xpath= "//h6[contains(text(),'Hey there, looks like you haven’t added a job as features work best when used with a job, You can add a job by clicking Add Job button.')]")
	public List<WebElement> jobPopup;
	
	@FindBy(xpath= "//a[contains(text(),'CV Store ')] ")
	public WebElement cvStrore ;
	
	@FindBy(xpath= "//a[text()='Tasks']")
	public WebElement task ;
	
	@FindBy(xpath= "//a[contains(text(),'Invoice')]")
	public WebElement invoice ;
	
	@FindBy(xpath= "//a[contains(text(),'Configuration')]")
	public WebElement configuration ;
	
	@FindBy(xpath= "//a[contains(text(),'Manage Employees')]")
	public WebElement manageEmployees ;
	
	@FindBy(xpath= "//span[contains(text(),'Manage Recruiters')]")
	public WebElement manageRecruiters;
	
	@FindBy(xpath= "//span[contains(text(),'Manage Employers')]")
	public WebElement manageEmployers ;
		
	@FindBy(xpath= "//span[contains(text(),'Manage Vendors')]")
	public WebElement manageVendors ;
	
	
//	Employer Section
	
	@FindBy(xpath = "//h5[text()='Employers ']//following::input[@name='search']")
	public WebElement employerSearchfield;
	
	@FindBy(xpath="//button[@title='Employers']")
	public WebElement addEmployer;
	
	

	@FindBy(xpath="//h5[contains(text(),'Employers')]//following::button[@title='Delete']")
	public static WebElement Employersdeletebtn;
	
	@FindBy(xpath="//h5[contains(text(),'Employers')]//following::button[@id='btnGroupDrop1']")
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
	
	

	public String namevalidate;

	
	public static String ele;
	
	public DashboardPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public void openWorkbenchPage() throws InterruptedException {
		
		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(1000);
		applicationTracking.click();
		boolean b=common.okbtnPopup.size()>0;
		if(b==true)
		{
			common.clickOnOKBtn();
		}
		
	}
 
	public void openInterviewsPage() throws InterruptedException 
	{
		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(3000);
		interviews.click();
	}
	
	public void openHireExpressPage() throws InterruptedException 
	{
		Action.moveToElement(dashboardpage.recruitment).perform();
		Thread.sleep(3000);
		hireExpress.click();
	}
	
	public void openDashboardPage() throws InterruptedException
	{
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",dashboard);
//		try {
//			common.clickOnCloseBtn();
//		}
//		catch(NoSuchElementException e)
//		{}
	} 
	
	public void openManageEmployeePage() throws InterruptedException
	{
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageEmployees.click();
		Thread.sleep(2000);
	}
	
	public void openManageEmployerPage() throws InterruptedException
	{
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageEmployers.click();
		Thread.sleep(2000);
	}
	
	public void openManageRecruitersPage() throws InterruptedException
	{
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageRecruiters.click();
		Thread.sleep(2000);
	}
	
	public void openManageVendorsPage() throws InterruptedException
	{
		Action.moveToElement(dashboardpage.configuration).build().perform();
		dashboardpage.manageVendors.click();
		Thread.sleep(2000);
	}
	
	public void VerifyUserIsOnCorrectPage() {
		Action.moveToElement(loginpage.myAccount).perform();
	  	if(loginpage.user=="employer")   
	  	{
		Assert.assertEquals(loginpage.userbtnemp.get(0).isDisplayed(), true);
		loginpage.userbtnemp.get(0).click();
	  	}
	  	else if(loginpage.user=="agency")
	  	{
	  	Assert.assertEquals(loginpage.userbtnagy.get(0).isDisplayed(), true);	
	  	loginpage.userbtnagy.get(0).click();
	  	}
	  	else if(loginpage.user=="candidate")
	  	{
	  	Assert.assertEquals(loginpage.userbtnCandidate.get(0).isDisplayed(), true);	
	  	loginpage.userbtnCandidate.get(0).click();
	  	}  	
    }
	
	public void clickonJobApplicationLInk() throws InterruptedException {
		Action.moveToElement(dashboardpage.recruitment).click().perform();
		Thread.sleep(2000);
		JobApplication.click();		
	}
	
//	Employer 
	
	public void clickOnAddButton(String profile) throws InterruptedException {
		Thread.sleep(3000);
		executor.executeScript("arguments[0].scrollIntoView();", AddTeamButton);
		if(profile.contentEquals("Employers"))	
		{
		executor.executeScript("arguments[0].scrollIntoView();", addEmployer);
		Thread.sleep(2000);
		addEmployer.click();
		System.out.println("emplyer is selected");
		}
	else if(profile.contentEquals("Recruitment Agencies"))
		{
		executor.executeScript("arguments[0].scrollIntoView();", addAgencyButton);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",addAgencyButton );
//		addAgencyButton.click();			
		}
	else if(profile.contentEquals("Team Members"))
		{
		executor.executeScript("arguments[0].scrollIntoView();", AddTeamButton);
		Thread.sleep(2000);
		AddTeamButton.click();
		}
	}

	
//	public void enterAllDetails(String profile,DataTable credentials) throws InterruptedException {
//		Thread.sleep(3000);
//		executor.executeScript("arguments[0].scrollIntoView();", AddTeamButton);
//		clickOnAddButton(profile);
//		if(loginpage.b==true)
//		{
//			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//			{
//				Thread.sleep(1000);
//				namefield.clear();
//				namefield.sendKeys(data.get("Name"));
//				namevalidate=data.get("Name");
//				ar.add(namevalidate);
//				emailfield.clear();
//				emailfield.sendKeys(data.get("Email"));
//				contactnumberfield.clear();
//				contactnumberfield.sendKeys(data.get("contact"));
//				select = new Select(countryid);
//				select.selectByVisibleText("India");
//				common.ClickSumbit();
//				if(common.okbtnPopup.size()>0)
//				{
//					common.clickOnOKBtn();
//				}
//				else
//				{
//					clickOnAddButton(profile);
//				}	
//			}
//			common.clickOnAddClosebtn();
//		}
//		else
//		{
//			for (Map<String, String> data : credentials.asMaps(String.class, String.class))
//			{
//				Thread.sleep(1000);
//				namefield.clear();
//				namefield.sendKeys(data.get("Nameagy"));
//				namevalidate=data.get("Nameagy");
//				ar.add(namevalidate);
//				emailfield.clear();
//				emailfield.sendKeys(data.get("Emailagy"));
//				contactnumberfield.clear();
//				contactnumberfield.sendKeys(data.get("contact"));
//				select = new Select(countryid);
//				select.selectByVisibleText("India");
//				common.ClickSumbit();
//				if(common.okbtnPopup.size()>0)
//				{
//					common.clickOnOKBtn();
//				}
//				else
//				{
//					clickOnAddButton(profile);
//				}	
//			}
//			common.clickOnAddClosebtn();
//		}
//	}
//	
 
	
	public void deleteUser(String team) throws InterruptedException
	{
		Thread.sleep(1000);	
		driver.findElement(By.xpath("(//td[contains(text(),'"+team+"')]//following::button[@id='btnGroupDrop1'])[1]")).click();
		driver.findElement(By.xpath("(//td[contains(text(),'"+team+"')]//following::button[text()='Delete'])[1]")).click();
	
	}
		
}
