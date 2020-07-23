package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilPackage.baseclass;

public class CandidateUpdateProfilePage extends baseclass {
	
	@FindBy(id = "Email")
	public WebElement emailID;
	
	@FindBy(id = "Name")
	public WebElement name;
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[1]/div[1]/div[7]/input")
	public WebElement designation;
	
	@FindBy(xpath = "//div[3]//div[6]//select[1]")
	public WebElement gender;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[1]/div[3]/div[3]/input")
	public WebElement location;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/form/div[1]/div[2]/div[6]/select")
	public WebElement communicationMode;
	
	@FindBy(xpath = "//*[@id=\"ng-invalidDiv\"]/td[2]/select")
	public WebElement expertiseLevel;
	
	@FindBy(xpath = "//label[@class='check']//span[@class='checkmark']")
	public WebElement noticePeriodCheckbox;
	
	@FindBy(xpath="//div[@class='col-md-6 pl-0']//div//input[@placeholder='Select Date']")
	public WebElement lastWorkingDay;
	
	@FindBy(xpath = "//button[contains(text(),'Add Skill')]")
	public WebElement addSkillButton;
	
	@FindBy(xpath = "//tr[2]//td[1]//input[1]")
	public WebElement skill2;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[2]/div[3]/table/tbody/tr[2]/td[2]/select")
	public WebElement expertiseLevel2;
	
	@FindBy(xpath = "//tr[2]//td[3]//input[1]")
	public WebElement certificate2;
	
	@FindBy(xpath = "//tr[3]//td[1]//input[1]")
	public WebElement skill3;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[2]/div[3]/table/tbody/tr[3]/td[2]/select")
	public WebElement expertiseLevel3;
	
	@FindBy(xpath = "//tr[3]//td[4]//button[1]")
	public WebElement skill3Delete;
	
	@FindBy(xpath = "//button[contains(text(),'Add Roles')]")
	public WebElement addRolesButton;
	
	@FindBy(xpath = "//tr[2]//td[2]//button[1]")
	public WebElement role3Delete;
	
	@FindBy(xpath = "//div[@class='col-md-4']//div[@class='row']//div[1]//label[1]//span[2]")
	public WebElement notLookingForJobCheckbox;
	
	@FindBy(linkText = "Skills Information")
	public WebElement SkillsInformation;
	
	@FindBy(linkText = "Personal & Professsional Information")
	public WebElement personalprofessionalInformation;
		
	
	
	public CandidateUpdateProfilePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	Select se;
	public int beforecount;
	public int aftercount;
	
	
	public void enterLastWorkingDay(String LastWorkingDay) {
		
		lastWorkingDay.sendKeys(LastWorkingDay);
	}
	
	public void autoPopulatedData() throws InterruptedException, AWTException {
		
		System.out.println("\nAuto populated data:");
		
		name.click();
		String canName = name.getAttribute("value");
		System.out.println("Candidate Name: " + canName);
		Thread.sleep(1000);
		
		emailID.click();
		String email = emailID.getAttribute("value");
		System.out.println("Email: " + email);
		Thread.sleep(1000);
		
		contactNumber.click();
		String contact = contactNumber.getAttribute("value");
		System.out.println("Contact Number: " + contact);
		Thread.sleep(1000);
		
		designation.click();
		String canDesignation = designation.getAttribute("value");
		System.out.println("Designation: " +canDesignation);
		Thread.sleep(1000);
		
		se = new Select(gender);
		WebElement canGen = se.getFirstSelectedOption();
		String canGender = canGen.getText();
		System.out.println("Gender: " +canGender);
		Thread.sleep(1000);
		
		noticePeriod.click();
		String noticeperiod = noticePeriod.getAttribute("value");
		System.out.println("Notice Period: " +noticeperiod);
		Thread.sleep(1000);
		
		location.click();
		String canLocation = location.getAttribute("value");
		System.out.println("Location: " +canLocation);
		Thread.sleep(1000);
		
		se = new Select(communicationMode);
		WebElement communication = se.getFirstSelectedOption();
		String communicationmode = communication.getText();
		System.out.println("Preferred mode of communication: " +communicationmode);
		
		se = new Select(expertiseLevel);
		WebElement expertise = se.getFirstSelectedOption();
		String expertiselevel = expertise.getText();
		System.out.println("Expertise level: " +expertiselevel);
	}
	
	public void verifyEmail() {
		
		emailID.click();
		
		String emailAttribute = candidateupdateprofilepage.emailID.getAttribute("readonly");
		System.out.println("\nEmail readonly field: " + emailAttribute);
		
		if(emailAttribute.equals("true")) {
			System.out.println("Email ID field is not editable.. Email ID field is critical field..");
		}
		else {
			System.out.println("Email ID field is editable..");
		}
		
	}
	
	public void addTenSkills() throws InterruptedException {
		
		for(int i=3;i<=12;i++) {
			
			addSkillButton.click();
			Thread.sleep(1000);
		}
	}
	
public void clickonskillsInformation() throws InterruptedException {
		
		Thread.sleep(3000);
		SkillsInformation.click();
		}

public void clickonpersonalprofessionalInformation() throws InterruptedException {
	
	Thread.sleep(3000);
	personalprofessionalInformation.click();
	}
	
	public void addThreeRoles() throws InterruptedException {
		
		for(int i=2;i<=4;i++) {
			
			addRolesButton.click();
			Thread.sleep(1000);
		}
	}

}
