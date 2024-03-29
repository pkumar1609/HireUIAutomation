package pages;

import java.time.format.DateTimeFormatter;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilPackage.baseclass;

public class RegisterPage extends baseclass { // HomePage.java class is child of Testbase.java Class

	public static String registerdName;
	public static String registerdEmail;
	public static String registerdContact;

	@FindBy(linkText = "Register")
	WebElement Registerlink;

	@FindBy(xpath = "//li[@id='login']")
	public WebElement loginlink;

	@FindBy(linkText = " Employer-Agency Sign In")
	public WebElement EmployerAgencySignInlink;

	@FindBy(linkText = "Job Seeker(Candidate) Sign In")
	public WebElement JobseekerCandidateSignInlink;

	@FindBy(xpath = "//input[@formcontrolname='Name']")
	WebElement Name;

	@FindBy(xpath = "//input[@formcontrolname='Email']")
	WebElement Email;

	@FindBy(xpath = "//input[@formcontrolname='ContactNumber']")
	WebElement ContactNumber;

	@FindBy(xpath = "//select[@formcontrolname='UserType']")
	WebElement UserType;

	@FindBy(xpath = "//select[@formcontrolname='TimeZone']")
	WebElement TimeZone;

	@FindBy(xpath = "//select[@formcontrolname='countryId']")
	WebElement Country;

	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement Submitbtn;

	@FindBy(xpath = "//button[@id='alertModalCloseBtn']")
	WebElement OKbtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/newuser/div[3]/button[1]")
	WebElement Closebtn;
	// button[@type='button' and @class='btn btn-outline-dark']
	/// html/body/ngb-modal-window/div/div/newuser/div[3]/button[1]

	@FindBy(id = "confirmModalBtn")
	WebElement Yesbtn;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement Password;

	@FindBy(xpath = "//input[@placeholder='Email address']")
	public WebElement Emailaddress;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	public WebElement Signinbtn;

	// Initializing the Page objects

	public RegisterPage() { // constructor
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void FillAllregisterdeatils(String Name, String CandidateEmail, String ContactNumber, String UserType,
			String timezone, String country) throws Throwable {

		registerpage.registerCandidatedetails(Name, CandidateEmail, ContactNumber);
		registerpage.registerUserdetails(UserType, timezone, country);
		common.ClickSumbit();
		common.clickOnConfirmYes();
		try {
			common.clickOnOKBtn();
		} catch (NoSuchElementException e) {
			common.clickOnCloseBtn();
			common.clickOnConfirmYes();
		}
	}

	public void clickRegister() throws InterruptedException {

		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", Registerlink);
	}

	public void clickLogin() {
		executor.executeScript("arguments[0].click();", loginlink);
	}

	public void clickEmployerAgencySignInlink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(loginlink).click().perform();
		Thread.sleep(4000);
		EmployerAgencySignInlink.click();
	}

	public void clickJobseekerCandidateSignInlinklink() {

		JobseekerCandidateSignInlink.click();
	}

	public void enterName(String EmployerName) {

		Name.sendKeys(EmployerName);
	}

	public void enterEmail(String EmployerEmail) {
		Email.sendKeys(EmployerEmail);
	}

	public void enterContactNumber(String EmployerContactNumber) {

		ContactNumber.sendKeys(EmployerContactNumber);
	}

	public void registerUser() {
		DateTimeFormatter Contactformate = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
		registerdName = dtFormate.format(currentTime) + "abc";
		Name.sendKeys(registerdName);
		registerdEmail = dtFormate.format(currentTime) + "@gmail.com";
		Email.sendKeys(registerdEmail);
		registerdContact = Contactformate.format(currentTime);
		ContactNumber.sendKeys(registerdContact);
	}

	public void registeremployerdetails(String EmployerName, String EmployerEmail, String EmployerContactNumber) {

		Name.sendKeys(EmployerName);
		Email.sendKeys(EmployerEmail);
		ContactNumber.sendKeys(EmployerContactNumber);
	}

	public void registerAgencydetails(String AgencyName, String AgencyEmail, String AgencyContactNumber) {

		Name.sendKeys(AgencyName);
		Email.sendKeys(AgencyEmail);
		ContactNumber.sendKeys(AgencyContactNumber);
	}

	public void registerCandidatedetails(String CandidateName, String CandidateEmail, String CandidateContactNumber) {

		Name.sendKeys(CandidateName);
		Email.sendKeys(CandidateEmail);
		ContactNumber.sendKeys(CandidateContactNumber);
	}

	public void alreadyregisterUserdetails(String name, String email, String contactnumber) {

		Name.sendKeys(name);
		Email.sendKeys(email);
		ContactNumber.sendKeys(contactnumber);
	}

