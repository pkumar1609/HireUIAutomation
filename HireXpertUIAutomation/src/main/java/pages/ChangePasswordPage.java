package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ChangePasswordPage extends baseclass {
	
	@FindBy(xpath="//input[@placeholder='Current Password']")
	 WebElement CurrentPassword;
	
	@FindBy(xpath="//input[@placeholder='New Password']")
	 WebElement NewPassword;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	 WebElement ConfirmPassword;
	
	public ChangePasswordPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void EnterCurrentPassword (String password) {
	 	   
    	CurrentPassword.clear();
    	CurrentPassword.sendKeys(password);
	}
    
   public void EnterNewPassword (String newpassword) {
	   
	  NewPassword.clear();
	  NewPassword.sendKeys(newpassword);
   }
   
   public void EnterConfirmPassword (String confirmpassword) {
	   
	ConfirmPassword.clear();
	ConfirmPassword.sendKeys(confirmpassword);
   }

}
