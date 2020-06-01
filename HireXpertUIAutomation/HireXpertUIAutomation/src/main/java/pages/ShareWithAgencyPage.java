package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ShareWithAgencyPage extends baseclass {
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "//td[4]//label[1]//input[1]")
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "//td[5]//label[1]//span[1]")
	public WebElement blockUnblockCheckbox;
	
	public ShareWithAgencyPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void searchAgency() {
		
		String expectedEmail = prop.getProperty("agencyemail1");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void searchAgencyOwner() {
		
		String expectedEmail = prop.getProperty("agencyemail2");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	

}
