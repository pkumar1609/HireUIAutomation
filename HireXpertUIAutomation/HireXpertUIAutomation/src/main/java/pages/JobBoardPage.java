package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	
public void ApplycandidateWithoutLoginforaJobOnJobBoard(String CandidateEmail, String Name, String ContactNumber, String Designation, String DateOfBirth, String Gender, String NoticePeriod, String Experience, String CTC, String ExpectedCTC, String City, String CityArea, String ZipCode, String CommunicationMode ) throws InterruptedException {
	
	addcandidatepage.emailField.sendKeys(CandidateEmail);
	addcandidatepage.name.sendKeys(Name);
	addcandidatepage.contactNumber.sendKeys(ContactNumber);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//body[contains(@class,'bodyBackground modal-open')]//div[contains(@class,'row')]//div[contains(@class,'row')]//div[contains(@class,'row')]//div[1]//div[3]//input[1]")).sendKeys(Designation);
	addcandidatepage.contactNumber.click();
	driver.findElement(By.xpath("//input[@placeholder='Select Date']")).sendKeys(DateOfBirth);
	
  	
	Thread.sleep(3000);
	
	Select se = new Select (driver.findElement(By.xpath("/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-apply-job[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/label[1]/select[1]")));
  	se.selectByVisibleText(Gender);
	addcandidatepage.noticePeriod.sendKeys(NoticePeriod);
	addcandidatepage.experienceInYears.sendKeys(Experience);
	
	
	Thread.sleep(3000);
	
	addcandidatepage.ctc.sendKeys(CTC);
	addcandidatepage.expectedCTC.sendKeys(ExpectedCTC);
	addcandidatepage.city.sendKeys(City);
	
	Thread.sleep(3000);
	
	addcandidatepage.cityArea.sendKeys(CityArea);     // CityArea
	addcandidatepage.expectedCTC.click();
	driver.findElement(By.xpath("//input[@id='ZipCode']")).sendKeys(ZipCode);
	Select se1 = new Select (addcandidatepage.communicationMode);
  	se1.selectByVisibleText(CommunicationMode);
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
