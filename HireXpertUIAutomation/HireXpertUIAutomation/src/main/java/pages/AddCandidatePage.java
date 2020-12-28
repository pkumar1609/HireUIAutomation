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
	
	@FindBy(xpath = "//input[@id='Title']")
	public WebElement title;
	
	@FindBy(xpath = "//button[@aria-label='Open Calendar']")
	public List<WebElement> calenderIcon;
	
	@FindBy(xpath = "//span[text()='Today']")
	public WebElement todayDate;
	
	@FindBy(xpath = "(//input[@placeholder='Select Date'])[1]")
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
	
	@FindBy(xpath = "(//input[@placeholder='Select Date'])[2]")
	public WebElement lastWorkingDay;
	
	@FindBy(id = "ECTC")
	public WebElement expectedCTC;
	
	@FindBy(xpath = "//Select[@formcontrolname='PreferredModeOfCommunication']")
	public WebElement communicationMode;
	
	@FindBy(id = "salaryOffered")
	public WebElement salaryOffered;
	
	@FindBy(xpath = "(//input[@placeholder='Skill']")  
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
	
	@FindBy(xpath = "//select[@formcontrolname='NotLookingForJob']")
	public WebElement LookingforJobfield;
	
	@FindBy(xpath = "//input[@placeholder='Enter Industry']")
	public WebElement industry;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement servingNoticePeriod;
	
	@FindBy(xpath = "//input[@formcontrolname='CVUpload']")
	public WebElement cv;
	
	
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
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//h6[contains(text(),'Congratulation, We got candidate information which is filled for you and saved 5 minutes of your time. ')]"));
		if(dynamicElement.size() != 0)
		{
			System.out.println("Candidate is present in system");
			common.clickOnOKBtn();
			Thread.sleep(2000);
			nameOfCan=name.getAttribute("value");
			salaryOffered.sendKeys(Salaryoffered);
//			this.distance.sendKeys(distance);
			se = new Select (isPermanentAddress);
			se.selectByVisibleText(permanentAddress);
			se = new Select (isReadyToRelocateToJobLocation);
			se.selectByVisibleText(relocate);
			this.expectedCTC.clear();
			this.expectedCTC.sendKeys(expectedCTC);
			Thread.sleep(2000);
		}	
		else
		{
			System.out.println("Candidate is not present in system and you need to enter candidate details");
//			title.clear();
//			title.sendKeys(profiletitle);
			name.sendKeys(Name); 
			nameOfCan=name.getAttribute("value");
			contactNumber.sendKeys(ContactNumber);
			designation.get(0).sendKeys(Designation);
			Thread.sleep(2000);
			date.sendKeys(Date);
			Thread.sleep(2000);
			se = new Select (gender);
			se.selectByVisibleText(Gender); 
			se = new Select (onNoticePeriod);
			se.selectByVisibleText(OnNoticePeriod);
			if(OnNoticePeriod.contentEquals("Yes"))
			{
				executor.executeScript("arguments[0].click()", addcandidatepage.calenderIcon.get(2));
				common.enterdate(LastWorkingDay);
				
//				this.lastWorkingDay.clear();
//				this.lastWorkingDay.sendKeys(LastWorkingDay);
//				this.datebelowField = driver.findElement(By.xpath("(//div[@class='text-info'])[2]")).getText();
			}	
			else
			{
				noticePeriod.sendKeys(NoticePeriod);
			}
			Thread.sleep(2000);
			experienceInYears.sendKeys(experience);
			ctc.sendKeys(CTC);
			this.expectedCTC.sendKeys(expectedCTC);
			se = new Select (countryId);
			se.selectByVisibleText(Country);
			city.clear();
			city.sendKeys(City);
		  	salaryOffered.sendKeys(Salaryoffered);
			Assert.assertEquals(city.getAttribute("value"), City);
			cityArea.sendKeys(CityArea);
			zipCode.sendKeys(ZipCode);
			se = new Select (communicationMode);
		  	se.selectByVisibleText(Communicationmode);
			Assert.assertEquals(communicationMode.getAttribute("value"), Communicationmode);
//			this.distance.sendKeys(distance);
			se = new Select (isPermanentAddress);
			se.selectByVisibleText(permanentAddress);
			se = new Select (isReadyToRelocateToJobLocation);
			se.selectByVisibleText(relocate);
		}

	}
	
	public void enterLastWorkingDay(String LastWorkingDay) {
		
		lastWorkingDay.sendKeys(LastWorkingDay);
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
		try {
			driver.findElement(By.xpath("//h6[contains(text(),'This candidate is already added to this job either by you or somebody else.')]")).isDisplayed();
			System.out.println("This candidate is already added to this job either by you or somebody else");
			common.clickOnOKBtn();
			Thread.sleep(2000);
			common.clickOnCloseBtn();
			common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e )
		{}
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
		upload.sendKeys("C:\\Users\\TLP33\\Documents\\CV.docx");
	}
	
	public void uploadResumeDocumentT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\sample2.doc"); // CV Path of Trupti's system
	}
	public void uploadResumeDocumentinZipformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\DVWA-master.zip"); // CV Path of Trupti's system
	}
	
	public void uploadResumeDocumentinPdfformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\komal[5_1_2019__6_1_2019].pdf"); // CV Path of Trupti's system
	}
	
	public void uploadResumeDocumentintextformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\sample.txt"); // CV Path of Trupti's system
	}

	public void uploadResumeDocumentinPNGformatT() throws AWTException {  //Method for Trupti
		WebElement upload = driver.findElement(By.xpath("//input[@formcontrolname='CVUpload']"));
		upload.sendKeys("C:\\Users\\TLP33\\Downloads\\RequestControlPopUp (1).png"); // CV Path of Trupti's system
	}
	
}
