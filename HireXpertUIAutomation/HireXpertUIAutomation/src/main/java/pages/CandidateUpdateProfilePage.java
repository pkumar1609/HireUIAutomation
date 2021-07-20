package pages;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import utilPackage.baseclass;

public class CandidateUpdateProfilePage extends baseclass {

	@FindBy(xpath = "//input[@id='Title']")
	public WebElement title;
	
	@FindBy(xpath = "//input[@placeholder='Enter Functional Area']")
	public WebElement functionalArea;

	@FindBy(xpath = "//select[@formcontrolname='ReadyToRelocate']")
	public WebElement readyToRelocate;

	@FindBy(xpath = "//button[contains(text(),'Add Skill')]")
	public WebElement addSkillButton;

	@FindBy(xpath = "//button[contains(text(),'Add Designation')]")
	public WebElement addRolesButton;

	@FindBy(xpath = "//span[text()='Desired Designations']//following::i")
	public List<WebElement> deletedesignation;

	@FindBy(xpath = "//a[contains(text(),' Skills & Designation')]")
	public WebElement SkillsInformation;

	@FindBy(xpath = "//a[@ngbtooltip='Personal & Professional Details']")
	public WebElement personalprofessionalInformation;

	@FindBy(xpath = "//a[@ngbtooltip='Professional Work Experience']")
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

	@FindBy(xpath = "//input[@placeholder='Enter Location']")
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

	@FindBy(xpath = "//a[@ngbtooltip='Certificates Details']")
	public WebElement certificateTab;

	@FindBy(xpath = "//input[@id='IssuingAuthority']")
	public List<WebElement> issuingAuthority;

//	language tab

	@FindBy(xpath = "//a[@ngbtooltip='Languages Details']")
	public WebElement languageTab;

	@FindBy(xpath = "//input[@placeholder='Enter Language']")
	public List<WebElement> language;

	@FindBy(xpath = "//select[@formcontrolname='ProficiencyId']")
	public List<WebElement> proficiency;

//	visa Tab

	@FindBy(xpath = "//a[@ngbtooltip='Visa Details']")
	public WebElement visaTab;

	@FindBy(xpath = "//input[@id='VisaType']")
	public List<WebElement> visaType;

	@FindBy(xpath = "//button[@aria-label='Open Calendar']")
	public List<WebElement> date;

//	Experience details Tab

	@FindBy(xpath = "//a[@ngbtooltip='Experience Details']")
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

	@FindBy(xpath = "//a[@ngbtooltip='Trainings Details']")
	public WebElement trainingsTab;

// Social Link

	@FindBy(xpath = "//a[@ngbtooltip='Social Links Details']")
	public WebElement sociallinkTab;

	@FindBy(xpath = "//input[@id='Link']")
	public List<WebElement> link;

//Aditional tab

	@FindBy(xpath = "//a[@ngbtooltip='Additional Details']")
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

	@FindBy(xpath = "//div[@class='fake_textarea']")
	public WebElement textArea;

	public CandidateUpdateProfilePage() {

		PageFactory.initElements(driver, this);
	}

	Select se;
	public int beforecount;
	public int aftercount;

	public void enterLastWorkingDay(String LastWorkingDay) {

		addcandidatepage.lastWorkingDay.sendKeys(LastWorkingDay);
	}

	public void autoPopulatedData() throws InterruptedException, AWTException {

		System.out.println("\nAuto populated data:");

		addcandidatepage.name.click();
		String canName = addcandidatepage.name.getAttribute("value");
		System.out.println("Candidate Name: " + canName);
		Thread.sleep(1000);

		addcandidatepage.emailField.click();
		String email = addcandidatepage.emailField.getAttribute("value");
		System.out.println("Email: " + email);
		Thread.sleep(1000);

		addcandidatepage.contactNumber.click();
		String contact = addcandidatepage.contactNumber.getAttribute("value");
		System.out.println("Contact Number: " + contact);
		Thread.sleep(1000);

		designation.get(0).click();
		String canDesignation = designation.get(0).getAttribute("value");
		System.out.println("Designation: " + canDesignation);
		Thread.sleep(1000);

		se = new Select(addcandidatepage.gender);
		WebElement canGen = se.getFirstSelectedOption();
		String canGender = canGen.getText();
		System.out.println("Gender: " + canGender);
		Thread.sleep(1000);

		addcandidatepage.noticePeriod.click();
		String noticeperiod = addcandidatepage.noticePeriod.getAttribute("value");
		System.out.println("Notice Period: " + noticeperiod);
		Thread.sleep(1000);

		addcandidatepage.city.click();
		String canLocation = addcandidatepage.city.getAttribute("value");
		System.out.println("Location: " + canLocation);
		Thread.sleep(1000);

		se = new Select(addcandidatepage.communicationMode);
		WebElement communication = se.getFirstSelectedOption();
		String communicationmode = communication.getText();
		System.out.println("Preferred mode of communication: " + communicationmode);

		se = new Select(addcandidatepage.expertiseLevel);
		WebElement expertise = se.getFirstSelectedOption();
		String expertiselevel = expertise.getText();
		System.out.println("Expertise level: " + expertiselevel);
	}

