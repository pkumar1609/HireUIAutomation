package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class AgenciesPage extends baseclass {
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-list-jobprovider/div[1]/h5/button[2]")
	public WebElement addAgencyButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[1]/input")
	public WebElement agencyName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[2]/input")
	public WebElement agencyEmail;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[3]/input")
	public WebElement agencyContactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement submitButton;
	
	public AgenciesPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAddButton() {
		
		addAgencyButton.click();
	}
	
	public void fillAgencyDetailsAddButton() {
		
		agencyName.sendKeys("AMB6 Agency");
		agencyEmail.sendKeys("amb6@gmail.com");
		agencyContactNumber.sendKeys("245551465");
	}


}
