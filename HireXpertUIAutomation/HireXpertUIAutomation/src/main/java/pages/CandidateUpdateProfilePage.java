package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import javax.annotation.meta.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class CandidateUpdateProfilePage extends baseclass {
	
//	@FindBy(id = "Email")
//	public WebElement emailID;
//	
//	@FindBy(id = "Title")
//	public WebElement profiletitle;
//	
//	@FindBy(id = "Name")
//	public WebElement name;
//	
//	@FindBy(id = "ContactNumber")
//	public WebElement contactNumber;	
//	
//	@FindBy(xpath = "//select[@formcontrolname='Gender']")
//	public WebElement gender;
//	
//	@FindBy(id = "NoticePeriod")
//	public WebElement noticePeriod;
//	
//	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[1]/div[3]/div[3]/input")
//	public WebElement location;
//	
//	@FindBy(xpath = "//input[@placeholder='Enter City']")
//	public WebElement city;
//	
//	@FindBy(xpath = "//input[@formcontrolname='ZipCode']")
//	public WebElement zipCode;
//	
//	@FindBy(xpath = "//input[@placeholder='Enter Industry']")
//	public WebElement industry;
//	
//	@FindBy(xpath = "//input[@placeholder='Enter Experience In Years']")
//	public WebElement experience;
//	
//	@FindBy(xpath = "//input[@placeholder='Enter ECTC']")
//	public WebElement ectc;
//	
//	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
//	public WebElement onNoticePeriod;
//	
//	@FindBy(xpath = "(//input[@placeholder='Select Date'])[2]")
//	public WebElement lastWorkingDay;
//	
//	@FindBy(xpath = "//input[@placeholder='Enter CTC']")
//	public WebElement ctc;
//	
//	@FindBy(xpath = "//select[@formcontrolname='PreferredModeOfCommunication']")
//	public WebElement modeOfcommunication;
//	
	@FindBy(xpath = "//select[@formcontrolname='ReadyToRelocate']")
	public WebElement readyToRelocate;
//		
//	@FindBy(xpath = "//input[@formcontrolname='Designation']")
//	public WebElement designation;
//	
//	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/form/div[1]/div[2]/div[6]/select")
//	public WebElement communicationMode;
//	
//	@FindBy(xpath = "//*[@id=\"ng-invalidDiv\"]/td[2]/select")
//	public WebElement expertiseLevel;
//	
//	@FindBy(xpath = "//select[@formcontrolname='ServingNoticePeriod']")
//	public WebElement noticePeriodCheckbox;
//		
//	@FindBy(xpath = "//button[contains(text(),'Add Skill')]")
//	public WebElement addSkillButton;
//	
//	@FindBy(xpath = "//tr[2]//td[1]//input[1]")
//	public WebElement skill2;
//	
//	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[2]/div[3]/table/tbody/tr[2]/td[2]/select")
//	public WebElement expertiseLevel2;
//	
//	@FindBy(xpath = "//tr[2]//td[3]//input[1]")
//	public WebElement certificate2;
//	
//	@FindBy(xpath = "//tr[3]//td[1]//input[1]")
//	public WebElement skill3;
//	
//	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-candidate-profile/div[2]/div/div/form/div[2]/div[3]/table/tbody/tr[3]/td[2]/select")
//	public WebElement expertiseLevel3;
//	
//	@FindBy(xpath = "//tr[3]//td[4]//button[1]")
//	public WebElement skill3Delete;
//	
//	@FindBy(xpath = "//button[contains(text(),'Add Designation')]")
//	public WebElement addRolesButton;
//	
//	@FindBy(xpath = "//tr[2]//td[2]//button[1]")
//	public WebElement role3Delete;	
//	
//	@FindBy(xpath = "//div[@class='col-md-4']//div[@class='row']//div[1]//label[1]//span[2]")
//	public WebElement notLookingForJobCheckbox;

	@FindBy(xpath = "//a[@title='Skills & Roles Details']")
	public WebElement SkillsInformation;
	
	@FindBy(xpath = "//a[@title='Personal & Professional Details']")
	public WebElement personalprofessionalInformation;
	
	@FindBy(xpath = "//a[@title='Professional Work Experience']")
	public WebElement workExperienceTab;
	
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

	@FindBy(xpath = "//input[@placeholder='Enter Current Organization']")
	public WebElement CurrentOrganization;
	
	@FindBy(xpath = "//input[@placeholder='Enter Current Designation']")
	public WebElement currentDesignation;
	
	@FindBy(xpath = "//input[@placeholder='Enter Duration']")
	public WebElement currentDuration;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select JobType']//input")
	public WebElement jobType;
	
	@FindBy(xpath = "//ng-select[@placeholder='Select Shift']//input")
	public WebElement Shift;
	
	@FindBy(xpath = "//ng-select[@placeholder='Enter Preferred Cities']//input")
	public WebElement preferredCity;
	
	@FindBy(xpath = "//input[@formcontrolname='SearchKeywords']")
	public WebElement searchKeywords;
	
	@FindBy(xpath = "//select[@formcontrolname='ResidentialStatus']")
	public WebElement residentialStatus;
	
	@FindBy(xpath = "//select[@formcontrolname='WillingToTravel']")
	public WebElement willingToTravel;
	
	@FindBy(xpath = "//a[@title='Qualifications Details']")
	public WebElement qualificationTab;
	
	@FindBy(xpath = "//input[@formcontrolname='Major']")
	public List<WebElement> major;
	
	@FindBy(xpath = "//input[@id='toDate']")
	public List<WebElement> year;
	
	@FindBy(xpath = "//input[@id='Grade']")
	public List<WebElement> grade;
	
	@FindBy(xpath = "//input[@id='College']")
	public List<WebElement> college;
	
	@FindBy(xpath = "//input[@formcontrolname='University']")
	public List<WebElement> university;
	
	@FindBy(xpath = "//input[@formcontrolname='Degree']")
	public List<WebElement> degree;
	
	@FindBy(xpath = "//div[@class='ng-input']//input")
	public List<WebElement> Country;
	
	@FindBy(xpath = "//input[@placeholder='Enter Organization']")
	public List<WebElement> organization;
	
	@FindBy(xpath = "//select[@formcontrolname='FromMonth']")
	public List<WebElement> fromMonth;
	
	@FindBy(xpath = "//input[@formcontrolname='FromYear']")
	public List<WebElement> fromYear;
	
	@FindBy(xpath = "//th[text()='To Date']//following::select[@formcontrolname='ToMonth']")
	public List<WebElement> toMonth;
	
	@FindBy(xpath = "//th[text()='To Date']//following::input[@formcontrolname='ToYear']")
	public List<WebElement> toYear;
	
	@FindBy(xpath = "//input[@formcontrolname='Designation']")
	public List<WebElement> designation;
	
	@FindBy(xpath = "//input[@formcontrolname='City']")
	public List<WebElement> city;
	
//	certificate tab
	
	@FindBy(xpath = "//a[@title='Certificates Details']")
	public WebElement certificateTab;
	
	@FindBy(xpath = "//input[@id='IssuingAuthority']")
	public List<WebElement> issuingAuthority;
	
//	language tab
	
	@FindBy(xpath = "//a[@title='Languages Details']")
	public WebElement languageTab;
	
	@FindBy(xpath = "//input[@placeholder='Enter Language']")
	public List<WebElement> language;
	
	@FindBy(xpath = "//select[@formcontrolname='ProficiencyId']")
	public List<WebElement> proficiency;
	
//	visa Tab
	
	@FindBy(xpath = "//a[@title='Visa Details']")
	public WebElement visaTab;
	
	@FindBy(xpath = "//input[@id='VisaType']")
	public List<WebElement> visaType;
	
	@FindBy(xpath = "//button[@aria-label='Open Calendar']")
	public List<WebElement> date;
	
//	Experience details Tab
	
	@FindBy(xpath = "//a[@title='Experience Details']")
	public WebElement experienceTab;
	
	@FindBy(xpath = "//input[@placeholder='Enter Technologies']")
	public WebElement technologies;
	
	@FindBy(xpath = "//input[@id='Client']")
	public WebElement client;
	
//	Training tab
	
	@FindBy(xpath = "//input[@id='TotalExperience']")
	public List<WebElement> TotalExperience;
	
	@FindBy(xpath = "//input[@id='Remark']")
	public List<WebElement> remark;
	
	@FindBy(xpath = "//input[@id='AttendedIn']")
	public List<WebElement> attendedIn;
	
	@FindBy(xpath = "//a[@title='Trainings Details']")
	public WebElement trainingsTab;
	
	
// Social Link
	
	@FindBy(xpath = "//a[@title='Social Links Details']")
	public WebElement sociallinkTab;
	
	@FindBy(xpath = "//input[@id='Link']")
	public List<WebElement> link;
	
//Aditional tab
	
	@FindBy(xpath = "//a[@title='Additional Details']")
	public WebElement aditionalTab;
	
	@FindBy(xpath = "//button[text()=' Cover Letter ']")
	public WebElement coverLetter;
	
	@FindBy(xpath = "//button[text()=' Achievements '] ")
	public WebElement achievements;
	
	@FindBy(xpath = "//button[text()=' Testimonials '] ")
	public WebElement testimonials;
	
	@FindBy(xpath = "//button[text()=' References '] ")
	public WebElement references;
	
	@FindBy(xpath = "//button[text()=' Extracurricular ']")
	public WebElement extracurricular;
	
	@FindBy(xpath = "//button[text()=' Profile Summary ']")
	public WebElement profileSummary;
	
	@FindBy(xpath = "//button[text()=' Declaration ']")
	public WebElement declaration;
	
	@FindBy(xpath = "//div[@class='ngx-editor-textarea']")
	public WebElement textArea;
	
	public CandidateUpdateProfilePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	Select se;
	public int beforecount;
	public int aftercount;
	
	
	
	public void enterLastWorkingDay(String LastWorkingDay) {
		
		addcandidatepage.lastWorkingDay.sendKeys(LastWorkingDay);
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
		Assert.assertEquals(addcandidatepage.title.getAttribute("value"), addjobpage.jobname);
		Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"),data.get("CandidateEmail"));
		Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"),data.get("ContactNumber"));
		Assert.assertEquals(this.dateOfBirth.getAttribute("value"),data.get("Date")); 
		se = new Select (this.countryId);
		WebElement option = se.getFirstSelectedOption();
		Assert.assertEquals(option.getText()," "+data.get("Country")+" ");
		Assert.assertEquals(this.cityArea.getAttribute("value"),data.get("CityArea"));
		Assert.assertEquals(addcandidatepage.name.getAttribute("value"),data.get("Name"));
		Assert.assertEquals(addcandidatepage.gender.getAttribute("value"),data.get("Gender"));
		Assert.assertEquals(addcandidatepage.city.getAttribute("value"),data.get("City"));
		Assert.assertEquals(addcandidatepage.zipCode.getAttribute("value"),data.get("ZipCode"));
		Assert.assertEquals(addcandidatepage.designation.get(0).getAttribute("value"),data.get("Designation"));
		Assert.assertEquals(addcandidatepage.industry.getAttribute("value"),addjobpage.industryname);	
		Assert.assertEquals(addcandidatepage.experienceInYears.getAttribute("value"),data.get("experience"));
//		Assert.assertEquals(this.ectc.getAttribute("value"),expectedCTC);
		se = new Select (addcandidatepage.onNoticePeriod);
		WebElement onNotice = se.getFirstSelectedOption();
		Assert.assertEquals(onNotice.getText(),data.get("OnNoticePeriod"));
		Assert.assertEquals(addcandidatepage.lastWorkingDay.getAttribute("value"),data.get("LastWorkingDay"));
		Assert.assertEquals(addcandidatepage.ctc.getAttribute("value"),data.get("CTC"));
		se = new Select (addcandidatepage.communicationMode);
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
	
	public void addQualificationDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
			
		 for (Map<String, String> data : credentials.asMaps(String.class, String.class))
		   {			  
				if(i<degree.size())
				{
					major.get(i).sendKeys(data.get("Major"));
					year.get(i).sendKeys(data.get("year"));
					grade.get(i).sendKeys(data.get("grade"));
					college.get(i).sendKeys(data.get("college"));
					university.get(i).sendKeys(data.get("university"));
					Country.get(i).sendKeys(data.get("country"));
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='"+data.get("country")+"']")).click();
					
				}
			i++;
		}
	}
	
	public void fillWorkExperienceDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<organization.size())
				{
					organization.get(i).clear();
					organization.get(i).sendKeys(data.get("organization"));
					fromMonth.get(i).sendKeys(data.get("fromMonth"));
					fromYear.get(i).sendKeys(data.get("fromYear"));
					toMonth.get(i).sendKeys(data.get("toMonth"));
					toYear.get(i).sendKeys(data.get("toYear"));
					designation.get(i).clear();
					designation.get(i).sendKeys(data.get("designation"));
					city.get(i).clear();
					city.get(i).sendKeys(data.get("city"));
//					driver.findElement(By.xpath("//span[text()='×']")).click();
					Country.get(i).sendKeys(data.get("country"));
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[text()='"+data.get("country")+"']")).click();
				}
				i++;
			 }
	}
	
	public void fillAllskillsAndDesignationDetails(String designation,DataTable credentials) throws InterruptedException
	{
		int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<skills.size())
				{
					skills.get(i).sendKeys(data.get("skill"));
					expertiselevel.get(i).sendKeys(data.get("Expertiselevel"));
					certificate.get(i).sendKeys(data.get("certificate"));
					addcandidatepage.designation.get(i).sendKeys(data.get("designation"));
				}
				i++;
			 }
