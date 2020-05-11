package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilPackage.baseclass;

public class LoginPage extends baseclass {
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	public WebElement emailaddress;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")
	public WebElement signin;
	
	@FindBy(xpath= "//a[@title='Agency']")
	public WebElement userbtn;
	
	@FindBy(xpath= "//a[@title='Employer']")
	public WebElement userbtnemp;
	
	@FindBy(xpath= "//a[@href='#']")
	private WebElement logedinusername;
	
	@FindBy(xpath = "//img[contains(@class,'profile')]")
	public WebElement profile;
	
	@FindBy(xpath="//a[contains(text(),'Change Password')]")
	public WebElement ChangePasswordTab;
	
	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	public WebElement updateProfile;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	public WebElement Logout;
	
	public String username;
	public String user;
	public boolean b;
	String logedinuser;
	Actions Action = new Actions(driver);
	WebDriverWait explicitwait = new WebDriverWait(driver,80);
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		Action = new Actions(driver);
	    explicitwait=new WebDriverWait(driver,80);
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
	
	public void signInTeam() {
		emailaddress.sendKeys(prop.getProperty("teamemail"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}
	
	public void signInAgencyTeam() {
		emailaddress.sendKeys(prop.getProperty("agencyteamemail"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}
	
	public void signInCandidate() {
		emailaddress.sendKeys(prop.getProperty("candidateemail"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}
	
	public void loginInAppWithEmpK() {
		
		emailaddress.sendKeys(prop.getProperty("loginid"));
		password.sendKeys(prop.getProperty("pwd"));
//		explicitwait.until(ExpectedConditions.elementToBeClickable(login));
//		Thread.sleep(2000);
		signin.click();
	}
	
	public void loginInAppWithAgyK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyid"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		
	}
	public void loginInAppWithAgy2K() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyid2"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",signin);
		
	}
	
	public void loginInAppWithTeamK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("teamid"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(2000);
		signin.click();
	}
	
	public void loginInAppWithAgyTeamK() throws InterruptedException
	{
		emailaddress.sendKeys(prop.getProperty("agyteamid"));
		password.sendKeys(prop.getProperty("pwd"));
		Thread.sleep(1000);
		signin.click();
	}
	
	public void logoutFromAppK() throws InterruptedException
	{
		explicitwait.until(ExpectedConditions.elementToBeClickable(profile));
		Action.moveToElement(profile).click().perform();
		executor.executeScript("arguments[0].click();",Logout);

	}
	
	public void identifyUserK() throws InterruptedException
	{
		try {		
			Action.moveToElement(loginpage.profile).perform();
			Thread.sleep(2000);
			b= loginpage.userbtnemp.isDisplayed();
			Thread.sleep(2000);
			executor.executeScript("arguments[0].click();",userbtnemp);
			logedinuser= logedinusername.getText();
			System.out.println(logedinuser);
			}
			catch(NoSuchElementException e)
			{
				b=false;
				logedinuser= logedinusername.getText();
				System.out.println(logedinuser);
			}
			 
		}
	
}
