package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ScreeningPage extends baseclass {

	
	
	@FindBy(xpath = "//td[contains(text(),'Failed')]")
	public WebElement candidatestatus;
	
	
	
	
	
	
	
	public ScreeningPage() {     //constructor
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