//			addcandidatepage.designation.clear();
//			addcandidatepage.designation.sendKeys(designation);
//			Thread.sleep(4000); 
//			driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	public void fillAllCertificateDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<certificate.size())
				{
					certificate.get(i).sendKeys(data.get("certificate"));
					this.year.get(i).sendKeys(data.get("year"));
					grade.get(i).sendKeys(data.get("grade"));
					this.issuingAuthority.get(i).sendKeys(data.get("issuing Authority"));
					Country.get(i).sendKeys(data.get("country"));
					explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='"+data.get("country")+"']"))));
					driver.findElement(By.xpath("//span[text()='"+data.get("country")+"']")).click();
					
				}
				i++;
			 }
			
	}
	
	public void fillAllLanguageDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			  {
				if(i<certificate.size())
				{
					language.get(i).sendKeys(data.get("language"));
					proficiency.get(i).sendKeys(data.get("proficiency"));
					certificate.get(i).sendKeys(data.get("certificate"));
				}
				i++;
			 }
			
	}
	
	
	
	public void fillAllVisaDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(i<visaType.size())
				{
					Thread.sleep(1000);	
					date.get(i).click();			
					this.enterdate(data.get("ValidUpto"));
					visaType.get(i).sendKeys(data.get("VisaType"));
					Country.get(i).sendKeys(data.get("country"));
					explicitwait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='"+data.get("country")+"']"))));
					driver.findElement(By.xpath("//span[text()='"+data.get("country")+"']")).click();
				}
				i++;
			}
	}	
	
	
	public void fillAllExperirenceDetails(DataTable credentials) throws InterruptedException
	{
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				Thread.sleep(2000);	
				this.date.get(0).click();
				this.enterdate(data.get("fromDate"));
				Thread.sleep(2000);	
				this.date.get(1).click();
				this.enterdate(data.get("toDate"));
				addcandidatepage.title.sendKeys(data.get("title"));
				this.organization.get(0).sendKeys(data.get("organization"));
				this.technologies.sendKeys(data.get("technologies"));
				this.client.sendKeys(data.get("client"));
			 }
	}	
	
	public void fillAllTrainingDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
		
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(i<this.TotalExperience.size())
				{
				driver.findElements(By.xpath("//input[@id='Title']")).get(i).sendKeys(data.get("title1"));
				TotalExperience.get(i).sendKeys(data.get("experirence"));
				remark.get(i).sendKeys(data.get("reamrk1"));
				attendedIn.get(i).sendKeys(data.get("attendedYear"));
				}				
				i++;
			 }
			
			int j=i;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(j<=this.remark.size())
				{
				 driver.findElements(By.xpath("//input[@id='Title']")).get(j).sendKeys(data.get("title2"));	
				 remark.get(j).sendKeys(data.get("remark2"));
				}
				j++;
			 }
	}	
	public void fillAllSocialLinkDetails(DataTable credentials) throws InterruptedException
	{
		int i=0;
			for ( Map<String, String> data : credentials.asMaps(String.class, String.class))
			 {
				if(i<this.link.size())
				{
					driver.findElements(By.xpath("//input[@id='Title']")).get(i).sendKeys(data.get("title"));	
					link.get(i).sendKeys(data.get("link"));

			    }
				i++;
			}
	}
	
	public void fillAllAdditinalDetails() throws InterruptedException
	{
		Thread.sleep(5000);
		this.coverLetter.click();
		textArea.sendKeys(prop.getProperty("Coverletter"));	
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
		this.achievements.click();
		textArea.sendKeys(prop.getProperty("acheivment"));	
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
		this.testimonials.click();
		textArea.sendKeys(prop.getProperty("testimonals"));	
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
		this.references.click();
		textArea.sendKeys(prop.getProperty("refresnces"));
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
		this.extracurricular.click();
		textArea.sendKeys(prop.getProperty("extracurriculam"));	
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
		this.profileSummary.click();
		textArea.sendKeys(prop.getProperty("profilesummary"));	
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
		this.declaration.click();
		textArea.sendKeys(prop.getProperty("declaration"));	
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
	}
}