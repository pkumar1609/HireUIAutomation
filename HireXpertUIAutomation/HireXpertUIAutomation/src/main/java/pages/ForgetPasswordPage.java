package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ForgetPasswordPage  extends baseclass {
	

	@FindBy(linkText="Forgot Password")
	 public WebElement ForgotPasswordLink;
	
	@FindBy(xpath="//input[@formcontrolname='Email']")
	 WebElement LoginEmailField;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement SubmitBtn;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	 public WebElement OKBtn;
	
     public ForgetPasswordPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void EnterNonregisteredEmailid(String emailid) {
		
		LoginEmailField.sendKeys(emailid);
	}
	
	
}
