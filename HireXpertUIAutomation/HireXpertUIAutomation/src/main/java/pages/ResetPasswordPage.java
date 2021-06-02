	package pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;

	import utilPackage.baseclass;

	public class ResetPasswordPage extends baseclass {

		@FindBy(xpath = "//button[contains(text(),'My Account')]")
		public WebElement myAccount;

		@FindBy(xpath="//button[contains(text(),'Change Password')]")
		public WebElement ChangePasswordTab;

		@FindBy(xpath = "//div//h5[contains(text(),'Change Password')]")
		public WebElement ChangePasswordWin;

		@FindBy(xpath = "//input[@placeholder='Current Password']")
		public WebElement CurrentPassword;
		
		@FindBy(xpath = "//input[@placeholder='New Password']")
		public WebElement NewPassword;
		
		@FindBy(xpath = "//input[@placeholder='Confirm Password']")
		public WebElement ConfirmPassword;
		
		@FindBy(xpath = "//button[contains(text(),'Submit')]")
		public WebElement btnSubmit;
		
		@FindBy(xpath = "//div//h6[contains(text(),'Your password has been successfully updated.')]")
		public WebElement popSucess;
		
		@FindBy(xpath = "//button[contains(text(),'OK')]")
		public WebElement btnOK;

		@FindBy(xpath = "//div//h5[contains(text(),'Rate Us')]")
		public WebElement winRateUS;
		
		@FindBy(xpath="//button[contains(text(),'Logout')]")
		public WebElement Logout;
		
		@FindBy(xpath="//div//h3[contains(text(),'Welcome')]")
		public WebElement winWelcome;
		
		@FindBy(xpath = "//div//p[contains(text(),'Wrong password. Please use forgot password link to reset your password.')]")
		public WebElement lnkWrongPassword;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		public WebElement password;
		public ResetPasswordPage() 
		{
			super();
			PageFactory.initElements(driver, this);
		}
		public  void clickOnMyAccount() throws Throwable{
			Thread.sleep(2000);
			executor.executeScript("arguments[0].click();",myAccount);
			//myAccount.click();
		}
		public void clickOnChangePassword() throws Throwable {
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();",ChangePasswordTab);
			Thread.sleep(2000);

		}
		public void txtCurrentPassword(String curPassword) {

			CurrentPassword.sendKeys(curPassword);
			
		}
		
		public void txtNewPassword(String nPassword) {

			NewPassword.sendKeys(nPassword);
		}

		public void txtConfirmPassword(String conPassword) {

			ConfirmPassword.sendKeys(conPassword);
		}
		
		public void clickOnSubmit() throws Throwable {
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();",btnSubmit);
			Thread.sleep(2000);

		}
		
		public void clickOnOK() throws Throwable {
			Thread.sleep(3000);
			executor.executeScript("arguments[0].click();",btnOK);
			Thread.sleep(2000);

		}
//			Action.moveToElement(dashboardpage.recruitment).click().perform();














	
			

}
