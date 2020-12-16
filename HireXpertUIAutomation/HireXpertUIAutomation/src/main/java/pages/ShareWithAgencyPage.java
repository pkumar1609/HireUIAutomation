package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilPackage.baseclass;

public class ShareWithAgencyPage extends baseclass {
	
	
	boolean emp;
	String Sharedteam;
	String teamMemberName;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement searchField;
	
	@FindBy(xpath = "//span[@class='checkmark CheckBoxM']")
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "(//span[@class='checkmark CheckBoxM'])[2]")
	public WebElement blockUnblockCheckbox;
	
	@FindBy(xpath = "//button[@title='Share With Agency']")
	public WebElement shareWithAgency;
	
	
	public ShareWithAgencyPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void shareWithAgency(String agyEmailId) throws InterruptedException
	{
		Thread.sleep(1000); 
		workbenchpage.shareJob.click();
		Thread.sleep(1000); 
		workbenchpage.shareWithAgencyButton.click();
		sharewithteampage.searchField.sendKeys(agyEmailId);
		Thread.sleep(2000);
		sharewithteampage.shareCheckbox.click();
		try
		{
		common.clickOnConfirmYes();
		}
		catch(NoSuchElementException e)
		{}
	
	}

}
