package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class JobBoardPage extends baseclass {

	
	@FindBy(xpath = "//select[@id='industryDropdown']")
	public WebElement Industrydropdown;
	
	@FindBy(id = "typeahead-config")
	public WebElement Designation;
	
	@FindBy(xpath = "//input[@formcontrolname='Role']")
	public WebElement Role;
	
	@FindBy(xpath = "//select[@id='experienceDropdown']")
	public WebElement Experience;
	
	@FindBy(xpath = "//select[@id='city']")
	public WebElement City;
	
	@FindBy(xpath = "//button[@title='Search']")
	public WebElement Searchbtn;
	
	@FindBy(xpath = "//h6[@title='Job Title']")
	public WebElement JobTitleofJobOnJobBoard;
	
	@FindBy(xpath = "//button[@title='Job Details']")
	public WebElement JobDetailsBtn;
	
	@FindBy(xpath = "//button[@title='Apply']")
	public WebElement ApplyBtn;
	
	@FindBy(xpath = "//div[@role='document' and @class='modal-dialog']")
	public WebElement ApplyJobPopup;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement LoginBtnOnApplyJobPopup;
	
	@FindBy(xpath = "//button[text()='Apply without Login']")
	public WebElement ApplyWithoutLoginBtnOnApplyJobPopup;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	public WebElement LoginBtnOnJobBoard;
	
	@FindBy(linkText="Employer-Agency Sign In")
	WebElement EmployerAgencySignInlinkOnJobBoard;
	
	@FindBy(linkText="Job Seeker(Candidate) Sign In")
	WebElement JobseekerCandidateSignInlinkOnJobBoard;
	
	
public JobBoardPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
public void selectIndustryType(String industry) {
	
	Select select = new Select(Industrydropdown);
	select.selectByVisibleText(industry);
}

public void enterdesignation(String designation) {
	
	Designation.sendKeys(designation);
}

public void enterrole(String role) {
	
	Role.sendKeys(role);
}

public void enterexperience(String experience) {
	
   Experience.sendKeys(experience);
}

public void entercity(String city) {
	
   City.sendKeys(city);
}

public void clickonSearchBtn() {
	
	Searchbtn.click();
}

public void clickonJobDetailsBtn() {
	
	JobDetailsBtn.click();
}
	
public void clickonApplyBtn() {
	
	ApplyBtn.click();
}
	
public void verifyApplyJobDialogBoxDisplayedorNot(){
	
{         
	  try   
	  {    
	    if(ApplyJobPopup.isDisplayed())
	     
	    {      
	       System.out.println("Apply Job dialog box is displayed after clicking on Apply button for respective job.");
	    }    
	  }      
	  catch(NoSuchElementException e)     
	  {       
		  System.out.println("Apply Job dialog box is not displayed.");
	  }       
	}
}
	
public void verifyLoginBtnOnApplyJobDialogBox(){
	
{         
	  try   
	  {    
	    if(LoginBtnOnApplyJobPopup.isDisplayed())
	     
	    {      
	       System.out.println("Login Button is present on Apply Job Dialog box.");
	    }    
	  }      
	  catch(NoSuchElementException e)     
	  {       
		  System.out.println("Login Button is not present on Apply Job Dialog box.");
	  }       
	}
}

public void verifyApplyWithoutLoginBtnOnApplyJobDialogBox(){
	
{         
	  try   
	  {    
	    if(ApplyWithoutLoginBtnOnApplyJobPopup.isDisplayed())
	     
	    {      
	       System.out.println("Apply Without Login Button is present on Apply Job Dialog box.");
	    }    
	  }      
	  catch(NoSuchElementException e)     
	  {       
		  System.out.println("Apply Without Login Button is not present on Apply Job Dialog box.");
	  }       
	}
}
	
public void clickonApplyWithoutLoginBtn() {
	
	ApplyWithoutLoginBtnOnApplyJobPopup.click();
}
	
public void ApplycandidateWithoutLoginforaJobOnJobBoard(String CandidateEmail, String CandidateName, String ContactNumber, String CandidateDesignation, String DateOfBirth, String Gender,String OnNoticePeriod, String CandidateNoticePeriod, String CandidateExperience, String CandidateCTC, String CandidateExpectedCTC, String CandidateCity, String CandidateCityArea, String ZipCode, String CommunicationMode, String distance, String relocate, String permanentAddress ) throws InterruptedException {
	
	addcandidatepage.emailField.sendKeys(CandidateEmail);
	addcandidatepage.name.sendKeys(CandidateName);
	addcandidatepage.contactNumber.sendKeys(ContactNumber);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//input[@placeholder='Enter Designation'])[2]")).sendKeys(CandidateDesignation);
	addcandidatepage.contactNumber.click();
	driver.findElement(By.xpath("//input[@placeholder='Select Date']")).sendKeys(DateOfBirth);
	
  	
	Thread.sleep(3000);
	
	Select se = new Select (driver.findElement(By.xpath("//select[@formcontrolname='Gender']")));
  	se.selectByVisibleText(Gender);
  	
  	Select se1 = new Select (addcandidatepage.onNoticePeriod);
  	se1.selectByVisibleText(OnNoticePeriod);
  
	addcandidatepage.noticePeriod.sendKeys(CandidateNoticePeriod);
	addcandidatepage.experienceInYears.sendKeys(CandidateExperience);
	
	
	Thread.sleep(3000);
	
	addcandidatepage.ctc.sendKeys(CandidateCTC);
	addcandidatepage.expectedCTC.sendKeys(CandidateExpectedCTC);
	addcandidatepage.city.sendKeys(CandidateCity);
	
	Thread.sleep(3000);
	
	addcandidatepage.cityArea.sendKeys(CandidateCityArea);     // CityArea
	addcandidatepage.expectedCTC.click();
	driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys(ZipCode);
	Select se11 = new Select (addcandidatepage.communicationMode);
  	se11.selectByVisibleText(CommunicationMode);
	
	Thread.sleep(3000);
	
	addcandidatepage.distance.sendKeys(distance);
	
	addcandidatepage.isReadyToRelocateToJobLocation.sendKeys(relocate);
	
	addcandidatepage.isPermanentAddress.sendKeys(permanentAddress);
  	
}

public void clickOnLoginBtn() {
	
	LoginBtnOnJobBoard.click();
}
	
public void clickOnEmployerAgencySignInlinkOnJobBoard() {
	
	EmployerAgencySignInlinkOnJobBoard.click();
}
	
public void loginWithsameemployerofJob(String EmployerEmailAddress, String Password) {
	
	registerpage.Emailaddress.sendKeys(EmployerEmailAddress);
	
	registerpage.Password.sendKeys(Password);
	
	registerpage.Signinbtn.click();
}
	

public void verifyTheJobDataOnJobBoard (String JobTitle, String OrganizationName, String JobLocation, String JobCity, String JobCountry, String MinExp, String MaxExp, String JobBudget, String Industry, String JobDesignation) {
	
	
	WebElement title = driver.findElement(By.xpath("//h6[contains(text(),'"+JobTitle+"')]"));
	
	WebElement organizationname = driver.findElement(By.xpath("//p[contains(text(),'"+OrganizationName+"')]"));
	
	WebElement location = driver.findElement(By.xpath("(//p[contains(text(),'"+JobLocation+","+" "+JobCity+","+" "+JobCountry+"')])[1]"));
	
	WebElement experience = driver.findElement(By.xpath("(//p[contains(text(),'"+MinExp+" "+"to" +" "+MaxExp+" "+"Years"+"')])[1]"));
	
	WebElement budget = driver.findElement(By.xpath("(//p[contains(text(),'"+JobBudget+" "+"PA"+"')])[1]"));
	
	WebElement industry = driver.findElement(By.xpath("//p[contains(text(),'"+Industry+"')]"));
	
	WebElement designation = driver.findElement(By.xpath("//td[contains(text(),'"+JobDesignation+"')]"));
	
	WebElement jobtype = driver.findElement(By.xpath("//td[contains(text(),'Permanent Full Time')]"));
	
	boolean titleactual = title.isDisplayed();
	Assert.assertEquals(titleactual, true);
	
	boolean organizationnameactual = organizationname.isDisplayed();
	Assert.assertEquals(organizationnameactual, true);
	
	boolean locationactual = location.isDisplayed();
	Assert.assertEquals(locationactual, true);
	
	boolean experienceactual = experience.isDisplayed();
	Assert.assertEquals(experienceactual, true);
	
	boolean budgetactual = budget.isDisplayed();
	Assert.assertEquals(budgetactual, true);
	
	boolean industryactual = industry.isDisplayed();
	Assert.assertEquals(industryactual, true);
	
	boolean designationactual = designation.isDisplayed();
	Assert.assertEquals(designationactual, true);
	
	boolean jobtypeactual = jobtype.isDisplayed();
	Assert.assertEquals(jobtypeactual, true);
	

	
}


public void  verifyJobDetailsOnJobBoardAfterclickingOnJobDetails(String Title, String Designation,String Location, String City, String Country,String MinExp, String MaxExp, String Budget, String Industry, String JobRole) {
	
	WebElement title = driver.findElement(By.xpath("//h5[contains(text(),'"+Title+"')]"));
	
	WebElement designation = driver.findElement(By.xpath("//h6[contains(text(),'"+Designation+"')]"));
	
	WebElement location = driver.findElement(By.xpath("(//p[contains(text(),'"+Location+","+" "+City+","+" "+Country+"')])[2]"));
	
	WebElement experience = driver.findElement(By.xpath("(//p[contains(text(),'"+MinExp+" "+"to" +" "+MaxExp+" "+"Years"+"')])[2]"));
	
	WebElement budget = driver.findElement(By.xpath("(//p[contains(text(),'"+Budget+" "+"PA"+"')])[2]"));
	
	WebElement industry = driver.findElement(By.xpath("//td[contains(text(),'"+Industry+"')]"));
	
	WebElement jobrole = driver.findElement(By.xpath("//td[text()='"+JobRole+"']"));
	

	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