	// Do not uncomment below code lines.
	public void registerUserdetails(String usertype, String timezone, String country) {

		Select select1 = new Select(UserType);
		select1.selectByVisibleText(usertype);

		Select select3 = new Select(Country);
		select3.selectByVisibleText(country);

		Select select2 = new Select(TimeZone);
		select2.selectByVisibleText(timezone);
	}

	public void enterEmployerEmailandPassword() throws InterruptedException {
		explicitwait.until(ExpectedConditions.visibilityOf(Emailaddress));
		Emailaddress.sendKeys(RegisterPage.registerdEmail);
		Password.sendKeys("12345");
	}

	public void enterAgencyEmailandPassword(String AgencyEmail, String password) {

		Emailaddress.clear();
		Emailaddress.sendKeys(AgencyEmail);
		Password.clear();
		Password.sendKeys(password);
	}

	public void enterCandidateEmailandPassword(String CandidateEmail, String password) {

		Emailaddress.clear();
		Emailaddress.sendKeys(CandidateEmail);
		Password.clear();
		Password.sendKeys(password);
	}

	public void ClickSubmitbtn() {
		Submitbtn.click();
	}

	public void Clickokbtn() {
		OKbtn.click();
	}

	public void Clickclosebtn() {
		Closebtn.click();
	}

	public void verifythefieldsonregisterdialogbox() {

		if ((Name).isDisplayed()) {
			System.out.println("Name Element is Visible");
		} else {
			System.out.println("Name Element is InVisible");
		}
		if ((Email).isDisplayed()) {
			System.out.println("Email Element is Visible");
		} else {
			System.out.println("Email Element is InVisible");
		}
		if ((ContactNumber).isDisplayed()) {
			System.out.println("Contact Number Element is Visible");
		} else {
			System.out.println("Contact Number Element is InVisible");
		}
		if ((UserType).isDisplayed()) {
			System.out.println("User Type Element is Visible");
		} else {
			System.out.println("User Type Element is InVisible");
		}
		if ((TimeZone).isDisplayed()) {
			System.out.println("TimeZone Element is Visible");
		} else {
			System.out.println("TimeZone Element is InVisible");
		}
		if ((Country).isDisplayed()) {
			System.out.println("Country Element is Visible");
		} else {
			System.out.println("Country Element is InVisible");
		}
	}

	public void ClickYesbtn() {
		Yesbtn.click();
	}

	public void enteremailaddress(String emailaddress2) {
		Emailaddress.sendKeys(emailaddress2);
	}

	public void enterpassword(String password) {
		Password.sendKeys(password);
	}

	public void Loginwithemployernewpassword(String newpassword) {

		Emailaddress.sendKeys(registerdEmail);
		Password.sendKeys(newpassword);
	}

	public void Loginwithemployeroldpassword(String password) {

		Emailaddress.sendKeys(registerdEmail);
		Password.sendKeys(password);
	}

	public void Loginwithagencynewpassword(String newpassword) {
		Emailaddress.sendKeys(registerdEmail);
		Password.sendKeys(newpassword);
	}

	public void Loginwithagencyoldpassword(String AgencyEmail, String password) {
		Emailaddress.sendKeys(AgencyEmail);
		Password.sendKeys(password);
	}

	public void loginwithsamecandidate() {
		Emailaddress.sendKeys("candidate01@gmail.com");
		Password.sendKeys("12345");
		Signinbtn.click();
	}

	public void loginwithnewcandidate(String CandidateEmail, String password) throws InterruptedException {
		Emailaddress.sendKeys(CandidateEmail);
		Password.sendKeys(password);
		Thread.sleep(2000);
		Signinbtn.click();
	}

	public void employerlogin() {
		Emailaddress.sendKeys("pemp@gmail.com");
		Password.sendKeys("12345");
		Signinbtn.click();
	}

	public void employerloginforAddCandidate() {
		Emailaddress.sendKeys(prop.getProperty("employerusername"));
		Password.sendKeys(prop.getProperty("password"));
		Signinbtn.click();
	}

	public void agencylogin() {
		Emailaddress.sendKeys(prop.getProperty("agencyusername"));
		Password.sendKeys(prop.getProperty("password"));
		Signinbtn.click();
	}

	public void ClickSigninbtn() {
		executor.executeScript("arguments[0].click();", loginpage.signin);
	}

	public void loginwithEmployerTeamMember() {

		Emailaddress.sendKeys("teamemployermain01@gmail.com");
		Password.sendKeys("12345");
		Signinbtn.click();
	}

	public void loginwithAgencyTeamMember() {
		Emailaddress.sendKeys("agencymain02@gmail.com");
		Password.sendKeys("12345");
		Signinbtn.click();
	}

	public void registerAgency() throws InterruptedException {
		registerpage.clickRegister();
		registerpage.registerUser();
		registerpage.registerUserdetails("Agency", "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi", "India");
		common.ClickSumbit();
		common.clickOnConfirmYes();
		common.clickOnOKBtn();
	}
}
