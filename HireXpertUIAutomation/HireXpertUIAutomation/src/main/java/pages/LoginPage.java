package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.baseclass;

public class LoginPage extends baseclass {

	@FindBy(linkText = "Employer-Agency Sign In")
	public WebElement EmployerAgencySignInlink;

	@FindBy(linkText = "Job Seeker(Candidate) Sign In")
	public WebElement JobseekerCandidateSignInlink;

	@FindBy(xpath = "//input[@placeholder='Email address']")
	public WebElement emailaddress;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement password;

	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	public WebElement signin;

	@FindBy(xpath = "(//div[@id='ProfileDropDown']//button)[1]")
	public WebElement loggedInUser;

	@FindBy(xpath = "//a[@title='Employer']")
	public List<WebElement> employer;

	@FindBy(xpath = "//a[@title='Agency']")
	public List<WebElement> agency;

	@FindBy(xpath = "//a[@title='Candidate']")
	public List<WebElement> candidate;

	@FindBy(xpath = "//a[@href='#']")
	private WebElement logedinusername;

	@FindBy(xpath = "//button[contains(text(),'My Account')]")
	public WebElement myAccount;

	@FindBy(xpath = "//a[contains(text(),'Change Password')]")
	public WebElement ChangePasswordTab;

	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	public WebElement updateProfile;

//	@FindBy(xpath = "//button[contains(text(),'Log Out')]")
//	public WebElement LogOut;
//	
//	@FindBy(xpath = "//button[contains(text(),'Logout')]")
//	public WebElement logout;

	@FindBy(xpath = "//button[contains(text(),'Log Out')]")
	public WebElement Logout;
	
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	public WebElement logOut1;
	
	@FindBy(xpath = "//p[@class='error mb-1 pl-1 pr-1']")
	public WebElement errormsg1;

	@FindBy(xpath = "//div[contains(text(),'Email is required.')]")
	public WebElement emailError;

	@FindBy(xpath = "//div[contains(text(),'Password is required.')]")
	public WebElement pwdError;

	@FindBy(xpath = "//li[@id='login']")
	public WebElement login;

	public String username;
	public String user = null;
	public boolean b = false;
	public String logedinuser;
	Actions Action = new Actions(driver);
	WebDriverWait explicitwait = new WebDriverWait(driver, 80);

	public LoginPage() {

		PageFactory.initElements(driver, this);

		Action = new Actions(driver);
		explicitwait = new WebDriverWait(driver, 80);
	}

	public void ClickOnEmployerAgencySigninLink() throws InterruptedException {
		Thread.sleep(2000);
		Action.moveToElement(login).click().perform();
		Thread.sleep(1000);
//		EmployerAgencySignInlink.click();
		executor.executeScript("arguments[0].click();", EmployerAgencySignInlink);
	}

	public String validateTitle() {

		return driver.getTitle();
	}

	public void signInEmployer() {

		emailaddress.sendKeys(prop.getProperty("employeremail"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}

	public void signInAgency() throws InterruptedException {
		loginpage.ClickOnEmployerAgencySigninLink();
		emailaddress.sendKeys(prop.getProperty("agency"));
		password.sendKeys(prop.getProperty("12345"));
		signin.click();
	}

	public void signInAgency1() {
		emailaddress.sendKeys(prop.getProperty("agencyemail1"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}

	public void signInAgencyTeam() {
		emailaddress.sendKeys(prop.getProperty("agencyteamemail"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}

//	public void signInAgency2() {
//		emailaddress.sendKeys(prop.getProperty("agencyemail2"));
//		password.sendKeys(prop.getProperty("password"));
//		signin.click();
//	}

//	public void signInCandidate() {
//		emailaddress.sendKeys(prop.getProperty("candidateemail"));
//		password.sendKeys(prop.getProperty("password"));
//		signin.click();
//	}

	public void login(String username) throws InterruptedException {
		emailaddress.sendKeys(username);
		password.sendKeys("12345");
		Thread.sleep(2000);
		signin.click();
	}

	public void loginInNew(String Username, String Password) throws InterruptedException {
		emailaddress.sendKeys(Username);
		password.sendKeys(Password);
		Thread.sleep(4000);
		signin.click();
	}

	public void loginIn(String Username, String Password) throws InterruptedException {
		emailaddress.sendKeys(Username);
		password.sendKeys(Password);
		Thread.sleep(4000);
		signin.click();
		identifyUserK();
	}

	public void loginInAppWithTeamK() throws InterruptedException {
		emailaddress.sendKeys("pe1@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(4000);
		signin.click();
//		common.clickOnCloseBtn();
		identifyUserK();

	}

	public void loginInAppWithEmpK() throws InterruptedException {
		emailaddress.sendKeys(prop.getProperty("employer"));
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", signin);
		identifyUserK();

	}

	public void loginInAppWithAgyK() throws InterruptedException {
		emailaddress.sendKeys(prop.getProperty("agency"));
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", signin);
//		try
//		{
//		common.clickOnOKBtn();
//		}
//		catch(NoSuchElementException e)
//		{}
		identifyUserK();
	}

	public void loginInAppWithAgy2K() throws InterruptedException {
		emailaddress.sendKeys(prop.getProperty("agyid2"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", signin);
		identifyUserK();
//		if(dashboardpage.jobPopup != null)
//		{
//			common.clickOnOKBtn();
//		}
	}

	public void loginInAppWithSupport() throws InterruptedException {
		emailaddress.sendKeys("support@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", signin);

	}

	public void loginInAppWithAgyTeamK() throws InterruptedException {
		emailaddress.sendKeys("pa1@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(3000);
		signin.click();
//		common.clickOnCloseBtn();
		identifyUserK();
	}
	
	public void loginInAsVendor(String Username, String Password) throws InterruptedException {
		emailaddress.sendKeys(Username);
		password.sendKeys(Password);
		Thread.sleep(4000);
		signin.click();
	}
	

	public void logoutFromAppK() throws InterruptedException {
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(myAccount));
		Action.moveToElement(myAccount).click().perform();
		executor.executeScript("arguments[0].click();", Logout);
		
	}
	
	
	public void logoutFromAppKnew() throws InterruptedException {
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(myAccount));
		Action.moveToElement(myAccount).click().perform();
		executor.executeScript("arguments[0].click();", Logout);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", logOut1);

		// executor.executeScript("arguments[0].click();", common.logout);logout
	}
	

	public void identifyUserK() throws InterruptedException {
		explicitwait.until(ExpectedConditions.visibilityOf(myAccount));
		Action.moveToElement(myAccount).click().perform();
		String loggedUser = loggedInUser.getAttribute("title");
		switch (loggedInUser.getAttribute("title")) {
		case "Employer":
			b = true;
			user = "employer";
			break;
		case "Agency":
			b = false;
			user = "agency";
			break;
		case "Candidate":
			user = "candidate";
			break;
		}

	}
}
