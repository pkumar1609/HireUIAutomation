package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utilPackage.baseclass;

public class JobApplicationsPage extends baseclass{


	@FindBy(xpath = "//select[@id='jobDropdown']")
	public WebElement Jobdropdown;
	
	@FindBy(xpath = "//button[contains(@class,'btn Cbtn-primary')]")
	public WebElement SearchBtn;
	
	@FindBy(xpath = "//h6[contains(text(),'Rock')]")                             
	public WebElement Title;
	
	@FindBy(xpath = "//p[@title='Designation']")                         
	public WebElement designation;
	
	@FindBy(xpath = "//p[contains(text(),'Viman Nagar, Pune, India')]")                                          //p[@title='Location']
	public WebElement location;
	
	@FindBy(xpath = "//p[contains(text(),'60 Days')]")                                           //p[@title='Notice Period']
	public WebElement noticeperiod;
	
	@FindBy(xpath = "//p[@title='Experience']")                                           
	public WebElement experience;
	
	@FindBy(xpath = "//p[contains(text(),'450000 PA')]")                                         //p[@title='CTC']
	public WebElement ctc;
	
	@FindBy(xpath = "//p[contains(text(),'550000 PA')]")                                           //p[@title='ECTC']
	public WebElement expectedCTC;
	
	@FindBy(xpath = "//td[contains(text(),'Software Test Engineer')]")                                           //td[text()='Job Title']
	public WebElement JobTitle;
	
	@FindBy(xpath = "//a[@title='View Details']")                                           
	public WebElement viewdetailsBtn;
	
	@FindBy(xpath = "//button[@title='Add To Job']")                                           
	public WebElement addtojobBtn;
	
	
	
	
	
	
	
	


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
	
	
	public void verifycandidatedatadisplayedinJobApplicationSection (String CandidateName, String CandidateDesignation, String CandidateCityArea, String CandidateCity, String CandidateCountry, String CandidateExperience, String CandidateCTC, String CandidateExpectedCTC, String CandidateNoticePeriod, String JobTitle) {
		
		WebElement title = driver.findElement(By.xpath("//h6[contains(text(),'"+CandidateName+"')]"));
		
		WebElement designation = driver.findElement(By.xpath("(//p[contains(text(),'"+CandidateDesignation+"')])[1]"));
		
		WebElement location = driver.findElement(By.xpath("//p[contains(text(),'"+CandidateCityArea+","+" "+CandidateCity+","+" "+CandidateCountry+"')]"));
		
		WebElement experience = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateExperience+" "+"Years"+ "')])[1]"));
		
		WebElement ctc = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateCTC+" "+"PA"+" "+"(CTC)"+ "')])[1]"));
		
		WebElement ectc = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateExpectedCTC+" "+"PA"+" "+"(ECTC)"+ "')])[1]"));
		
		WebElement noticeperiod = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateNoticePeriod+" "+"Days"+ "')])[1]"));
		
		WebElement jobtitle = driver.findElement(By.xpath("//td[contains(text(),'"+JobTitle+"')]"));
		
//		WebElement matchedskills = driver.findElement(By.xpath(""));
		
		boolean titleactual = title.isDisplayed();
		Assert.assertEquals(titleactual, true);
		
		boolean designationactual = designation.isDisplayed();
		Assert.assertEquals(designationactual, true);
		
		boolean locationactual = location.isDisplayed();
		Assert.assertEquals(locationactual, true);
		
		boolean experienceactual = experience.isDisplayed();
		Assert.assertEquals(experienceactual, true);
		
		boolean ctcactual = ctc.isDisplayed();
		Assert.assertEquals(ctcactual, true);
		
		boolean ectcactual = ectc.isDisplayed();
		Assert.assertEquals(ectcactual, true);
		
		boolean noticeperiodactual = noticeperiod.isDisplayed();
		Assert.assertEquals(noticeperiodactual, true);
		
		boolean jobtitleactual = jobtitle.isDisplayed();
		Assert.assertEquals(jobtitleactual, true);
		
