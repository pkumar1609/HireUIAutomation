package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class LoginPage extends baseclass {
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	public WebElement emailaddress;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath="//button[@class='btn w-100 Cbtn-primary mt-1 text-left CustomPointer']")
	public WebElement signin;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String validateTitle() {
		
		return driver.getTitle();
	}
	
	public void signInButton() {
		
		emailaddress.sendKeys(prop.getProperty("invalidemail"));
		password.sendKeys(prop.getProperty("invalidpwd"));
		signin.click();
	}
	
	public void signInButton1() {
		emailaddress.sendKeys(prop.getProperty("validemail"));
		password.sendKeys(prop.getProperty("invalidpwd"));
		signin.click();
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
	
	

}
