package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

public class JobApplicationsPage extends baseclass{

	@FindBy(xpath = "//select[@id='jobDropdown']")
	public WebElement Jobdropdown;
	
	@FindBy(xpath = "//button[contains(@class,'btn Cbtn-primary')]")
	public WebElement SearchBtn;
	
	@FindBy(xpath = "//h6[contains(text(),'Rock')]")
	public WebElement Title;
	
	@FindBy(xpath = "//p[contains(text(),'Test Engineer')]")         //p[@title='Designation']
	public WebElement designation;
	
	@FindBy(xpath = "//p[contains(text(),'Viman Nagar, Pune, India')]")                                          //p[@title='Location']
	public WebElement location;
	
	@FindBy(xpath = "//p[contains(text(),'60 Days')]")                                           //p[@title='Notice Period']
	public WebElement noticeperiod;
	
	@FindBy(xpath = "//p[contains(text(),'03.5 Years')]")                                           //p[@title='Experience']
	public WebElement experience;
	
	@FindBy(xpath = "//p[contains(text(),'450000 PA')]")                                         //p[@title='CTC']
	public WebElement ctc;
	
	@FindBy(xpath = "//p[contains(text(),'550000 PA')]")                                           //p[@title='ECTC']
	public WebElement expectedCTC;
	
	@FindBy(xpath = "//td[contains(text(),'Software Test Engineer')]")                                           //td[text()='Job Title']
	public WebElement JobTitle;
	
	
	

public JobApplicationsPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void selectjob(String Job) {
		
		Select se = new Select(Jobdropdown);
		se.selectByVisibleText(Job);
		
	}
	
	public void clickonSerchBtn() {
		
		SearchBtn.click();
	}
	
	public void AssertCandidatedetailsOnJobApplicationscollumn ( String Name, String Designation, String CityArea, String NoticePeriod, String Experience, String CTC, String ExpectedCTC, String jobdesignation) throws Throwable 
	{
		Title.isDisplayed();
		designation.isDisplayed();
		location.isDisplayed();
		noticeperiod.isDisplayed();
		experience.isDisplayed();
		ctc.isDisplayed();
		expectedCTC.isDisplayed();
		JobTitle.isDisplayed();
		
		
		
		
		
		
		
		
		
		
//		Title.getAttribute("readonly").contentEquals(Name);
//		designation.getAttribute("readonly").contentEquals(Designation);
//		location.getAttribute("readonly").contentEquals(CityArea);
//		noticeperiod.getAttribute("readonly").contentEquals(NoticePeriod);
//		experience.getAttribute("readonly").contentEquals(Experience);
//		ctc.getAttribute("readonly").contentEquals(CTC);
//		expectedCTC.getAttribute("readonly").contentEquals(ExpectedCTC);
//		JobTitle.getAttribute("readonly").contentEquals(jobdesignation);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
