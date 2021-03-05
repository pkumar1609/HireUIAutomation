package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class HireExpressPage extends baseclass{
	
	public HireExpressPage() {
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath= "//button[contains(text(),'Add Job')]")
	public WebElement addJob;
	
	@FindBy(xpath= "//button[contains(text(),'Add Candidate')]")
	public WebElement addCandidate;
	
	@FindBy(xpath= "//select[@formcontrolname='job']")
	public WebElement selectJob;
	
	
	
	

}
