package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class CandidateCardSectionPage extends baseclass {
	
	@FindBy(xpath = "//p[@class='addbytitle']")
	public WebElement addedBy;
	
	@FindBy(xpath = "/html/body/app-root/div/div/div/workbench/div/div[2]/div/table/tbody/tr/td[1]/div/div/div/div/div[2]/div[2]/div/div[1]/p")
	public WebElement assignTo;
	
	@FindBy(xpath = "//div[@class='item-box cdk-drag']")
	public WebElement candidateCard;
	
	@FindBy(xpath = "//body//td[2]")
	public WebElement secondColumn;
	
	@FindBy(xpath = "//body//td[3]")
	public WebElement thirdColumn;
	
	
	Actions action;
	
	public CandidateCardSectionPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void dragAndDropCardToSecondColumn() throws InterruptedException {
		
		WebElement drag = candidateCard;
		WebElement drop = secondColumn;
		
		action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		Thread.sleep(3000);
	}
	
	public void dragAndDropCardToThirdColumn() throws InterruptedException {
		
		WebElement drag = candidateCard;
		WebElement drop = thirdColumn;
		
		action = new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		Thread.sleep(3000);
	}

}