//		boolean matchedskillsactual = matchedskills.isDisplayed();
//		Assert.assertEquals(matchedskills, true);
//		
	}
	
	public void verifycandidatedataafterclickingOnViewdetails (String CandidateName, String JobTitle, String CandidateDesignation, String CandidateCityArea, String CandidateCity, String CandidateCountry, String ZipCode, String CandidateExperience, String CandidateCTC, String CandidateExpectedCTC, String CandidateNoticePeriod, String ContactNumber, String DateOfBirth, String CandidateEmail, String Communicationmode, String Gender ) {
		
		WebElement name = driver.findElement(By.xpath("//strong[contains(text(),'"+CandidateName+"')]"));
		
		WebElement title = driver.findElement(By.xpath("//h6[text()='"+JobTitle+"']"));
		
		WebElement designation = driver.findElement(By.xpath("(//p[contains(text(),'"+CandidateDesignation+"')])[2]"));
		
		WebElement location = driver.findElement(By.xpath("//p[contains(text(),'"+CandidateCityArea+","+" "+CandidateCity+","+" "+CandidateCountry+" "+"-"+" "+ZipCode+"')]"));
		
		WebElement experience = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateExperience+" "+"Years"+ "')])[2]"));
		
		WebElement ctc = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateCTC+" "+"PA"+" "+"(CTC)"+ "')])[2]"));
				
		WebElement ectc = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateExpectedCTC+" "+"PA"+" "+"(ECTC)"+ "')])[2]"));
		
		WebElement noticeperiod = driver.findElement(By.xpath("(//p[contains(text(),'" +CandidateNoticePeriod+" "+"Days"+ "')])[2]"));
		
		WebElement contactnumber = driver.findElement(By.xpath("//p[contains(text(),'" +ContactNumber+ "')]"));
		
		WebElement dob = driver.findElement(By.xpath("//p[contains(text(),'" +DateOfBirth+ "')]"));
		
		WebElement email = driver.findElement(By.xpath("//td[contains(text(),'"+CandidateEmail+"')]"));
		
		WebElement modeofcommunication = driver.findElement(By.xpath("//td[contains(text(),'"+Communicationmode+"')]"));
		
		WebElement gender = driver.findElement(By.xpath("//td[contains(text(),'"+Gender+"')]"));
		
//		WebElement readytorelocate = driver.findElement(By.xpath("//td[contains(text(),'No')]"));
		
		
		
		boolean nameactual = name.isDisplayed();
		Assert.assertEquals(nameactual, true);
		
		boolean titleactual = title.isDisplayed();
		Assert.assertEquals(titleactual, true);
		
		boolean designationactual = designation.isDisplayed();
		Assert.assertEquals(designationactual, true);
		
		boolean locationactual = location.isDisplayed();
		Assert.assertEquals(locationactual, true);
		
		boolean ctcactual = ctc.isDisplayed();
		Assert.assertEquals(ctcactual, true);
		
		boolean ectcactual = ectc.isDisplayed();
		Assert.assertEquals(ectcactual, true);
		
		boolean noticeperiodactual = noticeperiod.isDisplayed();
		Assert.assertEquals(noticeperiodactual, true);
		
		boolean contactnumberactual = contactnumber.isDisplayed();
		Assert.assertEquals(contactnumberactual, true);
		
		boolean dobactual = dob.isDisplayed();
		Assert.assertEquals(dobactual, true);
		
		boolean emailactual = email.isDisplayed();
		Assert.assertEquals(emailactual, true);
		
		boolean modeofcommunicationactual = modeofcommunication.isDisplayed();
		Assert.assertEquals(modeofcommunicationactual, true);
		
		boolean genderactual = gender.isDisplayed();
		Assert.assertEquals(genderactual, true);
		
//		boolean readytorelocateactual = readytorelocate.isDisplayed();
//		Assert.assertEquals(readytorelocateactual, true);
		

	}


	
		
	
	
	
	
	
	
	
	
	
	
}