	public void verifyEmail() {

		addcandidatepage.emailField.click();
		String emailAttribute = addcandidatepage.emailField.getAttribute("readonly");
		System.out.println("\nEmail readonly field: " + emailAttribute);

		if (emailAttribute.equals("true")) {
			System.out.println("Email ID field is not editable.. Email ID field is critical field..");
		} else {
			System.out.println("Email ID field is editable..");
		}
	}

	public void addTenSkills() throws InterruptedException {

		for (int i = 3; i <= 12; i++) {

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
		Thread.sleep(1000);
		for (int i = 1; i <= 5; i++) {
			addRolesButton.click();
		}
	}

	public void AssertDetailsOnCandidateProfile(String Username, String CandidateEmail, String profiletitle,
			String Name, String ContactNumber, String Designation, String Date, String Gender, String OnNoticePeriod,
			String NoticePeriod, String LastWorkingDay, String experience, String CTC, String expectedCTC,
			String Country, String City, String CityArea, String ZipCode, String Communicationmode, String relocate)
			throws InterruptedException {		
		
		String tt= "";
		
		String candidateEmail = CandidateEmail.strip().toLowerCase();
		System.out.println("Candidate-Email==> "+candidateEmail);
		System.out.println("Actual candEmail=> "+addcandidatepage.emailField.getAttribute("value").strip());
		
		if(addcandidatepage.emailField.isDisplayed())
		{
			Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"),CandidateEmail.strip().toLowerCase());	
		}
		
		//Assert.assertEquals(addcandidatepage.emailField.getAttribute("value"),CandidateEmail.strip().toLowerCase());
		Assert.assertEquals(addcandidatepage.contactNumber.getAttribute("value"), ContactNumber);
		Assert.assertEquals(this.dateOfBirth.getAttribute("value"), Date);
		se = new Select(this.countryId);
		WebElement option = se.getFirstSelectedOption();
		Assert.assertEquals(option.getText().strip(), Country);
		Assert.assertEquals(this.cityArea.getAttribute("value").toLowerCase(), CityArea.toLowerCase());
		Assert.assertEquals(addcandidatepage.name.getAttribute("value").toLowerCase(), Name.strip().toLowerCase());
		Assert.assertEquals(addcandidatepage.gender.getAttribute("value"), Gender);
		Assert.assertEquals(addcandidatepage.city.getAttribute("value").toLowerCase(), City.strip().toLowerCase());
		Assert.assertEquals(addcandidatepage.zipCode.getAttribute("value"), ZipCode);
		Assert.assertEquals(this.currentDesignation.getAttribute("value").toLowerCase(), Designation.strip().toLowerCase());
		//Assert.assertEquals(addcandidatepage.industry.getAttribute("value"),addjobpage.industryname);
		Assert.assertEquals(addcandidatepage.experienceInYears.getAttribute("value"), experience);
		Assert.assertEquals(addcandidatepage.expectedCTC.getAttribute("value"), expectedCTC);
		select = new Select(addcandidatepage.onNoticePeriod);
		Assert.assertEquals(select.getFirstSelectedOption().getText(), OnNoticePeriod);
		if (OnNoticePeriod.contentEquals("Yes")) {
			Assert.assertEquals(addcandidatepage.lastWorkingDay.getAttribute("value"), LastWorkingDay);
		} else {
			Assert.assertEquals(addcandidatepage.noticePeriod.getAttribute("value"), NoticePeriod);
		}
		Assert.assertEquals(addcandidatepage.ctc.getAttribute("value"), CTC);
		se = new Select(addcandidatepage.communicationMode);
		WebElement communication = se.getFirstSelectedOption();
		Assert.assertEquals(communication.getText().toLowerCase(), Communicationmode.strip().toLowerCase());
		se = new Select(this.readyToRelocate);
		Assert.assertEquals(se.getFirstSelectedOption().getText().toLowerCase(), relocate.strip().toLowerCase());
	}

	public void AssertSkillonSkillAndRolesTab(String Skill1, String Skill2, String Skill3, String level1, String level2,
			String level3, String certificate1, String certificate2, String certificate3, String certificateforskill1,
			String certificateforskill2, String Designation) throws InterruptedException {

		this.clickonskillsInformation();
		Thread.sleep(4000);
		Assert.assertEquals(this.skills.get(0).getAttribute("value"), Skill1);
		Assert.assertEquals(this.skills.get(1).getAttribute("value"), Skill2);
		Assert.assertEquals(this.skills.get(2).getAttribute("value"), Skill3);
		select = new Select(this.expertiselevel.get(0));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " " + level1 + " ");
		select = new Select(this.expertiselevel.get(1));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " " + level2 + " ");
		select = new Select(this.expertiselevel.get(2));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), " " + level3 + " ");
		if (certificate1.contentEquals("Yes")) {
			Assert.assertEquals(addcandidatepage.certificate.get(0).getAttribute("value"), certificateforskill1);
		}
		if (certificate2.contentEquals("Yes")) {
			Assert.assertEquals(addcandidatepage.certificate.get(1).getAttribute("value"), certificateforskill2);
		}
		if (certificate3.contentEquals("Yes")) {
			Assert.assertEquals(addcandidatepage.certificate.get(2).getAttribute("value"), certificateforskill1);
		}
		Assert.assertEquals(this.role.getAttribute("value"), Designation);

	}

	public void addQualificationDetails(DataTable credentials) throws InterruptedException {
		int i = 0;

		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < degree.size()) {
				major.get(i).sendKeys(data.get("Major"));
				year.get(i).sendKeys(data.get("year"));
				grade.get(i).sendKeys(data.get("grade"));
				college.get(i).sendKeys(data.get("college"));
				university.get(i).sendKeys(data.get("university"));
				Country.get(i).sendKeys(data.get("country"));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='" + data.get("country") + "']")).click();

			}
			i++;
		}
	}

	public void fillWorkExperienceDetails(DataTable credentials) throws InterruptedException {
		int i = 0;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < organization.size()) {
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
				driver.findElement(By.xpath("//span[text()='" + data.get("country") + "']")).click();
			}
			i++;
		}
	}

	public void fillAllskillsAndDesignationDetails(String currentdesignation, DataTable credentials)
			throws InterruptedException {
		int i = 0;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < skills.size()) {
				skills.get(i).sendKeys(data.get("skill"));
				expertiselevel.get(i).sendKeys(data.get("Expertiselevel"));
				certificate.get(i).sendKeys(data.get("certificate"));
			}
			i++;
		}
		Assert.assertEquals(addcandidatepage.designation.get(0).getAttribute("value"), currentdesignation);
	}

	public void fillAllCertificateDetails(DataTable credentials) throws InterruptedException {
		int i = 0;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < certificate.size()) {
				certificate.get(i).sendKeys(data.get("certificate"));
				this.year.get(i).sendKeys(data.get("year"));
				grade.get(i).sendKeys(data.get("grade"));
				this.issuingAuthority.get(i).sendKeys(data.get("issuing Authority"));
				Country.get(i).sendKeys(data.get("country"));
				explicitwait.until(ExpectedConditions.elementToBeClickable(
						driver.findElement(By.xpath("//span[text()='" + data.get("country") + "']"))));
				driver.findElement(By.xpath("//span[text()='" + data.get("country") + "']")).click();

			}
			i++;
		}

	}

	public void fillAllLanguageDetails(DataTable credentials) throws InterruptedException {
		int i = 0;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < certificate.size()) {
				language.get(i).sendKeys(data.get("language"));
				proficiency.get(i).sendKeys(data.get("proficiency"));
				certificate.get(i).sendKeys(data.get("certificate"));
			}
			i++;
		}

	}

	public void fillAllVisaDetails(DataTable credentials) throws InterruptedException {
		int i = 0;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < visaType.size()) {
				Thread.sleep(1000);
				date.get(i).click();
				common.enterdate(data.get("ValidUpto"));
				visaType.get(i).sendKeys(data.get("VisaType"));
				Country.get(i).sendKeys(data.get("country"));
				explicitwait.until(ExpectedConditions.elementToBeClickable(
						driver.findElement(By.xpath("//span[text()='" + data.get("country") + "']"))));
				driver.findElement(By.xpath("//span[text()='" + data.get("country") + "']")).click();
			}
			i++;
		}
	}

	public void fillAllExperirenceDetails(DataTable credentials) throws InterruptedException {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			Thread.sleep(2000);
			this.date.get(0).click();
			common.enterdate(data.get("fromDate"));
			Thread.sleep(2000);
			this.date.get(1).click();
			common.enterdate(data.get("toDate"));
			candidateupdateprofilepage.title.sendKeys(data.get("title"));
			this.organization.get(0).sendKeys(data.get("organization"));
			this.technologies.sendKeys(data.get("technologies"));
			this.client.sendKeys(data.get("client"));
		}
	}

	public void fillAllTrainingDetails(DataTable credentials) throws InterruptedException {
		int i = 0;

		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < this.TotalExperience.size()) {
				driver.findElements(By.xpath("//input[@id='Title']")).get(i).sendKeys(data.get("title1"));
				TotalExperience.get(i).sendKeys(data.get("experirence"));
				remark.get(i).sendKeys(data.get("reamrk1"));
				attendedIn.get(i).sendKeys(data.get("attendedYear"));
			}
			i++;
		}

		int j = i;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (j <= this.remark.size()) {
				driver.findElements(By.xpath("//input[@id='Title']")).get(j).sendKeys(data.get("title2"));
				remark.get(j).sendKeys(data.get("remark2"));
			}
			j++;
		}
	}

	public void fillAllSocialLinkDetails(DataTable credentials) throws InterruptedException {
		int i = 0;
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			if (i < this.link.size()) {
				driver.findElements(By.xpath("//input[@id='Title']")).get(i).sendKeys(data.get("title"));
				link.get(i).sendKeys(data.get("link"));

			}
			i++;
		}
	}

	public void fillAllAdditinalDetails() throws InterruptedException {
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
		textArea.clear();
		textArea.sendKeys(prop.getProperty("declaration"));
		common.clickOnSaveBtn();
		common.clickOnOKBtn();
	}
}