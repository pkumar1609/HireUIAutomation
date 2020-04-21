package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class AddCandidatePage extends baseclass {
	
	@FindBy(xpath = "//h5[@class='modal-title w-97']")
	public WebElement pageTitle;
	
	@FindBy(id = "Email")
	public WebElement emailField;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div[1]/form/div/div[2]/button")
	public WebElement FindButton;
	
	@FindBy(xpath = "ECTC")
	public WebElement expectedCTC;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[3]/button[2]")
	public WebElement saveButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/job-applicant-component/div[3]/button[1]")
	public WebElement closeButton;
	
	@FindBy(id = "salaryOffered")
	public WebElement salaryOffered;
	
	
	
	public AddCandidatePage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void validatePageTitle() {
		
		String title = pageTitle.getText();
		System.out.println("Page title should be - Add Candidate with selected job name");
		System.out.println("Page title: " + title);
	}
	
	public void searchCandidateEmail() {
		
		emailField.click();
		emailField.sendKeys(prop.getProperty("candidateemail"));
	}
	
	

}
