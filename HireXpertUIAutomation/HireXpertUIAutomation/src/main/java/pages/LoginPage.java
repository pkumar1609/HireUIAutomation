package pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.baseclass;

public class LoginPage extends baseclass 
{
	
	@FindBy(linkText="Employer-Agency Sign In")
	public WebElement EmployerAgencySignInlink;
	
	@FindBy(linkText="Job Seeker(Candidate) Sign In")
	public WebElement JobseekerCandidateSignInlink;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	public WebElement emailaddress;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	public WebElement signin;
	
	@FindBy(xpath= "//a[@title='Agency']")
	public WebElement userbtn;
	
	@FindBy(xpath= "//a[@title='Employer']")
	public List<WebElement> userbtnemp;
	
	@FindBy(xpath= "//a[@title='Agency']")
	public List<WebElement> userbtnagy;
	
	@FindBy(xpath= "//a[@title='Candidate']")
	public List<WebElement> userbtnCandidate;
	
	@FindBy(xpath= "//a[@href='#']")
	private WebElement logedinusername;
	
	@FindBy(xpath = "//div[contains(@class,'tx-profile')]")
	public WebElement profile;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	public WebElement ChangePasswordTab;
	
	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	public WebElement updateProfile;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	public WebElement Logout;
	
	@FindBy(xpath = "//p[@class='error mb-1 pl-1 pr-1']") 
	public WebElement errormsg1;
	
	@FindBy(xpath = "//div[contains(text(),'Email is required.')]")
	public WebElement emailError;
	
	@FindBy(xpath = "//div[contains(text(),'Password is required.')]")
	public WebElement pwdError;
	
	@FindBy(xpath = "//li[@id='login']")
	public WebElement login;

	public String username;
	public String user;
	public boolean b;
	public String logedinuser;
	Actions Action = new Actions(driver);
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
		Action = new Actions(driver);
	    explicitwait=new WebDriverWait(driver,80);
	}
	
	public void  ClickOnEmployerAgencySigninLink() throws InterruptedException
	{
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
	
	public void signInAgency() {
		emailaddress.sendKeys(prop.getProperty("agencyemail"));
		password.sendKeys(prop.getProperty("password"));
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

	public void signInAgency2() {
		emailaddress.sendKeys(prop.getProperty("agencyemail2"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}
	
	public void signInCandidate() {
		emailaddress.sendKeys(prop.getProperty("candidateemail"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}
	
    public void login(String username) throws InterruptedException {
		
		emailaddress.sendKeys(username);
		password.sendKeys("12345");
		Thread.sleep(2000);
		signin.click();
//		try
//		{
//			common.clickOnOKBtn();
//		}
//		catch(NoSuchElementException e)
//		{}
	}
    
    public void loginIn(String Username, String Password) throws InterruptedException {
    	
		emailaddress.sendKeys(Username);
		password.sendKeys(Password);
		Thread.sleep(4000);
		signin.click();
//		if(common.okbtnPopup.size()>0)
//		{
//			common.clickOnOKBtn();
//		}
		identifyUserK();
		
	}
    
    public void loginInAppWithTeamK() throws InterruptedException
	{
		emailaddress.sendKeys("pe1@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(4000);
		signin.click();
//		common.clickOnCloseBtn();
		identifyUserK();
		
	}
	public void loginInAppWithEmpK() throws InterruptedException {
		emailaddress.sendKeys(prop.getProperty("loginid"));
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
//		try
//		{
//			common.clickOnOKBtn();
//		}
//		catch(NoSuchElementException e)
//		{}
//		common.clickOnCloseBtn();
		identifyUserK();
		
	}
	public void loginInAppWithAgyK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyid"));
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
//		try
//		{
//		common.clickOnOKBtn();
//		}
//		catch(NoSuchElementException e)
//		{}
		identifyUserK();
	}
	
	public void loginInAppWithAgy2K() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyid2"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		identifyUserK();
//		if(dashboardpage.jobPopup != null)
//		{
//			common.clickOnOKBtn();
//		}
	}
	 

	public void loginInAppWithSupport() throws InterruptedException
	{
		emailaddress.sendKeys("support@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		
	}
	
	
	public void loginInAppWithAgyTeamK() throws InterruptedException
	{
		emailaddress.sendKeys("pa1@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(3000);
		signin.click();
//		common.clickOnCloseBtn();
		identifyUserK();
	}
	 
	public void logoutFromAppK() throws InterruptedException
	{
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(profile));
		Action.moveToElement(profile).click().perform();
		executor.executeScript("arguments[0].click();",Logout);
		Thread.sleep(2000);
		common.logout.click();
	}
	
	public void identifyUserK() throws InterruptedException
	{
				Action.moveToElement(profile).perform();
				if(userbtnemp.size()>0)
				{
					logedinuser= userbtnemp.get(0).getText();
					Thread.sleep(2000);
					userbtnemp.get(0).click();
					b=true;
					user="employer";
				}
				if(userbtnagy.size()>0)
				{
					logedinuser= userbtnagy.get(0).getText();
					Thread.sleep(2000);
					userbtnagy.get(0).click();
					b=false;
					user="agency";
				}
				if(userbtnCandidate.size()>0)
				{
					System.out.println("candidate");
					logedinuser= userbtnCandidate.get(0).getText();
					System.out.println("candidate :"+logedinuser);
					userbtnCandidate.get(0).click();
					user="candidate";	
				}

	}
}
