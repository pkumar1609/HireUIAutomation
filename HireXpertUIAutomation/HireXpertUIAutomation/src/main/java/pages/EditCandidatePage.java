package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class EditCandidatePage extends baseclass {
	
	@FindBy(id = "ContactNumber")
	public WebElement contactNumber;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[3]/button[2]")
	public WebElement saveButton;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonProbabilityPopup;
	
	@FindBy(id = "NoticePeriod")
	public WebElement noticePeriod;
	
	
	public EditCandidatePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void EnterContactNumberT(String ContactNumber) {
		 
		contactNumber.clear();
		contactNumber.sendKeys(ContactNumber); 
	 }
	
	public void EnterNoticePeriodT(String NoticePeriod) {
		 
		noticePeriod.clear();
		noticePeriod.sendKeys(NoticePeriod); 
	 }
	
	

}
