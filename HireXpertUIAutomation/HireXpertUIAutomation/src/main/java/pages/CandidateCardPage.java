package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class CandidateCardPage extends baseclass {
	
	@FindBy(xpath = "//p[@class='addbytitle']")
	public WebElement addedBy;
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/workbench/div/div[2]/div/table/tbody/tr/td[1]/div/div/div/div/div[2]/div[2]/div/div[1]/p")
	public WebElement assignTo;
	
	
	public CandidateCardPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
