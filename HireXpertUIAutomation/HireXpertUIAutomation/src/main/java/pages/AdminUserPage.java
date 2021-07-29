package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class AdminUserPage extends baseclass {

	@FindBy(xpath = "//a[contains(text(),'New User')]")
	private WebElement adminNewUserMenu;

	@FindBy(xpath = "//h5[contains(text(),'Add Member')]") //
	private WebElement adminAddMemberPopUp;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	private WebElement enterName;

	@FindBy(xpath = "//input[@placeholder='Enter Email']")
	private WebElement enterEmail;

	@FindBy(xpath = "//input[@placeholder='Enter Contact Number']")
	private WebElement enterContactNumber;

	@FindBy(xpath = "//select[@formcontrolname='UserType']")
	private WebElement userType;

	@FindBy(xpath = "//select[@formcontrolname='countryId']")
	private WebElement country;

	@FindBy(xpath = "//select[@formcontrolname='TimeZone']")
	private WebElement timezone;

	public AdminUserPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getadminNewUserMenu() {
		return adminNewUserMenu;
	}
	
	public boolean checkAdminAddMemberPopUp() {
		if (adminAddMemberPopUp.isDisplayed())
			return true;
		return false;
	}

	public WebElement getName() {
		return enterName;
	}

	public WebElement getEmail() {
		return enterEmail;
	}

	public WebElement getContactNumber() {
		return enterContactNumber;
	}

	public WebElement getUserType() {
		return userType;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getTimezone() {
		return timezone;
	}

}
