package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilPackage.baseclass;

public class AddCandidatePage extends baseclass {
	
	@FindBy(xpath = "//h5[@class='modal-title w-97']")
	public WebElement pageTitle;
	
	@FindBy(id = "Email")
	public WebElement emailField;
	
	@FindBy(xpath = "//button[contains(text(),'Find')]")
	public WebElement FindButton;
	
	@FindBy(id = "alertModalCloseBtn")
	public WebElement OKButtonPopup;
	
	@FindBy(id = "Name")
	public WebElement name;
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[2]/div/div[1]/form/div[2]/div[1]/div/div/div[1]/div[4]/input")
	public WebElement designation;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div[1]/form/div[2]/div[1]/div/div/div[1]/div[6]/select")
	public WebElement gender;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "//*[@id=\"fromDatePicker\"]/div/div/input")
	public WebElement lastWorkingDay;
	
	@FindBy(xpath = "//div[3]//div[3]//input[1]")
	public WebElement location;
	
	@FindBy(xpath = "ECTC")
	public WebElement expectedCTC;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div[1]/form/div[2]/div[1]/div/div/div[3]/div[5]/select")
	public WebElement communicationMode;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[3]/button[2]")
	public WebElement saveButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[3]/button[1]")
	public WebElement closeButton;
	
	@FindBy(id = "salaryOffered")
	public WebElement salaryOffered;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonPopup;
	
	@FindBy(xpath = "//*[@id=\"ng-invalidDiv\"]/td[2]/select")
	public WebElement expertiseLevel;
	
	String nameOfCan;
	
	
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
		location.sendKeys("Pune");
	}
	
//	public void searchCandidateEmail() {
//		
//		emailField.click();
//		emailField.sendKeys(prop.getProperty("candidateemail"));
//	}
	
	public void EntercandidateemailT(String CandidateEmail) {
     	 
		emailField.sendKeys(CandidateEmail);
	}
	
	Select se;
	
	public void selectGender() {
		
		se = new Select(gender);
		se.selectByVisibleText("Female");
	}
	
	public void selectCommunicationMode() {
		
		se = new Select(communicationMode);
		se.selectByIndex(3);
	}
	
	public void selectExpertiseLevel() {
		
		se = new Select(expertiseLevel);
		se.selectByIndex(3);
	}
	
	public void EnterAllMandatoryfieldsT(String Name, String ContactNumber, String Designation, String Gender, String NoticePeriod, String Location, String Communicationmode) throws InterruptedException {
    	 
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//h6[contains(text(),'Congratulation, We got candidate information which')]"));
		if(dynamicElement.size() != 0){
			
			System.out.println("Candidate is already present in system");
			
			Thread.sleep(3000);
			
			OKButtonPopup.click();
		}
		
		else{
			
			System.out.println("Candidate is not present in system and you need to enter candidate details");
			
			name.sendKeys(Name);
		      
			contactNumber.sendKeys(ContactNumber);
		      
			designation.sendKeys(Designation);
			designation.sendKeys(Keys.ENTER);
		      
		      
			gender.sendKeys(Keys.ENTER);
			se = new Select (gender);
			se.selectByVisibleText(Gender);
		      
		  	noticePeriod.sendKeys(NoticePeriod);
		      
		  	location.sendKeys(Location);
		  	location.sendKeys(Keys.ENTER);
		      
		  	communicationMode.sendKeys(Keys.ENTER);
		  	se = new Select (communicationMode);
		  	se.selectByVisibleText(Communicationmode);
		}
	}
		

	
	public void enterEmailIdK() throws InterruptedException
	{
		emailField.sendKeys(prop.getProperty("canid"));
		Thread.sleep(1000);
		FindButton.click();
		Thread.sleep(1000);
		common.clickOnOKBtn();
		nameOfCan= name.getText();
	}
	
	

}
