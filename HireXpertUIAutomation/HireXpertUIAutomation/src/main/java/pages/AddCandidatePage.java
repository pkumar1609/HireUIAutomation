package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

public class AddCandidatePage extends baseclass {
	
	@FindBy(xpath = "//h5[@class='modal-title w-100']")
	public WebElement pageTitle;
	
	@FindBy(id = "Email")
	public WebElement emailField;
	
	@FindBy(id = "Title")
	public WebElement title;
	
	@FindBy(xpath = "(//span[@class='mydpicon icon-mydpcalendar'])[2]")
	public WebElement calenderIcon;
	
	@FindBy(xpath = "//span[text()='Today']")
	public WebElement todayDate;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public WebElement date;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement onNoticePeriod;
	
	@FindBy(id = "ExperienceInYears")
	public WebElement experienceInYears;
	
	@FindBy(id = "CTC")
	public WebElement ctc;
	
	@FindBy(xpath = "//select[@formcontrolname='CountryId']")
	public WebElement countryId;
	
	@FindBy(xpath = "//input[@formcontrolname='City']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@placeholder='Enter City Area']")
	public WebElement cityArea;
	
//	@FindBy(xpath = "//input[@formcontrolname='SalaryOffered']")
//	public WebElement salaryOffered;
	
	@FindBy(id = "ZipCode")
	public WebElement zipCode;
	
	@FindBy(id = "distance")
	public WebElement distance;
	
	@FindBy(xpath = "//select[@formcontrolname='IsPermanentAddress']")
	public WebElement isPermanentAddress;
	
	@FindBy(xpath = "//select[@formcontrolname='IsReadyToRelocateToJobLocation']")
	public WebElement isReadyToRelocateToJobLocation;
	
	@FindBy(xpath = "//button[contains(text(),'Find')]")
	public WebElement FindButton;
	
	@FindBy(xpath = "//input[@id='Name']")
	public WebElement name;
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "//input[@formcontrolname='Designation']")
	public WebElement designation;
	
	@FindBy(xpath = "//input[@formcontrolname='ZipCode']")
	public WebElement ZipCode;
	
	@FindBy(xpath = "//select[@formcontrolname='Gender']")
	public WebElement gender;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "//label[@class='check mt-4']//span[@class='checkmark']")
	public WebElement OnNoticePeriodCheckbox;
	
	@FindBy(xpath = "//*[@id=\"fromDatePicker\"]/div/div/input")
	public WebElement lastWorkingDay;
	
//	@FindBy(xpath = "//div[3]//div[3]//input[1]")
//	public WebElement location;
	
	@FindBy(id = "ECTC")
	public WebElement expectedCTC;
	
	@FindBy(xpath = "//Select[@formcontrolname='PreferredModeOfCommunication']")
	public WebElement communicationMode;
	
	@FindBy(id = "salaryOffered")
	public WebElement salaryOffered;
	
	@FindBy(xpath = "//*[@id='ng-invalidDiv']/td[2]/select")
	public WebElement expertiseLevel;
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[1]")
	public WebElement expertiseLevel1;
	
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[2]")
	public WebElement expertiseLevel2;
	
	@FindBy(xpath = "//div[@class='custom-file custom-file-invalid']")
	public WebElement uploadResumeField;
	
	public String nameOfCan;
	Robot rb;
	
	
	public AddCandidatePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void validatePageTitle() {
		
		String title = pageTitle.getText();
		System.out.println("\nPage title: " + title);
	}
	
	public void fillAllCandidateDetails() {
		
		name.sendKeys("c023");
		contactNumber.sendKeys("2559825845");
		designation.sendKeys("software tester");
		noticePeriod.sendKeys("30");
		cityArea.sendKeys("Pune");
	}
	
	public void EntercandidateemailT(String CandidateEmail) {
     	 
		emailField.sendKeys(CandidateEmail);
	}
	
	Select se;

	private String ExpertiseLevel1;

	private String ExpertiseLevel2;
	
	public void EnterAllMandatoryfieldsT(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws InterruptedException, AWTException {
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//h6[contains(text(),' Congratulation, We got candidate information which is filled for you and saved 5 minutes of your time. ')]"));
		if(dynamicElement.size() != 0)
		{
			System.out.println("Candidate is present in system");
			common.clickOnOKBtn();
			nameOfCan=name.getAttribute("value");
			System.out.println("nameOfCan "+nameOfCan);
		}	
		else 
		{
			System.out.println("Candidate is not present in system and you need to enter candidate details");
		
			name.sendKeys(Name); 
			nameOfCan=name.getAttribute("value");
			contactNumber.sendKeys(ContactNumber);
			designation.sendKeys(Designation);
			Thread.sleep(2000);
			date.sendKeys(Date);
			Thread.sleep(2000);
			se = new Select (gender);
			se.selectByVisibleText(Gender); 
			se = new Select (onNoticePeriod);
			se.selectByVisibleText(OnNoticePeriod);
			if(OnNoticePeriod.contentEquals("Yes"))
			{
				
			}	
			else
			{
			noticePeriod.sendKeys(NoticePeriod);
			}
			experienceInYears.sendKeys(experience);
			ctc.sendKeys(CTC);
			this.expectedCTC.sendKeys(expectedCTC);
			se = new Select (countryId);
			se.selectByVisibleText(Country);
			city.sendKeys(City);
			Thread.sleep(2000);
			salaryOffered.click();
			cityArea.sendKeys(CityArea);
			zipCode.sendKeys(ZipCode);
			se = new Select (communicationMode);
		  	se.selectByVisibleText(Communicationmode);
			salaryOffered.sendKeys(Salaryoffered);
			this.distance.sendKeys(distance);
			se = new Select (isPermanentAddress);
			se.selectByVisibleText(permanentAddress);
			se = new Select (isReadyToRelocateToJobLocation);
			se.selectByVisibleText(relocate);
		  	
//		  	uploadResumeDocument();
			
		}
//		common.clickOnSaveBtn();
//		common.clickOnConfirmYes();
	}
	
	
	public void checkCandidateALreadyPresent() throws InterruptedException
	{
		try {
			
			driver.findElement(By.xpath("//h6[contains(text(),' This candidate is already added to this job either by you or somebody else.')]")).isDisplayed();
			System.out.println("This candidate is already added to this job either by you or somebody else");
			common.clickOnOKBtn();
			Thread.sleep(2000);
			common.clickOnCloseBtn();
			common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e )
		{}
	}

        public void Enterexpertilevel (String ExpertiseLevel1, String ExpertiseLevel2 ) {
        		
        	se = new Select (expertiseLevel1);
		  	se.selectByVisibleText(ExpertiseLevel1);
		  	
		  	se = new Select (expertiseLevel2);
		  	se.selectByVisibleText(ExpertiseLevel2);
	}
        
        public void EnterexpertilevelofskillasNotanswered(String ExpertiseLevel1, String ExpertiseLevel2) {
    		
    		se = new Select (expertiseLevel1);
    	  	se.selectByVisibleText(ExpertiseLevel1);
    	  	
    	  	se = new Select (expertiseLevel2);
    	  	se.selectByVisibleText(ExpertiseLevel2);
    		
    	}

	public void clickUploadResumeField() {
		
		uploadResumeField.click();
	}
	
     public void clickonFindbtn() {
		
		FindButton.click();
	}
	
	public void uploadResumeDocument() throws AWTException {
		
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Documents\\CV.docx");
	}
	
	public void uploadResumeDocumentT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP32\\Documents\\CV.doc"); // CV Path of Trupti's system
	}

	
	

}
