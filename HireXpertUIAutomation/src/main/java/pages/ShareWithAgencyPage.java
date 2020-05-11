package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ShareWithAgencyPage extends baseclass {
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[4]/label/span")
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-sharejob/div[3]/button")
	public WebElement closeButton;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[5]/label/span")
	public WebElement blockUnblockCheckbox;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonConfirmation;
	
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
		
		String expectedEmail = prop.getProperty("agencyemail");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	

}
