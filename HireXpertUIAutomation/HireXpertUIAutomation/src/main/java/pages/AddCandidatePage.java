package pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import utilPackage.baseclass;

public class AddCandidatePage extends baseclass {
	
	public String nameOfCan;
	Robot rb;
	public String datebelowField;
//	private static boolean isreporterrunning;
	
	@FindBy(xpath = "//h5[@class='modal-title w-100']")
	public WebElement pageTitle;
	
	@FindBy(id = "Email")
	public WebElement emailField;
	
	@FindBy(xpath = "//input[@placeholder='Enter Alternate Email']")
	public WebElement alternateEmail;

	
	@FindBy(xpath = "//button[@aria-label='Open Calendar']")
	public List<WebElement> calenderIcon;
	
	@FindBy(xpath = "//span[text()='Today']")
	public WebElement todayDate;
	
	@FindBy(xpath = "(//input[@placeholder='Select Date'])[2]")
	public WebElement date;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement onNoticePeriod;
	
	@FindBy(id = "ExperienceInYears")
	public WebElement experienceInYears;
	
	@FindBy(id = "CTC")
	public WebElement ctc;
	
	@FindBy(xpath = "//select[@formcontrolname='CountryId']")
	public WebElement countryId;
	
	@FindBy(xpath = "//input[@placeholder='Enter City']")
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
	
	@FindBy(xpath = "//input[@placeholder='Enter Alternate Contact Number']")
	public WebElement alternateContact;
	
	@FindBy(xpath = "//input[@placeholder='Enter Designation']")
	public List<WebElement> designation;
	
	@FindBy(xpath = "//input[@formcontrolname='ZipCode']")
	public WebElement ZipCode;
	
	@FindBy(xpath = "//select[@formcontrolname='Gender']")
	public WebElement gender;
	
	@FindBy(xpath = "//input[@formcontrolname='NoticePeriod']")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "//label[@class='check mt-4']//span[@class='checkmark']")
	public WebElement OnNoticePeriodCheckbox;
	
	@FindBy(xpath = "//my-date-picker[@formcontrolname='LastWorkingDay']//input")
	public WebElement lastWorkingDay;
	
	@FindBy(id = "ECTC")
	public WebElement expectedCTC;
	
	@FindBy(xpath = "//Select[@formcontrolname='PreferredModeOfCommunication']")
	public WebElement communicationMode;
	
	@FindBy(id = "salaryOffered")
	public WebElement salaryOffered;
	
	@FindBy(xpath = "//input[@formcontrolname='Skill']")  
	public List<WebElement> jobskill;
	 
	@FindBy(xpath = "//select[@formcontrolname='ExpertiseLevel']")  
	public List<WebElement> expertiselevel;
	
	@FindBy(xpath = "//input[@formcontrolname='Certificate']")  
	public List<WebElement> certificate;
	
	@FindBy(xpath = "//div[@class='custom-file custom-file-invalid']")
	public WebElement uploadResumeField;
	
	@FindBy(xpath = "//*[@id='ng-invalidDiv']/td[2]/select")
	public WebElement expertiseLevel;
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[1]")
	public WebElement expertiseLevel1;
	
	@FindBy(xpath = "(//select[@formcontrolname='ExpertiseLevel'])[2]")
	public WebElement expertiseLevel2;
	
	@FindBy(xpath = "//select[@formcontrolname='IsLookingForJob']")
	public WebElement LookingforJobfield;
	
	@FindBy(xpath = "//input[@placeholder='Enter Industry']")
	public WebElement industry;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement servingNoticePeriod;
	
	@FindBy(xpath = "//input[@formcontrolname='CVUpload']")
	public WebElement cv;
	
	@FindBy(xpath = "//select[@formcontrolname='IsHideCandidateContact']")
	public WebElement hideContact;
	
	
	public AddCandidatePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validatePageTitle() {
		
		String title = pageTitle.getText();
		System.out.println("\nPage title: " + title);
	}
	
	public void fillAllCandidateDetails() {
		
		name.sendKeys("c023");
		contactNumber.sendKeys("2559825845");
		designation.get(0).sendKeys("software tester");
		noticePeriod.sendKeys("30");
		cityArea.sendKeys("Pune");
	}
	
	public void EntercandidateemailT(String CandidateEmail) {
     	 
		emailField.sendKeys(CandidateEmail);
	}
	
	Select se;

