package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class CandidateUpdateProfilePage extends baseclass {
	
	@FindBy(id = "Email")
	public WebElement emailID;
	
	@FindBy(id = "Title")
	public WebElement profiletitle;
	
	@FindBy(id = "Name")
	public WebElement name;
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;	
	
	@FindBy(xpath = "//select[@formcontrolname='Gender']")
	public WebElement gender;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[1]/div[3]/div[3]/input")
	public WebElement location;
	
	@FindBy(xpath = "//input[@placeholder='Enter City']")
	public WebElement city;
	
	@FindBy(xpath = "//input[@formcontrolname='ZipCode']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//input[@placeholder='Enter Industry']")
	public WebElement industry;
	
	@FindBy(xpath = "//input[@placeholder='Enter Experience In Years']")
	public WebElement experience;
	
	@FindBy(xpath = "//input[@placeholder='Enter ECTC']")
	public WebElement ectc;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement onNoticePeriod;
	
	@FindBy(xpath = "(//input[@placeholder='Select Date'])[2]")
	public WebElement lastWorkingDay;
	
	@FindBy(xpath = "//input[@placeholder='Enter CTC']")
	public WebElement ctc;
	
	@FindBy(xpath = "//select[@formcontrolname='PreferredModeOfCommunication']")
	public WebElement modeOfcommunication;
	
	@FindBy(xpath = "//select[@formcontrolname='ReadyToRelocate']")
	public WebElement readyToRelocate;
		
	@FindBy(xpath = "//input[@formcontrolname='Designation']")
	public WebElement designation;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/form/div[1]/div[2]/div[6]/select")
	public WebElement communicationMode;
	
	@FindBy(xpath = "//*[@id=\"ng-invalidDiv\"]/td[2]/select")
	public WebElement expertiseLevel;
	
	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
	public WebElement noticePeriodCheckbox;
		
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
	
	@FindBy(xpath = "//button[contains(text(),'Add Role')]")
	public WebElement addRolesButton;
	
	@FindBy(xpath = "//tr[2]//td[2]//button[1]")
	public WebElement role3Delete;
	
//	@FindBy(xpath = "//div[@class='col-md-4']//div[@class='row']//div[1]//label[1]//span[2]")
//	public WebElement notLookingForJobCheckbox;
	
	@FindBy(xpath = "//select[@formcontrolname='NotLookingForJob']")
	public WebElement LookingforJobfield;
	
	@FindBy(linkText = "Skills & Roles")
	public WebElement SkillsInformation;
	
	@FindBy(xpath = "//a[@title='Personal & Professional Details']")
	public WebElement personalprofessionalInformation;
	
	@FindBy(xpath = "//a[@class='nav-link'][contains(text(),'Profile')]")
	public WebElement profileTab;

	@FindBy(xpath = "//input[@placeholder='Enter Skill']")  
	public List<WebElement> skills;
	
	@FindBy(xpath = "//select[@formcontrolname='ExpertiseLevel']")  
	public List<WebElement> expertiselevel;
	
	@FindBy(xpath = "//input[@formcontrolname='Certificate']")  
	public List<WebElement> certificate;
	
	@FindBy(xpath = "//input[@formcontrolname='Role']")
	public WebElement role;
	
	@FindBy(xpath = "(//input[@placeholder='Select Date'])[1]")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//select[@formcontrolname='CountryId']")
	public WebElement countryId;
	
	@FindBy(xpath = "//input[@placeholder='Enter City Area']")
	public WebElement cityArea;


	
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
	
	public void addTenRoles() throws InterruptedException {
		
		for(int i=1;i<=10;i++) {
			
			addRolesButton.click();
			Thread.sleep(1000);
		}
	}
	public void AssertDetailsOnCandidateProfile(DataTable credentials) throws InterruptedException
	{
	 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
     {
		Thread.sleep(3000);
		Assert.assertEquals(this.profiletitle.getAttribute("value"), addjobpage.jobname);
		Assert.assertEquals(this.emailID.getAttribute("value"),data.get("CandidateEmail"));
		Assert.assertEquals(this.contactNumber.getAttribute("value"),data.get("ContactNumber"));
		Assert.assertEquals(this.dateOfBirth.getAttribute("value"),data.get("Date")); 
		se = new Select (this.countryId);
		WebElement option = se.getFirstSelectedOption();
		Assert.assertEquals(option.getText()," "+data.get("Country")+" ");
		Assert.assertEquals(this.cityArea.getAttribute("value"),data.get("CityArea"));
		Assert.assertEquals(this.name.getAttribute("value"),data.get("Name"));
		Assert.assertEquals(this.gender.getAttribute("value"),data.get("Gender"));
		Assert.assertEquals(this.city.getAttribute("value"),data.get("City"));
		Assert.assertEquals(this.zipCode.getAttribute("value"),data.get("ZipCode"));
		Assert.assertEquals(this.designation.getAttribute("value"),data.get("Designation"));
		Assert.assertEquals(this.industry.getAttribute("value"),addjobpage.industryname);	
		Assert.assertEquals(this.experience.getAttribute("value"),data.get("experience"));
//		Assert.assertEquals(this.ectc.getAttribute("value"),expectedCTC);
		se = new Select (this.onNoticePeriod);
		WebElement onNotice = se.getFirstSelectedOption();
		Assert.assertEquals(onNotice.getText(),data.get("OnNoticePeriod"));
		Assert.assertEquals(this.lastWorkingDay.getAttribute("value"),data.get("LastWorkingDay"));
		Assert.assertEquals(this.ctc.getAttribute("value"),data.get("CTC"));
		se = new Select (this.modeOfcommunication);
		WebElement communication = se.getFirstSelectedOption();
		Assert.assertEquals(communication.getText(),data.get("Communicationmode"));
		se = new Select (this.readyToRelocate);
		WebElement Relocate = se.getFirstSelectedOption();
		Assert.assertEquals(Relocate.getText(),data.get("relocate"));		
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
     }
	}
	
	public void AssertSkillonSkillAndRolesTab(DataTable credentials) throws InterruptedException
	{
	 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
	   {
		this.clickonskillsInformation();
		Thread.sleep(4000); 
		Assert.assertEquals(this.skills.get(0).getAttribute("value"), data.get("Skill1"));
		Assert.assertEquals(this.skills.get(1).getAttribute("value"), data.get("Skill2"));	
		Assert.assertEquals(this.skills.get(2).getAttribute("value"), data.get("Skill3"));	
		select=new Select(this.expertiselevel.get(0));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("level1")+" ");
		select=new Select(this.expertiselevel.get(1));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("level2")+" ");
		select=new Select(this.expertiselevel.get(2));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " "+data.get("level3")+" ");
		if(data.get("certificate1").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(0).getAttribute("value"), data.get("certificateforskill1"));	
		}
		if(data.get("certificate2").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(1).getAttribute("value"), data.get("certificateforskill2"));	
		}
		if(data.get("certificate3").contentEquals("Yes"))
		{
		Assert.assertEquals(addcandidatepage.certificate.get(2).getAttribute("value"), data.get("certificateforskill1"));	
		}
		Assert.assertEquals(this.role.getAttribute("value"),addjobpage.jobRole);
	}
	}
}