package pages;

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
	public WebElement userbtnemp;
	
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
//		this.driver = driver;
		
		Action = new Actions(driver);
	    explicitwait=new WebDriverWait(driver,80);
	}
	
	public void  ClickOnEmployerAgencySigninLink() throws InterruptedException
	{
		
		action.moveToElement(login).click().perform();
		Thread.sleep(4000);
		EmployerAgencySignInlink.click();
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
	
    public void loginInAppWithEmpK() throws InterruptedException {
		
		emailaddress.sendKeys(prop.getProperty("loginid"));
		password.sendKeys(prop.getProperty("pwd"));
//		explicitwait.until(ExpectedConditions.elementToBeClickable(signin));
		Thread.sleep(4000);
		signin.click();
		identifyUserK();
	}
    
    public void loginIn(String Username, String Password) throws InterruptedException {
		
		emailaddress.sendKeys(Username);
		password.sendKeys(Password);
		Thread.sleep(4000);
		signin.click();
		identifyUserK();
	}
    
    public void loginInAppWithTeamK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("teamid"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(4000);
		signin.click();
		identifyUserK();
	}
	
	public void loginInAppWithTeam2(String teamid2) throws InterruptedException
	{
		emailaddress.sendKeys(teamid2);
		password.sendKeys("12345");
		Thread.sleep(4000);
		signin.click();
		identifyUserK();
	}
	
	public void loginInAppWithAgyK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyid"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		identifyUserK();
	}
	
	public void loginInAppWithAgy2K() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyid2"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		identifyUserK();
	}
	
//	public void loginInAppWithAgyTeam2() throws InterruptedException
//	{
//		emailaddress.sendKeys(prop.getProperty("agyteamid2"));
//		password.sendKeys(prop.getProperty("pwd"));
//		Thread.sleep(2000);
//		executor.executeScript("arguments[0].click();",signin);
//		identifyUserK();
//	}
	
	public void loginInAppWithSupport() throws InterruptedException
	{
		emailaddress.sendKeys("support@gmail.com");
		password.sendKeys("12345");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		
	}
	
	
	public void loginInAppWithAgyTeamK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyteamid"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(1000);
		signin.click();
		identifyUserK();
	}
	 
	public void logoutFromAppK() throws InterruptedException
	{
		Thread.sleep(2000);
		explicitwait.until(ExpectedConditions.elementToBeClickable(profile));
		Action.moveToElement(profile).click().perform();
		executor.executeScript("arguments[0].click();",Logout);

	}
	
	public void identifyUserK() throws InterruptedException
	{
		    try {
				Action.moveToElement(profile).perform();
				Thread.sleep(2000);
				userbtnemp.isDisplayed();		
				Thread.sleep(2000);
				logedinuser= logedinusername.getText();
				logedinusername.click();
				b=true;
		
			}
			catch(NoSuchElementException e)
			{
				b=false;
				logedinuser= logedinusername.getText();
				Thread.sleep(2000);
				logedinusername.click();	
			}
			  
	}

}