//	private String ExpertiseLevel1;
//
//	private String ExpertiseLevel2;
	
	
	public void EnterAllMandatoryfieldsT(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws InterruptedException, AWTException {
//		
//		List<WebElement> dynamicElement = driver.findElements(By.xpath("//h6[contains(text(),'Congratulation, We got candidate information which is filled for you and saved 5 minutes of your time. ')]"));
//		if(dynamicElement.size() != 0)
//		{
//			System.out.println("Candidate is present in system");
//			common.clickOnOKBtn();
//			Thread.sleep(2000);
//			nameOfCan=name.getAttribute("value");
//			Thread.sleep(2000);
//			if(city.getAttribute("value").isEmpty())
//			{
//			city.sendKeys(City);
//			}		
//			if(cityArea.getAttribute("value").isEmpty())
//			{
//			cityArea.sendKeys(CityArea);
//			}
//			if(zipCode.getAttribute("value").equals(""))
//			{
//			zipCode.sendKeys(ZipCode);
//			}			
//			salaryOffered.sendKeys(Salaryoffered);
////			this.distance.sendKeys(distance);
//			se = new Select (isPermanentAddress);
//			se.selectByVisibleText(permanentAddress);
//			se = new Select (isReadyToRelocateToJobLocation);
//			se.selectByVisibleText(relocate);
//			this.expectedCTC.clear();
//			this.expectedCTC.sendKeys(expectedCTC);
//		}	
//		else
//		{

			if(name.getAttribute("value").isEmpty())
			{
			name.sendKeys(Name);
			}
			nameOfCan=name.getAttribute("value");
			if(contactNumber.getAttribute("value").isEmpty())
			{
			contactNumber.sendKeys(ContactNumber);
			}
			if(designation.get(0).getAttribute("value").isEmpty())
			{
				designation.get(0).sendKeys(Designation);
			}
			Thread.sleep(2000);
			se = new Select (gender);
			se.selectByVisibleText(Gender); 
			se = new Select (onNoticePeriod);
			se.selectByVisibleText(OnNoticePeriod);
			System.out.println("OnNoticePeriod"+OnNoticePeriod);
			if(OnNoticePeriod.contentEquals("Yes"))
			{
				executor.executeScript("arguments[0].click()", addcandidatepage.calenderIcon.get(0));
				if(this.lastWorkingDay.getAttribute("value").isEmpty())
				{
					common.enterdate(LastWorkingDay);
				}
				if(this.date.getAttribute("value").isEmpty())
				{
					date.sendKeys(Date);
				}				
			}	
			else
			{
				if(this.noticePeriod.getAttribute("value").isEmpty())
				{
					noticePeriod.sendKeys(NoticePeriod);
				}				
			}	
					
			Thread.sleep(2000);
			if(experienceInYears.getAttribute("value").isEmpty())
			{
			experienceInYears.sendKeys(experience);
			}
			if(ctc.getAttribute("value").isEmpty())
			{
				ctc.sendKeys(CTC);
			}
			if(this.expectedCTC.getAttribute("value").isEmpty())
			{
				this.expectedCTC.sendKeys(expectedCTC);
			}
			se = new Select (countryId);
			se.selectByVisibleText(Country);

			if(city.getAttribute("value").isEmpty())
			{
				city.sendKeys(City);
			}			
		  	salaryOffered.sendKeys(Salaryoffered);
		  	if(cityArea.getAttribute("value").isEmpty())
			{
		  		cityArea.sendKeys(CityArea);
			}	
			if(zipCode.getAttribute("value").isEmpty())
			{
			zipCode.sendKeys(ZipCode);
			}
			probabilityFields(Communicationmode, Salaryoffered, permanentAddress, relocate);
//		}

	}
	
	public void probabilityFields(String Communicationmode,String Salaryoffered,String permanentAddress, String relocate) {		
		se = new Select (communicationMode);
	  	se.selectByVisibleText(Communicationmode);
		Assert.assertEquals(communicationMode.getAttribute("value"), Communicationmode);
		se = new Select (isPermanentAddress);
		se.selectByVisibleText(permanentAddress);
		se = new Select (isReadyToRelocateToJobLocation);
		se.selectByVisibleText(relocate);
	}
	
	public void enterLastWorkingDay(String LastWorkingDay) {
		
		lastWorkingDay.sendKeys(LastWorkingDay);
	}
	
	public void candidateMandatoryDetails(String CandidateEmail,String Name,String ContactNumber,String Designation,String Date,String Gender,String OnNoticePeriod,String NoticePeriod,String LastWorkingDay,String experience,String CTC,String expectedCTC,String Country,String City,String CityArea,String ZipCode,String Communicationmode,String Salaryoffered,String distance,String permanentAddress, String relocate) throws InterruptedException {
		
		if(addcandidatepage.emailField.getAttribute("value").isEmpty())
		{
			addcandidatepage.emailField.sendKeys(CandidateEmail);
		}
		if(addcandidatepage.contactNumber.getAttribute("value").isEmpty())
		{
			addcandidatepage.contactNumber.sendKeys(ContactNumber);
		}		
		if(OnNoticePeriod.contentEquals("Yes"))
		{
			executor.executeScript("arguments[0].click()", addcandidatepage.calenderIcon.get(0));
			if(this.lastWorkingDay.getAttribute("value").isEmpty())
			{
				common.enterdate(LastWorkingDay);
			}
			if(this.date.getAttribute("value").isEmpty())
			{
				date.sendKeys(Date);
			}
			
		}	
		else
		{
			if(this.noticePeriod.getAttribute("value").isEmpty())
			{
				noticePeriod.sendKeys(NoticePeriod);
			}				
		}	
		if(experienceInYears.getAttribute("value").isEmpty())
		{
			experienceInYears.sendKeys(experience);
		}
		if(ctc.getAttribute("value").isEmpty())
		{
			ctc.sendKeys(CTC);
		}
		if(this.expectedCTC.getAttribute("value").isEmpty())
		{
			this.expectedCTC.sendKeys(expectedCTC);
		}
		se = new Select (countryId);
		if(se.getFirstSelectedOption().getText().isEmpty())
		{
			se.selectByVisibleText(Country);
		}
		if(this.city.getAttribute("value").isEmpty())
		{
			this.city.sendKeys(City);
		}
		if(this.cityArea.getAttribute("value").isEmpty())
		{
			this.cityArea.sendKeys(CityArea);
		}		
		if(zipCode.getAttribute("value").isEmpty())
		{
		zipCode.sendKeys(ZipCode);
		}
		probabilityFields(Communicationmode, Salaryoffered, permanentAddress, relocate);
	}
	
	public void addSkill(String level1, String level2, String level3, String certificate1, String certificate2, String certificate3,String certificateforskill1, String certificateforskill2) throws InterruptedException
	{
		for(int i=0;i<expertiselevel.size();i++)	
		{
			Thread.sleep(3000);
			select =new Select(this.expertiselevel.get(i));
			if(i==0)
			{
				select.selectByVisibleText(level1);
				if(certificate1.contentEquals("Yes"))
				{
					certificate.get(i).clear();
					certificate.get(i).sendKeys(certificateforskill1);
				}
			}
			if(i==1)
			{
				select.selectByVisibleText(level2);
				if(certificate2.contentEquals("Yes"))
				{
					certificate.get(i).clear();
					certificate.get(i).sendKeys(certificateforskill2);
				}
			}
			if(i==2)		
			{
				select.selectByVisibleText(level3);
				if(certificate3.contentEquals("Yes"))
				{
					certificate.get(i).clear();
					certificate.get(i).sendKeys(certificateforskill1);
				}
			}
		}
	}
	
	public void checkCandidateALreadyPresent() throws InterruptedException
	{
		if(driver.findElements(By.xpath("//h6[text()='You can not add this candidate to this job as this candidate is already added to this job with 4855866385 on 12-Mar-2021 and current status of this candidate is Potential Candidate.']")).size()>0)
		{
			common.clickOnOKBtn();
			Thread.sleep(2000);
			common.clickOnCloseBtn();
			common.clickOnConfirmYes();
		}
	} 

        public void Enterexpertilevel (String ExpertiseLevel1, String ExpertiseLevel2 ,String ExpertiseLevel3) {
        		
        	select = new Select (expertiselevel.get(0));
        	select.selectByVisibleText(" "+ExpertiseLevel1+" ");
        	select = new Select (expertiselevel.get(1));
        	select.selectByVisibleText(" "+ExpertiseLevel2+" ");
        	select = new Select (expertiselevel.get(2));
        	select.selectByVisibleText(" "+ExpertiseLevel3+" ");
		  	
	}
        
    
        public void probabilitypopupwhileaddingcandidate() {
        	
        	{         
        		  try   
        		  {    
        		    if(driver.findElement(By.xpath("(//div[@role='document'and@class='modal-dialog'])[2]")).isDisplayed())
        		     
        		    {      
    						try {
    							common.clickOnConfirmYes();
    						} catch (InterruptedException e) {
    							
    						}
        		    }    
        		  }      
        		  catch(NoSuchElementException e)     
        		  {       
        			  System.out.println("\\nNo probability popup is displayed");
        		  }       
        		}
        	}


     public void clickonFindbtn() {
		
		FindButton.click();
	}
	
	public void uploadResumeDocument() throws AWTException {
		
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Selenium\\CV.docx");
	}
	
	public void uploadResumeDocumentT() throws AWTException { 
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Selenium\\sample2.doc"); 
	}
	public void uploadResumeDocumentinZipformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Selenium\\DVWA-master.zip"); // CV Path of Trupti's system
	}
	
	public void uploadResumeDocumentinPdfformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Selenium\\Vimala_S__Bengaluru___Bangalore_7.06_yrs (2).pdf"); // CV Path of Trupti's system
	}
	
	public void uploadResumeDocumentintextformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Selenium\\sample.txt"); // CV Path of Trupti's system
	}

	public void uploadResumeDocumentinPNGformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Selenium\\RequestControlPopUp (1).png"); // CV Path of Trupti's system
	}
	
}
